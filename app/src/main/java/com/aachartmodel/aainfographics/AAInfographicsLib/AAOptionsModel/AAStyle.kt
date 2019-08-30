/**
 * Copyright (C), 2015-2019
 * FileName: AAStyle
 * Author: AnAn
 * Date: 2019-08-30 11:17
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AAStyle {

    private var color: String? = null
    private var fontSize: String? = null
    private var fontWeight: String? = null
    private var textOutLine: String? = null

    fun color(prop: String?): AAStyle {
        color = prop
        return this
    }

    fun fontSize(prop: Float?): AAStyle {
        fontSize = "$prop px"
        return this
    }

    fun fontWeight(prop: String?): AAStyle {
        fontWeight = prop
        return this
    }

    fun textOutLine(prop: String): AAStyle {
        textOutLine = prop
        return this
    }

}
