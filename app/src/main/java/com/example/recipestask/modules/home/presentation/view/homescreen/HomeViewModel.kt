package com.example.courses.modules.home.presentation.view.homescreen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipestask.modules.home.domain.entity.RecipesEntity
import com.example.recipestask.modules.home.domain.interactors.GetRecipesUseCase
import com.example.recipestask.modules.home.presentation.model.RecipesUIModel
import com.example.recipestask.modules.home.presentation.model.mappers.toRecipesUIModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val getRecipesUseCase: GetRecipesUseCase) :
    ViewModel() {
    val recipes = MutableLiveData<List<RecipesUIModel>>()
    fun getRecipes() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                getRecipesUseCase.build().collect {
                    recipes.postValue(it.map { it.toRecipesUIModel() })
                }
            }catch (e:Throwable){

            }
        }
    }
}