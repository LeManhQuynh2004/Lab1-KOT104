package com.quynhlm.dev.section1.ui.theme

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    val studentManager: StudentManager = StudentManager()
    while (true){
        println("<<Danh sách chức năng>>")
        println("1.Thêm sinh viên mới")
        println("2.Xóa sinh viên")
        println("3.Sửa sinh viên")
        println("4.Hiển thị danh sách sinh viên")
        println("5.Giải phương trình bậc 1")
        println("6.Kiểm tra quý")
        println("7.Kiểm tra năm nhuận")
        println("0.Thoát chương trình !")
        println("Vui lòng chọn chức năng")
        var choose : Int
        choose = scanner.nextInt()
        when(choose){
            1 -> {
                println("Enter student name:")
                val name = readLine().orEmpty()

                println("Enter student MSSV:")
                val mssv = readLine().orEmpty()

                println("Enter student Age:")
                val ageInput = readLine().orEmpty()
                val age = ageInput.toIntOrNull()

                println("Enter student graduated (true/false):")
                val graduatedInput = readLine().orEmpty()
                val graduated = graduatedInput.toBoolean()

                println("Enter student medium score:")
                val mediumScoreInput = readLine().orEmpty()
                val mediumScore = mediumScoreInput.toFloatOrNull() ?: 0.0f

                val newStudent = Student(name, mssv, mediumScore, age, graduated)
                studentManager.addStudent(newStudent)
            }
            2 -> {
                println("Enter student MSSV:")
                val mssv = readLine().orEmpty()

                var check = studentManager.deleteStudent(mssv)

                if(check == true){
                    println("Xóa thành công")
                }else{
                    println("Xóa thất bại")
                }
            }
            3 -> {
                println("Enter student MSSV:")
                val mssvUpdate = readLine().orEmpty()

                println("Enter update student name:")
                val name = readLine().orEmpty()

                println("Enter update student MSSV:")
                val mssv = readLine().orEmpty()

                println("Enter update student Age:")
                val ageInput = readLine().orEmpty()
                val age = ageInput.toIntOrNull()

                println("Enter update student graduated (true/false):")
                val graduatedInput = readLine().orEmpty()
                val graduated = graduatedInput.toBoolean()

                println("Enter update student medium score:")
                val mediumScoreInput = readLine().orEmpty()
                val mediumScore = mediumScoreInput.toFloatOrNull() ?: 0.0f

                val newStudent = Student(name, mssv, mediumScore, age, graduated)

                var check = studentManager.updateStudent(mssvUpdate,newStudent)

                if(check == true){
                    println("Sửa thành công")
                }else{
                    println("Sửa thất bại")
                }
            }
            4 -> {
                studentManager.showListStudent()
            }
            5 -> {
                lession1()
            }
            6 -> {
                lession2()
            }
            7 -> {
                lession3()
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
fun lession1 (){
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=" + x)
    }
}
fun lession2 (){
    var month = 0
    println("Nhập tháng:")
    val s: String? = readLine()
    if (s != null) month = s.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }
}
fun lession3(){
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break
    } while (true)
    println("Kết thúc chương trình")
}
class Lab2 {

}