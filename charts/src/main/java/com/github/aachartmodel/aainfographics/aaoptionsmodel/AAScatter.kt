package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType

open class AAScatter {
    var lineWidth: Number? = null
    var lineColor: String? = null
    var dashStyle: String? = null
    var enableMouseTracking: Any? = null
    var linkedTo: String? = null
    var states: AAStates? = null
    var marker: AAMarker? = null
    fun lineWidth(prop: Number?): AAScatter {
        lineWidth = prop
        return this
    }

    fun lineColor(prop: String?): AAScatter {
        lineColor = prop
        return this
    }

    fun dashStyle(prop: AAChartLineDashStyleType?): AAScatter {
        dashStyle = prop?.value
        return this
    }

    fun enableMouseTracking(prop: Any?): AAScatter {
        enableMouseTracking = prop
        return this
    }

    fun linkedTo(prop: String?): AAScatter {
        linkedTo = prop
        return this
    }

    fun states(prop: AAStates?): AAScatter {
        states = prop
        return this
    }

    fun marker(prop: AAMarker?): AAScatter {
        marker = prop
        return this
    }
}