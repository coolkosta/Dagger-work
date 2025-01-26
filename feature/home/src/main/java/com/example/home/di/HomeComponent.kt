package com.example.home.di

import android.content.Context
import com.example.core.di.ApplicationComponentProvider
import dagger.Component

@Component(modules = [HomeModule::class], dependencies = [HomeDependencyProvider::class])
interface HomeComponent {

    @Component.Builder
    interface Builder {
        fun homeDependencyProvider(homeDependencyProvider: HomeDependencyProvider): Builder
        fun build(): HomeComponent
    }

    companion object {
        @Volatile
        private var homeComponent: HomeComponent? = null

        @Synchronized
        fun init(context: Context): HomeComponent {
            if (homeComponent == null) {
                val appComponentProvider =
                    context.applicationContext as ApplicationComponentProvider
                val deps =
                    appComponentProvider.getAppComponent as HomeDependencyProvider
                homeComponent = DaggerHomeComponent
                    .builder()
                    .homeDependencyProvider(deps)
                    .build()
            }
            return requireNotNull(homeComponent)
        }
    }
}