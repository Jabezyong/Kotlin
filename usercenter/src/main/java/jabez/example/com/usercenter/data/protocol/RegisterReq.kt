package jabez.example.com.usercenter.data.protocol

/**
 * Created by jabez on 14/03/2018.
 */
data class RegisterReq(val mobile:String, val pwd:String,
                       val verifyCode: String)