package jabez.example.com.usercenter.injection.module

import dagger.Module
import dagger.Provides
import jabez.example.com.usercenter.service.UserService
import jabez.example.com.usercenter.service.impl.UserServiceImpl

/**
 * Created by jabez on 14/03/2018.
 */
@Module
class UserModule{
    @Provides
    fun providesUserService(service: UserServiceImpl): UserService {
        return service
    }
}