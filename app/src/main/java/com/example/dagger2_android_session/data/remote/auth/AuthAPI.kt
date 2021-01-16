package com.example.dagger2_android_session.data.remote.auth

import com.example.dagger2_android_session.data.models.User
import retrofit2.http.GET
import retrofit2.http.Path

interface AuthAPI {
    @GET("users/{id}")
    suspend fun login(@Path("id") id: Int): User
}