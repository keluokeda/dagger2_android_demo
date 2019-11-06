package com.ke.dagger2_android_demo

import dagger.Module
import dagger.Provides

@Module
class UserModule {

    @Provides
    fun provideUser(): User = User("lufei", 20)
}