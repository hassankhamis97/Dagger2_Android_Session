package com.example.dagger2_android_session.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.dagger2_android_session.R
import com.example.dagger2_android_session.databinding.ActivityMainBinding
import com.example.dagger2_android_session.ui.BaseActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {
    val bottomNavigationView by lazy {
        findViewById<BottomNavigationView>(R.id.bottomNavigationView)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        setUpNavigation()
    }
    override fun initializeViewModel() {
        initializeViewModel(MainViewModel::class.java)
    }

    override fun setListeners() {

    }

    override fun setObservers() {

    }

    override fun removeObservers() {

    }

    private fun setUpNavigation() {

        val navHostFragment = supportFragmentManager
                .findFragmentById(R.id.navHostFragment) as NavHostFragment?
        NavigationUI.setupWithNavController(bottomNavigationView,
                navHostFragment!!.navController)
    }
}