package com.example.recipestask.modules.home.data.model.mappers

import com.example.recipestask.modules.home.data.model.RecipesModel
import com.example.recipestask.modules.home.domain.entity.RecipesEntity

fun RecipesModel.toRecipeEntity(): RecipesEntity {
    return RecipesEntity(
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