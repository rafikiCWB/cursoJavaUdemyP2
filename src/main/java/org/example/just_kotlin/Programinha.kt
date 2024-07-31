package org.example.just_kotlin

fun main() {
    println("Hello World!")

    val stringList = listOf("item1", "item2", "item3")

    stringList.forEach {
        item -> println(item)
    }
}