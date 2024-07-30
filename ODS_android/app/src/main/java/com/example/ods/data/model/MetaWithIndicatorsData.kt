package com.example.ods.data.model

import androidx.room.Embedded
import androidx.room.Relation

data class MetaWithIndicatorsData(
    @Embedded val meta: MetaData,
    @Relation(
        parentColumn = "id",
        entityColumn = "metaId"
    )
    val indicators: List<IndicatorData>
)