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
package com.example.chartcorekotlin.AAChartConfiger

import java.util.HashMap
enum class AALinearGradientDirection {
    ToTop,           //⇧⇧⇧⇧⇧⇧
    ToBottom,        //⇩⇩⇩⇩⇩⇩
    ToLeft,          //⇦⇦⇦⇦⇦⇦
    ToRight,         //⇨⇨⇨⇨⇨⇨
    ToTopLeft,       //⇖⇖⇖⇖⇖⇖
    ToTopRight,      //⇗⇗⇗⇗⇗⇗
    ToBottomLeft,    //⇙⇙⇙⇙⇙⇙
    ToBottomRight,   //⇘⇘⇘⇘⇘⇘
}


object AAGradientColor {


    fun oceanBlueColor(): Map<String, Any> {
        return gradientColorMap("#2E3192", "#1BFFFF")
    }

    fun sanguineColor(): Map<String, Any> {
        return gradientColorMap("#D4145A", "#FBB03B")
    }

    fun lusciousLimeColor(): Map<String, Any> {
        return gradientColorMap("#009245", "#FCEE21")
    }

    fun purpleLakeColor(): Map<String, Any> {
        return gradientColorMap("#662D8C", "#ED1E79")
    }

    fun freshPapayaColor(): Map<String, Any> {
        return gradientColorMap("#ED1C24", "#FCEE21")
    }

    fun ultramarineColor(): Map<String, Any> {
        return gradientColorMap("#00A8C5", "#FFFF7E")
    }

    fun pinkSugarColor(): Map<String, Any> {
        return gradientColorMap("#D74177", "#FFE98A")
    }

    fun lemonDrizzleColor(): Map<String, Any> {
        return gradientColorMap("#FB872B", "#D9E021")
    }

    fun victoriaPurpleColor(): Map<String, Any> {
        return gradientColorMap("#312A6C", "#852D91")
    }

    fun springGreensColor(): Map<String, Any> {
        return gradientColorMap("#009E00", "#FFFF96")
    }

    fun mysticMauveColor(): Map<String, Any> {
        return gradientColorMap("#B066FE", "#63E2FF")
    }

    fun reflexSilverColor(): Map<String, Any> {
        return gradientColorMap("#808080", "#E6E6E6")
    }

    fun neonGlowColor(): Map<String, Any> {
        return gradientColorMap("#00FFA1", "#00FFFF")
    }

    fun berrySmoothieColor(): Map<String, Any> {
        return gradientColorMap("#8E78FF", "#FC7D7B")
    }

    fun newLeafColor(): Map<String, Any> {
        return gradientColorMap("#00537E", "#3AA17E")
    }

    fun cottonCandyColor(): Map<String, Any> {
        return gradientColorMap("#FCA5F1", "#B5FFFF")
    }

    fun pixieDustColor(): Map<String, Any> {
        return gradientColorMap("#D585FF", "#00FFEE")
    }

    fun fizzyPeachColor(): Map<String, Any> {
        return gradientColorMap("#F24645", "#EBC08D")
    }

    fun sweetDreamColor(): Map<String, Any> {
        return gradientColorMap("#3A3897", "#A3A1FF")
    }

    fun firebrickColor(): Map<String, Any> {
        return gradientColorMap("#45145A", "#FF5300")
    }

    fun wroughtIronColor(): Map<String, Any> {
        return gradientColorMap("#333333", "#5A5454")
    }

    fun deepSeaColor(): Map<String, Any> {
        return gradientColorMap("#4F00BC", "#29ABE2")
    }

    fun coastalBreezeColor(): Map<String, Any> {
        return gradientColorMap("#00B7FF", "#FFFFC7")
    }

    fun eveningDelightColor(): Map<String, Any> {
        return gradientColorMap("#93278F", "#00A99D")
    }

    private fun gradientColorMap(startColor: String,
                                 endColor: String): HashMap<String, Any> {
        return gradientColorMap(
            AALinearGradientDirection.ToTop,
            startColor,
            endColor)
    }

    private fun gradientColorMap(
        direction: AALinearGradientDirection,
        startColor: String,
        endColor: String): HashMap<String, Any> {
        val linearGradientColorMap = linearGradientMap(direction)
        val stopsArr = arrayOf<Any>(
            arrayOf(0, startColor),
            arrayOf(1, endColor)
        )
        val gradientColorMap = HashMap<String, Any>()
        gradientColorMap["linearGradient"] = linearGradientColorMap
        gradientColorMap["stops"] = stopsArr
        return gradientColorMap
    }

    /**
    (0,0) ----------- (1,0)
    |                   |
    |                   |
    |                   |
    |                   |
    |                   |
    (0,1) ----------- (1,1)
     */
    private fun linearGradientMap(direction: AALinearGradientDirection):Map<String,Int> {
        when (direction) {
            AALinearGradientDirection.ToTop ->
                return mapOf("x1" to 0, "y1" to 1, "x2" to 0, "y2" to 0)
            AALinearGradientDirection.ToBottom ->
                return mapOf("x1" to 0, "y1" to 0, "x2" to 0, "y2" to 1)
            AALinearGradientDirection.ToLeft ->
                return mapOf("x1" to 1, "y1" to 0, "x2" to 0, "y2" to 0)
            AALinearGradientDirection.ToRight ->
                return mapOf("x1" to 0, "y1" to 0, "x2" to 1, "y2" to 0)
            AALinearGradientDirection.ToTopLeft ->
                return mapOf("x1" to 1, "y1" to 1, "x2" to 0, "y2" to 0)
            AALinearGradientDirection.ToTopRight ->
                return mapOf("x1" to 0, "y1" to 1, "x2" to 1, "y2" to 0)
            AALinearGradientDirection.ToBottomLeft ->
                return mapOf("x1" to 1, "y1" to 0, "x2" to 0, "y2" to 1)
            AALinearGradientDirection.ToBottomRight ->
                return mapOf("x1" to 0, "y1" to 0, "x2" to 1, "y2" to 1)
        }

    }
}
