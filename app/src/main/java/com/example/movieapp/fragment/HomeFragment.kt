package com.example.movieapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.movieapp.MymodelUI
import com.example.movieapp.R
import com.example.movieapp.databinding.FragmentHomeBinding
import com.example.movieapp.itemAdapter

class HomeFragment : Fragment() {
    private lateinit var adapter: itemAdapter

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        adapter = itemAdapter {
            findNavController().navigate(R.id.detailFragment)
        }
        //hello
        binding.horizontalRv.adapter = adapter


        val toplist = listOf<MymodelUI>(
            MymodelUI(R.drawable.shangchi, "SHang-Chi", id = 1),
            MymodelUI(R.drawable.shangchi, "Eternals", id = 2),
            MymodelUI(R.drawable.shangchi, "Avengers", id = 3),
            MymodelUI(R.drawable.shangchi, "The New Amazing Spider-Man", id = 4),
            MymodelUI(R.drawable.shangchi, "Electro", id = 5),
            MymodelUI(R.drawable.shangchi, "Sherlok Holmas", id = 6),
            MymodelUI(R.drawable.shangchi, "Elona Holmas", id = 7),
        )

        adapter.setList(toplist)
        return binding.root
    }


}