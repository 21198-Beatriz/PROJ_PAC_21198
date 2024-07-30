package com.example.ods.data.repository

import com.example.ods.data.dao.IndicatorDao
import com.example.ods.data.dao.MetaDao
import com.example.ods.data.dao.ObjectiveDao
import com.example.ods.data.model.MetaData
import com.example.ods.data.model.MetaWithIndicatorsData
import com.example.ods.data.model.ObjectiveWithMetaData
import com.example.ods.domain.mapper.IndicatorMapper
import com.example.ods.domain.mapper.MetaMapper
import com.example.ods.domain.mapper.ObjectiveMapper
import com.example.ods.domain.model.Indicator
import com.example.ods.domain.model.Objective
import com.example.ods.domain.repository.ObjectiveRepository

class ObjectiveRepositoryImpl(
    private val objectiveDao: ObjectiveDao,
    private val metaDao: MetaDao,
    private val indicatorDao: IndicatorDao,
    private val objectiveMapper: ObjectiveMapper
) : ObjectiveRepository {

    override suspend fun getAllObjectives(): List<Objective> {
        val objectives = objectiveDao.getAllObjectives()
        val metas = metaDao.getAllMetas()
        val indicators = indicatorDao.getAllIndicators()

        return objectives.map { objectiveData ->
            val objectiveMetas = metas.filter { it.objectiveId == objectiveData.id }
            objectiveMapper.mapFromEntity(objectiveData, objectiveMetas, indicators)
        }
    }

    override suspend fun insert(objective: Objective) {
        objectiveDao.insert(objectiveMapper.mapToEntity(objective))
    }

    override suspend fun delete(objective: Objective) {
        objectiveDao.delete(objectiveMapper.mapToEntity(objective))
    }

    override suspend fun getObjectiveById(id: Int): Objective? {
        val objectiveData = objectiveDao.getObjectiveById(id) ?: return null
        val metas = metaDao.getMetaByObjectiveId(id)
        val indicators = indicatorDao.getIndicatorsByMetaIds(metas.map { it.id })

        return objectiveMapper.mapFromEntity(objectiveData, metas, indicators)
    }
}