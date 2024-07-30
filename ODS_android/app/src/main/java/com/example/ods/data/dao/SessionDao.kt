package com.example.ods.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ods.data.model.SessionData

@Dao
interface SessionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(session: SessionData)

    @Query("SELECT * FROM sessions ORDER BY id DESC LIMIT 1")
    suspend fun getCurrentSession(): SessionData?

    @Query("DELETE FROM sessions")
    suspend fun clearSession()
}