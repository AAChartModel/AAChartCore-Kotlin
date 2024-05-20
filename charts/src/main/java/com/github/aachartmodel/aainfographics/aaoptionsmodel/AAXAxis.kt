/**
 * Copyright (C), 2015-2019
 * FileName: AAXAxis
 * Author: AnAn
 * Date: 2019-08-30 11:20
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel


open class AAXAxis: AAAxis() {
    fun allowDecimals(prop: Boolean?): AAXAxis {
        allowDecimals = prop
        return this
    }

    fun alternateGridColor(prop: Any): AAXAxis {
        alternateGridColor = prop
        return this
    }

    fun crosshair(prop: AACrosshair): AAXAxis {
        crosshair = prop
        return this
    }

    fun title(prop: AATitle): AAXAxis {
        title = prop
        return this
    }

    fun type(prop: AAChartAxisType): AAXAxis {
        type = prop.value
        return this
    }

    fun dateTimeLabelFormats(prop: AADateTimeLabelFormats): AAXAxis {
        dateTimeLabelFormats = prop
        return this
    }

    fun plotBands(prop: Array<AAPlotBandsElement>): AAXAxis {
        plotBands = prop
        return this
    }

    fun plotLines(prop: Array<AAPlotLinesElement>): AAXAxis {
        plotLines = prop
        return this
    }

    fun categories(prop: Array<String>?): AAXAxis {
        categories = prop
        return this
    }

    fun linkedTo(prop: Int?): AAXAxis {
        linkedTo = prop
        return this
    }

    fun reversed(prop: Boolean?): AAXAxis {
        reversed = prop
        return this
    }

    fun reversedStacks(prop: Boolean?): AAXAxis {
        reversedStacks = prop
        return this
    }

    fun gridLineWidth(prop: Number?): AAXAxis {
        gridLineWidth = prop
        return this
    }

    fun gridLineColor(prop: String): AAXAxis {
        gridLineColor = prop
        return this
    }

    fun gridLineDashStyle(prop: String): AAXAxis {
        gridLineDashStyle = prop
        return this
    }

    fun gridLineInterpolation(prop: String): AAXAxis {
        gridLineInterpolation = prop
        return this
    }

    fun labels(prop: AALabels): AAXAxis {
        labels = prop
        return this
    }

    fun lineWidth(prop: Number?): AAXAxis {
        lineWidth = prop
        return this
    }

    fun lineColor(prop: String): AAXAxis {
        lineColor = prop
        return this
    }

    fun offset(prop: Number?): AAXAxis {
        offset = prop
        return this
    }

    fun max(prop: Number?): AAXAxis {
        max = prop
        return this
    }

    fun min(prop: Number?): AAXAxis {
        min = prop
        return this
    }

    fun minRange(prop: Int?): AAXAxis {
        minRange = prop
        return this
    }

    fun minTickInterval(prop: Int?): AAXAxis {
        minTickInterval = prop
        return this
    }

    fun minorTicks(prop: Boolean?): AAXAxis {
        minorTicks = prop
        return this
    }

    fun minorGridLineColor(prop: String?): AAXAxis {
        minorGridLineColor = prop
        return this
    }

    fun minorGridLineDashStyle(prop: String?): AAXAxis {
        minorGridLineDashStyle = prop
        return this
    }

    fun minorGridLineWidth(prop: Number?): AAXAxis {
        minorGridLineWidth = prop
        return this
    }

    fun minorTickColor(prop: String?): AAXAxis {
        minorTickColor = prop
        return this
    }

    fun minorTickInterval(prop: Any?): AAXAxis {
        minorTickInterval = prop
        return this
    }

    fun minorTickLength(prop: Number?): AAXAxis {
        minorTickLength = prop
        return this
    }

    fun minorTickPosition(prop: String?): AAXAxis {
        minorTickPosition = prop
        return this
    }

    fun minorTickWidth(prop: Number?): AAXAxis {
        minorTickWidth = prop
        return this
    }

    fun visible(prop: Boolean?): AAXAxis {
        visible = prop
        return this
    }

    fun startOnTick(prop: Boolean?): AAXAxis {
        startOnTick = prop
        return this
    }

    fun endOnTick(prop: Boolean?): AAXAxis {
        endOnTick = prop
        return this
    }

    fun opposite(prop: Boolean?): AAXAxis {
        opposite = prop
        return this
    }

    fun tickColor(prop: String?): AAXAxis {
        tickColor = prop
        return this
    }

    fun tickPositions(prop: Array<Any>): AAXAxis {
        tickPositions = prop
        return this
    }

    fun tickInterval(prop: Number?): AAXAxis {
        tickInterval = prop
        return this
    }

    fun tickmarkPlacement(prop: String): AAXAxis {
        tickmarkPlacement = prop
        return this
    }

    fun tickWidth(prop: Number?): AAXAxis {
        tickWidth = prop
        return this
    }

    fun tickLength(prop: Number?): AAXAxis {
        tickLength = prop
        return this
    }

    fun tickPosition(prop: String): AAXAxis {
        tickPosition = prop
        return this
    }
}
