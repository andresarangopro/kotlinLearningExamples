package com.example.kotlinapp.SecondApp.Adapters

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.kotlinapp.R
import com.example.kotlinapp.SecondApp.models.Person

class PersonListAdapter(private val list:ArrayList<Person>,
                        private val context: Context):RecyclerView.Adapter<PersonListAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): PersonListAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItem(list[position])
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItem(person:Person){
            var tvName: TextView = itemView.findViewById(R.id.tvName) as TextView
            var tvAge:TextView = itemView.findViewById(R.id.tvAge) as TextView
            var tvBorn: TextView = itemView.findViewById(R.id.tvBorn) as TextView

           tvName.text = person.name
           tvAge.text = person.age
           tvBorn.text = person.born
        }
    }
}