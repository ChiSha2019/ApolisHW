package com.example.apolishw

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class BaseApplication : DaggerApplication() {


     fun applicationInjector(): AndroidInjector<out DaggerApplication> =
         DaggerAppComponent.builder().application(this).build()
}
