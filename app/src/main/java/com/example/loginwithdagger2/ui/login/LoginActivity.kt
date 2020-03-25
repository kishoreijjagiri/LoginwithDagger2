package com.example.loginwithdagger2.ui.login


import android.os.Bundle
import com.example.loginwithdagger2.R
import com.example.loginwithdagger2.localrepository.Repository
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class LoginActivity : DaggerAppCompatActivity() {



    @Inject
    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        repository.saveToken("asdsfdsgfdgv")
        repository.saveStringeToSharedPref("username_key","kishore")
    }

}
