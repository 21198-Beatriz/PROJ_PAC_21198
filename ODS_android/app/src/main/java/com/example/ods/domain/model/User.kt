package com.example.ods.domain.model

import com.example.ods.domain.mapper.hashPassword

data class User(
    val id: Int = 0,
    val username: String,
    val password: String,
    val salt: String
) {
    fun isPasswordCorrect(password: String): Boolean {
        return hashPassword(password, salt) == this.password
    }
}