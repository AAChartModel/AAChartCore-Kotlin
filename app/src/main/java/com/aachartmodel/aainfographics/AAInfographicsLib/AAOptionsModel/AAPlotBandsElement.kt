/**
 * Copyright (C), 2015-2019
 * FileName: AAPlotBandsElement
 * Author: ios-fn
 * Date: 2019-06-16 18:58
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

class AAPlotBandsElement {
    private var from: Float? = null
    private var to: Float? = null
    private var color: Any? = null
    private var borderColor: String? = null
    private var borderWidth: Float? = null
    private var className: String? = null
    private var label: AALabel? = null
    private var index: Int? = null

    fun from(prop: Float?): AAPlotBandsElement {
        from = prop
        return this
    }

    fun to(prop: Float?): AAPlotBandsElement {
        to = prop
        return this
    }


    fun color(prop: Any): AAPlotBandsElement {
        color = prop
        return this
    }

    fun borderColor(prop: String): AAPlotBandsElement {
        borderColor = prop
        return this
    }

    fun borderWidth(prop: Float?): AAPlotBandsElement {
        borderWidth = prop
        return this
    }

    fun className(prop: String): AAPlotBandsElement {
        className = prop
        return this
    }

    fun label(prop: AALabel): AAPlotBandsElement {
        label = prop
        return this
    }

    fun index(prop: Int?): AAPlotBandsElement {
        index = prop
        return this
    }

}



