package com.example.kotlinapp.SecondApp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.example.kotlinapp.R

import kotlinx.android.synthetic.main.activity_second_app.*
import kotlinx.android.synthetic.main.content_activity_second.*

class SecondApp : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_app)
        setSupportActionBar(toolbar)
        btnSplash.setOnClickListener(this)
    }

    fun onCheckBoxClicked(view: View){
        view as CheckBox
        var isChecked:Boolean = view.isChecked
        when(view.id){
            R.id.chBFruits->if(isChecked){Log.w("Fruits","IsChecked")} else{Log.w("Fruits","IsNotChecked")}
            R.id.chbVegetables->if(isChecked){Log.w("Vegetables","IsChecked")}else{Log.w("Vegetables","IsNotChecked")}
            R.id.chBGrossers->if(isChecked){Log.w("Grossers","IsChecked")}else{Log.w("Grossers","IsNotChecked")}
        }
    }

    override fun onClick(view:View?){
        view as Button
        when(view.id){
            R.id.btnSplash->Toast.makeText(this,"wow!", Toast.LENGTH_LONG).show()
        }
    }

}


