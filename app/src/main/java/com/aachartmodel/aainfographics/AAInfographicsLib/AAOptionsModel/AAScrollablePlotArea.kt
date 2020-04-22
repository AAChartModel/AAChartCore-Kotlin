package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AAScrollablePlotArea {
    var minHeight: Int? = null
    var minWidth: Int? = null
    var opacity: Float? = null
    var scrollPositionX: Float? = null
    var scrollPositionY: Float? = null


    fun minHeight(prop: Int?): AAScrollablePlotArea {
        minHeight = prop
        return this
    }

    fun minWidth(prop: Int?): AAScrollablePlotArea {
        minWidth = prop
        return this
    }

    fun opacity(prop: Float?): AAScrollablePlotArea {
        opacity = prop
        return this
    }

    fun scrollPositionX(prop: Float?): AAScrollablePlotArea {
        scrollPositionX = prop
        return this
    }

    fun scrollPositionY(prop: Float?): AAScrollablePlotArea {
        scrollPositionY = prop
        return this
    }
}