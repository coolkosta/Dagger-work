package com.example.core.network

import retrofit2.Retrofit

interface NetworkApi {
    fun getRetrofit(): Retrofit
}