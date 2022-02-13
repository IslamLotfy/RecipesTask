package com.example.recipestask.modules.home.presentation.model.mappers

import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import com.example.recipestask.modules.home.presentation.model.RecipesUIModel

fun RecipesEntity.toRecipesUIModel(): RecipesUIModel {
    return RecipesUIModel(this.courseName)
}