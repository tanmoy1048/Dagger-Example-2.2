package com.datagene.daggerexample22.utils

import java.text.SimpleDateFormat
import java.util.*

object Utils{
    fun getTime(timeStamp:Long):String{
        val formatter = SimpleDateFormat("hh:mm:ss dd MMM yyyy", Locale.getDefault())
        return formatter.format(Date(timeStamp))
    }
}