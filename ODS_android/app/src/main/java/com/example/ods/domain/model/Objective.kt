package com.example.ods.domain.model

import androidx.compose.ui.graphics.Color

data class Objective(
    val id: Int = 0,
    val title: String,
    val description: String,
    val details: String,
    val color: Color,
    val metas: List<Meta>,
    val score: Int = 0
)