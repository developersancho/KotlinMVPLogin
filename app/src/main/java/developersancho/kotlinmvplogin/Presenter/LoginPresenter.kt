package developersancho.kotlinmvplogin.Presenter

import developersancho.kotlinmvplogin.Model.User
import developersancho.kotlinmvplogin.View.ILoginView

class LoginPresenter(internal var iLoginView: ILoginView) : ILoginPresenter {

    override fun onLogin(email: String, password: String) {
        val user = User(email,password)
        val isLoginSuccess = user.isDataValid
        if (isLoginSuccess)
            iLoginView.onLoginResult("Login Success")
        else
            iLoginView.onLoginResult("Login Error")
    }
}