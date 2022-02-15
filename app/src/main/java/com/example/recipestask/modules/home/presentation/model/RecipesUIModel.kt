package com.example.recipestask.modules.home.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

data class RecipesUIModel(
    val calories: String = "",
    val carbos: String = "",
    val country: String = "",
    val deliverableIngredients: List<String> = listOf(),
    val description: String = "",
    val difficulty: Int = 0,
    val fats: String = "",
    val favorites: Int = 0,
    val fibers: String = "",
    val headline: String = "",
    val highlighted: Boolean = false,
    val id: String = "",
    val image: String = "",
    val incompatibilities: Any? = null,
    val ingredients: List<String> = listOf(),
    val keywords: List<String> = listOf(),
    val name: String = "",
    val products: List<String> = listOf(),
    val proteins: String = "",
    val rating: Double = 0.0,
    val ratings: Int = 0,
    val time: String = "",
    val undeliverableIngredients: List<Any> = listOf(),
    val weeks: List<String> = listOf(),
    val ingredientsUIModel: List<IngredientModel> = listOf()
)
