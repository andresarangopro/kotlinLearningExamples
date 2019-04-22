package com.example.kotlinapp.Poo

class House(type:String, price:Double, yearBuilt:Int){

    var type:String? = null
    var price:Double? = null
    var yearBuilt:Int? = null
    init{
       this.type = type
       this.price = price
       this.yearBuilt = yearBuilt
    }

    /*this is a bad practice in kotlin*/
    fun GetType(): String? {
        return this.type
    }

    fun SetType(typess:String){
        this.type = typess
    }



}

fun multip(num1 :Int, num2:Int):Int = num1 * num2


fun main(args:Array<String>){

//    println("in two numbers: ")
//    var num1:Int = readLine()!!.toInt()
//    var num2:Int = readLine()!!.toInt()
//
//     add(num1, num2)
//    helloThere()
//    print("sum is ${multiply(num1, num2)}  ")

    var myHouse = House("# Bedroomhouse", 2333.0, 1998)
    println(myHouse.GetType())
    myHouse.SetType("asdf")
    println(myHouse.GetType())
}

/*this don't return any value*/
fun add(num1 :Int, num2:Int){
    var sum = num1 + num2
    println("multiply is: $sum")
}




/*this return an INt you can see next to the parenthesis*/
fun multiply(num1 :Int, num2:Int):Int{
    var multiply = num1 * num2
    return multiply
}

/*if haven't anything is same a void in Java*/
fun helloThere(){
    println("Hello there!")
}