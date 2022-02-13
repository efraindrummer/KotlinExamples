package com.example.fundamentoskotlin

fun main(){
    newTopic("Bucles")
    showPersons("Angel", "Marry", "Carlos")
    showPersons("Angel", "Marry", "Alex", "Sergio", "Karla")
}



fun showPersons(p1: String, p2: String, p3: String){
    println(p1)
    println(p2)
    println(p3)
}

fun showPersons(vararg persons: String) {
    newTopic("Ciclo FOR")
    for (person in persons) println(person)

    newTopic("Ciclo WHILE")
    var index = 0
    while (index < persons.size){
        if(persons[index] == "Marry") println("Es Merry")
        println(persons[index])
        index++
    }

    newTopic("WHEN")
    index = (0..persons.size-1).random()
    println(index)
    when (persons[index]){
        "Angel" -> println("Es Angel!")
        "Marry" -> {
            println("Ir a otra pantalla")
            println(2+4)
        }
        else -> println(persons[index])
    }
}