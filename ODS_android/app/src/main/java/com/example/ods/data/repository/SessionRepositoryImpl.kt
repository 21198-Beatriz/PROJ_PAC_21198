package com.example.ods.data.repository

import com.example.ods.data.dao.SessionDao
import com.example.ods.data.model.SessionData
import com.example.ods.domain.repository.SessionRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async

class SessionRepositoryImpl(
    private val sessionDao: SessionDao,
    private val scope: CoroutineScope
): SessionRepository {

    override suspend fun insertSession(session: SessionData): Deferred<Unit> {
        return scope.async {
            sessionDao.insert(session)
        }
    }

    override suspend fun getCurrentSession(): SessionData? {
        return sessionDao.getCurrentSession()
    }

    override suspend fun clearSession() {
        sessionDao.clearSession()
    }
}