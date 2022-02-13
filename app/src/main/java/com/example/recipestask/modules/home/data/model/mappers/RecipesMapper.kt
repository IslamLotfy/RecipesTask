package com.example.recipestask.modules.home.data.model.mappers

import com.example.recipestask.modules.home.data.model.ReceipeModel
import com.example.recipestask.modules.home.domain.entity.RecipesEntity

fun ReceipeModel.toRecipeEntity(): RecipesEntity {
    return RecipesEntity(this.courseName)
}