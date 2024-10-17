package org.example.just_kotlin

fun main() {
    val str = "rafael";
    val reverseStr = StrReverse().reverseString(str);
    println(reverseStr);
}

class StrReverse {
    fun reverseString(str: String): String {
        var reverseStr = ""
        for (i in str.length -1 downTo 0) {
            reverseStr += str[i]
        }
        return reverseStr
    }
}