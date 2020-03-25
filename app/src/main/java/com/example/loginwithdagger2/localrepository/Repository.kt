package com.example.loginwithdagger2.localrepository

interface Repository
{
    fun saveStringeToSharedPref(string: String,stringValue:String)

    fun getStringFromSharedPref(key:String):String

    fun saveToken(token:String)

    fun getToken():String
}