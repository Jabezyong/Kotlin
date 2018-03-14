package jabez.example.com.usercenter.presenter.view

import jabez.example.com.baselibrary.presenter.view.BaseView

/**
 * Created by jabez on 14/03/2018.
 */
interface RegisterView: BaseView {
    fun onRegisterResult(result:String)
}