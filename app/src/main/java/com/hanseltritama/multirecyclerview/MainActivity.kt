package com.hanseltritama.multirecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hanseltritama.multirecyclerview.adapters.VerticalAdapter
import com.hanseltritama.multirecyclerview.model.HorizontalModel
import com.hanseltritama.multirecyclerview.model.VerticalModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: VerticalAdapter
    lateinit var arrayListVertical: ArrayList<VerticalModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrayListVertical = ArrayList()

        rv_main_activity.setHasFixedSize(true)
        rv_main_activity.layoutManager = LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false)

        adapter = VerticalAdapter(this, arrayListVertical)

        rv_main_activity.adapter = adapter

        setData()
    }

    private fun setData() {
        val arrayListHorizontal: ArrayList<HorizontalModel> = ArrayList()
        for (i in 0..5) {
            for (j in 0..5) {
                val horizontalModel = HorizontalModel("Name: $j","Description: $j")
                arrayListHorizontal.add(horizontalModel)
            }
            val verticalModel = VerticalModel("Title $i", arrayListHorizontal)
            arrayListVertical.add(verticalModel)
        }
        adapter.notifyDataSetChanged()
    }
}