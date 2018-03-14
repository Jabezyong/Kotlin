package jabez.example.com.usercenter.injection.component

import dagger.Component
import jabez.example.com.baselibrary.injection.PerComponentScope
import jabez.example.com.baselibrary.injection.component.ActivityComponent
import jabez.example.com.usercenter.injection.module.UserModule
import jabez.example.com.usercenter.ui.activities.RegisterActivity

/**
 * Created by jabez on 14/03/2018.
 */
@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class), modules = arrayOf(UserModule::class))
interface UserComponent{
    fun inject(activity: RegisterActivity)
}