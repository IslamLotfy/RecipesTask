package com.example.recipestask.modules.home.presentation.model.mappers

import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import com.example.recipestask.modules.home.presentation.model.RecipesUIModel

fun RecipesEntity.toRecipesUIModel(): RecipesUIModel {
    return RecipesUIModel(
        calories,
        carbos,
        country,
        deliverableIngredients,
        description,
        difficulty,
        fats,
        favorites,
        fibers,
        headline,
        highlighted,
        id,
        image,
        incompatibilities,
        ingredients,
        keywords,
        name,
        products,
        proteins,
        rating,
        ratings,
        time,
        undeliverableIngredients,
        weeks
    )
}