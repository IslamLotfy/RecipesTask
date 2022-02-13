package com.example.recipestask.modules.home.data.api

import com.example.recipestask.modules.home.domain.entity.RecipesEntity

interface RecipesApi {
    suspend fun getRecipes(): List<RecipesEntity>
}