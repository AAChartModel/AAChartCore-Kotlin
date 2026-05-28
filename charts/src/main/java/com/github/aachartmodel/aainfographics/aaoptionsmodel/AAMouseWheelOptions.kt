package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAMouseWheelOptions {
    var enabled: Boolean? = null
    var sensitivity: Float? = null
    var type: String? = null  // "x" | "y" | "xy"

    fun enabled(v: Boolean?) = apply { enabled = v }
    fun sensitivity(v: Float?) = apply { sensitivity = v }
    fun type(v: String?) = apply { type = v }
}
