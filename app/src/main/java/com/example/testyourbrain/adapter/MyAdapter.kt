package com.example.testyourbrain.adapter

import android.content.Context
import android.icu.text.AlphabeticIndex
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testyourbrain.R
import com.example.testyourbrain.db.Records

class MyAdapter(listMain: ArrayList<Records>, context: Context) :
    RecyclerView.Adapter<MyAdapter.MyHolder>() {

    var listArray = listMain
    val contextM = context

    class MyHolder(itemView: View, contextV: Context) : RecyclerView.ViewHolder(itemView) {
        var tvRecord: TextView? = null
        var context = contextV

        fun setData(record: Records) {
            tvRecord = itemView.findViewById(R.id.tvRecord)
            tvRecord?.text = record.rec.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MyHolder(inflater.inflate(R.layout.item_layout, parent, false), contextM)
    }

    override fun getItemCount(): Int {
        return listArray.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.setData(listArray.get(position))
    }

    fun updateAdapter(listRecord: ArrayList<Records>) {
        listArray.clear()
        listArray.addAll(listRecord)
        notifyDataSetChanged()
    }
}