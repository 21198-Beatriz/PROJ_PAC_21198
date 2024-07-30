package com.example.ods.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sessions")
data class SessionData(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val userId: Int
)