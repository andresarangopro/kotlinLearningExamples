package com.example.kotlinapp.Poo.inherit

open class Animal(){
    var name:String?= null
    protected var color:String? =null
    private var numLegs:Int?= null
    constructor(name:String, color:String, numLegs:Int ):this(){
        this.name = name
        this.color = color
        this.numLegs = numLegs
    }

    constructor(name:String, color:String):this(){
        this.name = name
        this.color = color
        println("Object: "+ this.name)
        println("Object: "+ this.color)
    }

    fun setNumLegs(num:Int){
        this.numLegs = num
    }
    fun print(){
        println("Object: "+ this.name)
        println("Object: "+ this.color)
        println("Object: "+ this.numLegs)
    }
}

fun main(args:Array<String>){
   // var animal = Animal("Dog","Brown", 4)
//    var lion = Lion()
//    lion.name ="Lion"
//    lion.color ="Brown"
//    lion.numLegs = 4
//    println("lion legs ${lion.numLegs}")
//    var animal = Animal("animal", "brown" )
      var lion = Animal("ANIMAL", "Brown", 5)
      lion.setNumLegs(4)
      lion.print()
}

class Lion: Animal{
    var numEyes:Int? = null
    var age:Int? = null
    constructor(numEyes:Int, age:Int):super(){
        super.name = name
        this.numEyes = numEyes
        this.age = age
    }
}

class Cat:Animal{
    constructor():super(){
        super.color
    }
}