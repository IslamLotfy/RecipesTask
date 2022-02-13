package com.example.recipestask.modules.home.domain.repository

import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import kotlinx.coroutines.flow.Flow

interface RecipesRepository {
    fun getRecipes(): Flow<List<RecipesEntity>>
}