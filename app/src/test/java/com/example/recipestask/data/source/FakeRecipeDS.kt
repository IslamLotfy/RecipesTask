package com.example.recipestask.data.source

import com.example.recipestask.modules.home.data.model.RecipesModel
import com.example.recipestask.modules.home.data.source.RecipeDS

class FakeRecipeDS : RecipeDS {
    override suspend fun getRecipes(): List<RecipesModel> {
        return listOf(
            RecipesModel(
                calories = "250",
                carbos = "50",
                country = "EG",
                deliverableIngredients = listOf("Chicken", "rice"),
                description = "Chicken with rice",
                difficulty = 10,
                fats = "30",
                favorites = 0,
                fibers = "",
                headline = "Chicken",
                highlighted = false,
                id = "1222",
                image = "image.jpeg",
                incompatibilities = null,
                ingredients = listOf("Chicken", "rice"),
                keywords = listOf(),
                name = "Chicken Macdo",
                products = listOf(),
                proteins = "50",
                rating = 3.1,
                ratings = 3,
                time = "",
                undeliverableIngredients = emptyList(),
                weeks = listOf()
            ),
            RecipesModel(
                calories = "250",
                carbos = "50",
                country = "EG",
                deliverableIngredients = listOf("Chicken", "rice"),
                description = "Chicken with rice",
                difficulty = 10,
                fats = "30",
                favorites = 0,
                fibers = "",
                headline = "Chicken",
                highlighted = false,
                id = "1222",
                image = "image.jpeg",
                incompatibilities = null,
                ingredients = listOf("Chicken", "rice"),
                keywords = listOf(),
                name = "Chicken Macdo",
                products = listOf(),
                proteins = "50",
                rating = 3.1,
                ratings = 3,
                time = "",
                undeliverableIngredients = emptyList(),
                weeks = listOf()
            ),
            RecipesModel(
                calories = "250",
                carbos = "50",
                country = "EG",
                deliverableIngredients = listOf("Chicken", "rice"),
                description = "Chicken with rice",
                difficulty = 10,
                fats = "30",
                favorites = 0,
                fibers = "",
                headline = "Chicken",
                highlighted = false,
                id = "1222",
                image = "image.jpeg",
                incompatibilities = null,
                ingredients = listOf("Chicken", "rice"),
                keywords = listOf(),
                name = "Chicken Macdo",
                products = listOf(),
                proteins = "50",
                rating = 3.1,
                ratings = 3,
                time = "",
                undeliverableIngredients = emptyList(),
                weeks = listOf()
            ),
            RecipesModel(
                calories = "250",
                carbos = "50",
                country = "EG",
                deliverableIngredients = listOf("Chicken", "rice"),
                description = "Chicken with rice",
                difficulty = 10,
                fats = "30",
                favorites = 0,
                fibers = "",
                headline = "Chicken",
                highlighted = false,
                id = "1222",
                image = "image.jpeg",
                incompatibilities = null,
                ingredients = listOf("Chicken", "rice"),
                keywords = listOf(),
                name = "Chicken Macdo",
                products = listOf(),
                proteins = "50",
                rating = 3.1,
                ratings = 3,
                time = "",
                undeliverableIngredients = emptyList(),
                weeks = listOf()
            ),
            RecipesModel(
                calories = "250",
                carbos = "50",
                country = "EG",
                deliverableIngredients = listOf("Chicken", "rice"),
                description = "Chicken with rice",
                difficulty = 10,
                fats = "30",
                favorites = 0,
                fibers = "",
                headline = "Chicken",
                highlighted = false,
                id = "1222",
                image = "image.jpeg",
                incompatibilities = null,
                ingredients = listOf("Chicken", "rice"),
                keywords = listOf(),
                name = "Chicken Macdo",
                products = listOf(),
                proteins = "50",
                rating = 3.1,
                ratings = 3,
                time = "",
                undeliverableIngredients = emptyList(),
                weeks = listOf()
            )
        )
    }
}