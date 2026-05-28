package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAZooming {
    var type: String? = null // "x" | "y" | "xy"
    var pinchType: String? = null // "x" | "y" | "xy" (multitouch)
    var singleTouch: Boolean? = null // true = one-finger zoom (since HC 10.2)
    var key: String? = null // "shift" | "alt" | "ctrl" | "meta"
    var resetButton: AAResetZoomButtonOptions? = null
    var mouseWheel: AAMouseWheelOptions? = null

    fun type(type: String?) = apply { this.type = type }

    fun pinchType(pinchType: String?) = apply { this.pinchType = pinchType }

    fun singleTouch(singleTouch: Boolean?) = apply { this.singleTouch = singleTouch }

    fun key(key: String?) = apply { this.key = key }

    fun resetButton(resetButton: AAResetZoomButtonOptions?) = apply { this.resetButton = resetButton }

    fun mouseWheel(mouseWheel: AAMouseWheelOptions?) = apply { this.mouseWheel = mouseWheel }
}
