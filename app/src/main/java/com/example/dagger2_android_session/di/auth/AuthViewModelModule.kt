package com.example.dagger2_android_session.di.auth

import androidx.lifecycle.ViewModel
import com.example.dagger2_android_session.di.ViewModelKey
import com.example.dagger2_android_session.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun binAuthModelModule(authViewModel: AuthViewModel): ViewModel
}