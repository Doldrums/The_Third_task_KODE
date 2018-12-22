package com.example.doldr.the_third_task_kode

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {



    private var list_of_items = arrayOf("","Круг", "Прямоугольник", "Треугольник")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner!!.onItemSelectedListener = this
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, list_of_items)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner!!.adapter = aa


    }


    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        if(list_of_items[position]=="Круг"){
            val intent = Intent(this, Circle_activity::class.java)
            startActivity(intent)
        }
        if(list_of_items[position]=="Треугольник"){
            val intent = Intent(this, Delta_activity::class.java)
            startActivity(intent)
        }
        if(list_of_items[position]=="Прямоугольник"){
            val intent = Intent(this, Rectangle_activity::class.java)
            startActivity(intent)
        }
    }



}
