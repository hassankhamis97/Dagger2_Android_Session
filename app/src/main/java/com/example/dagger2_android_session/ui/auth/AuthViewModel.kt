package com.example.dagger2_android_session.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.RequestManager
import com.example.dagger2_android_session.repo.auth.AuthRepo
import kotlinx.coroutines.launch
import javax.inject.Inject

class AuthViewModel @Inject constructor(val authRepo: AuthRepo): ViewModel() {
    private val TAG = "Auth"
    init {
        Log.d(TAG, ": start AuthViewModel")
    }

    fun login(id: Int) {
        viewModelScope.launch {
            val x = authRepo.login(id)
            print(x)
        }
    }
}