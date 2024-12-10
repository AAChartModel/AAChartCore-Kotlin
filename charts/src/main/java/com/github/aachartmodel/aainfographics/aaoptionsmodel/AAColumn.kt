package com.github.aachartmodel.aainfographics.aaoptionsmodel

open class AABaseColumn {
    var name: String? = null
    var data: Array<Any>? = null
    var color: String? = null
    var grouping: Boolean? =
        null//Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other. 默认是：true.
    var pointPadding: Float? =
        null//Padding between each column or bar, in x axis units. 默认是：0.1.
    var pointPlacement: Float? =
        null//Padding between each column or bar, in x axis units. 默认是：0.1.
    var groupPadding: Float? =
        null//Padding between each value groups, in x axis units. 默认是：0.2.
    var borderColor: String? = null
    var borderRadius: Number? = null
    var borderWidth: Number? = null
    var colorByPoint: Boolean? =
        null//对每个不同的点设置颜色(当图表类型为 AAColumn 时,设置为 AAColumn 对象的属性,当图表类型为 bar 时,应该设置为 bar 对象的属性才有效)
    var dataLabels: AADataLabels? = null
    var stacking: String? = null
    var yAxis: Int? = null
    var pointWith: Number? = null //柱形条的宽度
    var maxPointWidth: Number? = null //柱形条的最大宽度
    var minPointLength: Number? = null //柱形条的最小高度
}

open class AAColumn: AABaseColumn() {
    fun name(prop: String?): AAColumn {
        name = prop
        return this
    }

    fun data(prop: Array<Any>?): AAColumn {
        data = prop
        return this
    }

    fun color(prop: String?): AAColumn {
        color = prop
        return this
    }

    fun grouping(prop: Boolean?): AAColumn {
        grouping = prop
        return this
    }

    fun pointPadding(prop: Float?): AAColumn {
        pointPadding = prop
        return this
    }

    fun pointPlacement(prop: Float?): AAColumn {
        pointPlacement = prop
        return this
    }

    fun groupPadding(prop: Float?): AAColumn {
        groupPadding = prop
        return this
    }

    fun borderColor(prop: String?): AAColumn {
        borderColor = prop
        return this
    }

    fun borderRadius(prop: Number?): AAColumn {
        borderRadius = prop
        return this
    }

    fun borderWidth(prop: Number?): AAColumn {
        borderWidth = prop
        return this
    }

    fun colorByPoint(prop: Boolean?): AAColumn {
        colorByPoint = prop
        return this
    }

    fun dataLabels(prop: AADataLabels?): AAColumn {
        dataLabels = prop
        return this
    }

    fun stacking(prop: String?): AAColumn {
        stacking = prop
        return this
    }

    fun yAxis(prop: Int?): AAColumn {
        yAxis = prop
        return this
    }

    fun pointWidth(prop: Number?): AAColumn {
        pointWith = prop
        return this
    }

    fun maxPointWidth(prop: Number?): AAColumn {
        maxPointWidth = prop
        return this
    }

    fun minPointLength(prop: Number?): AAColumn {
        minPointLength = prop
        return this
    }
}


open class AABar: AABaseColumn() {
    fun name(prop: String?): AABar {
        name = prop
        return this
    }

    fun data(prop: Array<Any>?): AABar {
        data = prop
        return this
    }

    fun color(prop: String?): AABar {
        color = prop
        return this
    }

    fun grouping(prop: Boolean?): AABar {
        grouping = prop
        return this
    }

    fun pointPadding(prop: Float?): AABar {
        pointPadding = prop
        return this
    }

    fun pointPlacement(prop: Float?): AABar {
        pointPlacement = prop
        return this
    }

    fun groupPadding(prop: Float?): AABar {
        groupPadding = prop
        return this
    }

    fun borderColor(prop: String?): AABar {
        borderColor = prop
        return this
    }

    fun borderRadius(prop: Number?): AABar {
        borderRadius = prop
        return this
    }

    fun borderWidth(prop: Number?): AABar {
        borderWidth = prop
        return this
    }

    fun colorByPoint(prop: Boolean?): AABar {
        colorByPoint = prop
        return this
    }

    fun dataLabels(prop: AADataLabels?): AABar {
        dataLabels = prop
        return this
    }

    fun stacking(prop: String?): AABar {
        stacking = prop
        return this
    }

    fun yAxis(prop: Int?): AABar {
        yAxis = prop
        return this
    }

    fun pointWidth(prop: Number?): AABar {
        pointWith = prop
        return this
    }

    fun maxPointWidth(prop: Number?): AABar {
        maxPointWidth = prop
        return this
    }

    fun minPointLength(prop: Number?): AABar {
        minPointLength = prop
        return this
    }
}


open class AAColumnrange: AABaseColumn() {
    fun name(prop: String?): AAColumnrange {
        name = prop
        return this
    }

    fun data(prop: Array<Any>?): AAColumnrange {
        data = prop
        return this
    }

    fun color(prop: String?): AAColumnrange {
        color = prop
        return this
    }

    fun grouping(prop: Boolean?): AAColumnrange {
        grouping = prop
        return this
    }

    fun pointPadding(prop: Float?): AAColumnrange {
        pointPadding = prop
        return this
    }

    fun pointPlacement(prop: Float?): AAColumnrange {
        pointPlacement = prop
        return this
    }

    fun groupPadding(prop: Float?): AAColumnrange {
        groupPadding = prop
        return this
    }

    fun borderColor(prop: String?): AAColumnrange {
        borderColor = prop
        return this
    }

    fun borderRadius(prop: Number?): AAColumnrange {
        borderRadius = prop
        return this
    }

    fun borderWidth(prop: Number?): AAColumnrange {
        borderWidth = prop
        return this
    }

    fun colorByPoint(prop: Boolean?): AAColumnrange {
        colorByPoint = prop
        return this
    }

    fun dataLabels(prop: AADataLabels?): AAColumnrange {
        dataLabels = prop
        return this
    }

    fun stacking(prop: String?): AAColumnrange {
        stacking = prop
        return this
    }

    fun yAxis(prop: Int?): AAColumnrange {
        yAxis = prop
        return this
    }

    fun pointWidth(prop: Number?): AAColumnrange {
        pointWith = prop
        return this
    }

    fun maxPointWidth(prop: Number?): AAColumnrange {
        maxPointWidth = prop
        return this
    }

    fun minPointLength(prop: Number?): AAColumnrange {
        minPointLength = prop
        return this
    }
}