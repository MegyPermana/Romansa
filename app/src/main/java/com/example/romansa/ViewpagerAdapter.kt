package com.example.romansa

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.romansa.databinding.OnboardingItemBinding

class ViewpagerAdapter(private var data:List<OnboardingData>) : RecyclerView.Adapter<ViewpagerAdapter.Pager2ViewHolder>() {
    class Pager2ViewHolder(var binding: OnboardingItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Pager2ViewHolder {
        return Pager2ViewHolder(OnboardingItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: Pager2ViewHolder, position: Int) {
        val user = data[position]
        holder.binding.textView.text = user.title
        holder.binding.textView2.text = user.message
        Glide.with(holder.binding.root)
        .load(user.image)
        .into(holder.binding.imageView)

    }

    override fun getItemCount(): Int {
        return data.size
    }
}