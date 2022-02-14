package com.example.fundamentoskotlin.classes

open class Computer(val number: Int, var name: String, var price: Int, var description: String) {
    open fun buy(){
        println("Esto es una data class")
    }
}