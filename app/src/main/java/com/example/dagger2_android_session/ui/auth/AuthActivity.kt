package com.example.dagger2_android_session.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.RequestManager
import com.example.dagger2_android_session.R
import com.example.dagger2_android_session.databinding.ActivityAuthBinding
import com.example.dagger2_android_session.ui.BaseActivity
import dagger.android.AndroidInjection
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : BaseActivity<ActivityAuthBinding, AuthViewModel>(R.layout.activity_auth) {
    private val TAG = "Auth"
    @Inject
    lateinit var requestManager: RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding?.imageView?.let {
            requestManager.load(R.drawable.ic_launcher_foreground).into(
                it
            )
        }
        Log.d(TAG, "onCreate: requestManager = $requestManager")
    }

    override fun initializeViewModel() {
        initializeViewModel(AuthViewModel::class.java)
    }

    override fun setListeners() {
        binding?.apply {
            loginBtn.setOnClickListener {
                viewModel.login(this.userIdText.text.toString().toInt())
            }
        }
    }

    override fun setObservers() {
        viewModel.loginEvent.observe(this, Observer {
            if (it) {
                openNewActivity(AuthActivity::class.java)
            }
        })
    }

    override fun removeObservers() {
        viewModel.loginEvent.removeObservers(this)
    }
}