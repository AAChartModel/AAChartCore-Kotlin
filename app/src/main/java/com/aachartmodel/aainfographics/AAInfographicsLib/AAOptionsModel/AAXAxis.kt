/**
 * Copyright (C), 2015-2019
 * FileName: AAXAxis
 * Author: AnAn
 * Date: 2019-08-30 11:20
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AAXAxis {
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
    var tickColor: String? = null //x轴轴线下方刻度线颜色
    var gridLineWidth: Float? = null //x轴网格线宽度
    var gridLineColor: String? = null //x轴网格线颜色
    var gridLineDashStyle: String? = null //x轴网格线样式
    var off: Float? = null//x轴垂直偏移
    var labels: AALabels? = null //用于设置 x 轴文字相关的
    var visible: Boolean? = null //用于设置 x 轴以及 x 轴文字是否显示
    var startOnTick: Boolean? =
        null //Whether to force the axis to start on a tick. Use this option with the minPadding option to control the axis start. 默认是：false.
    var tickInterval: Int? = null//x轴刻度点间隔数(设置每隔几个点显示一个 X轴的内容:
    var crosshair: AACrosshair? = null //准星线样式设置
    var tickmarkPlacement: String? = null //本参数只对分类轴有效。 当值为 on 时刻度线将在分类上方显示；当值为 between 时，刻度线将在两个分类中间显示。当 tickInterval 为 1 时，默认是 between，其他情况默认是 on。 默认是：null.
    var tickWidth: Float? = null//坐标轴刻度线的宽度，设置为 0 时则不显示刻度线
    var tickLength: Float? = null//坐标轴刻度线的长度。 默认是：10.
    var tickPosition: String? = null //刻度线相对于轴线的位置，可用的值有 inside 和 outside，分别表示在轴线的内部和外部。 默认是：outside.


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

    fun tickColor(prop: String): AAXAxis {
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
