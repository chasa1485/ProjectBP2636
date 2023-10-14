package com.example.projectbp2636

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity_2636 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2636)

        //intent explicit
        //instance
        val btnLogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)
        val logModel = LoginModel()

        //even btn Login click
        btnLogin.setOnClickListener{
            //input
            logModel.username =txtUsername.text.toString()
            logModel.password =txtPassword.text.toString()
            //validate
            if (logModel.loginCheck() == true){
                val intentHome = Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
            }else{
                Toast.makeText(this,"Username/Password Salah!!!!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}