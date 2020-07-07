/**
 * Copyright (C), 2015-2019
 * FileName: AADataLabels
 * Author: AnAn
 * Date: 2019-08-30 11:35
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartCreator.AAChartAlignType
import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartCreator.AAChartVerticalAlignType

class AADataLabels {
    var enabled: Boolean? = null
    var align: String? = null
    var inside: Boolean? = null
    var style: AAStyle? = null
    var format: String? = null
    var rotation: Float? = null
    var allowOverlap: Boolean? = null
    var useHTML: Boolean? = null
    var distance: Float? = null
    var verticalAlign: String? = null
    var x: Float? = null
    var y: Float? = null
    var color: String? = null
    var backgroundColor: String? = null
    var borderColor: String? = null
    var borderRadius: Float? = null
    var borderWidth: Float? = null
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

    fun rotation(prop: Float?): AADataLabels {
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

    fun distance(prop: Float?): AADataLabels {
        distance = prop
        return this
    }

    fun verticalAlign(prop: AAChartVerticalAlignType?): AADataLabels {
        verticalAlign = prop?.value
        return this
    }

    fun x(prop: Float?): AADataLabels {
        x = prop
        return this
    }

    fun y(prop: Float?): AADataLabels {
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

    fun borderRadius(prop: Float?): AADataLabels {
        borderRadius = prop
        return this
    }

    fun borderWidth(prop: Float?): AADataLabels {
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
