package com.example.kotlinapp.basicExamples

fun main(args:Array<String>){
    /*the same variables but you can put types : String, Int, Double, Boolean, Float, Char*/

    var name:String? = null
    var country:String = "Spain"
    var depends:Boolean = true
    var numberCountry:Int = 2
    var float:Float? = null // add ? to assign value null to a var
    var myChar = 'M'

    println(country +" is $numberCountry, $myChar")

    /*difference between val and var val is like a final*/
    var myName = "Felipe"
    myName = "Andrés"

    println(myName)

    val myLastName = "Paul"
    ///myLastName = "fjaol"
    println(myLastName)
}