package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AAPane {
    var background: AABackground? = null
    var center: Array<Any>? = null
    var endAngle: Float? = null
    var size: Float? = null
    var startAngle: Float? = null
    fun background(prop: AABackground?): AAPane {
        background = prop
        return this
    }

    fun center(prop: Array<Any>): AAPane {
        center = prop
        return this
    }

    fun endAngle(prop: Float?): AAPane {
        endAngle = prop
        return this
    }

    fun size(prop: Float?): AAPane {
        size = prop
        return this
    }

    fun startAngle(prop: Float?): AAPane {
        startAngle = prop
        return this
    }
}

class AABackground {
    var backgroundColor: Any? = null
    var borderColor: String? = null
    var borderWidth: Float? = null
    var className: String? = null
    var innerRadius: Float? = null
    var outerRadius: Float? = null
    var shape: String? = null
    fun backgroundColor(prop: Any?): AABackground {
        backgroundColor = prop
        return this
    }

    fun borderColor(prop: String?): AABackground {
        borderColor = prop
        return this
    }

    fun borderWidth(prop: Float?): AABackground {
        borderWidth = prop
        return this
    }

    fun className(prop: String?): AABackground {
        className = prop
        return this
    }

    fun innerRadius(prop: Float?): AABackground {
        innerRadius = prop
        return this
    }

    fun outerRadius(prop: Float?): AABackground {
        outerRadius = prop
        return this
    }

    fun shape(prop: String?): AABackground {
        shape = prop
        return this
    }
}
