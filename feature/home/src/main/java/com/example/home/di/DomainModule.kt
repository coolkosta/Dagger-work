package com.example.home.di

import com.example.home.data.remote.RetrofitRepositoryImpl
import com.example.home.domain.usecase.GetCities
import com.example.home.domain.usecase.GetCitiesImpl
import com.example.home.domain.usecase.GetCoins
import com.example.home.domain.usecase.GetCoinsImpl
import dagger.Binds
import dagger.Module

@Module(includes = [DataModule::class])
internal abstract class DomainModule {
    @Binds
    abstract fun provideGetCoins(getCoinsImpl: GetCoinsImpl): GetCoins

    @Binds
    abstract fun provideGetCities(getCitiesImpl: GetCitiesImpl): GetCities
}