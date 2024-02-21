package com.changeworld

private const val LOGIN_KEY = "login"
private const val PASSWORD_KEY = "password"
class CredentialsManager internal constructor(private val credentialsStorage: CredentialsStorage, private val logger: AwesomeSdkLogger) {

    fun storeLogin(login:String){
        logger.log("CredentialsManager: Saving login")
        credentialsStorage.store(LOGIN_KEY, login)
    }

    fun storePassword(password:String){
        logger.log("CredentialsManager: Saving password")
        credentialsStorage.store(PASSWORD_KEY, password)
    }

    fun getLogin():String?{
        logger.log("CredentialsManager: Getting login")
        return credentialsStorage.get(LOGIN_KEY)
    }

    fun getPassword():String?{
        logger.log("CredentialsManager: Getting password")
        return credentialsStorage.get(PASSWORD_KEY)
    }
}