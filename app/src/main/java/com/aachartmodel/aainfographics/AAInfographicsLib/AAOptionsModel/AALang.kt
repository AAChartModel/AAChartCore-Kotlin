package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AALang {
    var resetZoom: String? = null
    var thousandsSep: String? = null

    fun resetZoom(prop: String?): AALang {
        resetZoom = prop
        return this
    }

    fun thousandsSep(prop: String?): AALang {
        thousandsSep = prop
        return this
    }
}

