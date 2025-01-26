package com.example.home.data.remote

import com.example.home.data.remote.dto.City
import com.example.home.data.remote.dto.Coin
import retrofit2.http.GET

internal interface WebApi {

    @GET("coins")
   suspend fun getCoins(): List<Coin>

   @GET("cities")
    suspend fun getCities(): List<City>
}