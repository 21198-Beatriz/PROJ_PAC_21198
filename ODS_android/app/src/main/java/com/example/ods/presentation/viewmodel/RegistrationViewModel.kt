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
import com.example.ods.domain.mapper.UserMapper
import com.example.ods.domain.model.User
import com.example.ods.domain.repository.SessionRepository
import com.example.ods.domain.repository.UserRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RegistrationViewModel(
    private val repository: UserRepository,
    private val sessionRepository: SessionRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    fun register(username: String, password: String, confirmPassword: String, onResult: (Boolean, String) -> Unit) {
        viewModelScope.launch {
            val validationError = validateInput(username, password, confirmPassword)
            if (validationError != null) {
                onResult(false, validationError)
                return@launch
            }
            if (repository.isUserRegistered(username)) {
                onResult(false, "Já existe um utilizador com este nome")
            } else {
                val (salt, hashedPassword) = UserMapper().createSaltedPassword(password)
                val user = User(username = username, password = hashedPassword, salt = salt)
                val userId = repository.insert(user)
                sessionRepository.insertSession(SessionData(userId = userId.toInt()))
                onResult(true, "Registo efetuado com sucesso")
            }
        }
    }

    private fun validateInput(username: String, password: String, confirmPassword: String): String? {
        if (username.isBlank()) {
            return "O nome de utilizador não pode estar vazio"
        }
        if (password.isBlank()) {
            return "A senha não pode estar vazia"
        }
        if (password != confirmPassword) {
            return "As senhas não coincidem"
        }
        if (password.length < 6) {
            return "A senha deve ter pelo menos 6 caracteres"
        }
        return null
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val savedStateHandle = createSavedStateHandle()
                val userRepository =  (this[APPLICATION_KEY] as MyApplication).userRepository
                val sessionRepository = (this[APPLICATION_KEY] as MyApplication).sessionRepository
                RegistrationViewModel(
                    userRepository,
                    sessionRepository,
                    savedStateHandle
                )
            }
        }
    }
}