package com.ithakasoftware.quickequation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.absoluteValue

class Baskhara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.baskhara_activity)


        var btnCalc = findViewById<Button>(R.id.btnCalc)
        var txtResult = findViewById<TextView>(R.id.txtResult)

        btnCalc.setOnClickListener{

            var a = Integer.parseInt((findViewById<EditText>(R.id.edtA)).text.toString())
            var b = Integer.parseInt((findViewById<EditText>(R.id.edtB)).text.toString())
            var c = Integer.parseInt((findViewById<EditText>(R.id.edtC)).text.toString())

            var root1 = (-(b)+Math.sqrt(((b*b)-(4*a*c)).toDouble()))/2*a
            var root2 = (-(b)-Math.sqrt(((b*b)-(4*a*c)).toDouble()))/2*a

            txtResult.setText("("+root1 +","+ root2 +")")


        }

    }
}