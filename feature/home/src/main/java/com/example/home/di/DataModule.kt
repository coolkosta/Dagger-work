package com.example.home.di

import com.example.home.data.remote.RetrofitRepositoryImpl
import com.example.home.domain.repository.RetrofitRepository
import dagger.Binds
import dagger.Module

@Module
internal abstract class DataModule {

    @Binds
    abstract fun provideRetrofitRepository(repositoryImpl: RetrofitRepositoryImpl): RetrofitRepository
}