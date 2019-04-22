package com.example.kotlinapp.menu

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.kotlinapp.FirstApp.WhatsMyName
import com.example.kotlinapp.R
import com.example.kotlinapp.SecondApp.ListAdapterActivity
import com.example.kotlinapp.SecondApp.RecyclerViewActivity
import com.example.kotlinapp.SecondApp.SecondApp
import kotlinx.android.synthetic.main.content_menu_activity.*

class MenuActivity : AppCompatActivity(), View.OnClickListener {

    val REQUEST_CODE =1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }


    override fun onClick(v: View?) {
        v as Button
        when (v.id) {
            R.id.btnFirstApp -> {
                var intent = Intent(this, WhatsMyName::class.java)
                intent.putExtra("name","farango")
                startActivityForResult(intent,REQUEST_CODE)
            }
            R.id.btnSecondApp -> {startActivity(Intent(this, SecondApp::class.java))}
            R.id.btnListView ->{startActivity(Intent(this, ListAdapterActivity::class.java))}
            R.id.btnRecyclerView ->{startActivity(Intent(this, RecyclerViewActivity::class.java))}
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQUEST_CODE){
            if(resultCode == Activity.RESULT_OK){
                var result = data!!.extras.get("return")
                Toast.makeText(this,"$result",Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onPostResume() {
        super.onPostResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }
}

