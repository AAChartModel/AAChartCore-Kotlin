package com.github.aachartmodel.aainfographics.aaoptionsmodel

enum class AAChartAxisType(val value: String) {
    Linear("linear"),
    Logarithmic("logarithmic"),
    Datetime("datetime"),
    Category("category"),
}


 open class AAAxis {
    var allowDecimals: Boolean? = null
    var alternateGridColor: Any? = null
    var crosshair: AACrosshair? = null //准星线样式设置
    var title: AATitle? = null
    var type: String? = null
    var dateTimeLabelFormats: AADateTimeLabelFormats? = null
    var plotBands: Array<AAPlotBandsElement>? = null
    var plotLines: Array<AAPlotLinesElement>? = null
    var categories: Array<String>? = null
    var linkedTo: Int? = null
    var reversed: Boolean? = null
    var reversedStacks: Boolean? = null
    var opposite: Boolean? = null
    var lineWidth: Number? = null //坐标轴轴线宽度
    var lineColor: String? = null //坐标轴轴线线颜色
    var max: Number? = null //坐标轴最大值
    var min: Number? = null //坐标轴最小值（设置为0就不会有负数）
    var minRange: Int? = null
    var minTickInterval: Int? = null //The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
    var minorTicks: Boolean? = null //是否显示副刻度
    var minorGridLineColor: String? = null //Color of the minor, secondary grid lines.
    var minorGridLineDashStyle: String? = null //The dash or dot style of the minor grid lines.
    var minorGridLineWidth: Number? = null //Width of the minor, secondary grid lines.
    var minorTickColor: String? = null //Color for the minor tick marks.
    var minorTickInterval: Any? = null /*Specific tick interval in axis units for the minor ticks. On a linear axis, if "auto", the minor tick interval is calculated as a fifth of the tickInterval. If null or undefined, minor ticks are not shown.
     On logarithmic axes, the unit is the power of the value. For example, setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 10 and 100 etc.
    If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.*/
    var minorTickLength: Number? = null //The pixel length of the minor tick marks.
    var minorTickPosition: String? = null //The position of the minor tick marks relative to the axis line. Can be one of inside and outside. Defaults to outside.
    var minorTickWidth: Number? = null //The pixel width of the minor tick mark.

    var gridLineWidth: Number? = null //坐标轴网格线宽度
    var gridLineColor: String? = null //坐标轴网格线颜色
    var gridLineDashStyle: String? = null //坐标轴网格线样式
    var gridLineInterpolation: String? = null
    var offset: Number? = null //坐标轴垂直偏移
    var labels: AALabels? = null //用于设置坐标轴文字相关的
    var visible: Boolean? = null //用于设置坐标轴以及坐标轴文字是否显示
    var startOnTick: Boolean? = null //Whether to force the axis to start on a tick. Use this option with the maxPadding option to control the axis start.This option is always disabled, when panning type is either y or xy. Defaults to true.
    var endOnTick: Boolean? = null //Whether to force the axis to end on a tick. Use this option with the maxPadding option to control the axis end. This option is always disabled, when panning type is either y or xy. Defaults to true.
    var tickColor: String? = null //坐标轴轴线下方刻度线颜色
    var tickInterval: Number? = null //坐标轴刻度点间隔数(设置每隔几个点显示一个 坐标轴的内容:
    var tickmarkPlacement: String? = null //本参数只对分类轴有效。 当值为 on 时刻度线将在分类上方显示；当值为 between 时，刻度线将在两个分类中间显示。当 tickInterval 为 1 时，默认是 between，其他情况默认是 on。 默认是：null.
    var tickWidth: Number? = null //坐标轴刻度线的宽度，设置为 0 时则不显示刻度线
    var tickLength: Number? = null //坐标轴刻度线的长度。 默认是：10.
    var tickPosition: String? = null //刻度线相对于轴线的位置，可用的值有 inside 和 outside，分别表示在轴线的内部和外部。 默认是：outside.
    var tickPositions: Array<Any>? = null // Custom chart axis coordinates
}