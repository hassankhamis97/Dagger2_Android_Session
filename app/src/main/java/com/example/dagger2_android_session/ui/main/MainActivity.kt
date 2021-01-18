package com.example.dagger2_android_session.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2_android_session.R
import com.example.dagger2_android_session.databinding.ActivityMainBinding
import com.example.dagger2_android_session.ui.BaseActivity
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initializeViewModel() {

    }

    override fun setListeners() {

    }

    override fun setObservers() {

    }

    override fun removeObservers() {

    }
}