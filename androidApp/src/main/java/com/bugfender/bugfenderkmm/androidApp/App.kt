package com.bugfender.bugfenderkmm.androidApp

import android.app.Application

import com.bugfender.bugfenderkmm.shared.BFLogger

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        BFLogger.activateLogger("YOUR-APP-KEY", this)
    }
}