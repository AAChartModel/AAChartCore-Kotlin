/**
 * Copyright (C), 2015-2019
 * FileName: AAShadow
 * Author: AnAn
 * Date: 2019-08-30 11:31
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAShadow {
    private var color: String? = null
    private var offsetX: Number? = null
    private var offsetY: Number? = null
    private var opacity: Float? = null
    private var width: Number? = null

    fun color(prop: String): AAShadow {
        color = prop
        return this
    }

    fun offsetX(prop: Number?): AAShadow {
        offsetX = prop
        return this
    }

    fun offsetY(prop: Number?): AAShadow {
        offsetY = prop
        return this
    }

    fun opacity(prop: Float?): AAShadow {
        opacity = prop
        return this
    }

    fun width(prop: Number?): AAShadow {
        width = prop
        return this
    }

}