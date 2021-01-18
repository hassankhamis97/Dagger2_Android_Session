package com.example.dagger2_android_session.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.example.dagger2_android_session.R
import com.example.dagger2_android_session.data.models.User
import com.example.dagger2_android_session.local.SessionManager
import com.example.dagger2_android_session.util.Constants
import com.haroldadmin.cnradapter.NetworkResponseAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
abstract class AppModule {
    companion object {
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
        fun provideMoshi(): Moshi =
            Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()


        @Singleton
        @Provides
        fun provideRetrofit(moshi: Moshi): Retrofit =
            Retrofit.Builder().baseUrl(Constants.BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .addCallAdapterFactory(NetworkResponseAdapterFactory())
                .build()


        @Singleton
        @Provides
        fun provideSharedPreferences(context: Context): SharedPreferences = context.getSharedPreferences("Dagger2", Context.MODE_PRIVATE)


    }


    @Binds
    abstract fun bindAppContext(application: Application): Context
}