package com.example.ods.domain.repository

import com.example.ods.domain.model.Indicator

interface IndicatorRepository {
    suspend fun getAllIndicators(): List<Indicator>
    suspend fun insert(indicator: Indicator)
    suspend fun delete(indicator: Indicator)
}