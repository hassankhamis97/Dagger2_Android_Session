package com.example.dagger2_android_session.repo.auth

import com.example.dagger2_android_session.data.models.User
import com.example.dagger2_android_session.repo.auth.local.AuthRepoLocalImp
import com.example.dagger2_android_session.repo.auth.remote.AuthRepoRemoteImp
import com.haroldadmin.cnradapter.NetworkResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AuthRepo @Inject constructor(val authRepoRemoteImp: AuthRepoRemoteImp, val authRepoLocalImp: AuthRepoLocalImp) {

    suspend fun login(id: Int): User = withContext(Dispatchers.IO) {
        val response = authRepoRemoteImp.login(id)
        when (response) {
            is NetworkResponse.Success -> {
                
                return@withContext response.body
            }
            else -> {
                return@withContext User()
            }
        }
    }

}