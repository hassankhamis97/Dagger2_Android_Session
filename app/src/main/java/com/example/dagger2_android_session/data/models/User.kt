package com.example.dagger2_android_session.data.models

import javax.inject.Inject

data class User (
    val id: Int,
    val name: String,
    val email: String,
    val website: String
) {
    constructor(): this(0,"","","")
}