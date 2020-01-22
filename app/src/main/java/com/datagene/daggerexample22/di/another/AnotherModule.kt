package com.datagene.daggerexample22.di.another

import dagger.Module
import dagger.Provides

@Module
class AnotherModule {
    @Provides
    fun provideString(): String {
        return "just a string"
    }
}