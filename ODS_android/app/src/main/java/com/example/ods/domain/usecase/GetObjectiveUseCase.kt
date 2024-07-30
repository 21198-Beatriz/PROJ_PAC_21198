package com.example.ods.domain.usecase

import com.example.ods.data.repository.ObjectiveRepositoryImpl
import com.example.ods.domain.model.Objective

class GetObjectivesUseCase(private val repository: ObjectiveRepositoryImpl) : UseCase<Unit, List<Objective>> {
    override suspend fun execute(params: Unit): List<Objective> {
        return repository.getAllObjectives()
    }
}