/**
 * Copyright (C), 2015-2019
 * FileName: AAPlotBandsElement
 * Author: ios-fn
 * Date: 2019-06-16 18:58
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AAPlotBandsElement {
    private var from: Float? = null
    private var to: Float? = null
    private var color: Any? = null
    private var borderColor: String? = null
    private var borderWidth: Float? = null
    private var className: String? = null
    private var label: AALabel? = null
    private var index: Int? = null

    fun from(prop: Float?): AAPlotBandsElement {
        from = prop
        return this
    }

    fun to(prop: Float?): AAPlotBandsElement {
        to = prop
        return this
    }

    fun color(prop: Any): AAPlotBandsElement {
        color = prop
        return this
    }

    fun borderColor(prop: String): AAPlotBandsElement {
        borderColor = prop
        return this
    }

    fun borderWidth(prop: Float?): AAPlotBandsElement {
        borderWidth = prop
        return this
    }

    fun className(prop: String): AAPlotBandsElement {
        className = prop
        return this
    }

    fun label(prop: AALabel): AAPlotBandsElement {
        label = prop
        return this
    }

    fun index(prop: Int?): AAPlotBandsElement {
        index = prop
        return this
    }

}


class AALabel {
    private var text: String? = null
    private var style: Any? = null

    fun text(prop: String): AALabel {
        text = prop
        return this
    }

    fun style(prop: Any): AALabel {
        style = prop
        return this
    }
}
