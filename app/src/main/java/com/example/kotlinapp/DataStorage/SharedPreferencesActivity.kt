package com.example.kotlinapp.DataStorage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinapp.R
import android.content.SharedPreferences
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.content_shared_preferences.*

class SharedPreferencesActivity : AppCompatActivity(), View.OnClickListener {

    val PREFS_NAME                       ="myPrefs"
    var myPref: SharedPreferences?       = null
    var editor:SharedPreferences.Editor? = null
    var dataBack:SharedPreferences?      = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)

        myPref = getSharedPreferences(PREFS_NAME,0)
        getDataback()        //get data back
    }

    override fun onClick(v: View?) {
        v as Button
        when(v.id){
            R.id.btnWhatever ->{
                editor = (myPref as SharedPreferences?)!!.edit()
                putTxtInEditor(getTextEt(etWhateverOne))
            }
        }
    }

    fun putTxtInEditor(message:String){
        if(!message.equals("")){
            editor!!.putString("message",message)
            editor!!.commit()//very important
        }else{
            Toast.makeText(this,"please enter whatever!!", Toast.LENGTH_LONG).show()
        }
    }

    fun getTextEt(editText:EditText):String = editText.text.toString()

    fun getDataback(){
        dataBack = getSharedPreferences(PREFS_NAME, 0)
        if(dataBack!!.contains("message")){
            var myMessage = dataBack!!.getString("message","not found!")
            tvWhatever.text = myMessage
        }
    }

}
