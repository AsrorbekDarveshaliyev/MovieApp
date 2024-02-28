package com.example.movieapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.databinding.ItemCardBinding

class itemAdapter(private val listener: ((model: MymodelUI) -> Unit)) :
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


    inner class MyViewHolder(val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: MymodelUI) {
            binding.root.setOnClickListener {
//                itemCardListener?.invoke(model.id)
                listener.invoke(model)
//                Toast.makeText(context, model.name, Toast.LENGTH_SHORT).show()
            }
            binding.img.setImageResource(model.image)
            binding.name.text = model.name
            binding.title.text = model.rating
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemCardBinding.inflate(
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