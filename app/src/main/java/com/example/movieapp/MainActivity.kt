package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.movieapp.databinding.ActivityMainBinding
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var film: Any
    private lateinit var adapter: itemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        adapter = itemAdapter {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
        }
        //hello
        binding.film.adapter = adapter


        val toplist = listOf<MymodelUI>(
            MymodelUI(R.drawable.shangchi,"SHang-Chi", id = 1),
            MymodelUI(R.drawable.shangchi,"Eternals", id = 2),
            MymodelUI(R.drawable.shangchi,"Avengers", id = 3),
            MymodelUI(R.drawable.shangchi,"The New Amazing Spider-Man", id = 4),
            MymodelUI(R.drawable.shangchi,"Electro", id = 5),
            MymodelUI(R.drawable.shangchi,"Sherlok Holmas", id = 6),
            MymodelUI(R.drawable.shangchi,"Enola Holmas", id = 7),
        )

        adapter.setList(toplist)
    }
}