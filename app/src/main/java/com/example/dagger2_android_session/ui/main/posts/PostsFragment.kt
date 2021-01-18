package com.example.dagger2_android_session.ui.main.posts

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dagger2_android_session.R
import com.example.dagger2_android_session.databinding.PostsFragmentBinding
import com.example.dagger2_android_session.ui.BaseFragment

class PostsFragment : BaseFragment<PostsFragmentBinding, PostsViewModel>(R.layout.posts_fragment) {
    override fun initializeViewModel() {
        initializeViewModel(PostsViewModel::class.java)
    }

    override fun setListeners() {

    }

    override fun setObservers() {

    }

    override fun removeObservers() {

    }


}