/**
 * Copyright (C), 2015-2019
 * FileName: AALegend
 * Author: AnAn
 * Date: 2019-08-30 11:48
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartFontWeightType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLayoutType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType

class AALegend {
    var layout: String? =
        null //图例数据项的布局。布局类型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默认是：horizontal.
    var align: String? = null //设定图例在图表区中的水平对齐方式，合法值有left，center 和 right。
    var verticalAlign: String? =
        null //设定图例在图表区中的垂直对齐方式，合法值有 top，middle 和 bottom。垂直位置可以通过 y 选项做进一步设定。
    var enabled: Boolean? = null
    var borderColor: String? = null
    var borderWidth: Number? = null
    var itemMarginTop: Number? = null //图例的每一项的顶部外边距，单位px。 默认是：0.
    var itemStyle: AAItemStyle? = null
    var x: Number? = null
    var y: Number? = null
    var floating: Boolean? = null
    var labelFormat: String? = null

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

    fun borderWidth(prop: Number?): AALegend {
        borderWidth = prop
        return this
    }

    fun itemMarginTop(prop: Number?): AALegend {
        itemMarginTop = prop
        return this
    }

    fun itemStyle(prop: AAItemStyle): AALegend {
        itemStyle = prop
        return this
    }

    fun x(prop: Number?): AALegend {
        x = prop
        return this
    }

    fun y(prop: Number?): AALegend {
        y = prop
        return this
    }

    fun floating(prop: Boolean?): AALegend {
        floating = prop
        return this
    }

    fun labelFormat(prop: String?): AALegend {
        labelFormat = prop
        return this
    }


}

class AAItemStyle {
    var color: String? = null
    var cursor: String? = null
    var pointer: String? = null
    var fontSize: String? = null
    var fontWeight: String? = null


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

    fun fontSize(prop: Number?): AAItemStyle {
        prop?.let {
            fontSize = "${prop}px"
        }
        return this
    }

    fun fontWeight(prop: AAChartFontWeightType?): AAItemStyle {
        fontWeight = prop?.value
        return this
    }

}

