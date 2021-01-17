package com.example.dagger2_android_session.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.example.dagger2_android_session.R
import com.example.dagger2_android_session.util.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun provideRequestOptions(): RequestOptions =
            RequestOptions.placeholderOf(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)

    @Singleton
    @Provides
    fun provideGlideInstance(application: Application, requestOptions: RequestOptions): RequestManager =
            Glide.with(application).setDefaultRequestOptions(requestOptions)

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create()).build()


    @Singleton
    @Provides
    fun provideSharedPreferences(context: Context): SharedPreferences = context.getSharedPreferences("Dagger2", Context.MODE_PRIVATE)
}