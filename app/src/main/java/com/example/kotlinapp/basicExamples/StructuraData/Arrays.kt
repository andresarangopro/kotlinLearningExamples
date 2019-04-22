package com.example.kotlinapp.basicExamples.StructuraData

fun main(args:Array<String>){
    kotlinCollectionsExamle()

}

fun kotlinCollectionsExamle(){
    //Default is alwais inmutable
//    var myArrayLIst = listOf(1,"me", "james", "boni", true)
    var myArrayList = listOf<String>("me", "james", "boni")
    println(myArrayList)

    for(items in myArrayList) println("Items: $items")

    //make it mutable
    var mutablelist = mutableListOf<String>("me", "they", "you")
    mutablelist[0] = "He"

    for(items in mutablelist) println("Items: $items")

    //HashMap
    var myHashMap = hashMapOf(1 to "farango", 2 to "aarango")



    //Array
    var myArray = arrayOf(1,2,3,4)
    myArray[0] = 3
    println(myArray)
    for(items in myArray) println("Items $items")
}

fun hashMap(){
    /**Hashmap = Key-value*/

//    var hashmap = HashMap<Any, String>()
    var hashmap = HashMap<String, String>()
    hashmap.put("negra","coca-cola")
    hashmap.put("transparente","sprite")
    hashmap.put("colores","postobon")
    hashmap.put("verde","mountain daw")

//    println(hashmap.get("negra"))

    for(k in hashmap.keys) println(hashmap.get(k))
}

fun array(){
    var myArray = Array<Int>(5){4} // the two es the value on the all positions

    myArray[0] = 10
    myArray[1] = 1
    myArray[2] = 3
    myArray[3] = 8
    myArray[4] = 100
    myArray[4] = 10010

    //printing object is like foreach
    for(element in myArray){
        println("Index is: " +element)
    }

    //printing item inse od the array via index
    for(index in 0..myArray.size-1){
        println("Index is: " +myArray[index])
    }
    println(myArray[1])
}

fun arraylist(){
    var myArrayList = ArrayList<String>()
    myArrayList.add("farango")
    myArrayList.add("aarango")
    myArrayList.add("aarango")

    if(myArrayList.contains("farango")) println("Yes contains!!!")
    myArrayList.removeAt(2)

    for(names in myArrayList){
        println("Name: "+names)
    }

    for(index in 0..myArrayList.size-1){
        println("Name: "+myArrayList.get(index))
    }

    println(" "+ myArrayList.get(1))

}