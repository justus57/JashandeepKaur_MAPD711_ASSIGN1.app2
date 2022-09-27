package com.justus.jashandeepkaur_mapd711_assign1app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //call the function in main function
       submit()
        }
    //sub function
        fun submit(){
            val submit =  findViewById<Button>(R.id.button)
            val Name = getString(R.string.Name)
            val Address = getString(R.string.Address)
            val DreamJob = getString(R.string.DreamJob)
            val Favoritefood = getString(R.string.Favoritefood)
            val Profession = getString(R.string.Profession)

            submit.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("name", Name)
                bundle.putString("address", Address)
                bundle.putString("dreamjob", DreamJob)
                bundle.putString("favoritefood", Favoritefood)
                bundle.putString("proffession", Profession)
                val intent = Intent(this, Display::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
        }
    }
}