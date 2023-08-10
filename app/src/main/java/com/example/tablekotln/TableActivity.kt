package com.example .tablekotln

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TableActivity : AppCompatActivity() {
      var editText: EditText?=null
      var btnDisplay :Button?=null
      var textOutput :TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        editText=findViewById(R.id.editText)
        btnDisplay=findViewById(R.id.btnDisplay)
        textOutput=findViewById(R.id.textOutput)
        btnDisplay?.setOnClickListener {
            val temp:String=editText?.text.toString()
            //string to conversion
            val conversionText:Int=temp.toInt()
            multiplication(conversionText)
        }
    }
    fun multiplication(number:Int){
        //
        textOutput?.text =""
        for (i in 1..12){
            textOutput?.append("$number x$i =" +(number*i)+"\n")

        }

    }
}