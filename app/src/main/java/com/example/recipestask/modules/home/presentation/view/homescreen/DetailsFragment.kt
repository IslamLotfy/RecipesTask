package com.example.recipestask.modules.home.presentation.view.homescreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.bumptech.glide.Glide
import com.example.recipestask.databinding.FragmentDetailsBinding
import com.example.recipestask.modules.home.presentation.model.RecipesUIModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding
    private val homeViewModel: HomeViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getObject()
    }

    private fun getObject() {
        homeViewModel.recipesUIModel.observe(viewLifecycleOwner) {
            bindData(it)
        }
    }

    private fun bindData(it: RecipesUIModel) {
        Glide.with(requireContext()).load(it.image).into(binding.ivPoster)
        binding.tvName.text = it.name
        binding.tvHeadline.text = it.headline
        binding.tvDiscription.text = it.description
        binding.tvFats.text = it.fats
        binding.tvCarbs.text = it.carbos
        binding.tvCaloris.text = it.calories
        binding.tvFiber.text = it.fibers
        binding.tvProtien.text = it.proteins
        binding.rvIngredients.adapter = IngredientsAdapter(it.ingredientsUIModel)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            DetailsFragment()

    }
}