package com.example.dagger2_android_session.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import com.bumptech.glide.RequestManager
import javax.inject.Inject

class AuthViewModel @Inject constructor(): ViewModel() {
    private val TAG = "Auth"
    init {
        Log.d(TAG, ": start AuthViewModel") 
    }
}