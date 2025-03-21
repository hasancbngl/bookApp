package org.hasancobanoglu.bookapp

import android.app.Application
import org.hasancobanoglu.di.initKoin
import org.koin.android.ext.koin.androidContext

class BookApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BookApp)

        }
    }
}