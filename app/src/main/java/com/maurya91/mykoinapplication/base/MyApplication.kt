package com.maurya91.mykoinapplication.base

import android.app.Application
import com.maurya91.mykoinapplication.base.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication :Application() {
    override fun onCreate() {
        super.onCreate()

        // start Koin!
        startKoin {
            // Android context
            androidContext(this@MyApplication)
            // modules
            modules(appModule)
        }
}
}