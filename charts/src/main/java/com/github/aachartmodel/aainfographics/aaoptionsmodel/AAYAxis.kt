/**
 * Copyright (C), 2015-2019
 * FileName: AAYAxis
 * Author: AnAn
 * Date: 2019-08-30 11:25
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAYAxis: AAAxis() {
    var stackLabels: Any? = null
    fun stackLabels(prop: Any?): AAYAxis {
        stackLabels = prop
        return this
    }
//////////////////////////////////////////////

    fun allowDecimals(prop: Boolean?): AAYAxis {
        allowDecimals = prop
        return this
    }

    fun alternateGridColor(prop: Any): AAYAxis {
        alternateGridColor = prop
        return this
    }

    fun crosshair(prop: AACrosshair): AAYAxis {
        crosshair = prop
        return this
    }

    fun title(prop: AATitle): AAYAxis {
        title = prop
        return this
    }

    fun type(prop: AAChartAxisType): AAYAxis {
        type = prop.value
        return this
    }

    fun dateTimeLabelFormats(prop: AADateTimeLabelFormats): AAYAxis {
        dateTimeLabelFormats = prop
        return this
    }

    fun plotBands(prop: Array<AAPlotBandsElement>): AAYAxis {
        plotBands = prop
        return this
    }

    fun plotLines(prop: Array<AAPlotLinesElement>): AAYAxis {
        plotLines = prop
        return this
    }

    fun categories(prop: Array<String>?): AAYAxis {
        categories = prop
        return this
    }

    fun linkedTo(prop: Int?): AAYAxis {
        linkedTo = prop
        return this
    }

    fun reversed(prop: Boolean?): AAYAxis {
        reversed = prop
        return this
    }

    fun gridLineWidth(prop: Float?): AAYAxis {
        gridLineWidth = prop
        return this
    }

    fun gridLineColor(prop: String): AAYAxis {
        gridLineColor = prop
        return this
    }

    fun gridLineDashStyle(prop: String): AAYAxis {
        gridLineDashStyle = prop
        return this
    }

    fun gridLineInterpolation(prop: String): AAYAxis {
        gridLineInterpolation = prop
        return this
    }

    fun labels(prop: AALabels): AAYAxis {
        labels = prop
        return this
    }

    fun lineWidth(prop: Float?): AAYAxis {
        lineWidth = prop
        return this
    }

    fun lineColor(prop: String): AAYAxis {
        lineColor = prop
        return this
    }

    fun off(prop: Float?): AAYAxis {
        off = prop
        return this
    }

    fun max(prop: Float?): AAYAxis {
        max = prop
        return this
    }

    fun min(prop: Float?): AAYAxis {
        min = prop
        return this
    }

    fun minRange(prop: Int?): AAYAxis {
        minRange = prop
        return this
    }

    fun minTickInterval(prop: Int?): AAYAxis {
        minTickInterval = prop
        return this
    }

    fun minorGridLineColor(prop: String?): AAYAxis {
        minorGridLineColor = prop
        return this
    }

    fun minorGridLineDashStyle(prop: String?): AAYAxis {
        minorGridLineDashStyle = prop
        return this
    }

    fun minorGridLineWidth(prop: Float?): AAYAxis {
        minorGridLineWidth = prop
        return this
    }

    fun minorTickColor(prop: String?): AAYAxis {
        minorTickColor = prop
        return this
    }

    fun minorTickInterval(prop: Any?): AAYAxis {
        minorTickInterval = prop
        return this
    }

    fun minorTickLength(prop: Float?): AAYAxis {
        minorTickLength = prop
        return this
    }

    fun minorTickPosition(prop: String?): AAYAxis {
        minorTickPosition = prop
        return this
    }

    fun minorTickWidth(prop: Float?): AAYAxis {
        minorTickWidth = prop
        return this
    }

    fun visible(prop: Boolean?): AAYAxis {
        visible = prop
        return this
    }

    fun startOnTick(prop: Boolean?): AAYAxis {
        startOnTick = prop
        return this
    }

    fun opposite(prop: Boolean?): AAYAxis {
        opposite = prop
        return this
    }

    fun tickColor(prop: String?): AAYAxis {
        tickColor = prop
        return this
    }

    fun tickPositions(prop: Array<Any>): AAYAxis {
        tickPositions = prop
        return this
    }

    fun tickInterval(prop: Int?): AAYAxis {
        tickInterval = prop
        return this
    }

    fun tickmarkPlacement(prop: String): AAYAxis {
        tickmarkPlacement = prop
        return this
    }

    fun tickWidth(prop: Float?): AAYAxis {
        tickWidth = prop
        return this
    }

    fun tickLength(prop: Float?): AAYAxis {
        tickLength = prop
        return this
    }

    fun tickPosition(prop: String): AAYAxis {
        tickPosition = prop
        return this
    }

}
