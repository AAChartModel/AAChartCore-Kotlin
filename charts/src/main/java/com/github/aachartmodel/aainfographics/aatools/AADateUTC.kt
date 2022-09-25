package com.github.aachartmodel.aainfographics.aatools

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

object AADate {
    //   get UTC number from date
    fun AADateUTC(year: Int, month: Int, day: Int): Long {
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        sdf.timeZone = TimeZone.getTimeZone("UTC")
        var date: Date? = null
        try {
            date = sdf.parse("$year-$month-$day")
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return date!!.time
    }
}