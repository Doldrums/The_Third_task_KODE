package com.example.doldr.the_third_task_kode

class Circle {
    var R : Double = 0.0
    var X : Double = 0.0
    var Y : Double = 0.0



    fun S (R : Double): Double {
        var S : Double = Math.PI*R*R
        return S
    }

    fun P (R : Double): Double {
        var P: Double = 2*Math.PI*R
        return P
    }


}