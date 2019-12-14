/**
 * Copyright (C), 2015-2019
 * FileName: AAMarker
 * Author: AnAn
 * Date: 2019-08-30 11:33
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

class AAMarker {
    private var radius: Float? = null
    private var symbol: String? = null
    private var fillColor: String? = null//点的填充色(用来设置折线连接点的填充色)
    private var lineWidth: Float? = null//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
    private var lineColor: Any? = null//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色。)


    fun radius(prop: Float?): AAMarker {
        radius = prop
        return this
    }

    fun symbol(prop: String?): AAMarker {
        symbol = prop
        return this
    }

    fun fillColor(prop: String): AAMarker {
        fillColor = prop
        return this
    }

    fun lineWidth(prop: Float?): AAMarker {
        lineWidth = prop
        return this
    }

    fun lineColor(prop: Any?): AAMarker {
        lineColor = prop
        return this
    }

}
