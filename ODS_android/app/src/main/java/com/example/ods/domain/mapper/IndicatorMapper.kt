package com.example.ods.domain.mapper

import com.example.ods.data.model.IndicatorData
import com.example.ods.domain.model.Indicator

class IndicatorMapper: Mapper<IndicatorData, Indicator> {
    override fun mapFromEntity(entity: IndicatorData): Indicator {
        return Indicator(
            id = entity.id,
            title = entity.title,
            description = entity.description,
            metaId = entity.metaId
        )
    }

    override fun mapToEntity(domainModel: Indicator): IndicatorData {
        return IndicatorData(
            id = domainModel.id,
            title = domainModel.title,
            description = domainModel.description,
            metaId = domainModel.metaId
        )
    }
}