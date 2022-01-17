package com.example.a1_rv_custom_basic_adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a1_rv_custom_basic_adapter.adapter.CustomAdapter
import com.example.a1_rv_custom_basic_adapter.model.User

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews();

        val users = prepareUserList()
        refreshAdapter(users)
    }

    fun refreshAdapter(users:List<User>){
        val adapter = CustomAdapter(users)
        recyclerView.adapter = adapter
    }

    private fun prepareUserList(): List<User> {
        val users = ArrayList<User>()
        for (i in 0..30){
            users.add(User("Tohir"+i))
        }
        return users
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,1)
    }
}