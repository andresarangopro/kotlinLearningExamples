package com.example.kotlinapp.basicExamples

fun main(args: Array<String>){


//    var firstNum = 5
//    println("Ingrese un número: ")
//    var secondNum:Int? = null
//    secondNum = readLine()!!.toInt()
//
//    println("result ${firstNum + secondNum}")
//
//    println(firstNum < secondNum)
//    println(firstNum <= secondNum)
//    println(firstNum > secondNum)
//    println(firstNum >= secondNum)
//    println(firstNum == secondNum)
//    println(firstNum != secondNum)
//
//    /*conditionals*/
//
//    if(firstNum > secondNum)println("mayor") else println("menor")
//
//    /*Logical operations*
//    AND = &&
//    OR = ||
//    NOT = !/
//     */
//
//
//    /*When
//    *
//    * is like a switch case
//    *
//    * null asserted !! is not negation is for a correct cast
//    * */
//
//    println("Enter a number between 17 -19")
//    var age: Int = readLine()!!.toInt()
//
//    when(age){
//        17 -> println("Seventeen")
//        18 -> println("Eighteen")
//        19 -> println("nineTeen")
//        else -> {
//            println("none of the above")
//        }
//    }

    // For loop
//    for (item in 1..5){
//        println("Hey there!")
//    }
//
//    //While Loop
//
//    var counter = 0
//    while (counter <=5 ){
//        println("Counting $counter")
//        ++counter
//    }
//
//    do{
//        println("Counting $counter")
//        --counter
//    }while(counter >= 0)

    var isTrue: Boolean? = true


    do{
        println("Said a number: ")
        var answer: Int? = readLine()!!.toInt()
        when(answer) {
            10->{
                println("you winner that")
                isTrue = false
            }
            else -> println("try again")

        }
    }while(isTrue == true)
}