package com.changeworld

import org.koin.dsl.module

val baseModule = module {
    single<CredentialsStorage> { SuperSecureCredentialsStorage() }
    single { CredentialsManager(get(), get()) }
}