package com.example.loginwithdagger2.di

import com.example.loginwithdagger2.MyApplication
import com.example.loginwithdagger2.di.module.ActivityBuilder
import com.example.loginwithdagger2.di.module.RepositoryModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    RepositoryModule::class,
    ActivityBuilder::class
])

interface AppComponent : AndroidInjector<MyApplication>
{
    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<MyApplication>()

}