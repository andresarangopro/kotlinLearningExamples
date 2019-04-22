package com.example.kotlinapp.writeReadFile

import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

var fileConversation = "conversation.txt"
var fileMessage ="message.txt"
var menuExit = true

fun main(args:Array<String>){
   do{
       menu()
   }while (menuExit)
}

fun menu(){
    println("1 -> Write")
    println("2 -> Read")
    println("3 -> Exit")
    choice()
}

fun choice(){
    var choice = readLine()!!.toInt()
    when(choice){
        1 ->{
            println("Enter message: ")
            writeToFile(readLine()!!.toString()+"\n")
        }
        2->{
           println("Reading...")
            readFile()
        }
        3->{
            println("Exiting...")
            menuExit = false
        }


    }
}

fun writeToFile(message:String){
    try {
        var writer = FileWriter(fileConversation, true)// second parameter is for append
        writer.write(message)
        writer.close()
    }catch(ex: Exception){
        println("Exception $ex")
    }

}



fun readFile(){
    var reader = FileReader(fileConversation)
    var readMessage:String? = null
    var char:Int?

    try{
        do{
            char = reader.read()
            print(char.toChar())
        }while(char != -1)
    }catch (ex: Exception){
        println("Exception $ex")
    }
}