package com.example.recipestask.modules.home.data.repository

import com.example.recipestask.modules.home.data.source.RecipesDS
import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import com.example.recipestask.modules.home.domain.repository.RecipesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RecipesRepositoryImpl @Inject constructor(private val recipesDS: RecipesDS):
    RecipesRepository {
    override fun getRecipes(): Flow<List<RecipesEntity>> {
        return recipesDS.getRecipes()
    }
}