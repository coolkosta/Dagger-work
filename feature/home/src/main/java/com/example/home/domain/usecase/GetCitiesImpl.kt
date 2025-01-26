package com.example.home.domain.usecase

import com.example.home.data.remote.dto.City
import com.example.home.domain.repository.RetrofitRepository
import javax.inject.Inject

internal class GetCitiesImpl @Inject constructor(private val repository: RetrofitRepository) : GetCities {
    override suspend fun invoke(): List<City> {
        return repository.getCities()
    }
}