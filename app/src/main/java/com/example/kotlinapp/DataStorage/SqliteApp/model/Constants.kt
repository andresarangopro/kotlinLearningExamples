package com.example.kotlinapp.DataStorage.SqliteApp.model

val DATABASE_VERSION:Int = 1
val DATABASE_NAME:String="chores.db"
val TABLE_CHORE:String = "chores"

//chores tables columns names

val KEY_ID:String="id"
val KEY_CHORE_NAME:String ="chore_name"
val KEY_CHORE_ASSIGNED_BY:String ="chore_assigned_by"
val KEY_CHORE_ASSIGNED_TO:String = "chore_assigned_to"
val KEY_CHORE_ASSIGNED_TIME:String ="chore_assigned_time"