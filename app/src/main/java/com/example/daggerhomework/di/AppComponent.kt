package com.example.daggerhomework.di

import android.content.Context
import com.example.core.di.ApplicationComponent
import com.example.core.di.CoreComponent
import com.example.core.network.NetworkApi
import dagger.BindsInstance
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Component(modules = [AppModule::class], dependencies = [NetworkApi::class])
@Singleton
interface AppComponent : ApplicationComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder
        fun networkApi(networkApi: NetworkApi): Builder
        fun build(): AppComponent
    }

    val retrofit: Retrofit

    companion object {
        private var appComponent: AppComponent? = null
        fun init(context: Context): AppComponent {
            if (appComponent == null) {
                appComponent = DaggerAppComponent.builder()
                    .context(context)
                    .networkApi(CoreComponent.init())
                    .build()
            }
            return requireNotNull(appComponent)
        }
    }
}