package com.justus.jashandeepkaur_mapd711_assign1app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Display : AppCompatActivity() {
    lateinit var name: TextView
    lateinit var address: TextView
    lateinit var proffession: TextView
    lateinit var dreamjob: TextView
    lateinit var favoritefood: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        //pulls data from main-activity
        name =  findViewById(R.id.name)
        address =findViewById(R.id.address)
        proffession = findViewById(R.id.proffession)
        dreamjob = findViewById(R.id.dreamjob)
        favoritefood = findViewById(R.id.favoritefood)
        val bundle = intent.extras
        if (bundle != null){
            //feeding data to view screen
            name.text = "${bundle.getString("name")}"
            address.text = "${bundle.getString("address")}"
            proffession.text = "${bundle.getString("proffession")}"
            dreamjob.text = "${bundle.getString("dreamjob")}"
            favoritefood.text = "${bundle.getString("favoritefood")}"
        }
    }
}