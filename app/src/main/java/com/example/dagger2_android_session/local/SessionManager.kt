package com.example.dagger2_android_session.local

import android.content.SharedPreferences
import androidx.core.content.edit
import com.example.dagger2_android_session.data.models.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager @Inject constructor(val preferences: SharedPreferences) {

    var user: User
        get() = User.create(preferences.getString("user_pref", "")!!)
        set(value) = preferences.edit {
            putString("user_pref", value.toString())
        }

    fun createUser(user: User) {
        this.user = user
    }

    fun logoutUser() {
        this.user = User()
    }
}