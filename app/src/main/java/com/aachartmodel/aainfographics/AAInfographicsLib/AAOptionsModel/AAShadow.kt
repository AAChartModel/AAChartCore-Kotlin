/**
 * Copyright (C), 2015-2019
 * FileName: AAShadow
 * Author: AnAn
 * Date: 2019-08-30 11:31
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AAShadow {
    private var color: String? = null
    private var offsetX: Float? = null
    private var offsetY: Float? = null
    private var opacity: Float? = null
    private var width: Float? = null

    fun color(prop: String): AAShadow {
        color = prop
        return this
    }

    fun offsetX(prop: Float?): AAShadow {
        offsetX = prop
        return this
    }

    fun offsetY(prop: Float?): AAShadow {
        offsetY = prop
        return this
    }

    fun opacity(prop: Float?): AAShadow {
        opacity = prop
        return this
    }

    fun width(prop: Float?): AAShadow {
        width = prop
        return this
    }

}