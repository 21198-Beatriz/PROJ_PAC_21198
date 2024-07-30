package com.example.ods.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_objective_scores")
data class UserObjectiveScoreData(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val userId: Int,
    val objectiveId: Int,
    val score: Int
)