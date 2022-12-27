package com.lexlin.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnStart : Button = findViewById(R.id.btn_start)
        val etName :EditText = findViewById(R.id.et_name)

        btnStart.setOnClickListener{
            if (etName.text.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            } else {
                // move from this activity to another activity (QuizQuestionsActivity)
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString()) // pass additional data key,value
                startActivity(intent) // 这个时候按返回会回到MainActivity
                finish() // finish the current activity, which means it will close the mainActivity
                // 这个时候按返回会直接回到桌面
            }
        }




    }
}