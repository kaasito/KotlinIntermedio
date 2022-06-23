package com.lucas.pruebakotilin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
typealias MyMapList =  MutableMap<Int, ArrayList<String>>
typealias MyFun = (Int, String, MyMapList) -> Boolean
typealias MyNestedClass = MyNestedAndInnerClass.MyNestedClass
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

        //Data Classes
        dataClasses()

        //Type aliases
        typeAliases()

        //Destructuring declarations
        destructurinDeclarations()
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
        val myNestedClass = MyNestedClass()
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

    //Data classes

   private fun dataClasses(){

    val lucas = Worker("Lucas", 21, "Programador")
    lucas.lastWork = "Musico"
    val ana = Worker()
    val kasito = Worker("Lucas", 21, "Programador")


    //equals & hashCode
    if (lucas.equals(ana)){
        print("Son iguales")
    } else {
        print("No son iguales")
    }

    /*
    if (lucas == kasito){
        print("Son iguales")
    } else {
        print("No son iguales")
    }
     */

    //ToString
    print(lucas.toString())

    //copy
    val lucas2 = lucas.copy(age = 23)

    //ComponentM
    val (name, age) = kasito
        print(name)
        print(age)
    }

   //Type Aliases
   private var myMap:MyMapList = mutableMapOf()
   private fun typeAliases(){
       var myNewMap :MyMapList = mutableMapOf()
       myNewMap[1] = arrayListOf("Lucas", "Romero")
       myNewMap[2] = arrayListOf("Kasito", "On Spotify")

       myMap = myNewMap
    }

   //Destructuring declarations

   private fun destructurinDeclarations(){
       val (name,_,work) = Worker("Lucas", 21, "Programador")
       print("$name,$work")
       val kasito = Worker("Kasito", 21, "Programador")
       print(kasito.component1())

       val (lucasName,lucasAge) = myWorker()
       print("$lucasName,$lucasAge")

       val myMap = mapOf(1 to "Lucas", 2 to "Ana", 3 to "Sara")
       for (element in myMap){
           print("${element.key}, ${element.value}")
           print("${element.component1()}, ${element.component2()}")
       }

       for ((id, name) in myMap){
           print("${id}, ${name}")
       }

   }

    private fun myWorker(): Worker{
        return Worker("Lucas", 21, "Programador")
    }

}