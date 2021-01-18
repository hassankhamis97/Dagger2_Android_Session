package com.example.dagger2_android_session.di

import com.example.dagger2_android_session.di.auth.AuthModule
import com.example.dagger2_android_session.di.auth.AuthScope
import com.example.dagger2_android_session.di.auth.AuthViewModelModule
import com.example.dagger2_android_session.di.main.MainFragmentBuildersModule
import com.example.dagger2_android_session.di.main.MainModule
import com.example.dagger2_android_session.di.main.MainScope
import com.example.dagger2_android_session.di.main.MainViewModelModule
import com.example.dagger2_android_session.ui.auth.AuthActivity
import com.example.dagger2_android_session.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
    @AuthScope
    @ContributesAndroidInjector(modules = [AuthViewModelModule::class, AuthModule::class])
    abstract fun contributeAuthActivity(): AuthActivity

    @MainScope
    @ContributesAndroidInjector(modules = [MainViewModelModule::class, MainFragmentBuildersModule::class, MainModule::class])
    abstract fun contributeMainActivity(): MainActivity
}