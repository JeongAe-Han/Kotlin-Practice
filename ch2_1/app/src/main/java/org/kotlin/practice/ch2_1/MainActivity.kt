package org.kotlin.practice.ch2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        button.setOnClickListener{
            Toast.makeText(applicationContext, "버튼을 누르셨네요.",Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener{
            val input = editTextTextPersonName.text.toString()
            if (input==""){
                textView.setText("")
                Toast.makeText(applicationContext, "값을 입력해주세요.",Toast.LENGTH_SHORT).show()
            }else {
                textView.setText("입력한 값 : ${editTextTextPersonName.text.toString()}")
            }

        }
    }
}