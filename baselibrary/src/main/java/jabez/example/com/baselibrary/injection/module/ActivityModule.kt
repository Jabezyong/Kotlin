package jabez.example.com.baselibrary.injection.module

import android.app.Activity
import dagger.Module
import dagger.Provides
import jabez.example.com.baselibrary.injection.ActivityScope
import jabez.example.com.baselibrary.injection.PerComponentScope

/**
 * Created by jabez on 14/03/2018.
 */
@Module
class ActivityModule(private val activity: Activity) {

    @ActivityScope
    @Provides
    fun provideActivity(): Activity {
        return this.activity
    }
}

