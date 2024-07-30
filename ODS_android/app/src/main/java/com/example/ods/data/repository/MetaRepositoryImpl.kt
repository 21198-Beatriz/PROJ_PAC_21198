package com.example.ods.data.repository

import com.example.ods.data.dao.MetaDao
import com.example.ods.data.model.MetaWithIndicatorsData
import com.example.ods.domain.mapper.MetaMapper
import com.example.ods.domain.model.Meta
import com.example.ods.domain.repository.MetaRepository

class MetaRepositoryImpl(
    private val metaDao: MetaDao,
    private val metaMapper: MetaMapper
) : MetaRepository {

    override suspend fun getAllMetas(): List<Meta> {
        return metaDao.getAllMetas().map { metaData ->
            val indicators = metaDao.getMetaIndicators(metaData.id)
            val metaWithIndicators = MetaWithIndicatorsData(metaData, indicators)
            metaMapper.mapFromEntity(metaData)
        }
    }

    override suspend fun insert(meta: Meta) {
        metaDao.insert(metaMapper.mapToEntity(meta))
    }

    override suspend fun delete(meta: Meta) {
        metaDao.delete(metaMapper.mapToEntity(meta))
    }
}