/**
 * Copyright (C), 2015-2019
 * FileName: AAPlotOptions
 * Author: AnAn
 * Date: 2019-08-30 11:33
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

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








