package com.example.ods.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ods.data.model.UserObjectiveScoreData

@Dao
interface UserObjectiveScoreDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(userObjectiveScore: UserObjectiveScoreData)

    @Query("SELECT * FROM user_objective_scores WHERE userId = :userId AND objectiveId = :objectiveId")
    suspend fun getUserObjectiveScore(userId: Int, objectiveId: Int): UserObjectiveScoreData?
}