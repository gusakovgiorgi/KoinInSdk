import com.changeworld.AwesomeSdk
import com.changeworld.CredentialsStorage
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun main(args: Array<String>) {
    val credentialsManager = AwesomeSdk.getCredentialsManager()

    println("Saving login and password")
    credentialsManager.storeLogin("login")
    credentialsManager.storePassword("password")

    println("Getting login and password")
    println("Login: ${credentialsManager.getLogin()}")
    println("Password: ${credentialsManager.getPassword()}")
}