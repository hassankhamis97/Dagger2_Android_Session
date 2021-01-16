package com.example.dagger2_android_session.di

import com.example.dagger2_android_session.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity
}