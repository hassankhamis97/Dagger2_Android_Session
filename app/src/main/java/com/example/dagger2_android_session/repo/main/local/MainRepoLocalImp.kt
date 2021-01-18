package com.example.dagger2_android_session.repo.main.local

import com.example.dagger2_android_session.data.models.User
import com.example.dagger2_android_session.local.SessionManager
import javax.inject.Inject

class MainRepoLocalImp @Inject constructor(val sessionManager: SessionManager): MainRepoLocal {
    override fun logoutUser() {
        sessionManager.logoutUser()
    }
}