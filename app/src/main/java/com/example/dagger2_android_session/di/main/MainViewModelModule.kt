package com.example.dagger2_android_session.di.main

import androidx.lifecycle.ViewModel
import com.example.dagger2_android_session.di.ViewModelKey
import com.example.dagger2_android_session.ui.auth.AuthViewModel
import com.example.dagger2_android_session.ui.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModelModule(mainViewModel: MainViewModel): ViewModel
}