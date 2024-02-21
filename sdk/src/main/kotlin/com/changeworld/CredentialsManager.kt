package com.changeworld

private const val LOGIN_KEY = "login"
private const val PASSWORD_KEY = "password"
class CredentialsManager internal constructor(private val passwordStorage: CredentialsStorage) {

    fun storeLogin(login:String){
        passwordStorage.store(LOGIN_KEY, login)
    }

    fun storePassword(password:String){
        passwordStorage.store(PASSWORD_KEY, password)
    }

    fun getLogin():String?{
        return passwordStorage.get(LOGIN_KEY)
    }

    fun getPassword():String?{
        return passwordStorage.get(PASSWORD_KEY)
    }
}