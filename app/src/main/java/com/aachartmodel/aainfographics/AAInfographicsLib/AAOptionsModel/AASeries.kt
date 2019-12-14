/**
 * Copyright (C), 2015-2019
 * FileName: AASeries
 * Author: ios-fn
 * Date: 2019-08-30 11:32
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartStackingType

class AASeries {
    private var borderRadius: Float? = null
    private var marker: AAMarker? = null
    private var stacking: String? = null
    private var animation: AAAnimation? = null
    private var keys: Array<String>? = null
    private var colorByPoint: Boolean? = null//决定了图表是否给每个数据列或每个点分配一个颜色，默认值是 false， 即默认是给每个数据类分配颜色，
    private var connectNulls: Boolean? = null//设置折线是否断点重连
    private var events: Map<*, *>? = null
    private var shadow: AAShadow? = null

    fun borderRadius(prop: Float?): AASeries {
        borderRadius = prop
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

}
