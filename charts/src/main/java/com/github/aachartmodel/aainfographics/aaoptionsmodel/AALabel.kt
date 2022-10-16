/**
 * Copyright (C), 2015-2019
 * FileName: AALabel
 * Author: AnAn
 * Date: 2019-08-30 11:19
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer

class AALabel {
    var align: String? = null //标签的对齐方式，可用的值有 "left"、"center" 及 "right"。默认值是根据坐标轴的位置（在图表中的位置）即标签的旋转角度进行智能判断的。 默认是：center.
    var rotation: Number? = null //标签的旋转角度 默认是：0.
    var text: String? = null //文字
    var textAlign: String? = null //文字对齐
    var useHTML: Boolean? = null //HTML渲染
    var verticalAlign: String? = null //竖直对齐
    var style: Any? = null //轴标签的 CSS 样式
    var x: Number? = null //水平偏移
    var y: Number? = null // 竖直偏移
    var format: String? = null //格式化标签文本
    var formatter: String? = null //格式化标签文本


    fun align(prop: String?): AALabel {
        align = prop
        return this
    }

    fun rotation(prop: Number?): AALabel {
        rotation = prop
        return this
    }

    fun text(prop: String?): AALabel {
        text = prop
        return this
    }

    fun textAlign(prop: AAChartAlignType?): AALabel {
        textAlign = prop?.value
        return this
    }

    fun useHTML(prop: Boolean?): AALabel {
        useHTML = prop
        return this
    }

    fun verticalAlign(prop: String?): AALabel {
        verticalAlign = prop
        return this
    }

    fun style(prop: Any?): AALabel {
        style = prop
        return this
    }

    fun x(prop: Number?): AALabel {
        x = prop
        return this
    }

    fun y(prop: Number?): AALabel {
        y = prop
        return this
    }

    fun format(prop: String?): AALabel {
        format = prop
        return this
    }

    fun formatter(prop: String?): AALabel {
        formatter = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

}