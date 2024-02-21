package com.changeworld

private const val LOGIN_KEY = "login"
private const val PASSWORD_KEY = "password"
class CredentialsManager internal constructor(private val passwordStorage: CredentialsStorage, private val logger: AwesomeSdkLogger) {

    fun storeLogin(login:String){
        logger.log("CredentialsManager: Saving login")
        passwordStorage.store(LOGIN_KEY, login)
    }

    fun storePassword(password:String){
        logger.log("CredentialsManager: Saving password")
        passwordStorage.store(PASSWORD_KEY, password)
    }

    fun getLogin():String?{
        logger.log("CredentialsManager: Getting login")
        return passwordStorage.get(LOGIN_KEY)
    }

    fun getPassword():String?{
        logger.log("CredentialsManager: Getting password")
        return passwordStorage.get(PASSWORD_KEY)
    }
}