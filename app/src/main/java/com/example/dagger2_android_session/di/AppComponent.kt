package com.example.dagger2_android_session.di

import com.example.dagger2_android_session.application.BaseApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [AndroidSupportInjectionModule::class])
interface AppComponent: AndroidInjector<BaseApplication> {

}