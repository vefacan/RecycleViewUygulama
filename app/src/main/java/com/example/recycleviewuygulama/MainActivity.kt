package com.example.recycleviewuygulama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var oyunlarArrayList: ArrayList<Oyunlar>
    private lateinit var adapter: OyunlarAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val oyun1 = Oyunlar(1,"Apex Legends","apexlegends",0.00)
        val oyun2 = Oyunlar(2,"Valorant","valorant",0.00)
        val oyun3 = Oyunlar(3,"Resident Evil Biohazard","residentevil",145.99)
        val oyun4 = Oyunlar(4,"Marvel's Spiderman","spiderman",400.00)
        val oyun5 = Oyunlar(5,"God Of War","godofwar",299.99)
        val oyun6 = Oyunlar(6,"The Witcher 3 : Wild Hunt","witcher3",79.99)

        oyunlarArrayList = ArrayList<Oyunlar>()

        oyunlarArrayList.add(oyun1)
        oyunlarArrayList.add(oyun2)
        oyunlarArrayList.add(oyun3)
        oyunlarArrayList.add(oyun4)
        oyunlarArrayList.add(oyun5)
        oyunlarArrayList.add(oyun6)

        adapter = OyunlarAdapter(this@MainActivity,oyunlarArrayList)

        rv.adapter = adapter


    }
}