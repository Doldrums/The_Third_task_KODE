package com.example.doldr.the_third_task_kode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_circle.*

class Circle_activity : AppCompatActivity() {
    private var r : Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)
        val circle = Circle()

        btn_P.setOnClickListener {
            r = txt_Radius.text.toString().toDouble()
            txt_Result.text = circle.P(r).toString()
        }
        btn_S.setOnClickListener {
            r = txt_Radius.text.toString().toDouble()
            txt_Result.text = circle.S(r).toString()
        }


    }
}
