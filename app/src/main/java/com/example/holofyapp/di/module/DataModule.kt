package com.example.holofyapp.di.module

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DataModule {

    @Singleton
    @Provides
    fun providesRepository(unSplashService: UnSplashService): Repository =
        Repository(unSplashService)
}