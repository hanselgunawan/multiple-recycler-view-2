package com.hanseltritama.multirecyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hanseltritama.multirecyclerview.R
import com.hanseltritama.multirecyclerview.model.HorizontalModel
import com.hanseltritama.multirecyclerview.model.VerticalModel

class VerticalAdapter(var context: Context, var arrayList: ArrayList<VerticalModel>) : RecyclerView.Adapter<VerticalAdapter.MyVerticalViewHolder>() {

    class MyVerticalViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val recyclerView: RecyclerView = view.findViewById(R.id.rv_horizontal)
        val title: TextView = view.findViewById(R.id.rv_text_view)
        val buttonMore: Button = view.findViewById(R.id.rv_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVerticalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical, parent, false)
        return MyVerticalViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyVerticalViewHolder, position: Int) {
        val verticalModel = arrayList[position]
        val title: String = verticalModel.title
        val singleItem: ArrayList<HorizontalModel> = verticalModel.arrayList

        holder.title.text = title
        val horizontalAdapter = HorizontalAdapter(context, singleItem)

        holder.recyclerView.setHasFixedSize(true)
        holder.recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        holder.recyclerView.adapter = horizontalAdapter

        holder.buttonMore.setOnClickListener {
            Toast.makeText(context, verticalModel.title, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}