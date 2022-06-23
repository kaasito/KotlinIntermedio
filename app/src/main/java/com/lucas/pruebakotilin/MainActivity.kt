package com.lucas.pruebakotilin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Enum Classes
        enumClases()
        //Nested and Inner Classes
        nestedAndInnerClasses()
        //Class Inheritance
        classInheritance()

        //Interfaces
        interfaces()

        //Visibility Modifiers
        visibilityModifiers()

    }

    //Enum Classes

    enum class Direction(val dir : Int) {
        NORTH(1), SOUTH(-1), EAST(1), WEST(-1);

        fun description(): String {
            return when (this){
                NORTH -> "La direccion es Norte"
                SOUTH -> "La direccion es Sur"
                EAST -> "La direccion es Este"
                WEST -> "La direccion es Oeste"
            }
        }
    }


    private fun enumClases(){
        var userDirection: Direction? = null
        println("Direccion : $userDirection")

        userDirection = Direction.NORTH
        println("Direccion : $userDirection")

        userDirection.name //Lo que vale "NORTH"
        userDirection.ordinal //La posicion 0
        userDirection.description()
        userDirection.dir
    }

    //Nested and Inner Classes

    private fun nestedAndInnerClasses(){
        //Clase Anidada (nested)
        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        val sum = myNestedClass.sum(1,2)
        println("El resultado de la suma es $sum")

        //Clase inerta (inner)
        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sumTwo = myInnerClass.sumTwo(10)
        println("El resultado de sumar dos es $sumTwo")
    }

    //Class Inheritance

    private fun classInheritance(){
        val person = Person("Sara",  40)

      val programmer = Programmer("Lucas", 21,  "Swift")
        programmer.work()
        programmer.sayLanguage()
        programmer.goToWork()
        programmer.drive()
        val designer = Designer( "Lucas",  21)
        designer.work()
        designer.goToWork()
    }

    //Interfaces

    private fun interfaces(){
        val gamer = Person("Lucas", 21)
        gamer.play()
        gamer.stream()
    }

    //Visibility Modifiers
    private fun visibilityModifiers(){
        val visibility = Visibility()
        visibility.name = "Lucas"
        visibility.sayMyName()
    }

}