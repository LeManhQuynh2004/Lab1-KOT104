package com.quynhlm.dev.section1.ui.theme.Lab3

import com.quynhlm.dev.section1.ui.theme.StudentManager
import java.util.Scanner

fun main (){
    val scanner = Scanner(System.`in`)
    val teacherManager: TeacherManager = TeacherManager()
    while (true) {
        println("<<Danh sách chức năng>>")
        println("1.Thêm giáo viên mới")
        println("2.Xóa giáo viên")
        println("3.Tính lương thực lĩnh")
        println("4.Hiển thị danh sách sinh viên")
        var choose : Int
        choose = scanner.nextInt()
        when(choose){
            1 -> {
                println("Nhập mã giáo viên")
                var id = readLine().orEmpty()
                println("Nhập tên giáo viên")
                var name = readLine().orEmpty()
                println("Nhập tuổi giáo viên")
                var age = scanner.nextInt()
                scanner.nextLine()
                println("Nhập địa chỉ giáo viên")
                var address = readLine().orEmpty()
                println("Nhập lương cứng")
                var salary : Double = scanner.nextDouble()
                scanner.nextLine()
                println("Nhập địa chỉ giáo viên")
                var bonus : Double = scanner.nextDouble()
                scanner.nextLine()
                println("Nhập địa chỉ giáo viên")
                var penaty : Double = scanner.nextDouble()
                scanner.nextLine()

                var teacher = Teacher(salary,bonus, penaty,id,name,age,address)
                teacherManager.addTeacher(teacher)
            }
            2 -> {
                println("Nhập mã giáo viên")
                var id = readLine().orEmpty()

                var check = teacherManager.deleteTeacher(id)
                if(check){
                    println("Xóa thành công")
                }else{
                    println("Xóa thất bại")
                }
            }
            3 -> {
                println("Nhập mã giáo viên")
                var id = readLine().orEmpty()
                var readSalary = teacherManager.getSalary(id)
                println("Lương thực lĩnh :" + readSalary)
            }
            4 -> {
                teacherManager.showListTeacher()
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
class Lesstion1 {
}