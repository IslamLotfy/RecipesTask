package com.example.recipestask.modules.home.data.source

import com.example.recipestask.modules.home.data.api.RecipesApi
import com.example.recipestask.modules.home.data.model.RecipesModel
import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RecipesDSImpl @Inject constructor(private val recipesApi: RecipesApi):RecipeDS {
    override suspend fun getRecipes(): List<RecipesModel> {
        return recipesApi.getRecipes()
    }
}