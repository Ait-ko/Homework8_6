package com.example.homework8_6

import android.app.Application
import com.example.homework8_6.di.youtubeModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App :Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@App)
            modules(youtubeModule)
        }
    }
}