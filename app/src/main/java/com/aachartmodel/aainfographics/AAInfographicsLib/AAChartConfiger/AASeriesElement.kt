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
package com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger


import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AADataLabels
import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAMarker
import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AATooltip

/**
 * Created by anan on 2018/4/16.
 */


class AASeriesElement {

    private var type: String? = null
    private var name: String? = null
    private var data: Array<Any>? = null
    private var lineWidth: Float? = null//折线图、曲线图、直方折线图、折线填充图、曲线填充图、直方折线填充图的线条宽度
    private var borderWidth: Float? = null
    private var color: Any? = null
    private var fillColor: Any? = null
    private var fillOpacity: Float? = null//折线填充图、曲线填充图、直方折线填充图等填充图类型的填充颜色透明度
    private var threshold: Float? =
        null//The threshold, also called zero level or base level. For line type series this is only used in conjunction with negativeColor. default：0.
    private var negativeColor: String? =
        null// The color for the parts of the graph or points that are below the threshold
    private var dashStyle: String? = null
    private var yAxis: Int? = null
    private var dataLabels: AADataLabels? = null
    private var marker: AAMarker? = null
    private var step: Any? = null
    private var colorByPoint: Boolean? = null
    private var zIndex: Int? = null
    private var zones: Array<Any>? = null
    private var shadow: AAShadow? = null
    private var stack: String? = null
    private var tooltip: AATooltip? = null
    private var showInLegend: Boolean? = null


    fun type(prop: AAChartType): AASeriesElement {
        type = prop.value
        return this
    }

    fun name(prop: String): AASeriesElement {
        name = prop
        return this
    }

    fun data(prop: Array<Any>): AASeriesElement {
        data = prop
        return this
    }

    fun lineWidth(prop: Float?): AASeriesElement {
        lineWidth = prop
        return this
    }

    fun borderWidth(prop: Float): AASeriesElement {
        borderWidth = prop
        return this
    }

    fun color(prop: Any): AASeriesElement {
        color = prop
        return this
    }

    fun fillColor(prop: Any): AASeriesElement {
        fillColor = prop
        return this
    }

    fun fillOpacity(prop: Float?): AASeriesElement {
        fillOpacity = prop
        return this
    }

    fun threshold(prop: Float?): AASeriesElement {
        threshold = prop
        return this
    }

    fun negativeColor(prop: String): AASeriesElement {
        negativeColor = prop
        return this
    }

    fun dashStyle(prop: AAChartLineDashStyleType): AASeriesElement {
        dashStyle = prop.value
        return this
    }

    fun yAxis(prop: Int?): AASeriesElement {
        yAxis = prop
        return this
    }

    fun dataLabels(prop: AADataLabels): AASeriesElement {
        dataLabels = prop
        return this
    }

    fun marker(prop: AAMarker): AASeriesElement {
        marker = prop
        return this
    }

    fun step(prop: Any): AASeriesElement {
        step = prop
        return this
    }

    fun colorByPoint(prop: Boolean?): AASeriesElement {
        colorByPoint = prop
        return this
    }

    fun zIndex(prop: Int?): AASeriesElement {
        zIndex = prop
        return this
    }

    fun zones(prop: Array<Any>): AASeriesElement {
        zones = prop
        return this
    }

    fun shadow(prop: AAShadow): AASeriesElement {
        shadow = prop
        return this
    }

    fun stack(prop: String): AASeriesElement {
        stack = prop
        return this
    }

    fun tooltip(prop: AATooltip): AASeriesElement {
        tooltip = prop
        return this
    }

    fun showInLegend(prop: Boolean): AASeriesElement? {
        showInLegend = prop
        return this
    }

}


class AADataElement {
    private var name: String? = null
    private var y: Float? = null
    private var color: Any? = null
    private var dataLabels: AADataLabels? = null
    private var marker: AAMarker? = null

    fun name(prop: String): AADataElement {
        name = prop
        return this
    }

    fun y(prop: Float?): AADataElement {
        y = prop
        return this
    }

    fun color(prop: Any): AADataElement {
        color = prop
        return this
    }

    fun dataLabels(prop: AADataLabels): AADataElement {
        dataLabels = prop
        return this
    }

    fun marker(prop: AAMarker): AADataElement {
        marker = prop
        return this
    }
}


class AAShadow {
    private var color: String? = null
    private var offsetX: Float? = null
    private var offsetY: Float? = null
    private var opacity: Float? = null
    private var width: Float? = null

    fun color(prop: String): AAShadow {
        color = prop
        return this
    }

    fun offsetX(prop: Float?): AAShadow {
        offsetX = prop
        return this
    }

    fun offsetY(prop: Float?): AAShadow {
        offsetY = prop
        return this
    }

    fun opacity(prop: Float?): AAShadow {
        opacity = prop
        return this
    }

    fun width(prop: Float?): AAShadow {
        width = prop
        return this
    }

}

