/**
 * Copyright (C), 2015-2019
 * FileName: AATooltip
 * Author: ios-fn
 * Date: 2019-06-16 19:04
 * Description:
 * History:
 */
/**
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore            ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore-Kotlin     ◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 */

/**

 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/AAChartCore-Kotlin/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer


class AATooltip {
    var backgroundColor: String? = null
    var borderColor: String? = null
    var borderRadius: Float? = null
    var borderWidth: Float? = null
    var style: AAStyle? = null
    var enabled: Boolean? = null
    var useHTML: Boolean? = null
    var formatter: String? = null
    var headerFormat: String? = null
    var pointFormat: String? = null
    var footerFormat: String? = null
    var valueDecimals: Int? = null
    var shared: Boolean? = null
    var valueSuffix: String? = null
    var followTouchMove: Boolean? = null //https://api.highcharts.com.cn/highcharts#chart.panning
    var shadow: Boolean? = null
    var padding: Float? = null
    var pointFormatter: String? = null
    var positioner: String? = null
    var dateTimeLabelFormats: AADateTimeLabelFormats? = null

    fun backgroundColor(prop: String): AATooltip {
        backgroundColor = prop
        return this
    }

    fun borderColor(prop: String): AATooltip {
        borderColor = prop
        return this
    }

    fun borderRadius(prop: Float?): AATooltip {
        borderRadius = prop
        return this
    }

    fun borderWidth(prop: Float?): AATooltip {
        borderWidth = prop
        return this
    }

    fun style(prop: AAStyle): AATooltip {
        style = prop
        return this
    }

    fun enabled(prop: Boolean?): AATooltip {
        enabled = prop
        return this
    }

    fun useHTML(prop: Boolean?): AATooltip {
        useHTML = prop
        return this
    }

    fun formatter(prop: String): AATooltip {
        var pureJSFunctionStr = "($prop)"
        pureJSFunctionStr = AAJSStringPurer.pureJavaScriptFunctionString(pureJSFunctionStr)
        formatter = pureJSFunctionStr
        return this
    }

    fun headerFormat(prop: String): AATooltip {
        headerFormat = prop
        return this
    }

    fun pointFormat(prop: String): AATooltip {
        pointFormat = prop
        return this
    }

    fun footerFormat(prop: String): AATooltip {
        footerFormat = prop
        return this
    }

    fun valueDecimals(prop: Int?): AATooltip {
        valueDecimals = prop
        return this
    }

    fun shared(prop: Boolean?): AATooltip {
        shared = prop
        return this
    }

    fun valueSuffix(prop: String?): AATooltip {
        valueSuffix = prop
        return this
    }

    fun followTouchMove(prop: Boolean): AATooltip {
        followTouchMove = prop
        return this
    }

    fun shadow(prop: Boolean): AATooltip {
        shadow = prop
        return this
    }

    fun padding(prop: Float): AATooltip {
        padding = prop
        return this
    }

    fun pointFormatter(prop: String): AATooltip {
        pointFormatter = prop
        return this
    }

    fun positioner(prop: String): AATooltip {
        positioner = prop
        return this
    }

    fun dateTimeLabelFormats(prop: AADateTimeLabelFormats): AATooltip {
        dateTimeLabelFormats = prop
        return this
    }

    init {
        shared = true
        enabled = true
        shadow = true
    }

}



