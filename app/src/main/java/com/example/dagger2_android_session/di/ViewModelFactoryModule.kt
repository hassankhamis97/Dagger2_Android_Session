package com.example.dagger2_android_session.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun viewModelFactory(factory: DaggerViewModelFactory): ViewModelProvider.Factory
}