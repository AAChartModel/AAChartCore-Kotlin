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

 fun AARgba(red: Int,
            green: Int,
            blue: Int,
            alpha: Float = 1f): String {
     return "rgba($red,$green,$blue,$alpha)"
 }

fun AARgb(red: Int,
          green: Int,
          blue: Int,
          alpha: Float = 1f): String {
    return AARgba(red, green, blue, 1f)
}

object AAColor {
    val Black = blackColor()
    val DarkGray = darkGrayColor()
    val LightGray = lightGrayColor()
    val White = whiteColor()
    val Gray = grayColor()
    val Red = redColor()
    val Green = greenColor()
    val Blue = blueColor()
    val Cyan = cyanColor()
    val Yellow = yellowColor()
    val Magenta = magentaColor()
    val Orange = orangeColor()
    val Purple = purpleColor()
    val Brown = brownColor()
    val Clear = clearColor()

    fun rgbaColor(
            red: Int,
            green: Int,
            blue: Int,
            alpha: Float = 1f
    ): String {
        return "rgba($red,$green,$blue,$alpha)"
    }

    private fun blackColor(): String {
        return "black"
    }

    private fun darkGrayColor(): String {
        return "darkGray"
    }

    private fun lightGrayColor(): String {
        return "lightGray"
    }

    private fun whiteColor(): String {
        return "white"
    }

    private fun grayColor(): String {
        return "gray"
    }

    private fun redColor(): String {
        return "red"
    }

    private fun greenColor(): String {
        return "green"
    }

    private fun blueColor(): String {
        return "blue"
    }

    private fun cyanColor(): String {
        return "cyan"
    }

    private fun yellowColor(): String {
        return "yellow"
    }

    private fun magentaColor(): String {
        return "magenta"
    }

    private fun orangeColor(): String {
        return "orange"
    }

    private fun purpleColor(): String {
        return "purple"
    }

    private fun brownColor(): String {
        return "brown"
    }

    private fun clearColor(): String {
        return "clear"
    }
}
