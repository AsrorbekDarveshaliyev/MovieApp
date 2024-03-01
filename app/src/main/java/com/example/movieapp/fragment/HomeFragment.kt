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
    private lateinit var bundle: Bundle
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)


        bundle = Bundle()
        adapter = itemAdapter { data ->
            bundle.putString("name", data.name)
            bundle.putString("rating", data.rating)
            bundle.putInt("img", data.image)
            findNavController().navigate(R.id.detailFragment, bundle)

//            findNavController().navigate(R.id.bottomSheetDialogFragment)
        }
        //hello
        binding.horizontalRv.adapter = adapter
//        binding.horizontalRv.apply {
//            adapter = adapter
//            layoutManager = LinearLayoutManager(requireContext())
//            visibility = View.VISIBLE
//        }


        val toplist = listOf<MymodelUI>(
            MymodelUI(R.drawable.movie_venom, "SHang-Chi", id = 1, rating = "9.8/10 IMDb"),
            MymodelUI(R.drawable.movie_venom, "Eternals", id = 2, rating = "5.2/10 IMDb"),
            MymodelUI(R.drawable.movie_venom, "Avengers", id = 3, rating = "6.8/10 IMDb"),
            MymodelUI(
                R.drawable.movie_venom,
                "The New Amazing Spider-Man",
                id = 4,
                rating = "7.8/10 IMDb"
            ),
            MymodelUI(R.drawable.movie_venom, "Electro", id = 5, rating = "7.8/10 IMDb"),
            MymodelUI(R.drawable.movie_venom, "Sherlok Holmas", id = 6, rating = "7.8/10 IMDb"),
            MymodelUI(R.drawable.movie_venom, "Elona Holmas", id = 7, rating = "7.8/10 IMDb"),
        )

//        toplist?.let {
//
//        }.run {
//            Toast.makeText(requireContext(), "hatolik yuz berdi", Toast.LENGTH_SHORT).show()
//        }
        adapter.setList(toplist)
        return binding.root
    }

}


fun Number.getSquare(): Double {
    return Math.pow(this.toDouble(), 4.0)
}