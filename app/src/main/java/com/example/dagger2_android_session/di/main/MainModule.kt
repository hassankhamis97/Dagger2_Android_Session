package com.example.dagger2_android_session.di.main

import com.example.dagger2_android_session.data.models.User
import com.example.dagger2_android_session.di.auth.AuthScope
import com.example.dagger2_android_session.local.SessionManager
import dagger.Module
import dagger.Provides

@Module
class MainModule {
    @MainScope
    @Provides
    fun provideUser(sessionManager: SessionManager): User = sessionManager.user
}