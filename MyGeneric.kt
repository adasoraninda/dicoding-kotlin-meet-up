package com.dicoding.exam.coba

fun main() {
//    myPrint("3")
//    myPrint(1)
    val listNumber = listOf<Int>(1, 2, 3)
    val listString = listOf<String>("1", "2", "3")
}

fun <T> myPrint(value:T){
    println(value)
}

