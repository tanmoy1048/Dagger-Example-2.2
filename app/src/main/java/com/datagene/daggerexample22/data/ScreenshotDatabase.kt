package com.datagene.daggerexample22.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.datagene.daggerexample22.data.model.Screenshot


@Database(
    entities = [Screenshot::class],
    version = 1
)
abstract class ScreenshotDatabase : RoomDatabase() {
    abstract fun localDao(): LocalDao
}