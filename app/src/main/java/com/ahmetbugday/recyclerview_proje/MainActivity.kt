package com.ahmetbugday.recyclerview_proje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ahmetbugday.recyclerview_proje.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var filmlerArrayList: ArrayList<Filmler>
    private lateinit var adapter: FilmAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL)


        val f1 = Filmler("Forrest Gump","forrestgump",45.5)
        val f2 = Filmler("Barbie","barbie",75.5)
        val f3 = Filmler("Esaretin Bedeli","esaretinbedeli",35.0)
        val f4 = Filmler("Yüzüklerin Efendisi","yuzuklerinefendisi",60.0)
        val f5 = Filmler("Matrix","matrix",90.5)
        val f6 = Filmler("Oppenheimer","oppenheimer",25.5)
        filmlerArrayList = ArrayList<Filmler>()
        filmlerArrayList.add(f1)
        filmlerArrayList.add(f2)
        filmlerArrayList.add(f3)
        filmlerArrayList.add(f4)
        filmlerArrayList.add(f5)
        filmlerArrayList.add(f6)


        adapter = FilmAdapter(this,filmlerArrayList)
        binding.rv.adapter = adapter




    }
}