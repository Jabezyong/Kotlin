package jabez.example.com.baselibrary.data.protocol

/**
 * Created by jabez on 14/03/2018.
 */
class BaseResp<out T>(val status:Int, val message: String, val data:T)