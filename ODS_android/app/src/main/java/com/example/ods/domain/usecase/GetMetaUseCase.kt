package com.example.ods.domain.usecase

import com.example.ods.domain.model.Meta
import com.example.ods.domain.repository.MetaRepository

class GetMetaUseCase(private val metaRepository: MetaRepository) : UseCase<Unit, List<Meta>> {
    override suspend fun execute(params: Unit): List<Meta> {
        return metaRepository.getAllMetas()
    }
}