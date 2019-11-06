package com.ke.dagger2_android_demo

import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [AndroidInjectionModule::class,MainActivityModule::class])
interface AppComponent {

    fun inject(app: App)
}