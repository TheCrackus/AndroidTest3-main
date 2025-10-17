package com.example.androidtest3.ui.characters.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidtest3.data.model.Result
import com.example.androidtest3.databinding.CharacterItemBinding

class CharacterRecyclerViewAdapter : RecyclerView.Adapter<CharacterRecyclerViewAdapter.CharacterViewHolder>() {
    private val items = mutableListOf<Result>()

    fun submit(list: List<Result?>) {
        items.clear()
        items.addAll(list.filterNotNull())
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharacterViewHolder {
        val binding = CharacterItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CharacterViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: CharacterViewHolder,
        position: Int
    ) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class CharacterViewHolder(
        private val characterBinding: CharacterItemBinding
    ) : RecyclerView.ViewHolder(characterBinding.root) {
        fun bind (character: Result) {
            Glide.with(characterBinding.root).load(character.image).into(characterBinding.characterImage)
            characterBinding.characterName.text = character.name
        }
    }
}