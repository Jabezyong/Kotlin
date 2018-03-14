package jabez.example.com.baselibrary.common

import android.app.Application
import jabez.example.com.baselibrary.injection.component.AppComponent
import jabez.example.com.baselibrary.injection.component.DaggerAppComponent
import jabez.example.com.baselibrary.injection.module.AppModule

/**
 * Created by jabez on 14/03/2018.
 */
class BaseApplication: Application(){

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()

        initAppInjection()
    }

    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}