/**
 * Copyright (C), 2015-2019
 * FileName: AAChart
 * Author: AnAn
 * Date: 2019-08-30 11:49
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartZoomType
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer

class AAChart {
    var type: String? = null
    var backgroundColor: Any? = null
    var plotBackgroundImage: String? = null
    var pinchType: String? = null
    var panning: Boolean? = null
    var panKey: String? = null
    var polar: Boolean? = null
    var animation: Any? = null //AAAnimation | Boolean
    var inverted: Boolean? = null

    /*图表外边缘和绘图区域之间的边距。 数组中的数字分别表示顶部，右侧，底部和左侧 ([👆,👉,👇,👈])。
    也可以使用 marginTop，marginRight，marginBottom 和 marginLeft 来设置某一个方向的边距*/
    var margin: Array<Number>? = null
    var marginTop: Number? = null//👆
    var marginRight: Number? = null//👉
    var marginBottom: Number? = null//👇
    var marginLeft: Number? = null//👈
    var scrollablePlotArea: AAScrollablePlotArea? = null
    var resetZoomButton: AAResetZoomButton? = null
    var zoomType: String? = null
    var events: AAChartEvents? = null
    var height: Number? = null
    

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

    fun animation(prop: Any): AAChart {
        animation = prop
        return this
    }

    fun inverted(prop: Boolean?): AAChart {
        inverted = prop
        return this
    }

    fun margin(prop: Array<Number>?): AAChart {
        margin = prop
        return this
    }

    fun marginTop(prop: Number): AAChart {
        marginTop = prop
        return this
    }

    fun marginRight(prop: Number): AAChart {
        marginRight = prop
        return this
    }

    fun marginBottom(prop: Number): AAChart {
        marginBottom = prop
        return this
    }

    fun marginLeft(prop: Number): AAChart {
        marginLeft = prop
        return this
    }

    fun scrollablePlotArea(prop: AAScrollablePlotArea?): AAChart {
        scrollablePlotArea = prop
        return this
    }
    
    fun resetZoomButton(prop: AAResetZoomButton): AAChart {
        resetZoomButton = prop
        return this
    }

    fun zoomType(zoomType: String?): AAChart {
        this.zoomType = zoomType
        return this
    }

    fun events(events: AAChartEvents?): AAChart {
        this.events = events
        return this
    }

    fun height(height: Number?): AAChart {
        this.height = height
        return this
    }

}


class AAResetZoomButton {
    var position: AAPosition? = null
    var relativeTo: String? = null
    var theme: Map<String, Any>? = null
    fun position(prop: AAPosition?): AAResetZoomButton {
        position = prop
        return this
    }

    fun relativeTo(prop: String?): AAResetZoomButton {
        relativeTo = prop
        return this
    }

    fun theme(prop: Map<String, Any>?): AAResetZoomButton {
        theme = prop
        return this
    }
}


class AAChartEvents {
    var load: String? = null
    var redraw: String? = null
    var render: String? = null
    var selection: String? = null

    fun load(prop: String): AAChartEvents {
        load = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun redraw(prop: String): AAChartEvents {
        redraw = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun render(prop: String): AAChartEvents {
        render = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun selection(prop: String): AAChartEvents {
        selection = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

}
