package com.example.st_affichage

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val annonces: ArrayList<String> = ArrayList()
        var n=3 // number of opportunities in a category  ( lenna nekhdhoha mel base )
        for (i in 1..10){
            annonces.add("annonce # $i")
        }


      recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter= AnnoncesAdapter(annonces)
    }


}
