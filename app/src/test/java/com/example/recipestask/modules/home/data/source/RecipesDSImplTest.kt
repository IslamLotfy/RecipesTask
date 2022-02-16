package com.example.recipestask.modules.home.data.source

import com.example.recipestask.modules.home.data.model.RecipesModel
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class RecipesDSImplTest {
    @MockK
    lateinit var recipeDS: RecipeDS

    @MockK
    lateinit var recipesModel: RecipesModel

    private val recipesList = getRecipesModel()

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `getRecipes with success response`() = runBlocking {
        coEvery { recipeDS.getRecipes() } returns listOf(recipesModel)
        val recipes = recipeDS.getRecipes()
        assertEquals(recipes, listOf(recipesModel))
    }

    @Test
    fun `getRecipes with success response and check list size and items`() = runBlocking {
        coEvery { recipeDS.getRecipes() } returns recipesList
        val recipes = recipeDS.getRecipes()
        assertEquals(recipes, recipesList)
        assertEquals(recipes.size,recipesList.size)
    }
}