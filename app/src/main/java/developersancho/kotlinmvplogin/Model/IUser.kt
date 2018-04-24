package developersancho.kotlinmvplogin.Model

interface IUser {
    val email: String
    val password: String
    val isDataValid: Boolean
}