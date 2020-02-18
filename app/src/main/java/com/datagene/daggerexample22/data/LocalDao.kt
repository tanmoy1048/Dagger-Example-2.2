package com.datagene.daggerexample22.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.datagene.daggerexample22.data.model.Screenshot


@Dao
interface LocalDao {
    @Query("SELECT * FROM Screenshot WHERE url LIKE '%' ||:queryString|| '%'")
    fun getScreenshot(queryString:String): LiveData<List<Screenshot>>

    @Insert
    suspend fun insertScreenshot(screenshot: Screenshot)

    @Delete
    suspend fun deleteScreenshot(screenshot: Screenshot)

    @Query("DELETE FROM Screenshot")
    suspend fun deleteScreenshot()
}