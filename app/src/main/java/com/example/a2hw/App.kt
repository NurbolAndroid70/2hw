package com.example.a2hw

import android.app.Application
import com.example.a2hw.data.database.di.dataModules
import com.example.a2hw.domain.di.domainModule
import com.example.a2hw.presentation.di.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            androidLogger(Level.DEBUG)
            modules(dataModules)
            modules(domainModule)
            modules(uiModule)
        }
    }
}