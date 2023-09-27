package com.example.projectbp2636

import android.content.Intent

class LoginModel {
    //variabel
    var username = ""
    var password = ""
    //method/fc
    fun loginCheck():Boolean{
        if(username.equals("tiwi") && password.equals("amikom")){
            return true
        }else{
            return false
        }
    }
}