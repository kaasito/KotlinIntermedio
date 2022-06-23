package com.lucas.pruebakotilin

class Designer(name:String, age:Int) : Person(name, age) {
    override fun work(){
        println("Esta persona es designer")
    }
}