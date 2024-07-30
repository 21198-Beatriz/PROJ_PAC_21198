package com.example.ods.domain.repository

import com.example.ods.domain.model.Meta

interface MetaRepository {
    suspend fun getAllMetas(): List<Meta>
    suspend fun insert(meta: Meta)
    suspend fun delete(meta: Meta)
}