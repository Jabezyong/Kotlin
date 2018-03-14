package jabez.example.com.usercenter.service.impl

import jabez.example.com.baselibrary.data.protocol.BaseResp
import jabez.example.com.baselibrary.ext.convertBoolean
import jabez.example.com.baselibrary.rx.BaseException
import jabez.example.com.baselibrary.rx.BaseFuncBoolean
import jabez.example.com.usercenter.data.repository.UserRepository
import jabez.example.com.usercenter.service.UserService
import rx.Observable
import rx.functions.Func1
import javax.inject.Inject

/**
 * Created by jabez on 14/03/2018.
 */
class UserServiceImpl @Inject constructor():UserService{

    @Inject
    lateinit var repository: UserRepository
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {

        return repository.register(mobile,pwd,verifyCode)
                .convertBoolean()
    }

}