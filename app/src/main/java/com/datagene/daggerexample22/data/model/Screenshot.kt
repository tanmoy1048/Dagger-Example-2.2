package com.datagene.daggerexample22.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Screenshot")
class Screenshot(
        @ColumnInfo(name = "url")
        val url: String,
        @ColumnInfo(name = "imageLocation")
        val imageLocation: String,
        @ColumnInfo(name = "timeStamp")
        val timeStamp: Long
){
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")
        var id: Int?=null
}