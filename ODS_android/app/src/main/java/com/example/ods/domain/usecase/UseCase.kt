package com.example.ods.domain.usecase

interface UseCase<in P, R> {
    suspend fun execute(params: P): R
}