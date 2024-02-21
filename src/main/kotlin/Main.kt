import com.changeworld.AwesomeSdk

fun main(args: Array<String>) {
    val credentialsManager = AwesomeSdk.getCredentialsManager()

    println("Saving login and password")
    credentialsManager.storeLogin("login")
    credentialsManager.storePassword("password")

    println("Getting login and password")
    println("Login: ${credentialsManager.getLogin()}")
    println("Password: ${credentialsManager.getPassword()}")
}