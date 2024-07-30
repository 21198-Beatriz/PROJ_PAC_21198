package com.example.ods.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "objectives")
data class ObjectiveData(
    @PrimaryKey val id: Int,
    val title: String,
    val description: String,
    val details: String,
    val color: Long,
    val score: Int
)
