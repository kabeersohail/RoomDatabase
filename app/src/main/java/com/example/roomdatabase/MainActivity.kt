package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var contactDatabase: ContactDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contactDatabase = Room.databaseBuilder(applicationContext,
                ContactDatabase::class.java,
                "ContctDB"
            ).build()

        GlobalScope.launch {
            contactDatabase.contactDao().insert(Contact(1,"Sohail","8328330390"))
        }

    }
}