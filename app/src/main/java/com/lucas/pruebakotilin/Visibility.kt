package com.lucas.pruebakotilin

class Visibility {
    var name: String? = null

    fun sayMyName(){
        name?.let {
            print("My nombre es $it")
        } ?: run {
            print("No tengo nombre")
        }
    }
}

open class VisibilityTwo {
   protected fun sayMyNameTwo(){
        val visibility = Visibility()
    }
}

class VisibilityThree: VisibilityTwo(){
    internal val age: Int? = null

    fun sayMyNameThree(){
        sayMyNameTwo()
    }
}