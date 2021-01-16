package com.example.dagger2_android_session.di

import com.example.dagger2_android_session.di.auth.AuthViewModelModule
import com.example.dagger2_android_session.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector(modules = [AuthViewModelModule::class])
    abstract fun contributeAuthActivity(): AuthActivity
}