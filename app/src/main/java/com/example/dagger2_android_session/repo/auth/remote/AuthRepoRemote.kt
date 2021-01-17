package com.example.dagger2_android_session.repo.auth.remote

import com.example.dagger2_android_session.data.models.NetworkMessage
import com.example.dagger2_android_session.data.models.User
import com.haroldadmin.cnradapter.NetworkResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface AuthRepoRemote {
    suspend fun login(id: Int): NetworkResponse<User, NetworkMessage>
}