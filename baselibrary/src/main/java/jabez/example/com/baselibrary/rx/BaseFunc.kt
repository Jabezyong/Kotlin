package jabez.example.com.baselibrary.rx

import jabez.example.com.baselibrary.data.protocol.BaseResp
import rx.Observable
import rx.functions.Func1

/**
 * Created by jabez on 14/03/2018.
 */
class BaseFunc<T>: Func1<BaseResp<T>,
        Observable<T>>{
    override fun call(t: BaseResp<T>): Observable<T> {
        if(t.status != 0){
            return Observable.error(BaseException(t.status,t.message))
        }
        return Observable.just(t.data)
    }
}