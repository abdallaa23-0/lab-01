package com.example.myapplication

class Sad(date: String): Mood(date) {
    override fun moods(): String{
        return "They are Sad on $date"
    }
}