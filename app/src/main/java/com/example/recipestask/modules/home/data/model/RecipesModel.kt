package com.example.recipestask.modules.home.data.model


import com.google.gson.annotations.SerializedName

data class RecipesModel(
    @SerializedName("calories")
    val calories: String = "",
    @SerializedName("carbos")
    val carbos: String = "",
    @SerializedName("country")
    val country: String = "",
    @SerializedName("deliverable_ingredients")
    val deliverableIngredients: List<String> = listOf(),
    @SerializedName("description")
    val description: String = "",
    @SerializedName("difficulty")
    val difficulty: Int = 0,
    @SerializedName("fats")
    val fats: String = "",
    @SerializedName("favorites")
    val favorites: Int = 0,
    @SerializedName("fibers")
    val fibers: String = "",
    @SerializedName("headline")
    val headline: String = "",
    @SerializedName("highlighted")
    val highlighted: Boolean = false,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("image")
    val image: String = "",
    @SerializedName("incompatibilities")
    val incompatibilities: Any? = null,
    @SerializedName("ingredients")
    val ingredients: List<String> = listOf(),
    @SerializedName("keywords")
    val keywords: List<String> = listOf(),
    @SerializedName("name")
    val name: String = "",
    @SerializedName("products")
    val products: List<String> = listOf(),
    @SerializedName("proteins")
    val proteins: String = "",
    @SerializedName("rating")
    val rating: Double = 0.0,
    @SerializedName("ratings")
    val ratings: Int = 0,
    @SerializedName("time")
    val time: String = "",
    @SerializedName("undeliverable_ingredients")
    val undeliverableIngredients: List<Any> = listOf(),
    @SerializedName("weeks")
    val weeks: List<String> = listOf()
)