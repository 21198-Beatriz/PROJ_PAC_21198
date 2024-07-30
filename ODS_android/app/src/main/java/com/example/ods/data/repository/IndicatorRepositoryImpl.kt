package com.example.ods.data.repository

import com.example.ods.data.dao.IndicatorDao
import com.example.ods.domain.mapper.IndicatorMapper
import com.example.ods.domain.model.Indicator
import com.example.ods.domain.repository.IndicatorRepository

class IndicatorRepositoryImpl(
    private val indicatorDao: IndicatorDao,
    private val indicatorMapper: IndicatorMapper
) : IndicatorRepository {


    override suspend fun getAllIndicators(): List<Indicator> {
        return indicatorDao.getAllIndicators().map { indicatorMapper.mapFromEntity(it) }
    }

    override suspend fun insert(indicator: Indicator) {
        indicatorDao.insert(indicatorMapper.mapToEntity(indicator))
    }

    override suspend fun delete(indicator: Indicator) {
        indicatorDao.delete(indicatorMapper.mapToEntity(indicator))
    }
}