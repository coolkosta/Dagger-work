package com.example.core.di

import retrofit2.Retrofit

interface ApplicationComponentProvider {
    val getRetrofit: Retrofit
}