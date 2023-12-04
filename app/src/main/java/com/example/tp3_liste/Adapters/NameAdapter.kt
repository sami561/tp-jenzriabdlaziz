package com.example.tp3_liste.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tp3_liste.R

class NameAdapter(private val names : List<String> ): RecyclerView.Adapter<NameAdapter.NameViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
            // Inflating R.layout.name_item
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.name_item, parent, false)
            return NameViewHolder(view)
        }
        var itemClickListener: ((position: Int, name: String) -> Unit)? = null
        override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
    // Getting element from names list at this position
            val element = names[position]
            holder.txtName.text = element

            holder.itemView.setOnClickListener {
                itemClickListener?.invoke(position, element)
            }
        }
        override fun getItemCount(): Int {
            return names.size
        }
        class NameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val txtName = itemView.findViewById(R.id.txtName) as TextView
        }
}