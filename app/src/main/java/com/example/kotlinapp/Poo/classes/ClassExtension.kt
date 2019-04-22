package com.example.kotlinapp.Poo.classes

fun String.removeFirstAndLastChar() : String = this.substring(1, this.length -1) // It's the same that write String { return this.substring(1 , this.length -1 )}

fun Int.doubleNumber():Int =  this + this

class Outer{
    val mString = "Outside Nested Class"

    //iner is for acces outer class from nested class
    inner class NestedClass{
        val newString = "Inside Nested class"
        fun callInside():String = "Function call from inside Nested class."
        fun getStuff() = mString
    }
}

class Person{

    companion object Name{//Giving a name is optional , but it helps
        val name = "Andrés"
        fun showName() = println("My names is $name")
    }

}

class Point(val x:Int = 0, val y:Int =12){
    //Overload plus function
    operator fun plus(p:Point):Point{
        return Point(x +p.x, y + p.y)
    }

    operator fun minus(p:Point):Point{
        return Point(x -p.x, y- p.y)
    }


}

fun main(args:Array<String>){
    val fullName = "Andrés Felipe"
    val result = fullName.removeFirstAndLastChar()

    val number1 = 12
    val res = number1.doubleNumber()

    println("First characters are: $res")
    //Accesing the member variable of nested class
//    println(Outer.NestedClass().newString)
//    //
//    val nested:Outer.NestedClass = Outer.NestedClass()
//    println(nested.callInside())

//    val outer = Outer()
//    println("Usin Outer objct: ${outer.NestedClass().getStuff()}")
//    val inner = Outer().NestedClass()
//    println("Using inner Object: ${inner.getStuff()}")
//
//    Person.showName()

    val point1 = Point(10,-4)
    val point2 = Point(3, 8)

    var sum = Point()
    sum = point1.plus(point2)
    var substract = Point()
    substract = point1.minus(point2)

    println("The sum = (${sum.x}, ${sum.y})")
    println("The substract = (${substract.x}, ${substract.y})")

}