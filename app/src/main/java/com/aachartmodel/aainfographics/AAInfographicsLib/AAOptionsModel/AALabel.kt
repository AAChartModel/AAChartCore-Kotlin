/**
 * Copyright (C), 2015-2019
 * FileName: AALabel
 * Author: AnAn
 * Date: 2019-08-30 11:19
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

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