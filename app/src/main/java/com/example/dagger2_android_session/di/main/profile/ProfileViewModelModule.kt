package com.example.dagger2_android_session.di.main.profile

import androidx.lifecycle.ViewModel
import com.example.dagger2_android_session.di.ViewModelKey
import com.example.dagger2_android_session.ui.main.profile.ProfileViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ProfileViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun bindProfileViewModel(profileViewModel: ProfileViewModel): ViewModel
}
