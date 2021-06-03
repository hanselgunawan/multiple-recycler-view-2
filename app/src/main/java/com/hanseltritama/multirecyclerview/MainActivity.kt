package com.hanseltritama.multirecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_main_activity.setHasFixedSize(true)
        rv_main_activity.layoutManager = LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false)


    }
}