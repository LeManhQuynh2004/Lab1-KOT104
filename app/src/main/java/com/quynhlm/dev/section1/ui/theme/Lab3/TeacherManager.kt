package com.quynhlm.dev.section1.ui.theme.Lab3

import com.quynhlm.dev.section1.ui.theme.Student

class TeacherManager {
    private val array: MutableList<Teacher> = mutableListOf()

    fun addTeacher (teacher: Teacher){
        this.array.add(teacher)
        println("Thêm thành công")
    }
    fun deleteTeacher (Id : String) : Boolean{
        var teacher = array.stream().filter{ s -> s.id.equals(Id)}.findFirst().orElse(null)
        if(teacher == null){
            return false
        }
        this.array.remove(teacher)
        return true
    }
    fun updateTeacher (Id : String , teacher: Teacher) : Boolean{
        println("ID cần sửa là :" + Id)
        var teacherUpdate = this.array.stream().filter{ s -> s.id.equals(Id)}.findFirst().orElse(null)
        if(teacherUpdate == null){
            return false
        }
        teacherUpdate.apply {
            name = teacher.name
            age = teacher.age
            id = teacher.id
            salary = teacher.salary
            bonus = teacher.bonus
            penaty = teacher.penaty
        }
        println("Thông tin sau khi thay đổi :")
        println(teacher.toString())
        return true
    }

    fun getSalary (Id : String) : Double{
        var teacher = array.stream().filter{ s -> s.id.equals(Id)}.findFirst().orElse(null)
        if(teacher == null){
            return 0.0
        }
        return teacher.salary + teacher.bonus - teacher.penaty
    }
    fun showListTeacher () {
        if (this.array.isEmpty()){
            println("Danh sách trống")
        }else{
            this.array.stream().forEach{s -> println(s.toString())}
        }
    }
}