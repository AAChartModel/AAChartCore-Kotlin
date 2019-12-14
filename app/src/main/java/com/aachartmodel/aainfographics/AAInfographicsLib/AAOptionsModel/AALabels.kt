/**
 * Copyright (C), 2015-2019
 * FileName: AALabels
 * Author: AnAn
 * Date: 2019-08-30 11:23
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartAlignType
import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAJSStringPurer


class AALabels {
     var align: String? =
        null//轴标签的对齐方式，可用的值有 "left"、"center" 及 "right"。默认值是根据坐标轴的位置（在图表中的位置）即标签的旋转角度进行智能判断的。 默认是：center.
     var autoRotation: Any? =
        null //只针对水平轴有效，允许在防止轴标签重叠时自动旋转轴标签的角度。当空间足够时，轴标签不会被旋转。当图表变小时（主要是宽度变小） ，轴标签开始旋转对应的角度，然后会依次删除间隔的轴标签并尝试旋转数组中的角度。可以通过将此参数设置为 false 来关闭轴标签旋转（这将导致标签自动换行）。 默认是：[-45].
     var autoRotationLimit: Float? =
        null//当每个分类的宽度比该参数的值大很多（像素）时，轴标签将不会被自动旋转，而是以换行的形式展示轴标签。 当轴标签包含多个短词时换行展示轴标签可以使得轴标签有足够的空间，所以设置合理的自动旋转下限是非常有意义的。 默认是：80.
     var distance: Float? = null//只针对极地图有效，定义周标签与绘图区边缘的距离。 默认是：15.
     var enabled: Boolean? = null//是否显示坐标轴标签 默认是：true.
     var format: String? = null//坐标轴格式化字符串。 默认是：{value}.
     var formatter: String? = null//坐标轴格式化字符串。 默认是：{value}.
     var padding: Float? = null//轴标签的内间距，作用是保证轴标签之间有空隙。 默认是：5.
     var rotation: Float? = null//轴标签的旋转角度 默认是：0.
     var staggerLines: Int? = null//只针对水平轴有效，定义轴标签显示行数。
     var step: Int? =
        null//显示 n 的倍数标签，例如设置为 2 则表示标签间隔一个轴标签显示。默认情况下，为了避免轴标签被覆盖，该参数会根据情况自动计算。可以通过设置此参数为 1 来阻止自动计算。
     var style: AAStyle? = null//轴标签的 CSS 样式
     var x: Float? = null//相对于坐标轴刻度线的水平偏移。 默认是：0.
     var y: Float? = null//相对于坐标轴刻度线的垂直平偏移。 默认是：null.
     var useHTML: Boolean? = null//HTML渲染

    fun align(prop: AAChartAlignType): AALabels {
        align = prop.value
        return this
    }

    fun autoRotation(prop: Any): AALabels {
        autoRotation = prop
        return this
    }

    fun autoRotationLimit(prop: Float?): AALabels {
        autoRotationLimit = prop
        return this
    }

    fun distance(prop: Float?): AALabels {
        distance = prop
        return this
    }

    fun enabled(prop: Boolean?): AALabels {
        enabled = prop
        return this
    }

    fun format(prop: String): AALabels {
        format = prop
        return this
    }

    fun formatter(prop: String): AALabels {
        var pureJSFunctionStr = "($prop)"
        pureJSFunctionStr = AAJSStringPurer.pureJavaScriptFunctionString(pureJSFunctionStr)
        formatter = pureJSFunctionStr
        return this
    }

    fun padding(prop: Float?): AALabels {
        padding = prop
        return this
    }

    fun rotation(prop: Float?): AALabels {
        rotation = prop
        return this
    }

    fun staggerLines(prop: Int?): AALabels {
        staggerLines = prop
        return this
    }

    fun step(prop: Int?): AALabels {
        step = prop
        return this
    }

    fun style(prop: AAStyle): AALabels {
        style = prop
        return this
    }

    fun x(prop: Float?): AALabels {
        x = prop
        return this
    }

    fun y(prop: Float?): AALabels {
        y = prop
        return this
    }

    fun useHTML(prop: Boolean?): AALabels {
        useHTML = prop
        return this
    }
}
