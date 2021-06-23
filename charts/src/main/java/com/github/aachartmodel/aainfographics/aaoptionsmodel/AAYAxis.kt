/**
 * Copyright (C), 2015-2019
 * FileName: AAYAxis
 * Author: AnAn
 * Date: 2019-08-30 11:25
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAYAxis {
    var title: AATitle? = null
    var plotBands: Array<AAPlotBandsElement>? = null
    var plotLines: Array<AAPlotLinesElement>? = null
    var categories: Array<String>? = null
    var reversed: Boolean? = null
    var gridLineWidth: Float? = null// y 轴网格线宽度
    var gridLineColor: String? = null  // y 轴网格线颜色
    var gridLineDashStyle: String? = null //网格线线条样式，所有可用的线条样式参考：Highcharts线条样式
    var alternateGridColor: String? = null  //backcolor of every other grid line area
    var gridLineInterpolation: String? =
        null //Polar charts only. Whether the grid lines should draw as a polygon with straight lines between categories, or as circles. Can be either circle or polygon. 默认是：null.
    var labels: AALabels? = null//用于设置 y 轴文字相关的
    var lineWidth: Float? = null // y 轴线宽度
    var lineColor: String? = null // y 轴线颜色
    var off: Float? = null // y 轴线水平偏移
    var allowDecimals: Boolean? = null //y轴是否允许显示小数
    var max: Float? = null //y轴最大值
    var min: Float? = null //y轴最小值（设置为0就不会有负数）
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

    // var minPadding:   //Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. 默认是：0.05.
    var tickPositions: Array<Any>? = null //自定义Y轴坐标（如：[0, 25, 50, 75 , 100]）
    var visible: Boolean? = null //y轴是否允许显示
    var opposite: Boolean? =
        null//是否将坐标轴显示在对立面，默认情况下 x 轴是在图表的下方显示，y 轴是在左方，坐标轴显示在对立面后，x 轴是在上方显示，y 轴是在右方显示（即坐标轴会显示在对立面）。该配置一般是用于多坐标轴区分展示，另外在 Highstock 中，y 轴默认是在对立面显示的。 默认是：false.
    var tickInterval: Int? = null
    var crosshair: AACrosshair? = null  //准星线样式设置
    var stackLabels: String? = null
    var tickWidth: Float? = null//坐标轴刻度线的宽度，设置为 0 时则不显示刻度线
    var tickLength: Float? = null//坐标轴刻度线的长度。 默认是：10.
    var tickPosition: String? =
        null //刻度线相对于轴线的位置，可用的值有 inside 和 outside，分别表示在轴线的内部和外部。 默认是：outside.


    fun title(prop: AATitle): AAYAxis {
        title = prop
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

    fun categories(prop: Array<String>): AAYAxis {
        categories = prop
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

    fun alternateGridColor(prop: String): AAYAxis {
        alternateGridColor = prop
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

    fun allowDecimals(prop: Boolean?): AAYAxis {
        allowDecimals = prop
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

    fun tickPositions(prop: Array<Any>): AAYAxis {
        tickPositions = prop
        return this
    }

    fun visible(prop: Boolean?): AAYAxis {
        visible = prop
        return this
    }

    fun opposite(prop: Boolean?): AAYAxis {
        opposite = prop
        return this
    }

    fun tickInterval(prop: Int?): AAYAxis {
        tickInterval = prop
        return this
    }

    fun crosshair(prop: AACrosshair): AAYAxis {
        crosshair = prop
        return this
    }

    fun stackLabels(prop: String): AAYAxis {
        stackLabels = prop
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
