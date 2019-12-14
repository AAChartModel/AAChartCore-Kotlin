/**
 * Copyright (C), 2015-2019
 * FileName: AATitle
 * Author: AnAn
 * Date: 2019-08-30 11:26
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartAlignType
import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartVerticalAlignType

class AATitle {
    private var text: String? = null
    private var style: AAStyle? = null
    private var align: String? = null
    private var verticalAlign: String? = null
    private var x: Float? = null
    private var y: Float? = null
    private var userHTML: Boolean? = null

    fun text(prop: String?): AATitle {
        text = prop
        return this
    }

    fun style(prop: AAStyle): AATitle {
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

    fun x(prop: Float?): AATitle {
        x = prop
        return this
    }

    fun y(prop: Float?): AATitle {
        y = prop
        return this
    }

    fun userHTML(prop: Boolean?): AATitle {
        userHTML = prop
        return this
    }
}
