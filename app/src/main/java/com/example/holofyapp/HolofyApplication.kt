package com.example.holofyapp

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class HolofyApplication : DaggerApplication() {
    private val applicationInjector = DaggerAppComponent.builder().application(this).build()
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = applicationInjector

}