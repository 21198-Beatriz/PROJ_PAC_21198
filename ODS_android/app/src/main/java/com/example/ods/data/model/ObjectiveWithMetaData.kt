package com.example.ods.data.model

import androidx.room.Embedded
import androidx.room.Relation

data class ObjectiveWithMetaData(
    @Embedded val objective: ObjectiveData,
    @Relation(
        parentColumn = "id",
        entityColumn = "objectiveId"
    )
    val metas: List<MetaData>
)
