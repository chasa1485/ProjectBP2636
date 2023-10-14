package com.example.projectbp2636

import android.content.Intent
class LoginModel {
    //variabel
    var username = ""
    var password = ""
    fun loginCheck():Boolean{
        if(username.equals("noor") && password.equals("noor1")){
            return true
        }else{
            return false
        }
    }
}