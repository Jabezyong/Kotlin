package jabez.example.com.baselibrary.ext

import android.view.View
import com.trello.rxlifecycle.LifecycleProvider
import jabez.example.com.baselibrary.data.protocol.BaseResp
import jabez.example.com.baselibrary.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import jabez.example.com.baselibrary.rx.BaseFunc
import jabez.example.com.baselibrary.rx.BaseFuncBoolean

/**
 * Created by jabez on 14/03/2018.
 */
fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>, lifecycleProvider: LifecycleProvider<*>) {
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .compose(lifecycleProvider.bindToLifecycle())
            .subscribe(subscriber)
}

fun View.onClick(method: () -> Unit){
    this.setOnClickListener{method()}
}

fun <T> Observable<BaseResp<T>>.convert(): Observable<T>{
    return this.flatMap(BaseFunc<T>())
}

fun <T> Observable<BaseResp<T>>.convertBoolean(): Observable<Boolean>{
    return this.flatMap(BaseFuncBoolean())
}