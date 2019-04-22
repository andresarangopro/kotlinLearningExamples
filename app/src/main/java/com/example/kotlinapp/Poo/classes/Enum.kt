package com.example.kotlinapp.Poo.classes

//Enum Classes = allow us to represent collecion of information
//(fixed or static information)

enum class  Suits(){
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}


enum class Direction{
    NORTH,
    SOUTH,
    EAST,
    WEST
}

fun main(args:Array<String>){
    var cardPlayer = Suits.DIAMONDS
    var cardPlayer2 = Suits.CLUBS

    if(cardPlayer == Suits.DIAMONDS)println(" You are doing great!")
    if(cardPlayer2 == Suits.CLUBS)println(" Hello there! Things are not so well")

    var playerDirection = Direction.NORTH
    if(playerDirection == Direction.NORTH){
        println("You are going north")
    }
}