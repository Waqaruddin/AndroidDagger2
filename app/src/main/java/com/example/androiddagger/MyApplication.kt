package com.example.androiddagger

import android.app.Application

class MyApplication : Application() {
    val applicationComponent = DaggerApplicationComponent.create()
    override fun onCreate() {
        super.onCreate()
    }
}