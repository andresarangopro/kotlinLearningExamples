package com.example.kotlinapp.DataStorage.SqliteApp.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.example.kotlinapp.DataStorage.SqliteApp.data.ChoreListAdapter
import com.example.kotlinapp.DataStorage.SqliteApp.data.ChoresDatabaseHandler
import com.example.kotlinapp.DataStorage.SqliteApp.model.Chore
import com.example.kotlinapp.R
import kotlinx.android.synthetic.main.content_recyclerview_activity.*

class ChoreListActivity : AppCompatActivity() {

    private var adapter:ChoreListAdapter? = null
    private var choreList:ArrayList<Chore>?= null
    private var choreListItems:ArrayList<Chore>?= null
    private var layoutManager:RecyclerView.LayoutManager?=null
    var dbHandler:ChoresDatabaseHandler?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chore_list)

        dbHandler = ChoresDatabaseHandler(this)
        choreList = ArrayList<Chore>()
        choreListItems = ArrayList<Chore>()
        layoutManager = LinearLayoutManager(this)
        adapter = ChoreListAdapter(choreListItems!!, this)

        //setup list = recyclerview
        recyclerViewPersons.layoutManager = layoutManager
        recyclerViewPersons.adapter = adapter

        //load our chores

        choreList = dbHandler!!.readAllChores()
        for(c in choreList!!.iterator()){
           val chore = Chore()
            chore.choreName = c.choreName
            chore.assignedBy = c.assignedBy
            chore.assignedTo =c.assignedTo
            chore.timeAssigned =c.timeAssigned
            chore.showHumanDate(c.timeAssigned!!)
            choreListItems!!.add(chore)
        }
        adapter!!.notifyDataSetChanged()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.top_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.add_menu_button->{  Log.d("Item clicked", "Item add clicked")}
            R.id.info_menu_button->{ Log.d("Item clicked", "Item info clicked")}
        }
        return super.onOptionsItemSelected(item)
    }
}
