package com.example.kotlinapp.SecondApp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.kotlinapp.R
import kotlinx.android.synthetic.main.content_listadapter_view.*

class ListAdapterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_adapter)
        var namesArray:Array<String> =  listDataSource()
        var namesAdapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1, namesArray)
        listView.adapter = namesAdapter

        listView.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this,"ID: $id  Name: ${listView.getItemAtPosition(position).toString()}",Toast.LENGTH_LONG).show()
        }
    }

    fun listDataSource():Array<String> = arrayOf("Aaden","Aage","Aakil","Aalto","Aang",
            "Aarav","Aaron","Aart","Aaru","Aarush","Abacus","Abaddon","Aban","Abanito",
            "Abanu","Abba","Abbas","Abbott","Abdalla","Abdallah")


}


