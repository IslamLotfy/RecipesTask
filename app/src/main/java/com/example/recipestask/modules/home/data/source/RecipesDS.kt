package com.example.recipestask.modules.home.data.source

import com.example.recipestask.modules.home.data.api.RecipesApi
import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RecipesDS @Inject constructor(private val recipesApi: RecipesApi) {
    fun getRecipes(): Flow<List<RecipesEntity>> {
        return flow {
            emit(recipesApi.getRecipes())
        }
    }
}