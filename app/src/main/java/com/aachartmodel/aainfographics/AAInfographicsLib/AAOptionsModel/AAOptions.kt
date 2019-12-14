/**
 * Copyright (C), 2015-2019
 * FileName: AAOptions
 * Author: AnAn
 * Date: 2019-08-30 14:18
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AASeriesElement

class AAOptions {
    var chart: AAChart? = null
    var title: AATitle? = null
    var subtitle: AASubtitle? = null
    var xAxis: AAXAxis? = null
    var yAxis: AAYAxis? = null
    var xAxisArray: Array<AAXAxis>? = null
    var yAxisArray: Array<AAYAxis>? = null
    var tooltip: AATooltip? = null
    var plotOptions: AAPlotOptions? = null
    var series: Array<AASeriesElement>? = null
    var legend: AALegend? = null
    var colors: Array<Any>? = null
    var touchEventEnabled: Boolean? = null

    fun chart(prop: AAChart): AAOptions {
        chart = prop
        return this
    }

    fun title(prop: AATitle): AAOptions {
        title = prop
        return this
    }

    fun subtitle(prop: AASubtitle): AAOptions {
        subtitle = prop
        return this
    }

    fun xAxis(prop: AAXAxis): AAOptions {
        xAxis = prop
        return this
    }

    fun yAxis(prop: AAYAxis): AAOptions {
        yAxis = prop
        return this
    }

    fun xAxisArray(prop: Array<AAXAxis>): AAOptions {
        xAxisArray = prop
        return this
    }

    fun yAxisArray(prop: Array<AAYAxis>): AAOptions {
        yAxisArray = prop
        return this
    }

    fun tooltip(prop: AATooltip): AAOptions {
        tooltip = prop
        return this
    }

    fun plotOptions(prop: AAPlotOptions): AAOptions {
        plotOptions = prop
        return this
    }

    fun series(prop: Array<AASeriesElement>?): AAOptions {
        series = prop
        return this
    }

    fun legend(prop: AALegend): AAOptions {
        legend = prop
        return this
    }

    fun colors(prop: Array<Any>?): AAOptions {
        colors = prop
        return this
    }

    fun touchEventEnabled(prop: Boolean?): AAOptions {
        touchEventEnabled = prop
        return this
    }

}
