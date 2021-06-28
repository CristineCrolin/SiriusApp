package com.example.siriusapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    public fun signin(view: View) {
        var Intentsignin = Intent(this, Home::class.java)
        startActivity(Intentsignin)
    }

    public fun create(view: View) {
        var Intentcreate = Intent(this, SignUp::class.java)
        startActivity(Intentcreate)
    }
}