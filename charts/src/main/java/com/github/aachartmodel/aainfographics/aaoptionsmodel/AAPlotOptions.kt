/**
 * Copyright (C), 2015-2019
 * FileName: AAPlotOptions
 * Author: AnAn
 * Date: 2019-08-30 11:33
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType

open class AAPlotOptions {
    var column: AAColumn? = null
    var bar: AABar? = null
    var line: AALine? = null
    var spline: AASpline? = null
    var area: AAArea? = null
    var areaspline: AAAreaspline? = null
    var pie: AAPie? = null
    var columnrange: Any? = null
    var arearange: Any? = null
    var series: AASeries? = null
    var scatter: AAScatter? = null

    fun column(prop: AAColumn): AAPlotOptions {
        column = prop
        return this
    }

    fun line(prop: AALine): AAPlotOptions {
        line = prop
        return this
    }

    fun pie(prop: AAPie): AAPlotOptions {
        pie = prop
        return this
    }

    fun bar(prop: AABar): AAPlotOptions {
        bar = prop
        return this
    }

    fun spline(prop: AASpline): AAPlotOptions {
        spline = prop
        return this
    }

    fun area(prop: AAArea): AAPlotOptions {
        area = prop
        return this
    }

    fun areaspline(prop: AAAreaspline): AAPlotOptions {
        areaspline = prop
        return this
    }

    fun columnrange(prop: Any): AAPlotOptions {
        columnrange = prop
        return this
    }

    fun arearange(prop: Any): AAPlotOptions {
        arearange = prop
        return this
    }

    fun series(prop: AASeries): AAPlotOptions {
        series = prop
        return this
    }

    fun scatter(prop: AAScatter): AAPlotOptions {
        scatter = prop
        return this
    }

}

open class AABaseColumn {
    var name: String? = null
    var data: Array<Any>? = null
    var color: String? = null
    var grouping: Boolean? =
        null//Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other. 默认是：true.
    var pointPadding: Float? =
        null//Padding between each column or bar, in x axis units. 默认是：0.1.
    var pointPlacement: Float? =
        null//Padding between each column or bar, in x axis units. 默认是：0.1.
    var groupPadding: Float? =
        null//Padding between each value groups, in x axis units. 默认是：0.2.
    var borderWidth: Number? = null
    var colorByPoint: Boolean? =
        null//对每个不同的点设置颜色(当图表类型为 AAColumn 时,设置为 AAColumn 对象的属性,当图表类型为 bar 时,应该设置为 bar 对象的属性才有效)
    var dataLabels: AADataLabels? = null
    var stacking: String? = null
    var borderRadius: Number? = null
    var yAxis: Int? = null
    var pointWith: Number? = null //柱形条的宽度
    var maxPointWidth: Number? = null //柱形条的最大宽度
    var minPointLength: Number? = null //柱形条的最小高度
}

open class AAColumn: AABaseColumn() {
    fun name(prop: String): AAColumn {
        name = prop
        return this
    }

    fun data(prop: Array<Any>): AAColumn {
        data = prop
        return this
    }

    fun color(prop: String): AAColumn {
        color = prop
        return this
    }

    fun grouping(prop: Boolean?): AAColumn {
        grouping = prop
        return this
    }

    fun pointPadding(prop: Float?): AAColumn {
        pointPadding = prop
        return this
    }

    fun pointPlacement(prop: Float?): AAColumn {
        pointPlacement = prop
        return this
    }

    fun groupPadding(prop: Float?): AAColumn {
        groupPadding = prop
        return this
    }

    fun borderWidth(prop: Number?): AAColumn {
        borderWidth = prop
        return this
    }

    fun colorByPoint(prop: Boolean?): AAColumn {
        colorByPoint = prop
        return this
    }

    fun dataLabels(prop: AADataLabels): AAColumn {
        dataLabels = prop
        return this
    }

    fun stacking(prop: String): AAColumn {
        stacking = prop
        return this
    }

    fun borderRadius(prop: Number?): AAColumn {
        borderRadius = prop
        return this
    }

    fun yAxis(prop: Int?): AAColumn {
        yAxis = prop
        return this
    }


    fun pointWidth(prop: Number?): AAColumn {
        pointWith = prop
        return this
    }

    fun maxPointWidth(prop: Number?): AAColumn {
        maxPointWidth = prop
        return this
    }

    fun minPointLength(prop: Number?): AAColumn {
        minPointLength = prop
        return this
    }

}

open class AABar: AABaseColumn() {
    fun name(prop: String): AABar {
        name = prop
        return this
    }

    fun data(prop: Array<Any>): AABar {
        data = prop
        return this
    }

    fun color(prop: String): AABar {
        color = prop
        return this
    }

    fun grouping(prop: Boolean?): AABar {
        grouping = prop
        return this
    }

    fun pointPadding(prop: Float?): AABar {
        pointPadding = prop
        return this
    }

    fun pointPlacement(prop: Float?): AABar {
        pointPlacement = prop
        return this
    }

    fun groupPadding(prop: Float?): AABar {
        groupPadding = prop
        return this
    }

    fun borderWidth(prop: Number?): AABar {
        borderWidth = prop
        return this
    }

    fun colorByPoint(prop: Boolean?): AABar {
        colorByPoint = prop
        return this
    }

    fun dataLabels(prop: AADataLabels): AABar {
        dataLabels = prop
        return this
    }

    fun stacking(prop: String): AABar {
        stacking = prop
        return this
    }

    fun borderRadius(prop: Number?): AABar {
        borderRadius = prop
        return this
    }

    fun yAxis(prop: Int?): AABar {
        yAxis = prop
        return this
    }


    fun pointWidth(prop: Number?): AABar {
        pointWith = prop
        return this
    }

    fun maxPointWidth(prop: Number?): AABar {
        maxPointWidth = prop
        return this
    }

    fun minPointLength(prop: Number?): AABar {
        minPointLength = prop
        return this
    }
}


open class AALine {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AALine {
        dataLabels = prop
        return this
    }
}


open class AASpline {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AASpline {
        dataLabels = prop
        return this
    }
}


open class AAArea {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AAArea {
        dataLabels = prop
        return this
    }
}


open class AAAreaspline {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AAAreaspline {
        dataLabels = prop
        return this
    }
}


open class AAPie {
    var type: String? = null
    var dataLabels: AADataLabels? = null
    var size: Number? = null
    var allowPointSelect: Boolean? = null
    var cursor: String? = null
    var showInLegend: Boolean? = null
    var startAngle: Number? = null
    var endAngle: Number? = null
    var depth: Number? = null
    var center: Any? = null
    var data: Array<Any>? = null


    fun type(prop: AAChartType?): AAPie {
        type = prop?.value
        return this
    }

    fun dataLabels(prop: AADataLabels): AAPie {
        dataLabels = prop
        return this
    }

    fun size(prop: Number?): AAPie {
        size = prop
        return this
    }

    fun allowPointSelect(prop: Boolean?): AAPie {
        allowPointSelect = prop
        return this
    }

    fun cursor(prop: String): AAPie {
        cursor = prop
        return this
    }

    fun showInLegend(prop: Boolean?): AAPie {
        showInLegend = prop
        return this
    }

    fun startAngle(prop: Number?): AAPie {
        startAngle = prop
        return this
    }

    fun endAngle(prop: Number?): AAPie {
        endAngle = prop
        return this
    }

    fun depth(prop: Number?): AAPie {
        depth = prop
        return this
    }

    fun center(prop: Any?): AAPie {
        center = prop
        return this
    }

    fun data(prop: Array<Any>): AAPie {
        data = prop
        return this
    }

}


open class AAColumnrange {
    var borderRadius: Number? = null
    var borderWidth: Number? = null
    var dataLabels: AADataLabels? = null

    fun borderRadius(prop: Number?): AAColumnrange {
        borderRadius = prop
        return this
    }

    fun borderWidth(prop: Number?): AAColumnrange {
        borderWidth = prop
        return this
    }

    fun dataLabels(prop: AADataLabels): AAColumnrange {
        dataLabels = prop
        return this
    }
}


open class AAArearange {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AAArearange {
        dataLabels = prop
        return this
    }
}


open class AAScatter {
    var lineWidth: Number? = null
    var lineColor: String? = null
    var dashStyle: String? = null
    var enableMouseTracking: Any? = null
    var linkedTo: String? = null
    var states: AAStates? = null
    var marker: AAMarker? = null
    fun lineWidth(prop: Number?): AAScatter {
        lineWidth = prop
        return this
    }

    fun lineColor(prop: String?): AAScatter {
        lineColor = prop
        return this
    }

    fun dashStyle(prop: AAChartLineDashStyleType?): AAScatter {
        dashStyle = prop?.value
        return this
    }

    fun enableMouseTracking(prop: Any?): AAScatter {
        enableMouseTracking = prop
        return this
    }

    fun linkedTo(prop: String?): AAScatter {
        linkedTo = prop
        return this
    }

    fun states(prop: AAStates?): AAScatter {
        states = prop
        return this
    }

    fun marker(prop: AAMarker?): AAScatter {
        marker = prop
        return this
    }
}



