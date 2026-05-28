package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAButtonTheme {
    var fill: String? = null
    var stroke: String? = null
    var radius: Int? = null
    var style: Map<String, Any>? = null

    fun fill(fill: String?) = apply { this.fill = fill }

    fun stroke(stroke: String?) = apply { this.stroke = stroke }

    fun radius(radius: Int?) = apply { this.radius = radius }

    fun style(style: Map<String, Any>?) = apply { this.style = style }
}
