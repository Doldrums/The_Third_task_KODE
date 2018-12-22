package com.example.doldr.the_third_task_kode

class Rectangle {
    var A : Double = 0.0
    var B : Double = 0.0

    fun S ( A : Double, B : Double): Double {
        var S : Double = A*B
        return S
    }

    fun P( A : Double, B : Double): Double {
        var P : Double = 2*(A+B)
        return P
    }
}