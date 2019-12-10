/**
 * Copyright (C), 2015-2019
 * FileName: AAPlotOptions
 * Author: AnAn
 * Date: 2019-08-30 11:33
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AAPlotOptions {
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

}

class AAColumn {
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
    var borderWidth: Float? = null
    var colorByPoint: Boolean? =
        null//对每个不同的点设置颜色(当图表类型为 AAColumn 时,设置为 AAColumn 对象的属性,当图表类型为 bar 时,应该设置为 bar 对象的属性才有效)
    var dataLabels: AADataLabels? = null
    var stacking: String? = null
    var borderRadius: Float? = null
    var yAxis: Float? = null

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

    fun borderWidth(prop: Float?): AAColumn {
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

    fun borderRadius(prop: Float?): AAColumn {
        borderRadius = prop
        return this
    }

    fun yAxis(prop: Float?): AAColumn {
        yAxis = prop
        return this
    }

}

class AABar {
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
    var borderWidth: Float? = null
    var colorByPoint: Boolean? =
        null//对每个不同的点设置颜色(当图表类型为 AABar 时,设置为 AABar 对象的属性,当图表类型为 bar 时,应该设置为 bar 对象的属性才有效)
    var dataLabels: AADataLabels? = null
    var stacking: String? = null
    var borderRadius: Float? = null
    var yAxis: Float? = null

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

    fun borderWidth(prop: Float?): AABar {
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

    fun borderRadius(prop: Float?): AABar {
        borderRadius = prop
        return this
    }

    fun yAxis(prop: Float?): AABar {
        yAxis = prop
        return this
    }
}


class AALine {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AALine {
        dataLabels = prop
        return this
    }
}

class AASpline {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AASpline {
        dataLabels = prop
        return this
    }
}

class AAArea {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AAArea {
        dataLabels = prop
        return this
    }
}

class AAAreaspline {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AAAreaspline {
        dataLabels = prop
        return this
    }
}

class AAPie {
    var dataLabels:AADataLabels? = null
    var size: Float? = null
    var allowPointSelect: Boolean? = null
    var cursor: String? = null
    var showInLegend: Boolean? = null
    var startAngle: Float? = null
    var endAngle: Float? = null
    var depth: Float? = null
    var center: Float? = null

    fun dataLabels(prop: AADataLabels): AAPie {
        dataLabels = prop
        return this
    }

    fun size(prop: Float?): AAPie {
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

    fun startAngle(prop: Float?): AAPie {
        startAngle = prop
        return this
    }

    fun endAngle(prop: Float?): AAPie {
        endAngle = prop
        return this
    }

    fun depth(prop: Float?): AAPie {
        depth = prop
        return this
    }

    fun center(prop: Float?): AAPie {
        center = prop
        return this
    }

}

class AAColumnrange {
    var borderRadius: Float? = null
    var borderWidth: Float? = null
    var dataLabels: AADataLabels? = null

    fun borderRadius(prop: Float?): AAColumnrange {
        borderRadius = prop
        return this
    }

    fun borderWidth(prop: Float?): AAColumnrange {
        borderWidth = prop
        return this
    }

    fun dataLabels(prop: AADataLabels): AAColumnrange {
        dataLabels = prop
        return this
    }
}

class AAArearange {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AAArearange {
        dataLabels = prop
        return this
    }
}



