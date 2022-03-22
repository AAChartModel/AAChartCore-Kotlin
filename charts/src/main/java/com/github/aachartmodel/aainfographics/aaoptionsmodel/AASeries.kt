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

class AASeries {
    var borderColor //The border color, It is only valid for column, bar, pie, columnrange, pyramid and funnel chart types
            : String? = null
    var borderWidth //The border width, It is only valid for column, bar, pie, columnrange, pyramid and funnel chart types
            : Float? = null
    var borderRadius //The corner radius of the border surrounding each column or bar.
            : Float? = null
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
    var events: Map<*, *>? = null
    var shadow: AAShadow? = null
    var dataLabels: AADataLabels? = null

    fun borderColor(prop: String?): AASeries {
        borderColor = prop
        return this
    }

    fun borderWidth(prop: Float?): AASeries {
        borderWidth = prop
        return this
    }

    fun borderRadius(prop: Float?): AASeries {
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

    fun events(prop: Map<*, *>): AASeries {
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
}