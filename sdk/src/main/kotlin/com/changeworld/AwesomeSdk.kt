package com.changeworld

object AwesomeSdk {

    fun getCredentialsManager(): CredentialsManager {
        return IsolatedKoinContext.koin.get()
    }
}