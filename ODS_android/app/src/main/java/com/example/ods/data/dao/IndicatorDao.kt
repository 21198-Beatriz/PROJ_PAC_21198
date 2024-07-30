package com.example.ods.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ods.data.model.IndicatorData

@Dao
interface IndicatorDao {
    @Query("SELECT * FROM indicators")
    fun getAllIndicators(): List<IndicatorData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(indicator: IndicatorData)

    @Delete
    suspend fun delete(indicator: IndicatorData)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(indicators: List<IndicatorData>)

    @Query("SELECT * FROM indicators WHERE metaId IN (:metaIds)")
    fun getIndicatorsByMetaIds(metaIds: List<Int>): List<IndicatorData>
}