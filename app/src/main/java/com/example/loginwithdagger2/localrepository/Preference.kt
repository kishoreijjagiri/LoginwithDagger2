package com.example.loginwithdagger2.localrepository

import android.content.SharedPreferences

class Preference constructor(var sharedPreferences: SharedPreferences)
{

    companion object
    {
        private lateinit var editor :SharedPreferences.Editor
        var AUTHTOKEN="AUTHTOKEN_KEY"

        private const val OAUTH_TOKEN = "OAUTH_TOKEN"
    }


    init {
        editor = sharedPreferences.run { edit() }
    }


    fun putString( key :String,value:String)= editor.putString(key,value).apply()

    fun getString(key: String): String? = sharedPreferences.getString(key,"")
    fun getToken():String? =sharedPreferences.getString(AUTHTOKEN,"")

    fun saveToken(token:String)=editor.putString(AUTHTOKEN,token).apply()




}