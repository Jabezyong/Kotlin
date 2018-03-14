package jabez.example.com.usercenter.service

import rx.Observable

/**
 * Created by jabez on 14/03/2018.
 */
interface UserService {
    fun register(mobile:String, pwd: String, verifyCode: String):Observable<Boolean>
}