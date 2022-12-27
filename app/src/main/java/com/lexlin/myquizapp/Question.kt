package com.lexlin.myquizapp

data class Question(
    val id : Int,
    val question: String,
    val image: Int, // location in our res
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int // option index
)
