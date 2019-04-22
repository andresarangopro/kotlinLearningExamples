package com.example.kotlinapp.FirstApp

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.kotlinapp.R
import kotlinx.android.synthetic.main.activity_whats_my_name.*

class WhatsMyName : AppCompatActivity(), View.OnClickListener {


    val marsGravity = 0.38

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whats_my_name)
        var data = intent.extras
        if(data != null){
            var name = data.get("name")
            Toast.makeText(this,"$name",Toast.LENGTH_LONG).show()
        }
        var enteredText = etName.text
        var weigth  = etWeigth.text
        btnName.setOnClickListener{tvName.text = "HELLO $enteredText"}
        btnWeigth.setOnClickListener{tvWeigth.text ="YOUR WEIGTH IN MARS IS: ${calculateWeigth(weigth.toString().toDouble())}"}
        btnBackMenu.setOnClickListener(this)

    }
    fun calculateWeigth(userWeigth:Double):Double = userWeigth*marsGravity

    override fun onClick(v: View?) {
       v as Button
        when(v.id){
            R.id.btnBackMenu->{
                var returnIntent = this.intent
                returnIntent.putExtra("return", "hello from whatsMyName Activity")
                setResult(Activity.RESULT_OK,returnIntent)
                finish()
            }
        }
    }
}
