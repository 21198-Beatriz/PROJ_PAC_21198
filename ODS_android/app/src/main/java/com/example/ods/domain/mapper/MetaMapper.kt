package com.example.ods.domain.mapper

import com.example.ods.data.model.IndicatorData
import com.example.ods.data.model.MetaData
import com.example.ods.domain.model.Meta

class MetaMapper : Mapper<MetaData, Meta> {
    override fun mapFromEntity(entity: MetaData): Meta {
        return Meta(
            id = entity.id,
            title = entity.title,
            description = entity.description,
            objectiveId = entity.objectiveId,
            detailsId = entity.detailsId,
            indicators = emptyList()
        )
    }

    fun mapFromEntity(entity: MetaData, indicatorList: List<IndicatorData>): Meta {
        return Meta(
            id = entity.id,
            title = entity.title,
            description = entity.description,
            objectiveId = entity.objectiveId,
            detailsId = entity.detailsId,
            indicators = indicatorList.map { IndicatorMapper().mapFromEntity(it) } ?: emptyList()
        )
    }

    override fun mapToEntity(domainModel: Meta): MetaData {
        return MetaData(
            id = domainModel.id,
            title = domainModel.title,
            description = domainModel.description,
            detailsId = domainModel.detailsId,
            objectiveId = domainModel.objectiveId
        )
    }

}