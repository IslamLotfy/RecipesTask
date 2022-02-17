package com.example.recipestask.modules.home.presentation.view.homescreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.recipestask.databinding.IngredientsListItemBinding
import com.example.recipestask.modules.home.presentation.model.IngredientModel

class IngredientsAdapter constructor(private var ingredients: List<IngredientModel>) :
    RecyclerView.Adapter<IngredientsAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: IngredientsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: IngredientModel) {
            binding.tvIngredientName.text = item.name
            binding.tvIngredientDeliver.setImageDrawable(
                ResourcesCompat.getDrawable(
                    binding.root.context.resources,
                    item.deliverableIcon,
                    null
                )
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflator = LayoutInflater.from(parent.context)
        return ViewHolder(IngredientsListItemBinding.inflate(inflator, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ingredients[position])
    }

    override fun getItemCount() = ingredients.size
}