package jabez.example.com.usercenter.ui.activities


import android.os.Bundle
import jabez.example.com.baselibrary.ext.onClick
import jabez.example.com.baselibrary.ui.activities.BaseMvpActivity
import jabez.example.com.usercenter.R
import jabez.example.com.usercenter.injection.component.DaggerUserComponent
import jabez.example.com.usercenter.injection.module.UserModule
import jabez.example.com.usercenter.presenter.view.RegisterPresenter
import jabez.example.com.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast


class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {
    override fun injectComponent() {
        DaggerUserComponent.builder().activityComponent(activityComponent).userModule(UserModule()).build()
        mPresenter.mView = this
    }

    override fun onRegisterResult(result: String) {
        toast("{$result}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mRegisterBtn.onClick{
            mPresenter.register(mMobileEt.toString(),mCodeEt.toString(),
                    mPassEt.toString())
        }
    }


}
