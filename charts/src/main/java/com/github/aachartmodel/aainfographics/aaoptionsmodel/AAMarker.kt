/**
 * Copyright (C), 2015-2019
 * FileName: AAMarker
 * Author: AnAn
 * Date: 2019-08-30 11:33
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

open class AAMarker {
    var enabled: Boolean? = null
    var radius: Number? = null
    var symbol: String? = null
    var fillColor: String? = null//点的填充色(用来设置折线连接点的填充色)
    var lineWidth: Number? = null//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
    var lineColor: Any? = null//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色。)
    var states: AAMarkerStates? = null

    fun enabled(prop: Boolean): AAMarker {
        enabled = prop
        return this
    }

    fun radius(prop: Number?): AAMarker {
        radius = prop
        return this
    }

    fun symbol(prop: String?): AAMarker {
        symbol = prop
        return this
    }

    fun fillColor(prop: String): AAMarker {
        fillColor = prop
        return this
    }

    fun lineWidth(prop: Number?): AAMarker {
        lineWidth = prop
        return this
    }

    fun lineColor(prop: Any?): AAMarker {
        lineColor = prop
        return this
    }

    fun states(prop: AAMarkerStates): AAMarker? {
        states = prop
        return this
    }
}

open class AAMarkerStates {
    var hover: AAMarkerHover? = null

    fun hover(prop: AAMarkerHover?): AAMarkerStates {
        hover = prop
        return this
    }
}

open class AAMarkerHover {
    var enabled: Boolean? = null
    var fillColor: String? = null
    var lineColor: String? = null
    var lineWidth: Number? = null
    var lineWidthPlus: Number? = null
    var radius: Number? = null
    var radiusPlus: Number? = null


    fun enabled(prop: Boolean?): AAMarkerHover {
        enabled = prop
        return this
    }

    fun fillColor(prop: String?): AAMarkerHover {
        fillColor = prop
        return this
    }

    fun lineColor(prop: String?): AAMarkerHover {
        lineColor = prop
        return this
    }

    fun lineWidth(prop: Number?): AAMarkerHover {
        lineWidth = prop
        return this
    }

    fun lineWidthPlus(prop: Number?): AAMarkerHover {
        lineWidthPlus = prop
        return this
    }

    fun radius(prop: Number?): AAMarkerHover {
        radius = prop
        return this
    }

    fun radiusPlus(prop: Number?): AAMarkerHover {
        radiusPlus = prop
        return this
    }
}

