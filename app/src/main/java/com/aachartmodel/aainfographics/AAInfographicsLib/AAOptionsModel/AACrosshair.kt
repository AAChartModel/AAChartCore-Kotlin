/**
 * Copyright (C), 2015-2019
 * FileName: AACrosshair
 * Author: ios-fn
 * Date: 2019-06-16 19:19
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.example.chartcorekotlin.AAChartConfiger.AAChartLineDashSyleType

class AACrosshair {
    private var width: Float? = null
    private var color: String? = null
    private var dashStyle: AAChartLineDashSyleType? = null

    fun width(prop: Float?): AACrosshair {
        width = prop
        return this
    }

    fun color(prop: String): AACrosshair {
        color = prop
        return this
    }

    fun dashStyle(prop: AAChartLineDashSyleType): AACrosshair {
        dashStyle = prop
        return this
    }
}