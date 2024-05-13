package com.quynhlm.dev.section1.ui.theme.Lab3

class Teacher(var salary : Double,var bonus : Double , var penaty : Double , id: String, name: String, age: Int, address: String) : People(id, name, age, address) {
    override fun toString(): String {
        return super.toString() +" "+ "salary=$salary, bonus=$bonus, penaty=$penaty, realSalary=${salary + bonus - penaty}"
    }
}