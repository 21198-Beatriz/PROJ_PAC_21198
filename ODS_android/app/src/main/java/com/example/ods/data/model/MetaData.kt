package com.example.ods.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "metas")
class MetaData(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String,
    val description: String,
    val objectiveId: Int,
    val detailsId: Int
)