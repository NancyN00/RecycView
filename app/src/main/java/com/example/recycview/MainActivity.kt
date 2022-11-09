package com.example.recycview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recycler : RecyclerView = findViewById(R.id.recycUser)
        val user1 = User("Award", "Grammys", "Canada", "Spanish")
        val user2 = User("Actor", "Ryan Reynolds", "USA", "English")
        val user3= User("Businessman", "Aliko Dangote", "Tanzania", "Swahili")
        val user4 = User("Actress", "Gal Gaddot", "Israel", "Arabic")
        val user5 = User("Comedian", "Chris Rock", "USA", "Afrikana")
        val user6 = User("Dancer", "Jade Chynoweth", "Australia", "Austria")
        val user7 = User("Rapper", "Lee Felix", "Seoul", "Korean")
        //data class is model
        val usersList = ArrayList<User>()
        usersList.add(user1)
        usersList.add(user2)
        usersList.add(user3)
        usersList.add(user4)
        usersList.add(user5)
        usersList.add(user6)
        usersList.add(user7)

        var adapter = CustomAdapter(usersList)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter
    }
}