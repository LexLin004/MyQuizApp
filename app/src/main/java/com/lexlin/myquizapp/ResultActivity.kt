package com.lexlin.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName : TextView = findViewById(R.id.tv_name)
        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        val tvScore : TextView = findViewById(R.id.tv_score)
        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctQuestion = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)
        // tvScore.text = "Your Score is $correctQuestion out of $totalQuestion"
        tvScore.text = buildString {
        append("Your Score is ")
        append(correctQuestion)
        append(" out of ")
        append(totalQuestion)
    }
        val btnFinish : Button = findViewById(R.id.btn_finish)
        btnFinish.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}