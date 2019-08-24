/**
 * Copyright (C), 2015-2019, 飞牛集达有限公司
 * FileName: AAWaterfallChart
 * Author: ios-fn
 * Date: 2019-06-29 22:47
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
