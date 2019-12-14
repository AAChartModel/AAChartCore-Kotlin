/**
 * Copyright (C), 2015-2019
 * FileName: AAPlotLinesElement
 * Author: ios-fn
 * Date: 2019-06-16 19:00
 * Description:
 * History:
 */
/**
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore            ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore-Kotlin     ◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 */

/**

 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/AAChartCore-Kotlin/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartLineDashStyleType


class AAPlotLinesElement {

    private var color: Any? = null
    private var dashStyle: String? = null
    private var width: Float? = null
    private var value: Float? = null
    private var zIndex: Int? = null
    private var label: AALabel? = null

    fun color(prop: Any): AAPlotLinesElement {
        color = prop
        return this
    }

    fun dashStyle(prop: AAChartLineDashStyleType): AAPlotLinesElement {
        dashStyle = prop.value
        return this
    }

    fun width(prop: Float?): AAPlotLinesElement {
        width = prop
        return this
    }

    fun value(prop: Float?): AAPlotLinesElement {
        value = prop
        return this
    }

    fun zIndex(prop: Int?): AAPlotLinesElement {
        zIndex = prop
        return this
    }

    fun label(prop: AALabel): AAPlotLinesElement {
        label = prop
        return this
    }


}






