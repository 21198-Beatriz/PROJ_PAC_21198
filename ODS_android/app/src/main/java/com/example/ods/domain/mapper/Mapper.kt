package com.example.ods.domain.mapper

interface Mapper<in E, D> {
    fun mapFromEntity(entity: E): D
    fun mapToEntity(domainModel: D): @UnsafeVariance E
}