package com.example.doldr.the_third_task_kode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rectangle.*

class Rectangle_activity : AppCompatActivity() {
    private var A : Double = 0.0
    private var B : Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        val rectangle = Rectangle()

        btn_P.setOnClickListener {
            A = txt_A.text.toString().toDouble()
            B = txt_B.text.toString().toDouble()
            txt_Result.text = rectangle.P(A,B).toString()


        }
        btn_S.setOnClickListener {
            A = txt_A.text.toString().toDouble()
            B = txt_B.text.toString().toDouble()
            txt_Result.text = rectangle.S(A,B).toString()

        }
    }
}
