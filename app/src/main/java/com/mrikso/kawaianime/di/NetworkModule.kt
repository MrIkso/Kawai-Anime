package com.mrikso.kawaianime.di

import com.mrikso.kawaianime.api.AnimeAPI
import com.mrikso.kawaianime.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesAnimeAPI(retrofit: Retrofit): AnimeAPI {
        return retrofit.create(AnimeAPI::class.java)
    }

}