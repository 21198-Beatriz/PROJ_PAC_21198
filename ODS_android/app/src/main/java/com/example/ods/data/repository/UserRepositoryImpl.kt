package com.example.ods.data.repository

import com.example.ods.data.dao.UserDao
import com.example.ods.domain.mapper.UserMapper
import com.example.ods.domain.model.User
import com.example.ods.domain.repository.UserRepository

class UserRepositoryImpl(
    private val userDao: UserDao
) : UserRepository {

    override suspend fun getUserByUserName(userName: String): User? {
        return userDao.getUserByUserName(userName)?.let {
            User(
                id = it.id,
                username = it.username,
                password = it.password,
                salt = it.salt
            )
        }
    }

    override suspend fun insert(user: User) : Long {
        return userDao.insert(UserMapper().mapToEntity(user))
    }

    override suspend fun delete(user: User) {
        userDao.delete(UserMapper().mapToEntity(user))
    }

    override suspend fun isUserRegistered(userName: String): Boolean {
        return userDao.getUserByUserName(userName)?.let {
            return true
        } ?: false
    }

    override suspend fun getUserById(userId: Int): User? {
        return userDao.getUserById(userId)?.let {
            UserMapper().mapFromEntity(it)
        }
    }
}