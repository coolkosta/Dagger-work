package com.example.core.di

import com.example.core.network.NetworkApi
import dagger.Component
import javax.inject.Singleton

@Component(modules = [CoreModule::class])
@Singleton
interface CoreComponent : NetworkApi {

    companion object {
        @Volatile
        private var instance: CoreComponent? = null

        @Synchronized
        fun init(): CoreComponent {
            if (instance == null) {
                instance = DaggerCoreComponent.create()
            }
            return requireNotNull(instance)
        }
    }
}