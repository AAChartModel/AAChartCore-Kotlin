/**
 * Copyright (C), 2015-2019
 * FileName: AASubtitle
 * Author: AnAn
 * Date: 2019-08-30 11:29
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType


class AASubtitle {
    private var text: String? = null
    private var style: AAStyle? = null
    private var align: String? = null
    private var verticalAlign: String? = null
    private var x: Number? = null
    private var y: Number? = null
    private var userHTML: Boolean? = null

    fun text(prop: String?): AASubtitle {
        text = prop
        return this
    }

    fun style(prop: AAStyle?): AASubtitle {
        style = prop
        return this
    }

    fun align(prop: AAChartAlignType?): AASubtitle {
        align = prop?.value
        return this
    }

    fun verticalAlign(prop: AAChartVerticalAlignType): AASubtitle {
        verticalAlign = prop.toString()
        return this
    }

    fun x(prop: Number?): AASubtitle {
        x = prop
        return this
    }

    fun y(prop: Number?): AASubtitle {
        y = prop
        return this
    }

    fun userHTML(prop: Boolean?): AASubtitle {
        userHTML = prop
        return this
    }
}
