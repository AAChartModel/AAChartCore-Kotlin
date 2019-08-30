/**
 * Copyright (C), 2015-2019
 * FileName: AAAnimation
 * Author: AnAn
 * Date: 2019-08-30 11:14
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AAAnimation {
    private var duration: Int? = null
    private var easing: String? = null

    fun duration(prop: Int?): AAAnimation {
        duration = prop
        return this
    }

    fun easing(prop: String?): AAAnimation {
        easing = prop
        return this
    }
}