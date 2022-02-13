package com.example.recipestask.modules.home.presentation.view.homescreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.courses.modules.home.presentation.view.homescreen.HomeViewModel
import com.example.recipestask.R
import com.example.recipestask.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private val homeViewModel: HomeViewModel by viewModels()
    lateinit var binding: ActivityMainBinding
    private val adapter = RecipesAdapter {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvRecipes.adapter = adapter
        homeViewModel.getRecipes()
        homeViewModel.recipes.observe(this) {
            adapter.submitList(it)
        }
    }
}