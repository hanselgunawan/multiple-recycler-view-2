package com.hanseltritama.multirecyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.hanseltritama.multirecyclerview.R
import com.hanseltritama.multirecyclerview.model.HorizontalModel

class HorizontalAdapter(var context: Context, var arrayList: ArrayList<HorizontalModel>) : RecyclerView.Adapter<HorizontalAdapter.MyHorizontalViewHolder>() {

    class MyHorizontalViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.horizontal_title)
        val thumb: ImageView = view.findViewById(R.id.horizontal_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHorizontalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horizontal, parent, false)
        return MyHorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyHorizontalViewHolder, position: Int) {
        val horizontalModel: HorizontalModel = arrayList[position]
        holder.title.text = horizontalModel.name
        holder.itemView.setOnClickListener {
            Toast.makeText(context, horizontalModel.name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}