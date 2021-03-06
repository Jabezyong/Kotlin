package jabez.example.com.baselibrary.ui.activities

import android.os.Bundle
import jabez.example.com.baselibrary.common.BaseApplication
import jabez.example.com.baselibrary.injection.component.ActivityComponent
import jabez.example.com.baselibrary.injection.component.DaggerActivityComponent
import jabez.example.com.baselibrary.injection.module.ActivityModule
import jabez.example.com.baselibrary.injection.module.LifecycleProviderModule
import jabez.example.com.baselibrary.presenter.view.BasePresenter
import jabez.example.com.baselibrary.presenter.view.BaseView
import javax.inject.Inject

/**
 * Created by jabez on 14/03/2018.
 */
abstract open class BaseMvpActivity<T: BasePresenter<*>>: BaseActivity(), BaseView{
    override fun showLoading() {

    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Inject
    lateinit var mPresenter: T

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
        injectComponent()

    }

    private fun initActivityInjection() {
        activityComponent =
                DaggerActivityComponent.builder().appComponent((application as BaseApplication).appComponent)
                .activityModule(ActivityModule(this))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()
    }

    protected abstract fun injectComponent()
}