import com.changeworld.AwesomeSdk
import com.changeworld.AwesomeSdkLogger

fun main() {
    AwesomeSdk.init(object : AwesomeSdkLogger {
        override fun log(message: String) {
            println(message)
        }
    })
    val credentialsManager = AwesomeSdk.getCredentialsManager()

    println("Saving login and password")
    credentialsManager.storeLogin("login")
    credentialsManager.storePassword("password")

    println("Getting login and password")
    println("Login: ${credentialsManager.getLogin()}")
    println("Password: ${credentialsManager.getPassword()}")
}