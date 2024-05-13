package com.quynhlm.dev.section1.ui.theme.Lab3

class CartManager {
    private val array: MutableList<Cart> = mutableListOf()
    fun addCart(cart: Cart){
        this.array.add(cart)
    }
    fun deleteCart (Id : String) : Boolean{
        var cart = array.stream().filter{ s -> s.id.equals(Id)}.findFirst().orElse(null)
        if(cart == null){
            return false
        }
        this.array.remove(cart)
        return true
    }
    fun showCartDetails () {
        if (this.array.isEmpty()){
            println("Danh sách trống")
        }else{
            this.array.stream().forEach{s -> println(s.toString())}
        }
    }
}