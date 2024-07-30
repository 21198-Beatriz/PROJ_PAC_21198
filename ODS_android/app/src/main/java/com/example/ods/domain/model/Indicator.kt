package com.example.ods.domain.model

import androidx.room.PrimaryKey

data class Indicator(
    val id: Int = 0,
    val title: String,
    val description: String,
    val metaId: Int = 0
)