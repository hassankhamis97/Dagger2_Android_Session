package com.example.dagger2_android_session.ui.main.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dagger2_android_session.repo.auth.AuthRepo
import com.example.dagger2_android_session.repo.main.MainRepo
import javax.inject.Inject

class ProfileViewModel @Inject constructor(private val mainRepo: MainRepo) : ViewModel() {

    private val _logoutEvent = MutableLiveData<Boolean>(false)
    val logoutEvent: LiveData<Boolean>
        get() = _logoutEvent

    fun logout() {
        _logoutEvent.postValue(true)
        mainRepo.logout()
    }
}