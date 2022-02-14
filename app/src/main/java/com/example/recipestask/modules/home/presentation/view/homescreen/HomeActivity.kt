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
    lateinit var binding: ActivityMainBinding
    private val homeViewModel: HomeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val homeFragment = HomeFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .add(binding.fragmentContainerView.id,homeFragment)
            .commit()

        homeViewModel.openDetailsFragment.observe(this){
            val detailsFragment = DetailsFragment.newInstance()
            supportFragmentManager.beginTransaction()
                .replace(binding.fragmentContainerView.id,detailsFragment)
                .addToBackStack("Home")
                .commit()
        }
    }
}