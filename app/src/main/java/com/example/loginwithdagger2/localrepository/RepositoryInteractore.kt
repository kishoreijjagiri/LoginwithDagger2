package com.example.loginwithdagger2.localrepository

import javax.inject.Inject

class RepositoryInteractore @Inject constructor(var preference: Preference) :
    Repository
{
    override fun getStringFromSharedPref(key: String): String = preference.getString(key).toString()
    override fun saveStringeToSharedPref(shkey: String,shvalue:String) =preference.putString(shkey,shvalue)

    override fun saveToken(token: String) =preference.saveToken(token)

    override fun getToken(): String = preference.getToken().toString()

}