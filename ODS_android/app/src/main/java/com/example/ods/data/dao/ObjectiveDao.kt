package com.example.ods.data.dao

import androidx.room.*
import com.example.ods.data.model.MetaData
import com.example.ods.data.model.ObjectiveData

@Dao
interface ObjectiveDao {
    @Query("SELECT * FROM objectives")
    fun getAllObjectives(): List<ObjectiveData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(objective: ObjectiveData)

    @Delete
    suspend fun delete(objective: ObjectiveData)

    @Query("SELECT * FROM metas WHERE id = :objectiveId")
    fun getObjectiveMetas(objectiveId: Int): List<MetaData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(data: List<ObjectiveData>)

    @Query("SELECT COUNT(*) FROM objectives")
    suspend fun getCount(): Int

    @Query("SELECT * FROM objectives WHERE id = :objectiveId LIMIT 1")
    suspend fun getObjectiveById(objectiveId: Int): ObjectiveData?
}