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



