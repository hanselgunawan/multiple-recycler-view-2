package com.hanseltritama.multirecyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hanseltritama.multirecyclerview.R
import com.hanseltritama.multirecyclerview.model.VerticalModel

class VerticalAdapter(context: Context, arrayList: ArrayList<VerticalModel>) : RecyclerView.Adapter<VerticalAdapter.MyVerticalViewHolder>() {

    class MyVerticalViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVerticalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical, parent, false)
        return MyVerticalViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyVerticalViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}