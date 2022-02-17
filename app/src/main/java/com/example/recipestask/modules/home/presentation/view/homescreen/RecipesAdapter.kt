package com.example.recipestask.modules.home.presentation.view.homescreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recipestask.databinding.RecipeListItemBinding
import com.example.recipestask.modules.home.presentation.model.RecipesUIModel

class RecipesAdapter constructor(
    private var recipesList: List<RecipesUIModel> = listOf(),
    val onItemClicked: (recipe: RecipesUIModel) -> Unit
) : RecyclerView.Adapter<RecipesAdapter.ViewHolder>() {
    inner class ViewHolder constructor(val itemViewBinding: RecipeListItemBinding) :
        RecyclerView.ViewHolder(itemViewBinding.root) {
        fun bind(recipe: RecipesUIModel) {
            Glide.with(itemViewBinding.root.context)
                .load(recipe.image)
                .into(itemViewBinding.ivPoster)
            itemViewBinding.tvName.text = recipe.name
            itemViewBinding.root.setOnClickListener {
                onItemClicked(recipe)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflator = LayoutInflater.from(parent.context)
        val binding = RecipeListItemBinding.inflate(inflator, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(recipe = recipesList[position])
    }

    override fun getItemCount() = recipesList.size

    fun submitList(list: List<RecipesUIModel>) {
        this.recipesList = list
        notifyDataSetChanged()
    }
}