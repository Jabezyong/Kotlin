package jabez.example.com.baselibrary.injection.module

import android.app.Activity
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Module
import dagger.Provides
import jabez.example.com.baselibrary.injection.ActivityScope
import jabez.example.com.baselibrary.injection.PerComponentScope

/**
 * Created by jabez on 14/03/2018.
 */
@Module
class LifecycleProviderModule(private val lifecycleProvider: LifecycleProvider<*>) {


    @Provides
    fun providesLifecycleProvider(): LifecycleProvider<*> {
        return lifecycleProvider
    }
}

