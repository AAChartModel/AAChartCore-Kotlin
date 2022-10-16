/**
 * Copyright (C), 2015-2019
 * FileName: AASeries
 * Author: ios-fn
 * Date: 2019-08-30 11:32
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType
import com.github.aachartmodel.aainfographics.aachartcreator.AAShadow
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer

class AASeries {
    var borderColor //The border color, It is only valid for column, bar, pie, columnrange, pyramid and funnel chart types
            : String? = null
    var borderWidth //The border width, It is only valid for column, bar, pie, columnrange, pyramid and funnel chart types
            : Number? = null
    var borderRadius //The corner radius of the border surrounding each column or bar.
            : Number? = null
    var borderRadiusTopLeft: Any? = null
    var borderRadiusTopRight: Any? = null
    var borderRadiusBottomLeft: Any? = null
    var borderRadiusBottomRight: Any? = null
    var marker: AAMarker? = null
    var stacking: String? = null
    var animation: AAAnimation? = null
    var keys: Array<String>? = null
    var colorByPoint: Boolean? = null//决定了图表是否给每个数据列或每个点分配一个颜色，默认值是 false， 即默认是给每个数据类分配颜色，
    var connectNulls: Boolean? = null//设置折线是否断点重连
    var events: AASeriesEvents? = null
    var shadow: AAShadow? = null
    var dataLabels: AADataLabels? = null
    var states: AAStates? = null
    var point: AAPoint? = null
    var pointInterval: Int? = null
    var pointIntervalUnit: String? = null
    var pointPlacement: Any? = null
    var pointStart: Number? = null

    fun borderColor(prop: String?): AASeries {
        borderColor = prop
        return this
    }

    fun borderWidth(prop: Number?): AASeries {
        borderWidth = prop
        return this
    }

    fun borderRadius(prop: Number?): AASeries {
        borderRadius = prop
        return this
    }

    fun borderRadiusTopLeft(prop: Any?): AASeries {
        borderRadiusTopLeft = prop
        return this
    }

    fun borderRadiusTopRight(prop: Any?): AASeries {
        borderRadiusTopRight = prop
        return this
    }

    fun borderRadiusBottomLeft(prop: Any?): AASeries {
        borderRadiusBottomLeft = prop
        return this
    }

    fun borderRadiusBottomRight(prop: Any?): AASeries {
        borderRadiusBottomRight = prop
        return this
    }

    fun marker(prop: AAMarker): AASeries {
        marker = prop
        return this
    }

    fun stacking(prop: AAChartStackingType?): AASeries {
        stacking = prop?.value
        return this
    }

    fun animation(prop: AAAnimation): AASeries {
        animation = prop
        return this
    }

    fun keys(prop: Array<String>): AASeries {
        keys = prop
        return this
    }

    fun colorByPoint(prop: Boolean?): AASeries {
        colorByPoint = prop
        return this
    }

    fun connectNulls(prop: Boolean?): AASeries {
        connectNulls = prop
        return this
    }

    fun events(prop: AASeriesEvents): AASeries {
        events = prop
        return this
    }

    fun shadow(prop: AAShadow): AASeries {
        shadow = prop
        return this
    }

    fun dataLabels(prop: AADataLabels): AASeries {
        dataLabels = prop
        return this
    }

    fun states(prop: AAStates): AASeries {
        states = prop
        return this
    }

    fun point(prop: AAPoint): AASeries {
        point = prop
        return this
    }

    fun pointInterval(prop: Int): AASeries {
        pointInterval = prop
        return this
    }

    fun pointIntervalUnit(prop: String): AASeries {
        pointIntervalUnit = prop
        return this
    }

    fun pointPlacement(prop: Any): AASeries {
        pointPlacement = prop
        return this
    }

    fun pointStart(prop: Number): AASeries {
        pointStart = prop
        return this
    }
}

class AASeriesEvents {
    var legendItemClick: String? = null

    fun legendItemClick(prop: String): AASeriesEvents {
        legendItemClick = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }
}

class AAPoint {
    var events: AAPointEvents? = null

    fun events(prop: AAPointEvents): AAPoint {
        events = prop
        return this
    }
}

class AAPointEvents {
    var click //点击事件
            : String? = null
    var mouseOut //鼠标划出
            : String? = null
    var mouseOver //鼠标划过
            : String? = null
    var remove //删除
            : String? = null
    var select //选中
            : String? = null
    var unselect //取消选中
            : String? = null
    var update //更新
            : String? = null
    var legendItemClick //图例点击事件
            : String? = null


    fun click(prop: String?): AAPointEvents {
        click = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun mouseOut(prop: String?): AAPointEvents {
        mouseOut = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun mouseOver(prop: String?): AAPointEvents {
        mouseOver = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun remove(prop: String?): AAPointEvents {
        remove = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun select(prop: String?): AAPointEvents {
        select = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun unselect(prop: String?): AAPointEvents {
        unselect = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun update(prop: String?): AAPointEvents {
        update = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun legendItemClick(prop: String?): AAPointEvents {
        legendItemClick = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

}
