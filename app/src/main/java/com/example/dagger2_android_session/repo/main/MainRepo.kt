package com.example.dagger2_android_session.repo.main

import com.example.dagger2_android_session.repo.main.local.MainRepoLocalImp
import javax.inject.Inject

class MainRepo @Inject constructor(private val mainRepoLocalImp: MainRepoLocalImp) {
    fun logout() {
        mainRepoLocalImp.logoutUser()
    }
}