package com.example.shopapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopapp.Model.Product
import com.example.shopapp.ProductsAdapter.ViewHolder

class ProductsAdapter(private val products: ArrayList<Product>) : RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = products(position).title
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_row, parent, false)
    }

    override fun getItemCount() = products.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById<R.id.photo>()
        val title: TextView = itemView.findViewById<R.id.title>()

    }
}