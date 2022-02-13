package com.example.fundamentoskotlin.classes

import com.example.fundamentoskotlin.newTopic

fun main(){
    newTopic("Colleciones")
    newTopic("Solo lectura")

    val frutaList = listOf("Manzana", "Banana", "Uva", "Lima")
    println(frutaList.get((0..frutaList.size-1).random()))
    println("Index de Uva es ${frutaList.indexOf("Uva")}")
}