package com.quynhlm.dev.section1.ui.theme.Lession3

fun main(){
    var a = 5
    var nhanDoi2 = a.let{
        a * 3
    }
    println(nhanDoi2)
    println("Tổng : " + sum(2,3))
    println("Nhân : " + chiaDoi(2))
//    println("Chia : " + nhanDoi2(2))
}

fun getLength (str : String) : Int {
    return str.run {
        if(isEmpty()){
            return 0
        }
        length
    }
}
var sum : (Int,Int) -> Int = {a,b -> a + b}
var chiaDoi : (Int) -> Int = {c -> c/2}
var nhanDoi = {soA : Int -> soA * 2}
var truDoi : (Int) -> Int = {it - 2}
var nhanDoi3 : (a : Int) -> Int = {a -> a.let{
    a * 3
}}
class Bai3 {
}