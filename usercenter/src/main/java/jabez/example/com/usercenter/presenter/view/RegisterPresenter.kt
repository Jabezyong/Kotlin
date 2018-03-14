package jabez.example.com.usercenter.presenter.view

import jabez.example.com.baselibrary.ext.execute
import jabez.example.com.baselibrary.presenter.view.BasePresenter
import jabez.example.com.baselibrary.rx.BaseSubscriber
import jabez.example.com.usercenter.service.UserService
import jabez.example.com.usercenter.service.impl.UserServiceImpl
import javax.inject.Inject


/**
 * Created by jabez on 14/03/2018.
 */
class RegisterPresenter @Inject constructor():BasePresenter<RegisterView>(){

    @Inject
    lateinit var userService: UserService
    fun register(mobile:String, pwd: String, verifyCode: String){
        /**
         * Register
         */


        userService.register(mobile, verifyCode, pwd)
                .execute(object: BaseSubscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult("Register")
                    }
                },lifecycleProvider)

    }


}