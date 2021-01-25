package com.example.dagger2_android_session.ui.auth

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.RequestManager
import com.example.dagger2_android_session.local.SessionManager
import com.example.dagger2_android_session.repo.auth.AuthRepo
import kotlinx.coroutines.launch
import javax.inject.Inject

class AuthViewModel @Inject constructor(val authRepo: AuthRepo, val sessionManager: SessionManager): ViewModel() {


    private val _loginEvent = MutableLiveData<Boolean>(false)
    val loginEvent: LiveData<Boolean>
        get() = _loginEvent

    private val TAG = "Dagger2_Android_Session"
    init {
        Log.d(TAG, ": start AuthViewModel")
        val y = sessionManager.user
        print(y)
    }

    fun login(id: Int) {
        viewModelScope.launch {
            val user = authRepo.login(id)
            if (user.id != -1) {
                setLogin()
            }
        }
    }

    fun setLogin() {
        _loginEvent.postValue(true)
    }
}