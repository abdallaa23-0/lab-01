package com.example.myapplication

class Sad(date: String): Mood(date) {
    override fun moodexpression(): String{
        return "They are Sad on $date"
    }
}