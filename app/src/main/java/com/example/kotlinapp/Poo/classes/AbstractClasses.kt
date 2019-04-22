package com.example.kotlinapp.Poo.classes

//Abstract Classes = not meant to be instantiated and they also
//can have a mixture of functions declared with or without an implementaton

abstract class GraphicObject{

    fun moveTo(newX:Int, newY:Int){
        println("Moved to $newX and $newY")
    }

    abstract fun draw()
    abstract fun resize()
}

class Circle: GraphicObject() {
    override fun draw() {
        println("Drawing a circle")
    }

    override fun resize() {
        println("resize a circle")
    }

}

class Triangle: GraphicObject(){
    override fun draw() {
        println("Drawing a triangle")
    }

    override fun resize() {
        println("Resize a triangle")
    }

}

fun main(args:Array<String>){
    var circle = Circle()
    circle.draw()
    circle.moveTo(12,23)

    var triangle = Triangle()
    triangle.resize()
    triangle.moveTo(25,30)
}