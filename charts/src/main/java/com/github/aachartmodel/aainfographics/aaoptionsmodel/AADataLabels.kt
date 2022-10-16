/**
 * Copyright (C), 2015-2019
 * FileName: AADataLabels
 * Author: AnAn
 * Date: 2019-08-30 11:35
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer

class AADataLabels {
    var enabled: Boolean? = null
    var align: String? = null
    var inside: Boolean? = null
    var style: AAStyle? = null
    var format: String? = null
    var formatter: String? = null
    var rotation: Number? = null
    var allowOverlap: Boolean? = null
    var useHTML: Boolean? = null
    var distance: Number? = null
    var verticalAlign: String? = null
    var x: Number? = null
    var y: Number? = null
    var color: String? = null
    var backgroundColor: String? = null
    var borderColor: String? = null
    var borderRadius: Number? = null
    var borderWidth: Number? = null
    var shape: String? = null
    var crop: Boolean? = null
    var overflow: String? = null
    var softConnector: Boolean? = null
    var textPath: Any? = null
    var filter: Any? = null

    fun enabled(prop: Boolean?): AADataLabels {
        enabled = prop
        return this
    }

    fun align(prop: AAChartAlignType?): AADataLabels {
        align = prop?.value
        return this
    }

    fun inside(prop: Boolean?): AADataLabels {
        inside = prop
        return this
    }


    fun style(prop: AAStyle?): AADataLabels {
        style = prop
        return this
    }

    fun format(prop: String?): AADataLabels {
        format = prop
        return this
    }

    fun formatter(prop: String?): AADataLabels {
        formatter = AAJSStringPurer.pureAnonymousJSFunctionString(prop)
        return this
    }

    fun rotation(prop: Number?): AADataLabels {
        rotation = prop
        return this
    }

    fun allowOverlap(prop: Boolean?): AADataLabels {
        allowOverlap = prop
        return this
    }

    fun useHTML(prop: Boolean?): AADataLabels {
        useHTML = prop
        return this
    }

    fun distance(prop: Number?): AADataLabels {
        distance = prop
        return this
    }

    fun verticalAlign(prop: AAChartVerticalAlignType?): AADataLabels {
        verticalAlign = prop?.value
        return this
    }

    fun x(prop: Number?): AADataLabels {
        x = prop
        return this
    }

    fun y(prop: Number?): AADataLabels {
        y = prop
        return this
    }

    fun color(prop: String?): AADataLabels {
        color = prop
        return this
    }

    fun backgroundColor(prop: String?): AADataLabels {
        backgroundColor = prop
        return this
    }

    fun borderColor(prop: String?): AADataLabels {
        borderColor = prop
        return this
    }

    fun borderRadius(prop: Number?): AADataLabels {
        borderRadius = prop
        return this
    }

    fun borderWidth(prop: Number?): AADataLabels {
        borderWidth = prop
        return this
    }

    fun shape(prop: String?): AADataLabels {
        shape = prop
        return this
    }

    fun crop(prop: Boolean?): AADataLabels {
        crop = prop
        return this
    }

    fun overflow(prop: String?): AADataLabels {
        overflow = prop
        return this
    }

    fun softConnector(prop: Boolean?): AADataLabels {
        softConnector = prop
        return this
    }

    fun textPath(prop: Any?): AADataLabels {
        textPath = prop
        return this
    }

    fun filter(prop: Any?): AADataLabels {
        filter = prop
        return this
    }
}
