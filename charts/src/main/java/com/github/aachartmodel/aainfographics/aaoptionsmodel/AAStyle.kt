/**
 * Copyright (C), 2015-2019
 * FileName: AAStyle
 * Author: AnAn
 * Date: 2019-08-30 11:17
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartFontWeightType


class AAStyle {
    var background: String? = null
    var backgroundColor: String? = null
    var border: String? = null
    var borderRadius: String? = null
    var color: String? = null
    var cursor: String? = null
    var fontFamily: String? = null
    var fontSize: String? = null
    var fontWeight: String? = null
    var height: Number? = null
    var lineWidth: Number? = null
    var opacity: Number? = null
    var padding: String? = null
    var pointerEvents: String? = null
    var position: String? = null
    var textAlign: String? = null
    var textDecoration: String? = null
    var textOutline: String? = null
    var textOverflow: String? = null
    var top: String? = null
    var transition: String? = null
    var whiteSpace: String? = null
    var width: Number? = null


    fun background(prop: String?): AAStyle {
        background = prop
        return this
    }

    fun backgroundColor(prop: String?): AAStyle {
        backgroundColor = prop
        return this
    }

    fun border(prop: String?): AAStyle {
        border = prop
        return this
    }

    fun borderRadius(prop: Number?): AAStyle {
        prop?.let {
            borderRadius = "${prop}px"
        }
        return this
    }

    fun color(prop: String?): AAStyle {
        color = prop
        return this
    }

    fun cursor(prop: String?): AAStyle {
        cursor = prop
        return this
    }

    fun fontFamily(prop: String?): AAStyle {
        fontFamily = prop
        return this
    }

    fun fontSize(prop: Number?): AAStyle {
        prop?.let {
            fontSize = "${prop}px"
        }
        return this
    }

    fun fontWeight(prop: AAChartFontWeightType?): AAStyle {
        fontWeight = prop?.value
        return this
    }

    fun height(prop: Number?): AAStyle {
        height = prop
        return this
    }

    fun lineWidth(prop: Number?): AAStyle {
        lineWidth = prop
        return this
    }

    fun opacity(prop: Number?): AAStyle {
        opacity = prop
        return this
    }

    fun padding(prop: Number?): AAStyle {
        prop?.let {
            padding = "${prop}px"
        }
        return this
    }

    fun pointerEvents(prop: String?): AAStyle {
        pointerEvents = prop
        return this
    }

    fun position(prop: String?): AAStyle {
        position = prop
        return this
    }

    fun textAlign(prop: String?): AAStyle {
        textAlign = prop
        return this
    }

    fun textDecoration(prop: String?): AAStyle {
        textDecoration = prop
        return this
    }

    fun textOutline(prop: String?): AAStyle {
        textOutline = prop
        return this
    }

    fun textOverflow(prop: String?): AAStyle {
        textOverflow = prop
        return this
    }

    fun top(prop: String?): AAStyle {
        top = prop
        return this
    }

    fun transition(prop: String?): AAStyle {
        transition = prop
        return this
    }

    fun whiteSpace(prop: String?): AAStyle {
        whiteSpace = prop
        return this
    }

    fun width(prop: Number?): AAStyle {
        width = prop
        return this
    }

    companion object {
        fun style(
            color: String?
        ): AAStyle {
            return style(color, null)
        }

        fun style(
            color: String?,
            fontSize: Number?
        ): AAStyle {
            return style(color, fontSize, null)
        }

        fun style(
            color: String?,
            fontSize: Number?,
            fontWeight: AAChartFontWeightType?
        ): AAStyle {
            return style(color, fontSize, fontWeight, null)
        }

        fun style(
            color: String?,
            fontSize: Number?,
            fontWeight: AAChartFontWeightType?,
            textOutline: String?
        ): AAStyle {
            return AAStyle()
                .color(color)
                .fontSize(fontSize)
                .fontWeight(fontWeight)
                .textOutline(textOutline)
        }
    }
}
