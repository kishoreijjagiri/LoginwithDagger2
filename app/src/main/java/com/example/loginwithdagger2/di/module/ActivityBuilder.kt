package com.example.loginwithdagger2.di.module
import com.example.loginwithdagger2.ui.login.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder
{
    @ContributesAndroidInjector
    abstract fun bindSplashActivty(): LoginActivity


}