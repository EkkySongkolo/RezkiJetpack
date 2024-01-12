package com.rezki.jetpack.di

import com.rezki.jetpack.data.RepositoryAnimals

object Injection {
    fun provideRepository(): RepositoryAnimals {
        return RepositoryAnimals.getInstance()
    }
}