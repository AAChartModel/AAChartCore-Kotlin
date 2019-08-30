/**
 * Copyright (C), 2015-2019
 * FileName: AADataLabels
 * Author: AnAn
 * Date: 2019-08-30 11:35
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AADataLabels {
    private var enabled: Boolean? = null
    private var style: AAStyle? = null
    private var format: String? = null
    private var rotation: Float? = null
    private var allowOverlap: Boolean? = null
    private var useHTML: Boolean? = null
    private var distance: Float? = null
    private var verticalAlign: String? = null
    private var x: Float? = null
    private var y: Float? = null
    private var color: String? = null
    private var backgroundColor: String? = null
    private var borderColor: String? = null
    private var borderRadius: Float? = null
    private var borderWidth: Float? = null
    private var shape: String? = null

    fun enabled(prop: Boolean?): AADataLabels {
        enabled = prop
        return this
    }

    fun style(prop: AAStyle): AADataLabels {
        style = prop
        return this
    }

    fun format(prop: String): AADataLabels {
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

    fun verticalAlign(prop: String): AADataLabels {
        verticalAlign = prop
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

    fun color(prop: String): AADataLabels {
        color = prop
        return this
    }

    fun backgroundColor(prop: String): AADataLabels {
        backgroundColor = prop
        return this
    }

    fun borderColor(prop: String): AADataLabels {
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

    fun shape(prop: String): AADataLabels {
        shape = prop
        return this
    }
}
