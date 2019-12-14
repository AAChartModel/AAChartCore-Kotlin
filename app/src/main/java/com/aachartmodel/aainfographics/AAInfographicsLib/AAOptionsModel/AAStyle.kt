/**
 * Copyright (C), 2015-2019
 * FileName: AAStyle
 * Author: AnAn
 * Date: 2019-08-30 11:17
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartFontWeightType


class AAStyle {

    private var color: String? = null
    private var fontSize: String? = null
    private var fontWeight: String? = null
    private var textOutline: String? = null

    fun color(prop: String?): AAStyle {
        color = prop
        return this
    }

    fun fontSize(prop: Float?): AAStyle {
        fontSize = "$prop px"
        return this
    }

    fun fontWeight(prop: AAChartFontWeightType?): AAStyle {
        fontWeight = prop?.value
        return this
    }

    fun textOutline(prop: String): AAStyle {
        textOutline = prop
        return this
    }

}
