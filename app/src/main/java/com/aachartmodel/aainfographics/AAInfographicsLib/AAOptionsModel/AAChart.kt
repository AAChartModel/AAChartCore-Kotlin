/**
 * Copyright (C), 2015-2019
 * FileName: AAChart
 * Author: AnAn
 * Date: 2019-08-30 11:49
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AAChart {
    private var type: String? = null
    private var backgroundColor: Any? = null
    private var plotBackgroundImage: String? = null
    private var pinchType: String? = null
    private var panning: Boolean? = null
    private var panKey: String? = null
    private var polar: Boolean? = null
    private var animation: AAAnimation? = null
    private var inverted: Boolean? = null
    private var marginLeft: Float? = null
    private var marginRight: Float? = null

    fun type(prop: String?): AAChart {
        type = prop
        return this
    }

    fun backgroundColor(prop: Any?): AAChart {
        backgroundColor = prop
        return this
    }

    fun plotBackgroundImage(prop: String): AAChart {
        plotBackgroundImage = prop
        return this
    }

    fun pinchType(prop: String?): AAChart {
        pinchType = prop
        return this
    }

    fun panning(prop: Boolean?): AAChart {
        panning = prop
        return this
    }

    fun panKey(prop: String): AAChart {
        panKey = prop
        return this
    }

    fun polar(prop: Boolean?): AAChart {
        polar = prop
        return this
    }

    fun animation(prop: AAAnimation): AAChart {
        animation = prop
        return this
    }

    fun inverted(prop: Boolean?): AAChart {
        inverted = prop
        return this
    }

    fun marginLeft(prop: Float?): AAChart {
        marginLeft = prop
        return this
    }

    fun marginRight(prop: Float?): AAChart {
        marginRight = prop
        return this
    }

}
