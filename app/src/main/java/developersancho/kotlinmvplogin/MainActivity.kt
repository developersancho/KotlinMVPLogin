package developersancho.kotlinmvplogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import developersancho.kotlinmvplogin.Presenter.LoginPresenter
import developersancho.kotlinmvplogin.View.ILoginView
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ILoginView {

    override fun onLoginResult(message: String) {
        Toasty.info(this, message, Toast.LENGTH_SHORT).show()
    }

    internal lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)
        btn_login.setOnClickListener {
            loginPresenter.onLogin(edt_email.text.toString(),
                    edt_password.text.toString())
        }

    }


}
