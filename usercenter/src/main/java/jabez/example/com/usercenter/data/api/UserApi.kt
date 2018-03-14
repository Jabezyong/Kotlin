package jabez.example.com.usercenter.data.api

import jabez.example.com.baselibrary.data.protocol.BaseResp
import jabez.example.com.usercenter.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * Created by jabez on 14/03/2018.
 */
interface UserApi{
    @POST("usercenter/register")
    fun register(@Body req: RegisterReq):Observable<BaseResp<String>>
}