/**
 * Copyright (C), 2015-2019
 * FileName: AALegend
 * Author: AnAn
 * Date: 2019-08-30 11:48
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartAlignType
import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartLayoutType
import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartVerticalAlignType

class AALegend {
    private var layout: String? =
        null //图例数据项的布局。布局类型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默认是：horizontal.
    private var align: String? = null //设定图例在图表区中的水平对齐方式，合法值有left，center 和 right。
    private var verticalAlign: String? =
        null //设定图例在图表区中的垂直对齐方式，合法值有 top，middle 和 bottom。垂直位置可以通过 y 选项做进一步设定。
    private var enabled: Boolean? = null
    private var borderColor: String? = null
    private var borderWidth: Float? = null
    private var itemMarginTop: Float? = null //图例的每一项的顶部外边距，单位px。 默认是：0.
    private var itemStyle: AAItemStyle? = null
    private var x: Float? = null
    private var y: Float? = null
    private var floating:Boolean? = null

    fun layout(prop: AAChartLayoutType): AALegend {
        layout = prop.value
        return this
    }

    fun align(prop: AAChartAlignType): AALegend {
        align = prop.value
        return this
    }

    fun verticalAlign(prop: AAChartVerticalAlignType): AALegend {
        verticalAlign = prop.value
        return this
    }

    fun enabled(prop: Boolean?): AALegend {
        enabled = prop
        return this
    }

    fun borderColor(prop: String): AALegend {
        borderColor = prop
        return this
    }

    fun BorderWidth(prop: Float?): AALegend {
        borderWidth = prop
        return this
    }

    fun itemMarginTop(prop: Float?): AALegend {
        itemMarginTop = prop
        return this
    }

    fun itemStyle(prop: AAItemStyle): AALegend {
        itemStyle = prop
        return this
    }

    fun x(prop: Float?): AALegend {
        x = prop
        return this
    }

    fun y(prop: Float?): AALegend {
        y = prop
        return this
    }

    fun floating(prop: Boolean): AALegend {
        floating = prop
        return this
    }


}

class AAItemStyle {
    private var color: String? = null
    private var cursor: String? = null
    private var pointer: String? = null
    private var fontSize: String? = null
    private var fontWeight: String? = null


    fun color(prop: String?): AAItemStyle {
        color = prop
        return this
    }

    fun cursor(prop: String): AAItemStyle {
        cursor = prop
        return this
    }

    fun pointer(prop: String): AAItemStyle {
        pointer = prop
        return this
    }

    fun fontSize(prop: Float?): AAItemStyle {
        fontSize = prop!!.toString() + "px"
        return this
    }

    fun fontWeight(prop: String): AAItemStyle {
        fontWeight = prop
        return this
    }

}

