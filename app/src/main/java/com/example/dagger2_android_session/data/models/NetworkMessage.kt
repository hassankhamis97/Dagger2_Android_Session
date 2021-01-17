package com.example.dagger2_android_session.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
open class NetworkMessage(
    @Json(name = "success")
    var success: Boolean = false,
    @Json(name = "message")
    var message: String? = ""
)