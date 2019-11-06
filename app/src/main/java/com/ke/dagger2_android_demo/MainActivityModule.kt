package com.ke.dagger2_android_demo

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap


@Module
    //(subcomponents = [MainActivityModule_ContributeMainActivity.MainActivitySubcomponent::class])
abstract class MainActivityModule {


    //    @Binds
//    @IntoMap
//    @ClassKey(MainActivity::class)
//    abstract fun bindMainActivityInjectorFactory(factory: MainActivitySubcomponent.Factory): AndroidInjector.Factory<*>
    @ContributesAndroidInjector(modules = [UserModule::class])
    abstract fun contributeMainActivity():MainActivity
}