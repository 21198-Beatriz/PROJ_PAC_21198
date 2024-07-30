package com.example.ods.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "indicators")
data class IndicatorData(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title: String,
    var description: String,
    var metaId: Int
)