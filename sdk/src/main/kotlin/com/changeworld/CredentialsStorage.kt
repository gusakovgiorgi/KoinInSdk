package com.changeworld

interface CredentialsStorage {

    fun store(key: String, value: String)

    fun get(key: String): String?
}