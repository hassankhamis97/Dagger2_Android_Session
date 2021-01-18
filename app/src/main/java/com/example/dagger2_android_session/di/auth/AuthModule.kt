package com.example.dagger2_android_session.di.auth

import com.example.dagger2_android_session.data.models.User
import com.example.dagger2_android_session.data.remote.auth.AuthAPI
import com.example.dagger2_android_session.local.SessionManager
import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class AuthModule {
    @AuthScope
    @Provides
    fun provideAuthAPI(retrofit: Retrofit): AuthAPI = retrofit.create(AuthAPI::class.java)

    @AuthScope
    @Provides
    fun provideUser(sessionManager: SessionManager): User = sessionManager.user
}