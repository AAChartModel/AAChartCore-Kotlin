/**
 * Copyright (C), 2015-2019
 * FileName: AACrosshair
 * Author: ios-fn
 * Date: 2019-06-16 19:19
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


class AACrosshair {
    private var width: Float? = null
    private var color: String? = null
    private var dashStyle: AAChartLineDashStyleType? = null

    fun width(prop: Float?): AACrosshair {
        width = prop
        return this
    }

    fun color(prop: String): AACrosshair {
        color = prop
        return this
    }

    fun dashStyle(prop: AAChartLineDashStyleType): AACrosshair {
        dashStyle = prop
        return this
    }
}