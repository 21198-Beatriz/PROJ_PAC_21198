package com.example.ods

import android.app.Application
import androidx.room.Room
import com.example.ods.data.repository.IndicatorRepositoryImpl
import com.example.ods.data.repository.MetaRepositoryImpl
import com.example.ods.data.repository.ObjectiveRepositoryImpl
import com.example.ods.data.repository.SessionRepositoryImpl
import com.example.ods.data.repository.UserObjectiveScoreRepository
import com.example.ods.data.repository.UserObjectiveScoreRepositoryImpl
import com.example.ods.data.repository.UserRepositoryImpl
import com.example.ods.domain.mapper.IndicatorMapper
import com.example.ods.domain.mapper.MetaMapper
import com.example.ods.domain.mapper.ObjectiveMapper
import com.example.ods.domain.repository.IndicatorRepository
import com.example.ods.domain.repository.MetaRepository
import com.example.ods.domain.repository.ObjectiveRepository
import com.example.ods.domain.repository.SessionRepository
import com.example.ods.domain.repository.UserRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class MyApplication : Application() {


    val applicationScope = CoroutineScope(SupervisorJob())
    lateinit var dataBase: AppDatabase

    // Initialize repositories eagerly
    lateinit var objectiveRepository: ObjectiveRepository
    lateinit var metaRepository: MetaRepository
    lateinit var indicatorRepository: IndicatorRepository
    lateinit var userRepository: UserRepository
    lateinit var sessionRepository: SessionRepository
    lateinit var userObjectiveScoreRepository: UserObjectiveScoreRepository

    override fun onCreate() {
        super.onCreate()
        initDatabase()
    }

    fun initDatabase() {
        applicationScope.launch(Dispatchers.IO) {
            dataBase = AppDatabase.getDatabase(this@MyApplication, applicationScope)
            objectiveRepository = ObjectiveRepositoryImpl(dataBase.objectiveDao(), dataBase.metaDataDao(), dataBase.indicatorDao(), ObjectiveMapper())
            metaRepository = MetaRepositoryImpl(dataBase.metaDataDao(), MetaMapper())
            indicatorRepository = IndicatorRepositoryImpl(dataBase.indicatorDao(), IndicatorMapper())
            userRepository = UserRepositoryImpl(dataBase.userDao())
            sessionRepository = SessionRepositoryImpl(dataBase.sessionDao(), applicationScope)
            userObjectiveScoreRepository = UserObjectiveScoreRepositoryImpl(dataBase.userObjectiveScoreDao())

            // Optionally, pre-load some data if needed
            sessionRepository.getCurrentSession()
            objectiveRepository.getAllObjectives()
        }
    }
}