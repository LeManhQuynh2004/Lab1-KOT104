package com.quynhlm.dev.section1.ui.theme.Lab3

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val cartManager: CartManager = CartManager()
    while (true) {
        println("<<Danh sách chức năng>>")
        println("1.Thêm phiếu mượn mới")
        println("2.Xóa phiếu mượn")
        println("3.Hiển thị danh sách sinh viên")
        println("0.Thoát")
        var choose : Int
        choose = scanner.nextInt()
        when(choose){
            1 -> {
                println("Nhập mã phiếu mượn")
                var id = readLine().orEmpty()
                println("Nhập ngày mượn")
                var brow = readLine().orEmpty()
                println("Nhập ngày trả")
                var pay = readLine().orEmpty()
                scanner.nextLine()
                println("Nhập tên sinh viên")
                var name = scanner.nextLine()
                println("Nhập tuổi sinh viên")
                var age = scanner.nextInt()
                println("Nhập lớp học giáo viên")
                var clas = readLine().orEmpty()
                println("Nhập mã sách")
                var book_id = readLine().orEmpty()

                var student = Student(name,age,clas)
                var cart = Cart(student,id , brow , pay , book_id)
                cartManager.addCart(cart)
            }
            2 -> {
                println("Nhập mã phiếu mượn")
                var id = readLine().orEmpty()

                var check = cartManager.deleteCart(id)
                if(check){
                    println("Xóa thành công")
                }else{
                    println("Xóa thất bại")
                }
            }
            3 -> {
                cartManager.showCartDetails()
            }
            0 -> {
                break
            }
            else -> {
                continue
            }
        }
    }
}
class Lession2 {

}