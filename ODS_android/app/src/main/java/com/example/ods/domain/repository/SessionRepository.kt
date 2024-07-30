package com.example.ods.domain.repository

import com.example.ods.data.model.SessionData
import kotlinx.coroutines.Deferred

interface SessionRepository {
    suspend fun insertSession(session: SessionData): Deferred<Unit>
    suspend fun getCurrentSession(): SessionData?
    suspend fun clearSession()
}