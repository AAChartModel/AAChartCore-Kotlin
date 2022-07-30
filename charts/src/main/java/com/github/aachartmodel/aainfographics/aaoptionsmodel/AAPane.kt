package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAPane {
    var background: AABackground? = null
    var center: Array<Any>? = null
    var endAngle: Number? = null
    var size: Number? = null
    var startAngle: Number? = null
    fun background(prop: AABackground?): AAPane {
        background = prop
        return this
    }

    fun center(prop: Array<Any>): AAPane {
        center = prop
        return this
    }

    fun endAngle(prop: Number?): AAPane {
        endAngle = prop
        return this
    }

    fun size(prop: Number?): AAPane {
        size = prop
        return this
    }

    fun startAngle(prop: Number?): AAPane {
        startAngle = prop
        return this
    }
}

class AABackground {
    var backgroundColor: Any? = null
    var borderColor: String? = null
    var borderWidth: Number? = null
    var className: String? = null
    var innerRadius: Number? = null
    var outerRadius: Number? = null
    var shape: String? = null
    fun backgroundColor(prop: Any?): AABackground {
        backgroundColor = prop
        return this
    }

    fun borderColor(prop: String?): AABackground {
        borderColor = prop
        return this
    }

    fun borderWidth(prop: Number?): AABackground {
        borderWidth = prop
        return this
    }

    fun className(prop: String?): AABackground {
        className = prop
        return this
    }

    fun innerRadius(prop: Number?): AABackground {
        innerRadius = prop
        return this
    }

    fun outerRadius(prop: Number?): AABackground {
        outerRadius = prop
        return this
    }

    fun shape(prop: String?): AABackground {
        shape = prop
        return this
    }
}
