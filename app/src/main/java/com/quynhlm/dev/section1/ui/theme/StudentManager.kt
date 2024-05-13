package com.quynhlm.dev.section1.ui.theme

class StudentManager {
    private val array: MutableList<Student> = mutableListOf()
    fun addStudent (student: Student){
        this.array.add(student)
    }
    fun deleteStudent (MSSA : String) : Boolean{
        var student = array.stream().filter{ s -> s.MSSV.equals(MSSA)}.findFirst().orElse(null)
        if(student == null){
            return false
        }
        this.array.remove(student)
        return true
    }
    fun updateStudent (Id : String , student: Student) : Boolean{
        println("ID cần sửa là :" + Id)
        var studentUpdate = this.array.stream().filter{ s -> s.MSSV.equals(Id)}.findFirst().orElse(null)
        if(studentUpdate == null){
            return false
        }
            studentUpdate.apply {
                name = student.name
                age = student.age
                MSSV = student.MSSV
                mediumScore = student.mediumScore
                graduated = student.graduated
            }
        println("Thông tin sau khi thay đổi :")
        println(student.toString())
        return true
    }
    fun showListStudent () {
        this.array.stream().forEach{s -> println(s.toString())}
    }
}