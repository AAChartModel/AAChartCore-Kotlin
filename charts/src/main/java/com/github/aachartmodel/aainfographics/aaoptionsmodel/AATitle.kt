/**
 * Copyright (C), 2015-2019
 * FileName: AATitle
 * Author: AnAn
 * Date: 2019-08-30 11:26
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAlignType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartVerticalAlignType

class AATitle {
    private var text: String? = null
    private var style: AAStyle? = null
    private var align: String? = null
    private var verticalAlign: String? = null
    private var x: Number? = null
    private var y: Number? = null
    private var userHTML: Boolean? = null

    fun text(prop: String?): AATitle {
        text = prop
        return this
    }

    fun style(prop: AAStyle?): AATitle {
        style = prop
        return this
    }

    fun align(prop: AAChartAlignType): AATitle {
        align = prop.toString()
        return this
    }

    fun verticalAlign(prop: AAChartVerticalAlignType): AATitle {
        verticalAlign = prop.toString()
        return this
    }

    fun x(prop: Number?): AATitle {
        x = prop
        return this
    }

    fun y(prop: Number?): AATitle {
        y = prop
        return this
    }

    fun userHTML(prop: Boolean?): AATitle {
        userHTML = prop
        return this
    }
}
