package com.example.ods

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.ods.data.dao.IndicatorDao
import com.example.ods.data.dao.MetaDao
import com.example.ods.data.dao.ObjectiveDao
import com.example.ods.data.dao.SessionDao
import com.example.ods.data.dao.UserDao
import com.example.ods.data.dao.UserObjectiveScoreDao
import com.example.ods.data.model.IndicatorData
import com.example.ods.data.model.MetaData
import com.example.ods.data.model.ObjectiveData
import com.example.ods.data.model.SessionData
import com.example.ods.data.model.UserData
import com.example.ods.data.model.UserObjectiveScoreData
import com.example.ods.domain.mapper.IndicatorMapper
import com.example.ods.domain.mapper.MetaMapper
import com.example.ods.domain.mapper.ObjectiveMapper
import com.example.ods.domain.model.Objective
import com.example.ods.domain.populate.populateObjectiveInitialData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

@Database(entities = [SessionData::class, UserData::class, UserObjectiveScoreData::class, IndicatorData::class, MetaData::class, ObjectiveData:: class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun indicatorDao(): IndicatorDao
    abstract fun metaDataDao(): MetaDao
    abstract fun objectiveDao(): ObjectiveDao
    abstract fun userDao(): UserDao
    abstract fun userObjectiveScoreDao(): UserObjectiveScoreDao
    abstract fun sessionDao(): SessionDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(
            context: Context,
            coroutineScope: CoroutineScope
        ): AppDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "my_database"
                )
//                    .createFromAsset("initial_data.db")
                    .build()
                INSTANCE = instance

                coroutineScope.launch {
                    if(instance.objectiveDao().getCount() == 0){
                        populateDatabase(populateObjectiveInitialData())

                    }
                }
                // return instance
                instance
            }
        }

        private fun populateDatabase(populateObjectiveInitialData: List<Objective>) {
            val objectiveDao = INSTANCE?.objectiveDao()
            val indicatorDao = INSTANCE?.indicatorDao()
            val metaDataDao = INSTANCE?.metaDataDao()

            val updatedIdsObjective = updateIdsForObjectives(populateObjectiveInitialData)
            objectiveDao?.insertAll(updatedIdsObjective.map { ObjectiveMapper().mapToEntity(it) })
            metaDataDao?.insertAll(updatedIdsObjective.flatMap { it.metas }.map { MetaMapper().mapToEntity(it) })
            val indicatorEntities = updatedIdsObjective.flatMap { it.metas.flatMap { meta -> meta.indicators } }.map { IndicatorMapper().mapToEntity(it) }
            indicatorDao?.insertAll(indicatorEntities)
        }

        fun updateIdsForObjectives(objectives: List<Objective>): List<Objective> {
            return objectives.map { objective ->
                val updatedMetas = objective.metas.map { meta ->
                    val updatedIndicators = meta.indicators.map { indicator ->
                        indicator.copy(metaId = meta.id)
                    }
                    meta.copy(objectiveId = objective.id, indicators = updatedIndicators)
                }
                objective.copy(metas = updatedMetas)
            }
        }

    }
}