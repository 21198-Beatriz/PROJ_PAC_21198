package com.example.ods.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.ods.MyApplication
import com.example.ods.data.model.UserObjectiveScoreData
import com.example.ods.data.repository.UserObjectiveScoreRepository
import com.example.ods.domain.model.Objective
import com.example.ods.domain.repository.ObjectiveRepository
import com.example.ods.domain.repository.SessionRepository
import com.example.ods.domain.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ObjectiveViewModel(
    private val repository: ObjectiveRepository,
    private val userObjectiveScoreRepository: UserObjectiveScoreRepository,
    private val sessionRepository: SessionRepository,
    private val userRepository: UserRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _objective = MutableStateFlow<Objective?>(null)
    val objective: StateFlow<Objective?> = _objective

    private val _objectives = MutableLiveData<List<Objective>>()
    val objectives: LiveData<List<Objective>> get() = _objectives

    private val _filteredObjectives = MutableLiveData<List<Objective>>()
    val filteredObjectives: LiveData<List<Objective>> get() = _filteredObjectives

    private val _loading = MutableStateFlow(true)
    val loading: StateFlow<Boolean> = _loading

    init {
        fetchObjectives()
    }

    private fun fetchObjectives() {
        viewModelScope.launch {
            _loading.value = true
            withContext(Dispatchers.IO) {
                val objectives = repository.getAllObjectives()
                _objectives.postValue(objectives)
            }
            _loading.value = false
        }
    }

    fun fetchObjectivesWithScores() {
        viewModelScope.launch {
            _loading.value = true
            withContext(Dispatchers.IO) {
                sessionRepository.getCurrentSession()?.let { session ->
                    val user = userRepository.getUserById(session.userId)
                    val objectiveList = repository.getAllObjectives().map { objective ->
                        user?.let {
                            val score = userObjectiveScoreRepository.getUserObjectiveScore(
                                userId = user.id,
                                objectiveId = objective.id
                            )
                            if (score != null) {
                                objective.copy(score = score.score)
                            } else {
                                objective
                            }
                        } ?: objective
                    }
                    _filteredObjectives.postValue(objectiveList)
                }
            }
            _loading.value = false
        }
    }

    suspend fun getObjectiveById(id: Int): Objective? {
        return withContext(Dispatchers.IO) {
            repository.getObjectiveById(id)
        }
    }

    fun updateObjectiveScore(objective: Objective, score: Int) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                sessionRepository.getCurrentSession()?.let { session ->
                    val user = userRepository.getUserById(session.userId)
                    user?.let {
                        val userObjectiveScore = userObjectiveScoreRepository.getUserObjectiveScore(
                            userId = user.id,
                            objectiveId = objective.id
                        )
                        if (userObjectiveScore != null) {
                            userObjectiveScoreRepository.insertUserObjectiveScore(
                                userObjectiveScore.copy(score = score)
                            )
                        } else {
                            userObjectiveScoreRepository.insertUserObjectiveScore(
                                UserObjectiveScoreData(
                                    userId = user.id,
                                    objectiveId = objective.id,
                                    score = score
                                )
                            )
                        }
                        fetchObjectivesWithScores()
                    }
                }
            }
        }
    }

    fun deleteObjective(objective: Objective) {
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                repository.insert(objective.copy(score = 0))
                fetchObjectives()
            }
        }
    }

    fun insertObjective(newObjective: Objective) {
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                repository.insert(newObjective)
                fetchObjectives()
            }
        }
    }

    // Define ViewModel factory in a companion object
    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val savedStateHandle = createSavedStateHandle()
                val objectiveRepository = (this[APPLICATION_KEY] as MyApplication).objectiveRepository
                val sessionRepository = (this[APPLICATION_KEY] as MyApplication).sessionRepository
                val userRepository = (this[APPLICATION_KEY] as MyApplication).userRepository
                val userObjectiveScoreRepository = (this[APPLICATION_KEY] as MyApplication).userObjectiveScoreRepository
                ObjectiveViewModel(
                    repository = objectiveRepository,
                    sessionRepository = sessionRepository,
                    userRepository = userRepository,
                    userObjectiveScoreRepository = userObjectiveScoreRepository,
                    savedStateHandle = savedStateHandle
                )
            }
        }
    }
}