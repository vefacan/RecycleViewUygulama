package com.example.recycleviewuygulama

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class OyunlarAdapter(private val mContext:Context,private val oyunlarListesi:List<Oyunlar>) : RecyclerView.Adapter<OyunlarAdapter.CardTasarimNesneleriTutucu>() {

    inner class CardTasarimNesneleriTutucu(view:View):RecyclerView.ViewHolder(view){

        var imageViewOyunResim:ImageView
        var textViewOyunBaslik:TextView
        var textViewOyunFiyat:TextView
        var buttonSepeteEkle:Button

        init {
            imageViewOyunResim = view.findViewById(R.id.imageViewOyunResim)
            textViewOyunBaslik = view.findViewById(R.id.textViewOyunBaslik)
            textViewOyunFiyat = view.findViewById(R.id.textViewOyunFiyat)
            buttonSepeteEkle = view.findViewById(R.id.buttonSepeteEkle)
        }

    }

    override fun getItemCount(): Int {

        return oyunlarListesi.size

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneleriTutucu {

        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarimi,parent,false)
        return CardTasarimNesneleriTutucu(tasarim)

    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriTutucu, position: Int) {

        val oyun = oyunlarListesi[position]

        holder.textViewOyunBaslik.text = oyun.oyun_ad
        holder.textViewOyunFiyat.text = "${oyun.oyun_fiyat}"
        holder.imageViewOyunResim.setImageResource(mContext.resources.getIdentifier(oyun.oyun_resim_ad,"drawable",mContext.packageName))
        holder.buttonSepeteEkle.setOnClickListener {

            Toast.makeText(mContext,"${oyun.oyun_ad} Sepete Eklendi.",Toast.LENGTH_SHORT).show()
        }
    }
}