package com.example.ods.presentation.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.ods.MyApplication
import com.example.ods.data.model.SessionData
import com.example.ods.domain.repository.SessionRepository
import com.example.ods.domain.repository.UserRepository
import kotlinx.coroutines.launch

open class LoginViewModel(
    private val repository: UserRepository,
    private val sessionRepository: SessionRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    fun login(username: String, password: String, onResult: (Boolean, String) -> Unit) {

        viewModelScope.launch {
            val validationError = validateInput(username, password)
            if (validationError != null) {
                onResult(false, validationError)
                return@launch
            }

            val user = repository.getUserByUserName(username)
            if (user?.isPasswordCorrect(password) == true) {
                val insertSessionDeferred = sessionRepository.insertSession(SessionData(userId = user.id))
                insertSessionDeferred.await()
                onResult(true, "Login efetuado com sucesso")
            } else {
                onResult(false, "Utilizador ou senha inválidos")
            }
        }
    }

    fun logout(onResult: () -> Unit) {
        viewModelScope.launch {
            sessionRepository.clearSession()
            onResult()
        }
    }

    private fun validateInput(username: String, password: String): String? {
        if (username.isBlank()) {
            return "O campo de utilizador não pode estar vazio"
        }
        if (password.isBlank()) {
            return "O campo de senha não pode estar vazio"
        }
        return null
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val savedStateHandle = createSavedStateHandle()
                val userRepository =  (this[APPLICATION_KEY] as MyApplication).userRepository
                val sessionRepository = (this[APPLICATION_KEY] as MyApplication).sessionRepository
                LoginViewModel(
                    userRepository,
                    sessionRepository,
                    savedStateHandle
                )
            }
        }
    }
}