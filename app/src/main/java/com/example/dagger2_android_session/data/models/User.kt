package com.example.dagger2_android_session.data.models

import android.os.Parcelable
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.android.parcel.Parcelize
import java.lang.Exception
import javax.inject.Inject

@Parcelize
data class User (
    var id: Int,
    var name: String,
    var email: String,
    var website: String
) : Parcelable {
    constructor(): this(0,"","","")

    companion object {
        fun create(json: String): User {
            val moshi = Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()
            val adapter = moshi.adapter(User::class.java)
            return try {
                adapter.fromJson(json)!!
            } catch (ex: Exception) {
                User()
            }

        }
    }

    override fun toString(): String {
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
        val adapter = moshi.adapter(User::class.java)
        return adapter.toJson(this)
    }
}
