package com.example.ods.domain.mapper

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.example.ods.data.model.IndicatorData
import com.example.ods.data.model.MetaData
import com.example.ods.data.model.ObjectiveData
import com.example.ods.data.model.ObjectiveWithMetaData
import com.example.ods.domain.model.Objective

class ObjectiveMapper: Mapper<ObjectiveData, Objective> {

    override fun mapFromEntity(entity: ObjectiveData): Objective {
        return Objective(
            id = entity.id,
            description = entity.description,
            color = Color(entity.color),
            details = entity.details,
            title = entity.title,
            metas = emptyList(),
            score = entity.score
        )
    }

    fun mapFromEntity(entity: ObjectiveData, metas: List<MetaData>, indicators: List<IndicatorData>): Objective {
        val metaMapper = MetaMapper()
        val metasWithIndicators = metas.map { meta ->
            val metaIndicators : List<IndicatorData> = indicators.filter { it.metaId == meta.id }
            metaMapper.mapFromEntity(meta, metaIndicators)
        }
        return Objective(
            id = entity.id,
            title = entity.title,
            description = entity.description,
            metas = metasWithIndicators,
            color = Color(entity.color),
            details = entity.details
        )
    }

    override fun mapToEntity(domainModel: Objective): ObjectiveData {
        return ObjectiveData(
            id = domainModel.id,
            description = domainModel.description,
            color = domainModel.color.toArgb().toLong(),
            details = domainModel.details,
            title = domainModel.title,
            score = domainModel.score
        )
    }
}