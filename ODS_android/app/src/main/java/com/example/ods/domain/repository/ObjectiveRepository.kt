package com.example.ods.domain.repository

import com.example.ods.domain.model.Objective

interface ObjectiveRepository {
    suspend fun getAllObjectives(): List<Objective>
    suspend fun insert(objective: Objective)
    suspend fun delete(objective: Objective)
    suspend fun getObjectiveById(id :Int): Objective?
}