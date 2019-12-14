/**
 * Copyright (C), 2015-2019, 飞牛集达有限公司
 * FileName: AAJSStringPurer
 * Author: ios-fn
 * Date: 2019-06-16 19:05
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
package com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger

import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartType


object AAJSStringPurer {

    fun pureJavaScriptFunctionString(jsFunctionStr: String): String {
        var pureJSFunctionStr = jsFunctionStr
        pureJSFunctionStr = pureJSFunctionStr.replace("'", "\"")
        pureJSFunctionStr = pureJSFunctionStr.replace("\u0000", "")
        pureJSFunctionStr = pureJSFunctionStr.replace("\n", "")
        pureJSFunctionStr = pureJSFunctionStr.replace("\\", "\\\\")
        pureJSFunctionStr = pureJSFunctionStr.replace("\"", "\\\"")
//        pureJSFunctionStr = pureJSFunctionStr.replace("\'", "\\\'");
        pureJSFunctionStr = pureJSFunctionStr.replace("\n", "\\n")
        pureJSFunctionStr = pureJSFunctionStr.replace("\r", "\\r")
//        pureJSFunctionStr = pureJSFunctionStr.replace("\f", "\\f")
        pureJSFunctionStr = pureJSFunctionStr.replace("\u2028", "\\u2028")
        pureJSFunctionStr = pureJSFunctionStr.replace("\u2029", "\\u2029")

        return pureJSFunctionStr
    }

}