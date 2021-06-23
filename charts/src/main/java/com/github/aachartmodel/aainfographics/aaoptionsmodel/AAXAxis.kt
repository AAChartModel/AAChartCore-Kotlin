/**
 * Copyright (C), 2015-2019
 * FileName: AAXAxis
 * Author: AnAn
 * Date: 2019-08-30 11:20
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAXAxis {
    var type: String? = null
    var plotBands: Array<AAPlotBandsElement>? = null
    var plotLines: Array<AAPlotLinesElement>? = null
    var categories: Array<String>? = null
    var linkedTo: Int? = null
    var reversed: Boolean? = null
    var opposite: Boolean? = null
    var lineWidth: Float? = null //x轴轴线宽度
    var lineColor: String? = null //x轴轴线线颜色
    var max: Float? = null //x轴最大值
    var min: Float? = null//x轴最小值（设置为0就不会有负数）
    var minRange: Int? = null
    var minTickInterval: Int? = null //The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
    var minorGridLineColor: String? = null //Color of the minor, secondary grid lines.
    var minorGridLineDashStyle: String? = null //The dash or dot style of the minor grid lines.
    var minorGridLineWidth: Float? = null //Width of the minor, secondary grid lines.
    var minorTickColor: String? = null //Color for the minor tick marks.
    var minorTickInterval: Any? = null /*Specific tick interval in axis units for the minor ticks. On a linear axis, if "auto", the minor tick interval is calculated as a fifth of the tickInterval. If null or undefined, minor ticks are not shown.
     On logarithmic axes, the unit is the power of the value. For example, setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 10 and 100 etc.
    If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.*/
    var minorTickLength: Float? = null //The pixel length of the minor tick marks.
    var minorTickPosition: String? = null //The position of the minor tick marks relative to the axis line. Can be one of inside and outside. Defaults to outside.
    var minorTickWidth: Float? = null //The pixel width of the minor tick mark.

    var tickColor: String? = null //x轴轴线下方刻度线颜色
    var gridLineWidth: Float? = null //x轴网格线宽度
    var gridLineColor: String? = null //x轴网格线颜色
    var gridLineDashStyle: String? = null //x轴网格线样式
    var off: Float? = null//x轴垂直偏移
    var labels: AALabels? = null //用于设置 x 轴文字相关的
    var visible: Boolean? = null //用于设置 x 轴以及 x 轴文字是否显示
    var startOnTick: Boolean? = null //Whether to force the axis to start on a tick. Use this option with the minPadding option to control the axis start. 默认是：false.
    var tickInterval: Int? = null//x轴刻度点间隔数(设置每隔几个点显示一个 X轴的内容:
    var crosshair: AACrosshair? = null //准星线样式设置
    var tickmarkPlacement: String? =
        null //本参数只对分类轴有效。 当值为 on 时刻度线将在分类上方显示；当值为 between 时，刻度线将在两个分类中间显示。当 tickInterval 为 1 时，默认是 between，其他情况默认是 on。 默认是：null.
    var tickWidth: Float? = null//坐标轴刻度线的宽度，设置为 0 时则不显示刻度线
    var tickLength: Float? = null//坐标轴刻度线的长度。 默认是：10.
    var tickPosition: String? =
        null //刻度线相对于轴线的位置，可用的值有 inside 和 outside，分别表示在轴线的内部和外部。 默认是：outside.

    fun type(prop: String): AAXAxis {
        type = prop
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

    fun opposite(prop: Boolean?): AAXAxis {
        opposite = prop
        return this
    }


    fun lineWidth(prop: Float?): AAXAxis {
        lineWidth = prop
        return this
    }

    fun lineColor(prop: String): AAXAxis {
        lineColor = prop
        return this
    }

    fun max(prop: Float?): AAXAxis {
        max = prop
        return this
    }

    fun min(prop: Float?): AAXAxis {
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

    fun minorGridLineColor(prop: String?): AAXAxis {
        minorGridLineColor = prop
        return this
    }

    fun minorGridLineDashStyle(prop: String?): AAXAxis {
        minorGridLineDashStyle = prop
        return this
    }

    fun minorGridLineWidth(prop: Float?): AAXAxis {
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

    fun minorTickLength(prop: Float?): AAXAxis {
        minorTickLength = prop
        return this
    }

    fun minorTickPosition(prop: String?): AAXAxis {
        minorTickPosition = prop
        return this
    }

    fun minorTickWidth(prop: Float?): AAXAxis {
        minorTickWidth = prop
        return this
    }

    fun tickColor(prop: String?): AAXAxis {
        tickColor = prop
        return this
    }

    fun gridLineWidth(prop: Float?): AAXAxis {
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

    fun off(prop: Float?): AAXAxis {
        off = prop
        return this
    }

    fun labels(prop: AALabels): AAXAxis {
        labels = prop
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

    fun tickInterval(prop: Int?): AAXAxis {
        tickInterval = prop
        return this
    }

    fun crosshair(prop: AACrosshair): AAXAxis {
        crosshair = prop
        return this
    }

    fun tickmarkPlacement(prop: String): AAXAxis {
        tickmarkPlacement = prop
        return this
    }

    fun tickWidth(prop: Float?): AAXAxis {
        tickWidth = prop
        return this
    }

    fun tickLength(prop: Float?): AAXAxis {
        tickLength = prop
        return this
    }

    fun tickPosition(prop: String): AAXAxis {
        tickPosition = prop
        return this
    }
}
