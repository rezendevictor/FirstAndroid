package com.example.ktempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        converterButton.setOnClickListener{
            converter(it)
        }

    }

    fun converter(view: View){
        var temp = valorTemp.text.toString().toDouble()

        if(this.celsius.isChecked){
            temp = (temp-32)*5/9

        }else if (fehen.isChecked){
            temp = (temp *9/5) + 32
        }

        valorTemp.setText(temp.toString())
    }
}
