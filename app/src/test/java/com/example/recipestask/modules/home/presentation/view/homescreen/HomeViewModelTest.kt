package com.example.recipestask.modules.home.presentation.view.homescreen

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import com.example.recipestask.modules.home.domain.interactors.GetRecipesUseCase
import com.example.recipestask.modules.home.domain.interactors.GetRecipesUseCaseTest
import com.example.recipestask.modules.home.presentation.model.RecipesUIModel
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.coVerifyOrder
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class HomeViewModelTest {
    @get:Rule
    val rule = InstantTaskExecutorRule()
    private lateinit var homeViewModel: HomeViewModel

    @MockK
    lateinit var recipesObserver: Observer<List<RecipesUIModel>>

    @MockK
    lateinit var getRecipesUseCase: GetRecipesUseCase

    @MockK
    lateinit var recipesUiModel: RecipesUIModel

    @MockK
    lateinit var recipesEntity: RecipesEntity
    val dispatcher = TestCoroutineDispatcher()

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Before
    fun setup() {
        MockKAnnotations.init(this, relaxUnitFun = true)
        Dispatchers.setMain(dispatcher)
        homeViewModel = HomeViewModel(getRecipesUseCase)
        homeViewModel.recipes.observeForever(recipesObserver)
    }

    @Test
    fun `getRecipes with success`() = runBlocking {
        coEvery { getRecipesUseCase.build() } returns flowOf(listOf(recipesEntity))

        homeViewModel.getRecipes()
        coVerify { getRecipesUseCase.build() }
        coVerify { recipesObserver.onChanged(listOf(recipesUiModel)) }
    }
}