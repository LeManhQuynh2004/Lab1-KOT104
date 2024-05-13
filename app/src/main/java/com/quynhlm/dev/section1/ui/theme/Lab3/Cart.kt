package com.quynhlm.dev.section1.ui.theme.Lab3

class Cart (var student: Student ,var id : String , var BorrowedDay : String , var PayDay : String , var book_id : String) {
    override fun toString(): String {
        return "Cart(student=$student, id=$id, BorrowedDay=$BorrowedDay, PayDay=$PayDay, book_id=$book_id)"
    }
}