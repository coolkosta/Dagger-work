package com.example.home.data.remote

import com.example.home.data.remote.dto.City
import com.example.home.data.remote.dto.Coin
import com.example.home.domain.repository.RetrofitRepository
import retrofit2.Retrofit
import javax.inject.Inject

class RetrofitRepositoryImpl @Inject constructor(
    private val retrofit: Retrofit
) : RetrofitRepository {
    private val webApi by lazy {
        retrofit.create(WebApi::class.java)
    }

    override suspend fun getCoins(): List<Coin> {
        return webApi.getCoins()
    }

    override suspend fun getCities(): List<City> {
        return webApi.getCities()
    }


}