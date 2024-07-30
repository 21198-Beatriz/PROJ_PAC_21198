package com.example.ods.data.repository

import com.example.ods.data.dao.UserObjectiveScoreDao
import com.example.ods.data.model.UserObjectiveScoreData

class UserObjectiveScoreRepositoryImpl(private val userObjectiveScoreDao: UserObjectiveScoreDao) : UserObjectiveScoreRepository {
    override suspend fun insertUserObjectiveScore(userObjectiveScore: UserObjectiveScoreData) {
        userObjectiveScoreDao.insert(userObjectiveScore)
    }

    override suspend fun getUserObjectiveScore(userId: Int, objectiveId: Int): UserObjectiveScoreData? {
        return userObjectiveScoreDao.getUserObjectiveScore(userId, objectiveId)
    }
}