/**
 * Copyright (C), 2015-2019
 * FileName: AAChart
 * Author: AnAn
 * Date: 2019-08-30 11:49
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartType
import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartZoomType

class AAChart {
    private var type: String? = null
    private var backgroundColor: Any? = null
    private var plotBackgroundImage: String? = null
    private var pinchType: String? = null
    private var panning: Boolean? = null
    private var panKey: String? = null
    private var polar: Boolean? = null
    private var animation: AAAnimation? = null
    private var inverted: Boolean? = null
    /*图表外边缘和绘图区域之间的边距。 数组中的数字分别表示顶部，右侧，底部和左侧 ([👆,👉,👇,👈])。 
    也可以使用 marginTop，marginRight，marginBottom 和 marginLeft 来设置某一个方向的边距*/
    private var margin: Array<Float>? = null
    private var marginTop: Float? = null//👆
    private var marginRight: Float? = null//👉
    private var marginBottom: Float? = null//👇
    private var marginLeft: Float? = null//👈
    var scrollablePlotArea: AAScrollablePlotArea? = null


    fun type(prop: AAChartType?): AAChart {
        type = prop?.value
        return this
    }

    fun backgroundColor(prop: Any?): AAChart {
        backgroundColor = prop
        return this
    }

    fun plotBackgroundImage(prop: String): AAChart {
        plotBackgroundImage = prop
        return this
    }

    fun pinchType(prop: AAChartZoomType?): AAChart {
        pinchType = prop?.value
        return this
    }

    fun panning(prop: Boolean?): AAChart {
        panning = prop
        return this
    }

    fun panKey(prop: String): AAChart {
        panKey = prop
        return this
    }

    fun polar(prop: Boolean?): AAChart {
        polar = prop
        return this
    }

    fun animation(prop: AAAnimation): AAChart {
        animation = prop
        return this
    }

    fun inverted(prop: Boolean?): AAChart {
        inverted = prop
        return this
    }

    fun marginLeft(prop: Float?): AAChart {
        marginLeft = prop
        return this
    }

    fun marginRight(prop: Float?): AAChart {
        marginRight = prop
        return this
    }

    fun margin(prop: Array<Float>): AAChart {
        margin = prop
        return this
    }

    fun marginTop(prop: Float): AAChart {
        marginTop = prop
        return this
    }

    fun marginRight(prop: Float): AAChart {
        marginRight = prop
        return this
    }

    fun marginBottom(prop: Float): AAChart {
        marginBottom = prop
        return this
    }

    fun marginLeft(prop: Float): AAChart {
        marginLeft = prop
        return this
    }

    fun scrollablePlotArea(prop: AAScrollablePlotArea?): AAChart {
        scrollablePlotArea = prop
        return this
    }

}
