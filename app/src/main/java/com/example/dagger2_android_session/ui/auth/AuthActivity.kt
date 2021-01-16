package com.example.dagger2_android_session.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.RequestManager
import com.example.dagger2_android_session.R
import com.example.dagger2_android_session.databinding.ActivityAuthBinding
import dagger.android.AndroidInjection
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {
    private val TAG = "Auth"
    @Inject
    lateinit var requestManager: RequestManager

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel:AuthViewModel

    var binding: ActivityAuthBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_auth
        )
        binding?.imageView?.let {
            requestManager.load(R.drawable.ic_launcher_foreground).into(
                it
            )
        }
        Log.d(TAG, "onCreate: requestManager = $requestManager")

        initializeViewModel()
        addListeners()
    }

    private fun addListeners() {
        binding?.apply {
            loginBtn.setOnClickListener {
                viewModel.login(this.userIdText.text.toString().toInt())
            }
        }
    }

    fun initializeViewModel() {
        viewModel = ViewModelProvider(this, viewModelFactory).get(AuthViewModel::class.java)
    }
}