package com.example.ods.domain.mapper

import com.example.ods.data.model.UserData
import com.example.ods.domain.model.User

class UserMapper: Mapper<UserData, User> {
    override fun mapFromEntity(entity: UserData): User {
        return User(
            id = entity.id,
            username = entity.username,
            password = entity.password,
            salt = entity.salt
        )
    }

    override fun mapToEntity(domainModel: User): UserData {
        return UserData(
            id = domainModel.id,
            username = domainModel.username,
            password = domainModel.password,
            salt = domainModel.salt
        )
    }

    fun createSaltedPassword(password: String): Pair<String, String> {
        val salt = generateSalt()
        val hashedPassword = hashPassword(password, salt)
        return Pair(salt, hashedPassword)
    }
}