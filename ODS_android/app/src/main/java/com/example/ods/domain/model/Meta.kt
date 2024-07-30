package com.example.ods.domain.model

data class Meta(
    val id: Int = 0,
    val title: String,
    val description: String,
    val objectiveId: Int = 0,
    val detailsId: Int = 0,
    val indicators: List<Indicator>
)
