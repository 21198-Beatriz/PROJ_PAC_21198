package com.example.ods.domain.repository

import com.example.ods.domain.model.User

interface UserRepository {
    suspend fun getUserByUserName(userName: String): User?
    suspend fun insert(user: User): Long
    suspend fun delete(user: User)
    suspend fun isUserRegistered(userName: String): Boolean
    suspend fun getUserById(userId: Int): User?
}