package com.example.basickotlin.controlFlow

fun main(){
//val jam = 24
//    when(jam){
//        in 1..5 -> println("bayar parkir sebanhyak\$${jam * 1.0}")
//        in 6..23 -> println("bayar parkir sebanyak \$${((jam - 5.0) * 0.5) + 5}")
//        else -> println("bayar parkir sebanyak \$${(jam % 24.0) * 0.5 + (jam / 24 * 15)}")
//    }

    var parkiranMobil = "Bayar Parkiran Mobil"
    println(parkiranMobil)


    // Cara menghitung harga parkiran menggunakan ElseIf
    var jam = 5



    if (jam >= 1 && jam <= 5) {
        println("bayar parkir sebanyak  \$${jam * 1} " + "untuk " + (jam) + " jam")
    }else if (jam >= 6 && jam < 24) {
        println("bayar parkir sebanyak \$${(((jam - 5.0) * 0.5) + 5)}" + " untuk " + (jam) + " jam")
    }else if (jam >24){
        println("bayar parkir sebanyak \$${(jam % 24.0) * 0.5 +((jam / 24) * 15)}" + " untuk " + (jam) + " jam" )
    }else{
        println("Jangan Boong")
    }

    // Cara menghitung harga parkiran menggunakan When
    when(jam){
        in 1..5 -> println("bayar parkir sebanyak \$${jam *1}" + " untuk " + (jam) + " jam")
        in 6..23 -> println("bayar parkir sebanyak \$${((jam-5.0) * 0.5) + 5.0}" + " untuk " + (jam) + " jam")
        in 24..10000000000 -> println("bayar parkir sebanyak \$${(jam % 24.0) * 0.5 + (jam / 24 * 15)}" + " untuk " + (jam) + " jam")
        else -> println("Jangan Boong ")
    }


}
