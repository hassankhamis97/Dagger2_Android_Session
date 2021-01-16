package com.example.dagger2_android_session.di

import com.example.dagger2_android_session.di.auth.AuthModule
import com.example.dagger2_android_session.di.auth.AuthScope
import com.example.dagger2_android_session.di.auth.AuthViewModelModule
import com.example.dagger2_android_session.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
    @AuthScope
    @ContributesAndroidInjector(modules = [AuthViewModelModule::class, AuthModule::class])
    abstract fun contributeAuthActivity(): AuthActivity
}