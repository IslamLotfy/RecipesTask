package com.example.recipestask.modules.home.data.repository

import com.example.recipestask.data.source.FakeRecipeDS
import com.example.recipestask.modules.home.data.source.getRecipesEntity
import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import com.example.recipestask.modules.home.domain.repository.RecipesRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class RecipesRepositoryImplTest {
    @MockK
    lateinit var repositoryMock: RecipesRepository

    private lateinit var repository: RecipesRepository

    @MockK
    lateinit var recipesEntity: RecipesEntity

    private val recipesEntityList = getRecipesEntity()

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
        repository = RecipesRepositoryImpl(FakeRecipeDS(),Dispatchers.Unconfined)
    }

    @Test
    fun `getRecipes with success response`() = runBlocking {
        coEvery { repositoryMock.getRecipes() } returns flowOf(listOf(recipesEntity))
        repositoryMock.getRecipes().collect {
            assertEquals(it, listOf(recipesEntity))
        }
    }

    @Test
    fun `getRecipes with success response with fakeDS`() = runBlocking {
        repository.getRecipes().collect {
            assertEquals(it, recipesEntityList)
        }
    }

}