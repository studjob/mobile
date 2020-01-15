package com.example.st_affichage

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val electronList: ArrayList<String> = ArrayList()
        val electricityList: ArrayList<String> = ArrayList()
        val desList: ArrayList<String> = ArrayList()
        val etudeList: ArrayList<String> = ArrayList()
        val formatageList: ArrayList<String> = ArrayList()
        var n=30 // number of opportunities in a category  ( lenna nekhdhoha mel base )

       //ELECTRONIQUES
        for (i in 1..n){
            electronList.add("electronique # $i")
        }

      recyclerView.layoutManager=LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter= AnnoncesAdapter(electronList)

        //ELECTRICITY
        for (i in 1..41){
            electricityList.add("electricité # $i")
        }


        triciti.layoutManager=LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        triciti.adapter= AnnoncesAdapter(electricityList)


        //DESIGN
        for (i in 1..50){
            desList.add("design # $i")
        }


        design.layoutManager=LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        design.adapter= AnnoncesAdapter(desList)


        //ETUDE
        //for (i in 1..26){
          //  etudeList.add("etude # $i")
        //}


        //etude.layoutManager=LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        //etude.adapter= AnnoncesAdapter(etudeList)


        //FORMATAGE PC
       // for (i in 1..30){
         //   formatageList.add("formatage pc # $i")
        //}


        //formatage.layoutManager=LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        //formatage.adapter= AnnoncesAdapter(formatageList)
    }


}
