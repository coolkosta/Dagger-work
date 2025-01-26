package com.example.home.domain.repository

import com.example.home.data.remote.dto.City
import com.example.home.data.remote.dto.Coin

internal interface RetrofitRepository {
    suspend fun getCoins(): List<Coin>
    suspend fun getCities(): List<City>
}