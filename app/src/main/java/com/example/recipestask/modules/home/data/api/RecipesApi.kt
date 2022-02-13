package com.example.recipestask.modules.home.data.api

import com.example.recipestask.modules.home.data.model.RecipesModel
import retrofit2.http.GET

interface RecipesApi {
    @GET("43427003d33f1f6b51cc")
    suspend fun getRecipes(): List<RecipesModel>
}