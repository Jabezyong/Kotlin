package jabez.example.com.baselibrary.rx

import rx.Subscriber

/**
 * Created by jabez on 14/03/2018.
 */
open class BaseSubscriber<T>: Subscriber<T>(){
    override fun onNext(t: T) {

    }

    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }

}