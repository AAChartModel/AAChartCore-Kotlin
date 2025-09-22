package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType

// https://api.highcharts.com/highcharts/xAxis.title.align
// https://api.highcharts.com/highcharts/yAxis.title.align
enum class AAChartAxisTitleAlignValueType(val value: String) {
    High("high"),
    Low("low"),
    Middle("middle")
}

// https://api.highcharts.com/highcharts/xAxis.title
// https://api.highcharts.com/highcharts/yAxis.title
class AAAxisTitle {
    var align: String? = null
    var margin: String? = null
    var offset: Number? = null
    var rotation: Number? = null
    var style: AAStyle? = null
    var text: String? = null
    var textAlign: String? = null
    var useHTML: Boolean? = null // 是否使用 HTML 渲染标题
    var x: Number? = null // 标题相对于水平对齐的偏移量，取值范围为：图表左边距到图表右边距，可以是负值，单位px。 默认是：0.
    var y: Number? = null // 标题相对于垂直对齐的偏移量，取值范围：图表的上边距（chart.spacingTop ）到图表的下边距（chart.spacingBottom），可以是负值，单位是px。默认值和字体大小有关。

    fun align(prop: AAChartAxisTitleAlignValueType?): AAAxisTitle {
        align = prop?.value
        return this
    }

    fun margin(prop: String?): AAAxisTitle {
        margin = prop
        return this
    }

    fun offset(prop: Number?): AAAxisTitle {
        offset = prop
        return this
    }

    fun rotation(prop: Number?): AAAxisTitle {
        rotation = prop
        return this
    }

    fun style(prop: AAStyle?): AAAxisTitle {
        style = prop
        return this
    }

    fun text(prop: String?): AAAxisTitle {
        text = prop
        return this
    }

    fun textAlign(prop: AAChartAlignType?): AAAxisTitle {
        textAlign = prop?.value
        return this
    }

    fun useHTML(prop: Boolean?): AAAxisTitle {
        useHTML = prop
        return this
    }

    fun x(prop: Number?): AAAxisTitle {
        x = prop
        return this
    }

    fun y(prop: Number?): AAAxisTitle {
        y = prop
        return this
    }
}