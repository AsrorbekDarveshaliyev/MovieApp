package com.example.movieapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.databinding.MovieBinding
import com.example.movieapp.databinding.MovieVenomBinding

class itemAdapter(private val listener: ((model:MymodelUI) -> Unit)):
    RecyclerView.Adapter<itemAdapter.MyViewHolder>() {
    private var list: ArrayList<MymodelUI> = ArrayList<MymodelUI>()
    fun setList(list: List<MymodelUI>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }


    private var itemCardListener: ((id: Int) -> Unit)? = null

    fun setClickListener(card: ((id: Int) -> Unit)) {
        itemCardListener = card
    }


    inner class MyViewHolder(val binding: MovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: MymodelUI) {
            binding.root.setOnClickListener {
//                itemCardListener?.invoke(model.id)
                listener.invoke(model)
//                Toast.makeText(context, model.name, Toast.LENGTH_SHORT).show()
            }
            binding.rasm.setImageResource(model.image)
            binding.text.text = model.name
            binding.rating.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            MovieBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}