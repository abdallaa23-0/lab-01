package com.example.myapplication

class Happy(date: String): Mood(date) {
    override fun moods(): String{
        return "They are Happy on $date"
    }
}