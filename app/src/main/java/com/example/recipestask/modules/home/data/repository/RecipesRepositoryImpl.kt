package com.example.recipestask.modules.home.data.repository

import com.example.recipestask.modules.home.data.model.mappers.toRecipeEntity
import com.example.recipestask.modules.home.data.source.RecipeDS
import com.example.recipestask.modules.home.data.source.RecipesDSImpl
import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import com.example.recipestask.modules.home.domain.repository.RecipesRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class RecipesRepositoryImpl @Inject constructor(private val recipesDS: RecipeDS,private val dispatcher: CoroutineDispatcher = Dispatchers.IO) :
    RecipesRepository {
    override fun getRecipes(): Flow<List<RecipesEntity>> {
        return flow {
            emit(recipesDS.getRecipes().map { it.toRecipeEntity() })
        }.flowOn(dispatcher)
    }
}