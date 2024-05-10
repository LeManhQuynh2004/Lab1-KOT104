package com.quynhlm.dev.section1.ui.theme

import java.util.Scanner

fun Lesson_1() {
    print("Lê Mạnh Quỳnh - Ph32353\n")
    print("=========================\n")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")
}

fun input() : Pair<Int, Int> {
    while (true) {
        try {
            val scanner = Scanner(System.`in`)
            print("Nhập số a: ")
            val a = scanner.nextInt()
            print("Nhập số b: ")
            val b = scanner.nextInt()
            return Pair(a, b)
        } catch (e: Exception) {
            continue
        }
    }
}

fun Lesson_2() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Chọn phép tính mong muốn :")
        println("1.Phép cộng hai số")
        println("2.Phép trừ hai số")
        println("3.Phép nhân hai số")
        println("4.Phép chia hai số")
        println("0.Thoát")
        var choose = scanner.nextInt()
        when (choose) {
            1 -> {
                val (a, b) = input()
                println("Tổng của hai số là ${a + b}")
            }

            2 -> {
                val (a, b) = input()
                println("Hiệu của hai số là ${a - b}")
            }

            3 -> {
                val (a, b) = input()
                println("Tích của hai số là ${a * b}")
            }
            4 -> {
                val (a, b) = input()
                if (a <= 0 || b <= 0) {
                    println("Không thực hiện được khi a hoặc b bằng không")
                } else {
                    println("Thương của hai số là ${a / b}")
                }
            }

            0 -> {
                return
            }

            else -> {
                println("Vui lòng chọn lại 1 -> 4")
                continue
            }
        }
    }
}

fun printMessage(message: String): Unit {                               // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
    for (m in messages) println(prefix + m)
}

fun log(vararg entries: String) {
    printAll(*entries)                                             // 5
}

fun Lession3() {
    printMessage("Hello")                                               // 5
    printMessageWithPrefix("Hello", "Log")                              // 6
    printMessageWithPrefix("Hello")                                     // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                                  // 9
    println(multiply(2, 4))
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("Chọn bài mong muốn :")
    println("1.Bài 1")
    println("2.Bài 2")
    println("3.Bài 3")
    var choose = scanner.nextInt()
    when (choose) {
        1 -> {
            Lesson_1()
        }

        2 -> {
            Lesson_2()
        }

        3 -> {
            Lession3()
        }

        0 -> return
    }
}

class Lab1 {

}