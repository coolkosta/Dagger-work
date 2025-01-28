package com.example.daggerhomework

import android.app.Application
import com.example.core.di.ApplicationComponentProvider
import com.example.daggerhomework.di.AppComponent
import retrofit2.Retrofit

class App : Application(), ApplicationComponentProvider {

    private val appComponent: AppComponent by lazy {
        AppComponent.init(this)
    }
    override val getRetrofit: Retrofit
        get() = appComponent.retrofit

}