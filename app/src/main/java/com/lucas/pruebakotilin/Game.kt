package com.lucas.pruebakotilin

interface Game {

    val game: String

    fun play()

    fun stream(){
        print("Estoy haciendo stream de mi juego $game")
    }
}