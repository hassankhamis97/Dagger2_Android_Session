package com.example.dagger2_android_session.di.main

import com.example.dagger2_android_session.di.main.posts.PostsViewModelModule
import com.example.dagger2_android_session.ui.main.posts.PostsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector(modules = [PostsViewModelModule::class])
    abstract fun ContributesPostsFragment(): PostsFragment
}