package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AATime {
    var timezone: String? = null
    var useUTC: Boolean? = null

    fun timezone(prop: String?): AATime {
        timezone = prop
        return this
    }

    fun useUTC(prop: Boolean?): AATime {
        useUTC = prop
        return this
    }
}
