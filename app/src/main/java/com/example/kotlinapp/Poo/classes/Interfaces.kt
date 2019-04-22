package com.example.kotlinapp.Poo.classes

//Interface classes = classes that have methods without bodies

interface InputHandler{
    fun clicked()
    fun doubleClick()
    fun singleClick()
}

class Button: InputHandler{
    override fun doubleClick() {
       println("Double Click")
    }

    override fun singleClick() {
       println("Single click")
    }

    override fun clicked() {
       println("Button Clicked")
    }

}

class Phone : InputHandler{
    override fun doubleClick() {
        println("Double Click")
    }

    override fun singleClick() {
        println("Single click")
    }

    override fun clicked() {
        println("Phone Clicked")
    }

}
fun main(args:Array<String>){
    var button = Button()
    button.clicked()

    var phone = Phone()
    phone.clicked()

}