package com.example.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity(tableName = "contact_table")
//data class Contact(
//    @PrimaryKey(autoGenerate = true)
//    var id : Long = 0L,
//    @ColumnInfo(name = "user_name")
//    val name : String = "",
//    @ColumnInfo(name = "user_phone")
//    val phone : String = ""
//)

@Entity(tableName = "contact_table")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    var id : Long,
    val name : String,
    val phone : String
)
