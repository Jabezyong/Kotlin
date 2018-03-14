package jabez.example.com.baselibrary.injection.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import jabez.example.com.baselibrary.common.BaseApplication
import javax.inject.Singleton


/**
 * Created by jabez on 14/03/2018.
 */
@Module
class AppModule(private val context:BaseApplication) {

    @Singleton
    @Provides
    fun provideContext():Context{
        return this.context
    }
}