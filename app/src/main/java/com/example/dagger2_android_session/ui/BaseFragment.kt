package com.example.dagger2_android_session.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dagger2_android_session.R
import com.example.dagger2_android_session.di.DaggerViewModelFactory
import com.example.dagger2_android_session.ui.auth.AuthActivity
import com.example.dagger2_android_session.ui.main.posts.PostsViewModel
import dagger.android.support.DaggerAppCompatActivity
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<VDB: ViewDataBinding, VM: ViewModel>(private val layoutId: Int): DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: DaggerViewModelFactory

    lateinit var viewModel: VM

    var binding: VDB? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<VDB>(inflater, layoutId, container, false)
        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
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
        (activity as BaseActivity<*, *>).openNewActivity(activityClass)
    }

    abstract fun setListeners()
    abstract fun setObservers()
    abstract fun removeObservers()
}