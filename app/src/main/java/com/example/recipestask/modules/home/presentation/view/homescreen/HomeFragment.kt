package com.example.recipestask.modules.home.presentation.view.homescreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.courses.modules.home.presentation.view.homescreen.HomeViewModel
import com.example.recipestask.R
import com.example.recipestask.databinding.ActivityMainBinding
import com.example.recipestask.databinding.FragmentHomeBinding
import com.example.recipestask.modules.home.presentation.model.RecipesUIModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : Fragment() {
    private var param1: RecipesUIModel? = null
    private lateinit var binding: FragmentHomeBinding
    private val homeViewModel: HomeViewModel by activityViewModels()
    private val adapter = RecipesAdapter {
        homeViewModel.openDetailsFragment.postValue(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.rvRecipes.adapter = adapter
        homeViewModel.getRecipes()
        homeViewModel.recipes.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment()
    }
}