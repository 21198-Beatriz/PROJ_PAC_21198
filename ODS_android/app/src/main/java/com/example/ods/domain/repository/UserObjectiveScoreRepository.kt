package com.example.ods.data.repository

import com.example.ods.data.dao.UserObjectiveScoreDao
import com.example.ods.data.model.UserObjectiveScoreData

interface UserObjectiveScoreRepository {
    suspend fun insertUserObjectiveScore(userObjectiveScore: UserObjectiveScoreData)

    suspend fun getUserObjectiveScore(userId: Int, objectiveId: Int): UserObjectiveScoreData?
}