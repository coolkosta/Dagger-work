package com.example.home.domain.usecase

import com.example.home.data.remote.dto.City

internal interface GetCities {
    suspend operator fun invoke(): List<City>
}