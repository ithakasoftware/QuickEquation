package com.ithakasoftware.quickequation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        var btnBaskhara = findViewById<Button>(R.id.btnBaskhara)

        btnBaskhara.setOnClickListener{
            goBaskhara()
        }
    }

    private fun goBaskhara() {
        val intentBaskhara = Intent(this,Baskhara::class.java)

        startActivity(intentBaskhara)

    }

}