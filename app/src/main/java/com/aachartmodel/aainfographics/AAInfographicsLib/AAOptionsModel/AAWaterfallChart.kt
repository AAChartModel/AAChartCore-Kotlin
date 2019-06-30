/**
 * Copyright (C), 2015-2019, 飞牛集达有限公司
 * FileName: AAWaterfallChart
 * Author: ios-fn
 * Date: 2019-06-29 22:47
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel;

class AAWaterfallChart {
    var upColor: String? = null
    var color: String? = null
    var borderWidth: Float? = null
    var data: Array<Any>? = null

    fun upColor(prop: String): AAWaterfallChart {
        upColor = prop
        return this
    }

    fun color(prop: String): AAWaterfallChart {
        color = prop
        return this
    }

    fun borderWidth(prop: Float?): AAWaterfallChart {
        borderWidth = prop
        return this
    }

    fun data(prop: Array<Any>): AAWaterfallChart {
        data = prop
        return this
    }
}
