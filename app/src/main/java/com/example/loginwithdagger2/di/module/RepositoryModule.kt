package com.example.loginwithdagger2.di.module

import android.content.Context
import com.example.loginwithdagger2.MyApplication
import com.example.loginwithdagger2.localrepository.Preference
import com.example.loginwithdagger2.localrepository.Repository
import com.example.loginwithdagger2.localrepository.RepositoryInteractore

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule
{
    @Provides
    @Singleton
    fun provideContext(application:MyApplication):Context=application.applicationContext

    @Provides
    @Singleton
    fun provideShredPreference(context: Context): Preference = Preference(
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context.applicationContext)
        )


    @Provides
    @Singleton
    fun provideRepositorey(preference: Preference): Repository = RepositoryInteractore(preference)





}