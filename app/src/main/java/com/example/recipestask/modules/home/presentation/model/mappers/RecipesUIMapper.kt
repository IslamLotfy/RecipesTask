package com.example.recipestask.modules.home.presentation.model.mappers

import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import com.example.recipestask.modules.home.presentation.model.IngredientModel
import com.example.recipestask.modules.home.presentation.model.RecipesUIModel
import com.example.recipestask.R

fun RecipesEntity.toRecipesUIModel(): RecipesUIModel {
    return RecipesUIModel(
        if (calories.isBlank()) "0" else calories,
        if (carbos.isBlank()) "0" else carbos,
        country,
        deliverableIngredients,
        description,
        difficulty,
        if (fats.isBlank()) "0" else fats,
        favorites,
        if (fibers.isBlank()) "0" else fibers,
        headline,
        highlighted,
        id,
        image,
        incompatibilities,
        ingredients,
        keywords,
        name,
        products,
        if (proteins.isBlank()) "0" else proteins,
        rating,
        ratings,
        time,
        undeliverableIngredients,
        weeks,
        this.getIngredientUIModel()
    )
}

private fun RecipesEntity.getIngredientUIModel(): List<IngredientModel> {
    return ingredients.map { name ->
        val drwable =
            if (deliverableIngredients.contains(name)) R.drawable.ic_right else R.drawable.ic_wrong
        IngredientModel(name = name, drwable)
    }
}
