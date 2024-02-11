package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.databinding.MovieBinding

class itemAdapter(private val listener: ((id: Int) -> Unit)) {
    private var list: ArrayList<MyModel> = ArrayList<MyModel>()
    fun setList(list: List<MyModel>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    private fun notifyDataSetChanged() {

    }

    fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.movie)
    }

    private fun setContentView(movie: Int) {

    }

    private var itemCardListener: ((id: Int) -> Unit)? = null

    fun setClickListener(card: ((id: Int) -> Unit)) {
        itemCardListener = card
    }


    inner class MyViewHolder(val binding: MovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: MyModel) {
            binding.root.setOnClickListener {
//                itemCardListener?.invoke(model.id)
                listener.invoke(model.id)
//                Toast.makeText(context, model.name, Toast.LENGTH_SHORT).show()
            }
            binding.rasm.setImageResource(model.image)
            binding.text.text = model.name
            binding.rating.setImageResource(model.image)
        }
    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            MovieBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    fun getItemCount(): Int {
        return list.size
    }
}