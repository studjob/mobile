package com.example.st_affichage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnnoncesAdapter (val annonces: ArrayList<String>) :
    RecyclerView.Adapter<AnnoncesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_annonce, parent, false)
        return ViewHolder(view )
    }

    override fun getItemCount()= annonces.size

    override fun onBindViewHolder(holder: AnnoncesAdapter.ViewHolder, position: Int) {
            holder.category1.text=annonces[position]
    }

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val category1: TextView= itemView.findViewById(R.id.category1)
    }
}