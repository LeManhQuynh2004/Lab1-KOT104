package com.quynhlm.dev.section1.ui.theme

import java.util.Scanner

fun main (){
    var numbers = arrayOf(1,2,3,4,5)
    for(item in numbers){
        println(item)
    }
    println("--------------------")
    for (i in numbers.indices){
        println("Ví trí số $i và ${numbers[i]}")
    }
    numbers[0] = 2 //Thay đổi giá trị
    numbers[numbers.size -1 ] = 3
    println(numbers.size) //Lấy ra độ dài của mảng

    println("-----------------------")

    var arr = numbers.asList().toMutableList()
    for (item in arr){
        println(item)
    }

    var arrInt = mutableListOf<Int>()
    arrInt.addAll(numbers)

    println("----------------------")

    for (item in arrInt){
        println(item)
    }
    arrInt.add(2)
    arrInt.set(1,2)
    arrInt.remove(9)

    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
    var sc = Scanner(System.`in`)
    var name = sc.nextLine()

    when(name) {
        "one" -> println(numbersMap.get(name))
        else -> println("Không tìm thấy")
    }

//    if(numbersMap.containsKey(name)){
//        println(numbersMap.get(name))
//    }
}

class Lesstion2 {

}