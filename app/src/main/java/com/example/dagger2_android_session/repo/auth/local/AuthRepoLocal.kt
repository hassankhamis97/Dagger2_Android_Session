package com.example.dagger2_android_session.repo.auth.local

import com.example.dagger2_android_session.data.models.User

interface AuthRepoLocal {
    fun createUser(user: User)
}