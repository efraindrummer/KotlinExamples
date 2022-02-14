package com.example.fundamentoskotlin.classes

import com.example.fundamentoskotlin.newTopic

fun main(){
    newTopic("Colleciones")
    newTopic("Solo lectura")

    val frutaList = listOf("Manzana", "Banana", "Uva", "Lima")
    println(frutaList.get((0..frutaList.size-1).random()))
    println("Index de Uva es ${frutaList.indexOf("Uva")}")

    newTopic("Mutable List")
    val myUser = User(0, "Efrain", "May", Group.FAMILY.ordinal)
    val bro = myUser.copy(1,"ivan")
    val friend = bro.copy(id = 2, group = Group.FRIEND.ordinal)

    val usersList = mutableListOf(myUser, bro)
    println(usersList)
    usersList.add(friend)
    println(usersList)
    //usersList.removeAt(1)
    usersList.remove(bro)
    println(usersList)

    val usersSelectedList = mutableListOf<User>()
    println(usersSelectedList)
    //usersSelectedList.addAll(usersList)
    usersSelectedList.add(myUser)
    println(usersSelectedList)
    usersSelectedList.set(0, bro)
    println(usersSelectedList)
    usersSelectedList.add(myUser)
    usersSelectedList.add(myUser)
    println(usersSelectedList)
}