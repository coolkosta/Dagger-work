package com.example.home.di

import com.example.core.di.ApplicationComponentProvider
import com.example.home.presenter.HomeViewModel
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [HomeModule::class],
    dependencies = [ApplicationComponentProvider::class]
)
interface HomeComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun viewModel(viewModel: HomeViewModel): Builder
        fun applicationComponent(applicationComponent: ApplicationComponentProvider): Builder
        fun build(): HomeComponent
    }
}