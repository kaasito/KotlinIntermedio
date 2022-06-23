package com.lucas.pruebakotilin

open class Person(name:String, age: Int): Work(), Game{
    //Cualquier clase tiene una supervlase comun "Any"

    open fun work(){
        println("Esta persona esta trabajando")
    }

    override fun goToWork() {
        print("Esta persona va al trabajo")
    }

    //Game Interface

    override val game: String
        get() = "Among Us"

    override fun play() {
        print("Esta persona est'a jugando a $game")
    }
}