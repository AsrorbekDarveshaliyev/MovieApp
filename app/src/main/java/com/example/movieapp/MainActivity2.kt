package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.movieapp.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var film: Any
    private lateinit var binding: ActivityMainBinding
private lateinit var adapter: Adaptermain
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = Adaptermain {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
        }
        //hello
        binding.film.adapter = adapter

        val list = listOf<MymodelUI>(
            MymodelUI(
                R.drawable.movie_venomfilm,

                "Venom Let There be Carnage",


                id = 1
            ),
            MymodelUI(R.drawable.movie_venomfilm, "King's man", id = 2),
            MymodelUI(R.drawable.movie_venomfilm, "Doctor Strange", id = 3),
            MymodelUI(R.drawable.movie_venomfilm, "Captain America: Civil War", id = 4),
            MymodelUI(R.drawable.movie_venomfilm, "Iron man: Progress", id = 5),
            MymodelUI(R.drawable.movie_venomfilm, "Avengers: Infinity War", id = 6),
            MymodelUI(R.drawable.movie_venomfilm, "Avengers: End Game", id = 7),

            )

        adapter.setList(list)



//        adapter.setClickListener {
//            intent.putExtra("myId", it)
//            startActivity(intent)
//        }
    }



    }
