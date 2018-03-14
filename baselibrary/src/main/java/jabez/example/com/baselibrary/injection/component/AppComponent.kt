package jabez.example.com.baselibrary.injection.component

import android.content.Context
import dagger.Component
import jabez.example.com.baselibrary.injection.module.AppModule
import javax.inject.Singleton

/**
 * Created by jabez on 14/03/2018.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent{
    fun context(): Context
}