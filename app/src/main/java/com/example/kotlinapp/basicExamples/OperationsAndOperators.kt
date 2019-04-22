package com.example.kotlinapp.basicExamples

fun main(args:Array<String>){
    var firstNum = 20
    var secondNum = 10

    var result:Float?

    result = firstNum/secondNum.toFloat()
    println("The sum is ${firstNum + secondNum}")
    println("The Subtraction is ${firstNum - secondNum}")
    println("The multiply is ${firstNum * secondNum}")
    println("The Division is ${firstNum.toFloat() / secondNum}")
    println("The Remainder is ${firstNum % secondNum}")
    println("Increment  ${++firstNum}")
    println("Decrement ${--firstNum}")

    /*ConvertoDataTypes*/

    var age:Int? = 31
    println(age.toString() + 10)
}