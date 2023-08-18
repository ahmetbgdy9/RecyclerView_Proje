package com.ahmetbugday.recyclerview_proje

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ahmetbugday.recyclerview_proje.databinding.CardFilmTasarimBinding

class FilmAdapter(private val mContext: Context, private val filmlerListesi:List<Filmler>): RecyclerView.Adapter<FilmAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(val binding: CardFilmTasarimBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardFilmTasarimBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = filmlerListesi[position]
        val binding = holder.binding
        binding.textViewFilmAd.text = film.filmAd
        binding.textViewFilmFiyat.text = "${film.filmFiyat} Tl"


        val resimId = mContext.resources.getIdentifier(film.filmResim, "drawable", mContext.packageName)

        binding.imageViewFilmResmi.setImageResource(resimId)

        binding.buttonSepeteEkle.setOnClickListener {
            Toast.makeText(mContext, "${film.filmAd} filmi sepete eklendi.", Toast.LENGTH_SHORT).show()
        }

    }
}
