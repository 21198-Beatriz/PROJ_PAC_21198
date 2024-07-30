package com.example.ods.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ods.data.model.IndicatorData
import com.example.ods.data.model.MetaData

@Dao
interface MetaDao {
    @Query("SELECT * FROM metas")
    fun getAllMetas(): List<MetaData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(meta: MetaData)

    @Delete
    suspend fun delete(meta: MetaData)

    @Query("SELECT * FROM indicators WHERE id = :metaId")
    fun getMetaIndicators(metaId: Int): List<IndicatorData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(data: List<MetaData>)

    @Query("SELECT * FROM metas WHERE objectiveId = :objectiveId")
    fun getMetaByObjectiveId(objectiveId: Int): List<MetaData>
}