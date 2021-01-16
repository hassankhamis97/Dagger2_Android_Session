package com.example.dagger2_android_session.di

import android.app.Application
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.example.dagger2_android_session.R
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideRequestOptions(): RequestOptions =
            RequestOptions.placeholderOf(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)

    @Provides
    fun provideGlideInstance(application: Application, requestOptions: RequestOptions): RequestManager =
            Glide.with(application).setDefaultRequestOptions(requestOptions)
}