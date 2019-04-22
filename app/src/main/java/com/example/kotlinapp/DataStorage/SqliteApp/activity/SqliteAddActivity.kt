package com.example.kotlinapp.DataStorage.SqliteApp.activity

import android.app.ProgressDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.kotlinapp.DataStorage.SqliteApp.data.ChoresDatabaseHandler
import com.example.kotlinapp.DataStorage.SqliteApp.model.Chore
import com.example.kotlinapp.R
import kotlinx.android.synthetic.main.content_shared_preferences.*

class SqliteAddActivity : AppCompatActivity(), View.OnClickListener {


    var dbHandler:ChoresDatabaseHandler? =null
    var etEnterChore:EditText?           =null
    var etAssignedBy:EditText?           =null
    var etAssignedTo:EditText?           =null
    var progressDialog: ProgressDialog?  = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlite_add)
        dbHandler = ChoresDatabaseHandler(this)
        progressDialog = ProgressDialog(this)
        init()
    }

    fun init() {
        etEnterChore = etWhateverOne
        etAssignedBy = etWhateverTwo
        etAssignedTo = etWhateverThree
    }

    override fun onClick(v: View?) {
        v as Button
        when (v.id) {
            R.id.btnWhatever -> {
                progressDialog!!.setMessage("Saving...")
                progressDialog!!.show()
                addChoreToDataBase()
            }
            R.id.btnNextWhatever->{startActivity(Intent(this, ChoreListActivity::class.java))}
        }
    }

    fun addChoreToDataBase(){
        if(isNotEditTextNull(etEnterChore) &&  isNotEditTextNull(etAssignedBy)
            && isNotEditTextNull(etAssignedTo)){
            var chore = Chore()
            chore.choreName = etEnterChore!!.text.toString()
            chore.assignedTo = etAssignedBy!!.text.toString()
            chore.assignedBy = etAssignedBy!!.text.toString()
            saveToDB(chore)
            progressDialog!!.cancel()
            startActivity(Intent(this, ChoreListActivity::class.java))
        }
    }

    fun isNotEditTextNull(editText:EditText?):Boolean{
        if(!TextUtils.isEmpty(editText!!.text.toString()))return true
        else {
            editText.setError("Please enter information")
            return false
        }
    }

    fun saveToDB(chore:Chore){
        dbHandler?.createChore(chore)
    }
}
