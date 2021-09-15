package com.example.holofyapp.di.module

import com.example.holofyapp.fragment.HomeDetailFragment
import com.example.holofyapp.fragment.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun constriButeHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun constriButeHomeDetailFragment(): HomeDetailFragment


}