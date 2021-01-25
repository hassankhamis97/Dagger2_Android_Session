package com.example.dagger2_android_session.ui

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dagger2_android_session.di.DaggerViewModelFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<VDB: ViewDataBinding, VM: ViewModel>(val layoutId: Int): DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: DaggerViewModelFactory

    lateinit var viewModel: VM

    var binding: VDB? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        initializeViewModel()
        setListeners()
        setObservers()
    }

    override fun onDestroy() {
        binding = null
        removeObservers()
        super.onDestroy()
    }

    abstract fun initializeViewModel()

    fun initializeViewModel(viewModelClass: Class<out VM>) {
        viewModel = ViewModelProvider(this, viewModelFactory).get(viewModelClass)
    }

    fun openNewActivity(activityClass: Class<out DaggerAppCompatActivity>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }

    abstract fun setListeners()
    abstract fun setObservers()
    abstract fun removeObservers()
}