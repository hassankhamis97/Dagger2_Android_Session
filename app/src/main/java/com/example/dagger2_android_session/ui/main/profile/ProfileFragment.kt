package com.example.dagger2_android_session.ui.main.profile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dagger2_android_session.R
import com.example.dagger2_android_session.data.models.User
import com.example.dagger2_android_session.databinding.ProfileFragmentBinding
import com.example.dagger2_android_session.ui.BaseFragment
import com.example.dagger2_android_session.ui.main.posts.PostsViewModel
import javax.inject.Inject

class ProfileFragment : BaseFragment<ProfileFragmentBinding, ProfileViewModel>(R.layout.profile_fragment) {
    private val TAG = "user"

    @Inject
    lateinit var user: User

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding?.apply {
            user = this@ProfileFragment.user
            viewModel = this@ProfileFragment.viewModel
        }
        Log.d(TAG, "onCreate: user = $user + add = ${System.identityHashCode(user)}")
    }
    override fun initializeViewModel() {
        initializeViewModel(ProfileViewModel::class.java)
    }

    override fun setListeners() {

    }

    override fun setObservers() {

    }

    override fun removeObservers() {

    }

}