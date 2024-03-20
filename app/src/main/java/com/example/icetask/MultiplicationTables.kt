package com.example.icetask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MultiplicationTables : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication_tables)

        //write code here...
        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")
// convert the table number to an integer
        val tableNumber = tableString?.toInt()
// display the heading so we can see the value in action
        val multiplicationTable = findViewById<TextView>(R.id.multiplicationTableTextView)
        multiplicationTable.text = "$tableNumber x table"


    }
}