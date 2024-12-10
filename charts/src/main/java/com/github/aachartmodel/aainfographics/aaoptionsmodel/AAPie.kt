package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType

open class AAPie {
    var type: String? = null
    var dataLabels: AADataLabels? = null
    var size: Number? = null
    var allowPointSelect: Boolean? = null
    var cursor: String? = null
    var showInLegend: Boolean? = null
    var startAngle: Number? = null
    var endAngle: Number? = null
    var depth: Number? = null
    var center: Any? = null
    var data: Array<Any>? = null


    fun type(prop: AAChartType?): AAPie {
        type = prop?.value
        return this
    }

    fun dataLabels(prop: AADataLabels): AAPie {
        dataLabels = prop
        return this
    }

    fun size(prop: Number?): AAPie {
        size = prop
        return this
    }

    fun allowPointSelect(prop: Boolean?): AAPie {
        allowPointSelect = prop
        return this
    }

    fun cursor(prop: String): AAPie {
        cursor = prop
        return this
    }

    fun showInLegend(prop: Boolean?): AAPie {
        showInLegend = prop
        return this
    }

    fun startAngle(prop: Number?): AAPie {
        startAngle = prop
        return this
    }

    fun endAngle(prop: Number?): AAPie {
        endAngle = prop
        return this
    }

    fun depth(prop: Number?): AAPie {
        depth = prop
        return this
    }

    fun center(prop: Any?): AAPie {
        center = prop
        return this
    }

    fun data(prop: Array<Any>): AAPie {
        data = prop
        return this
    }

}