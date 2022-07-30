package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAScrollablePlotArea {
    var minHeight: Number? = null
    var minWidth: Number? = null
    var opacity: Float? = null
    var scrollPositionX: Number? = null
    var scrollPositionY: Number? = null


    fun minHeight(prop: Number?): AAScrollablePlotArea {
        minHeight = prop
        return this
    }

    fun minWidth(prop: Number?): AAScrollablePlotArea {
        minWidth = prop
        return this
    }

    fun opacity(prop: Float?): AAScrollablePlotArea {
        opacity = prop
        return this
    }

    fun scrollPositionX(prop: Number?): AAScrollablePlotArea {
        scrollPositionX = prop
        return this
    }

    fun scrollPositionY(prop: Number?): AAScrollablePlotArea {
        scrollPositionY = prop
        return this
    }
}