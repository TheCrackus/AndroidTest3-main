package com.example.androidtest3

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BadApplication : Application(){
    override fun onCreate() {
        super.onCreate()
    }
}