package com.example.recipestask.modules.home.domain.interactors

import com.example.recipestask.data.source.FakeRecipeDS
import com.example.recipestask.modules.home.data.repository.RecipesRepositoryImpl
import com.example.recipestask.modules.home.data.source.getRecipesEntity
import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import com.example.recipestask.modules.home.domain.repository.RecipesRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetRecipesUseCaseTest {
    @MockK
    lateinit var getRecipesUseCaseTest: GetRecipesUseCase

    private lateinit var getRecipesUseCase: GetRecipesUseCase

    @MockK
    lateinit var recipesEntity: RecipesEntity

    private val recipesEntityList = getRecipesEntity()

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
        getRecipesUseCase = GetRecipesUseCase(RecipesRepositoryImpl(FakeRecipeDS()))
    }

    @Test
    fun `getRecipes with success response`() = runBlocking {
        coEvery { getRecipesUseCaseTest.build() } returns flowOf(listOf(recipesEntity))
        getRecipesUseCaseTest.build().collect {
            assertEquals(it, listOf(recipesEntity))
        }
    }

    @Test
    fun `getRecipes with success response with FakeRepository`() = runBlocking {
        getRecipesUseCase.build().collect {
            assertEquals(it, recipesEntityList)
        }
    }
}