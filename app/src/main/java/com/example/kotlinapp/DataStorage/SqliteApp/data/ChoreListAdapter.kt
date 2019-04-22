package com.example.kotlinapp.DataStorage.SqliteApp.data

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.kotlinapp.DataStorage.SqliteApp.model.Chore
import com.example.kotlinapp.R

class ChoreListAdapter(private val listChores:ArrayList<Chore>,
                       private val context: Context): RecyclerView.Adapter<ChoreListAdapter.ViewHolder?>(){


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ChoreListAdapter.ViewHolder {
        //
        val view = LayoutInflater.from(context)
            .inflate(R.layout.list_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return listChores.size
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        holder?.bindViews(listChores[position])
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var choreName = itemView.findViewById(R.id.tvName) as TextView
        var assignedBy = itemView.findViewById(R.id.tvAge) as TextView
        var assignedDate = itemView.findViewById(R.id.tvDate) as TextView
        var assignedTo = itemView.findViewById(R.id.tvBorn) as TextView

        fun bindViews(chore:Chore){
            choreName.text = chore.choreName
            assignedBy.text = chore.assignedBy
            assignedDate.text = chore.showHumanDate(chore.timeAssigned!!)
            assignedTo.text = chore.assignedTo

        }

    }
}