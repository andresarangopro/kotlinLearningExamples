package com.example.kotlinapp.DataStorage.SqliteApp.model

import java.text.DateFormat
import java.util.*

class Chore(){
    fun showHumanDate(timeAssigned: Long): String {
        var dateFormat: DateFormat = DateFormat.getDateInstance()
        var formatDate:String = dateFormat.format( Date(timeAssigned).time )
        return formatDate
    }

    var choreName:String?=null
    var assignedBy:String?=null
    var assignedTo:String?= null
    var timeAssigned:Long?=null
    var id:Int?=null

    constructor(choreName:String, assignedBy:String,
                assignedTo:String, timeAssigned:Long,
                id:Int):this(){
        this.choreName = choreName
        this.assignedBy = assignedBy
        this.assignedTo = assignedTo
        this.timeAssigned = timeAssigned
        this.id = id
    }
}