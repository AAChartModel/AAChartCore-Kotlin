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
package com.github.aachartmodel.aainfographics.aatools


object AAJSStringPurer {

    fun pureJavaScriptFunctionString(JSStr: String): String {
        var pureJSStr = JSStr
        pureJSStr = pureJSStr.replace("'", "\"")
        pureJSStr = pureJSStr.replace("\u0000", "")
        pureJSStr = pureJSStr.replace("\n", "")
        pureJSStr = pureJSStr.replace("\\", "\\\\")
        pureJSStr = pureJSStr.replace("\"", "\\\"")
        pureJSStr = pureJSStr.replace("\'", "\\\'");
        pureJSStr = pureJSStr.replace("\n", "\\n")
        pureJSStr = pureJSStr.replace("\r", "\\r")
//        pureJSStr = pureJSStr.replace("\f", "\\f")
        pureJSStr = pureJSStr.replace("\u2028", "\\u2028")
        pureJSStr = pureJSStr.replace("\u2029", "\\u2029")

        return pureJSStr
    }

    //https://stackoverflow.com/questions/34334232/why-does-function-not-work-but-function-does-chrome-devtools-node
    fun pureAnonymousJSFunctionString(JSStr: String?): String? {
        var pureJSStr = "($JSStr)"
        pureJSStr = pureJavaScriptFunctionString(pureJSStr)
        return pureJSStr
    }

}

fun Array<String>.aa_toJSArray(): String {
    var originalJsArrStr = ""
    for (i in this.indices) {
        val element = this[i]
        originalJsArrStr = "$originalJsArrStr'$element',"
    }
    return "[$originalJsArrStr]"
}