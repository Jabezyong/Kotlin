package jabez.example.com.baselibrary.injection.component

import android.app.Activity
import android.content.Context
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Component
import jabez.example.com.baselibrary.injection.ActivityScope
import jabez.example.com.baselibrary.injection.PerComponentScope
import jabez.example.com.baselibrary.injection.module.ActivityModule
import jabez.example.com.baselibrary.injection.module.LifecycleProviderModule

/**
 * Created by jabez on 14/03/2018.
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),modules = arrayOf(ActivityModule::class, LifecycleProviderModule::class))
interface ActivityComponent {

    fun activity(): Activity
    fun context(): Context
    fun lifecycleProvider(): LifecycleProvider<*>
}