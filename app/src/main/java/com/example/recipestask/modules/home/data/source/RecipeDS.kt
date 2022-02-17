package com.example.recipestask.modules.home.data.source

import com.example.recipestask.modules.home.data.model.RecipesModel

interface RecipeDS {
    suspend fun getRecipes(): List<RecipesModel>
}