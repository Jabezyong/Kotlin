package jabez.example.com.usercenter.data.repository

import jabez.example.com.baselibrary.data.net.RetrofitFactory
import jabez.example.com.baselibrary.data.protocol.BaseResp
import jabez.example.com.usercenter.data.api.UserApi
import jabez.example.com.usercenter.data.protocol.RegisterReq
import rx.Observable
import javax.inject.Inject

/**
 * Created by jabez on 14/03/2018.
 */
class UserRepository @Inject constructor(){
    fun register(mobile:String, pwd: String, verifyCode: String): Observable<BaseResp<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RegisterReq(mobile,pwd,verifyCode))
    }
}