/**
 * Copyright (C), 2015-2019
 * FileName: AAPlotLinesElement
 * Author: ios-fn
 * Date: 2019-06-16 19:00
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.example.chartcorekotlin.AAChartConfiger.AAChartLineDashSyleType

class AAPlotLinesElement {

    private var color: Any? = null
    private var dashStyle: AAChartLineDashSyleType? = null
    private var width: Float? = null
    private var value: Float? = null
    private var zIndex: Int? = null
    private var label: AALabel? = null

    fun color(prop: Any): AAPlotLinesElement {
        color = prop
        return this
    }

    fun dashStyle(prop: AAChartLineDashSyleType): AAPlotLinesElement {
        dashStyle = prop
        return this
    }

    fun width(prop: Float?): AAPlotLinesElement {
        width = prop
        return this
    }

    fun value(prop: Float?): AAPlotLinesElement {
        value = prop
        return this
    }

    fun zIndex(prop: Int?): AAPlotLinesElement {
        zIndex = prop
        return this
    }

    fun label(prop: AALabel): AAPlotLinesElement {
        label = prop
        return this
    }


}






