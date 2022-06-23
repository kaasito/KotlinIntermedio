package com.lucas.pruebakotilin

class Programmer(name:String, age:Int, val language:String) : Person(name, age), Vehicle {
    override fun work(){
        println("Esta persona es programador")
    }
    fun sayLanguage(){
        println("Este programador programa en $language")
    }

    override fun goToWork() {
        print("Esta persona va a Google")
    }

    override fun drive() {
        super.drive()
    }
}