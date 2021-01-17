package com.example.dagger2_android_session.repo.auth.remote

import com.example.dagger2_android_session.data.models.NetworkMessage
import com.example.dagger2_android_session.data.models.User
import com.example.dagger2_android_session.data.remote.auth.AuthAPI
import com.haroldadmin.cnradapter.NetworkResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AuthRepoRemoteImp @Inject constructor(val authAPI: AuthAPI): AuthRepoRemote {
    override suspend fun login(id: Int): NetworkResponse<User, NetworkMessage> = withContext(Dispatchers.IO) {
        return@withContext authAPI.login(id)
    }
}