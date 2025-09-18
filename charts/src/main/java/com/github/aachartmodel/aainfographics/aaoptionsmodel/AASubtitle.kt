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
    var text: String? = null
    var style: AAStyle? = null
    var align: String? = null
    var verticalAlign: String? = null
    var x: Number? = null
    var y: Number? = null
    var userHTML: Boolean? = null

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
