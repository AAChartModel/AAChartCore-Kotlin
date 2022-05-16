package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAZonesElement {
    var value: Number? = null
    var color: Any? = null
    var fillColor: Any? = null
    var dashStyle: String? = null

    fun value(prop: Number?): AAZonesElement {
        value = prop
        return this
    }

    fun color(prop: Any?): AAZonesElement {
        color = prop
        return this
    }

    fun fillColor(prop: Any?): AAZonesElement {
        fillColor = prop
        return this
    }

    fun dashStyle(prop: String?): AAZonesElement {
        dashStyle = prop
        return this
    }
}