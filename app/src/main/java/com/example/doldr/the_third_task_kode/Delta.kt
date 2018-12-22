package com.example.doldr.the_third_task_kode

class Delta {
    var A : Double = 0.0
    var B : Double = 0.0
    var C : Double = 0.0

    var X : Double = 0.0
    var Y : Double = 0.0

    fun P (A : Double, B : Double, C : Double): Double {
        var P : Double = A + B + C
        return P
    }
    fun S (A : Double, B : Double, C : Double): Double {
        var P : Double = P(A,B,C)
        var S : Double = Math.sqrt(P * (P-A)*(P-B)*(P-C))
        return S
    }

}