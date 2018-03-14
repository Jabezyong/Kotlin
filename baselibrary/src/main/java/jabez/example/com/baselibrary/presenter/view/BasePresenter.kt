package jabez.example.com.baselibrary.presenter.view

import android.content.Context
import com.trello.rxlifecycle.LifecycleProvider
import javax.inject.Inject

/**
 * Created by jabez on 14/03/2018.
 */
open class BasePresenter<T:BaseView>{
    lateinit var mView: T

    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>

    @Inject
    lateinit var context: Context

}