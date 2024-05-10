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
    fun updateStudent (MSSA : String , student: Student) : Boolean{
        var studentUpdate = array.stream().filter{ s -> s.MSSV.equals(MSSA)}.findFirst().orElse(null)
        if(studentUpdate == null){
            return false
        }
        studentUpdate.name = student.name
        studentUpdate.age = student.age
        studentUpdate.MSSV = student.MSSV
        studentUpdate.mediumScore = student.mediumScore
        studentUpdate.graduated = student.graduated

        println("Thông tin sau khi thay đổi :")
        println(student.toString())
        return true
    }
    fun showListStudent () {
        this.array.stream().forEach{s -> println(s.toString())}
    }
}