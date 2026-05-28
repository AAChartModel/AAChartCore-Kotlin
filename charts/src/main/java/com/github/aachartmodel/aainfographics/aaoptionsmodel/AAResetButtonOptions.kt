package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAResetZoomButtonOptions {
    var theme: AAButtonTheme? = null
    var position: AAPosition? = null // align/verticalAlign/x/y

    fun theme(theme: AAButtonTheme?) = apply { this.theme = theme }

    fun position(position: AAPosition?) = apply { this.position = position }
}
