package br.com.chicorialabs.itauclonekt

import android.app.Application
import br.com.chicorialabs.itauclonekt.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppApplication)
            modules(viewModelModule)
        }
    }


}