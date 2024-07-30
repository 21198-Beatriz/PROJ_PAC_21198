package com.example.ods.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ods.data.model.UserData

@Dao
interface UserDao {
    @Query("SELECT * FROM users WHERE username = :userName LIMIT 1")
    suspend fun getUserByUserName(userName: String): UserData?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: UserData) : Long

    @Delete
    suspend fun delete(user: UserData)

    @Query("SELECT * FROM users WHERE id = :userId LIMIT 1")
    suspend fun getUserById(userId: Int): UserData?
}