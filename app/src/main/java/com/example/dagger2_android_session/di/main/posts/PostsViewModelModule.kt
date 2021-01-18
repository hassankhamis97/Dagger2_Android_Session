package com.example.dagger2_android_session.di.main.posts

import androidx.lifecycle.ViewModel
import com.example.dagger2_android_session.di.ViewModelKey
import com.example.dagger2_android_session.ui.main.posts.PostsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class PostsViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel::class)
    abstract fun bindsPostsViewModel(postsViewModel: PostsViewModel): ViewModel
}