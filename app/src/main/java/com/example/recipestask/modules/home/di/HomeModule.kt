package com.example.courses.modules.home.di

import com.example.recipestask.modules.home.data.api.RecipesApi
import com.example.recipestask.modules.home.data.repository.RecipesRepositoryImpl
import com.example.recipestask.modules.home.data.source.RecipeDS
import com.example.recipestask.modules.home.data.source.RecipesDSImpl
import com.example.recipestask.modules.home.domain.repository.RecipesRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
abstract class HomeModule {
    companion object {
        @Provides
        fun providesRecipesApiService(retrofit: Retrofit) = retrofit.create(RecipesApi::class.java)
    }
    @Binds
    internal abstract fun bindsRecipesRepository(recipesRepositoryImpl: RecipesRepositoryImpl): RecipesRepository

    @Binds
    internal abstract fun bindsRecipesDS(recipesDSImpl: RecipesDSImpl): RecipeDS
}