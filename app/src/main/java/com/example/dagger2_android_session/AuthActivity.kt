package com.example.dagger2_android_session

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.RequestManager
import com.example.dagger2_android_session.databinding.ActivityAuthBinding
import dagger.android.AndroidInjection
import dagger.android.DaggerActivity
import javax.inject.Inject

class AuthActivity : AppCompatActivity() {
    private val TAG = "AuthActivity"
    @Inject
    lateinit var requestManager: RequestManager

    var binding: ActivityAuthBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_auth)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
        binding?.imageView?.let {
            requestManager.load(R.drawable.ic_launcher_foreground).into(
                it
            )
        }
        Log.d(TAG, "onCreate: requestManager = $requestManager")
    }
}