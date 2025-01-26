package com.example.daggerhomework

import android.app.Application
import com.example.core.di.ApplicationComponent
import com.example.core.di.ApplicationComponentProvider
import com.example.daggerhomework.di.AppComponent
import com.example.home.di.HomeComponent
import com.example.home.di.HomeComponentProvider

class App : Application(), ApplicationComponentProvider, HomeComponentProvider {

    private val appComponent: AppComponent by lazy {
        AppComponent.init(this)
    }

    override val getAppComponent: ApplicationComponent
        get() = appComponent

    override fun getHomeComponent(): HomeComponent {
        return HomeComponent.init(this)
    }
}