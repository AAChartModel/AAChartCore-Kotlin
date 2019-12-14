/**
 * Copyright (C), 2015-2019
 * FileName: AAAnimation
 * Author: AnAn
 * Date: 2019-08-30 11:14
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartAnimationType

class AAAnimation {
    private var duration: Int? = null
    private var easing: String? = null

    fun duration(prop: Int?): AAAnimation {
        duration = prop
        return this
    }

    fun easing(prop: AAChartAnimationType?): AAAnimation {
        easing = prop?.value
        return this
    }
}