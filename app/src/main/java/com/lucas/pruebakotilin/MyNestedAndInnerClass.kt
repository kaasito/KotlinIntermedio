package com.lucas.pruebakotilin

class MyNestedAndInnerClass {
    //Clase Anidada (Nested Class)

    private val one = 1
    fun returnOne() : Int {
        return 1
    }
    //Clase Anidada (Nested Class)
    class MyNestedClass {
        fun sum(first: Int, sec: Int) : Int {
            return first + sec
        }
    }

    //Clase Interna (Inner Class)
   inner class MyInnerClass {
        fun sumTwo(number:Int) :Int {
           return number + one + returnOne()
        }
    }
}