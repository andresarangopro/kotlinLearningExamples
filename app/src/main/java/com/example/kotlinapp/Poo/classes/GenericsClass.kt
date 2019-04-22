package com.example.kotlinapp.Poo.classes

class Login<T>(name:T, password:T){
    init{
        println("Name: "+ name + " Password: "+ password)

    }
}

class Persona(username:String, password: String){
    var username: String? = null
    var password: String? = null
    init {
        this.username = username
        this.password = password
        println("Person class")
    }
}

fun main(args:Array<String>){
    var login  = Login<String>("farango", "farango")
    var login2 = Login<Int>(1,13242)
    var login3 = Login<Boolean>(true, false)

    var person = Persona("farango", "1234")
    var user = Login<Persona>(person, person)

}