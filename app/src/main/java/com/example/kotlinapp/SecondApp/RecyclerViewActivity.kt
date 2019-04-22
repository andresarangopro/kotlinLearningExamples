package com.example.kotlinapp.SecondApp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.kotlinapp.R
import com.example.kotlinapp.SecondApp.Adapters.PersonListAdapter
import com.example.kotlinapp.SecondApp.models.Person
import kotlinx.android.synthetic.main.content_recyclerview_activity.*

class RecyclerViewActivity : AppCompatActivity() {
    private var adapter:PersonListAdapter? = null
    private var personList:ArrayList<Person>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        setupRecycler()

    }

    fun setupRecycler(){
        personList = ArrayList<Person>()
        layoutManager = LinearLayoutManager(this)
        adapter = PersonListAdapter(personList!!, this)

        //setup list (RecyclerView)
        recyclerViewPersons.layoutManager = layoutManager
        recyclerViewPersons.adapter = adapter
        loadData()
        adapter!!.notifyDataSetChanged()
    }

    fun loadData(){
        for(itemPerson in 0..9){
            val person = Person()
            person.name = "James" + itemPerson
            person.age = "${20 +itemPerson}"
            person.born = "${itemPerson}"
            personList!!.add(person)
        }

    }
}
