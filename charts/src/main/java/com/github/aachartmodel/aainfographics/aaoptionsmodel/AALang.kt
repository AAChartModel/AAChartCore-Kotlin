/**
 * Copyright (C), 2015-2019
 * FileName: AAChart
 * Author: AnAn
 * Date: 2019-08-30 11:49
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

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