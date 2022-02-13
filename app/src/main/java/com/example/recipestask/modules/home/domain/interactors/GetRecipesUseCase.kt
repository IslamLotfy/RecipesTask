package com.example.recipestask.modules.home.domain.interactors

import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import com.example.recipestask.modules.home.domain.repository.RecipesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetRecipesUseCase @Inject constructor(private val recipesRepository: RecipesRepository) {
    fun build(): Flow<List<RecipesEntity>> {
        return recipesRepository.getRecipes()
    }
}