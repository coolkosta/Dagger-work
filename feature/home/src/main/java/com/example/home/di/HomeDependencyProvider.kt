package com.example.home.di

import retrofit2.Retrofit

interface HomeDependencyProvider {
    fun getRetrofit(): Retrofit
}