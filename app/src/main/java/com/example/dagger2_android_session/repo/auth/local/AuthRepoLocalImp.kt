package com.example.dagger2_android_session.repo.auth.local

import com.example.dagger2_android_session.data.models.User
import com.example.dagger2_android_session.local.SessionManager
import javax.inject.Inject

class AuthRepoLocalImp @Inject constructor(val sessionManager: SessionManager): AuthRepoLocal {
    override fun createUser(user: User) {
        sessionManager.createUser(user)
    }
}