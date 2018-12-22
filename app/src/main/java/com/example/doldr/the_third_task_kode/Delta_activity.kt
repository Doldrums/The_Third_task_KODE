package com.example.doldr.the_third_task_kode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_delta.*

class Delta_activity : AppCompatActivity() {
    private var A : Double = 0.0
    private var B : Double = 0.0
    private var C : Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delta)

        val delta = Delta()

        btn_P.setOnClickListener {
            A = txt_A.text.toString().toDouble()
            B = txt_B.text.toString().toDouble()
            C = txt_C.text.toString().toDouble()
            txt_Result.text = delta.P(A,B,C).toString()


        }
        btn_S.setOnClickListener {
            A = txt_A.text.toString().toDouble()
            B = txt_B.text.toString().toDouble()
            C = txt_C.text.toString().toDouble()
            txt_Result.text = delta.S(A,B,C).toString()

        }
    }
}
