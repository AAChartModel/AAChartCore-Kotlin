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
        return oceanBlueColor(AALinearGradientDirection.ToTop)
    }

    fun sanguineColor(): Map<String, Any> {
        return sanguineColor(AALinearGradientDirection.ToTop)
    }

    fun lusciousLimeColor(): Map<String, Any> {
        return lusciousLimeColor(AALinearGradientDirection.ToTop)
    }

    fun purpleLakeColor(): Map<String, Any> {
        return purpleLakeColor(AALinearGradientDirection.ToTop)
    }

    fun freshPapayaColor(): Map<String, Any> {
        return freshPapayaColor(AALinearGradientDirection.ToTop)
    }

    fun ultramarineColor(): Map<String, Any> {
        return ultramarineColor(AALinearGradientDirection.ToTop)
    }

    fun pinkSugarColor(): Map<String, Any> {
        return pinkSugarColor(AALinearGradientDirection.ToTop)
    }

    fun lemonDrizzleColor(): Map<String, Any> {
        return lemonDrizzleColor(AALinearGradientDirection.ToTop)
    }

    fun victoriaPurpleColor(): Map<String, Any> {
        return victoriaPurpleColor(AALinearGradientDirection.ToTop)
    }

    fun springGreensColor(): Map<String, Any> {
        return springGreensColor(AALinearGradientDirection.ToTop)
    }

    fun mysticMauveColor(): Map<String, Any> {
        return mysticMauveColor(AALinearGradientDirection.ToTop)
    }

    fun reflexSilverColor(): Map<String, Any> {
        return reflexSilverColor(AALinearGradientDirection.ToTop)
    }

    fun neonGlowColor(): Map<String, Any> {
        return neonGlowColor(AALinearGradientDirection.ToTop)
    }

    fun berrySmoothieColor(): Map<String, Any> {
        return berrySmoothieColor(AALinearGradientDirection.ToTop)
    }

    fun newLeafColor(): Map<String, Any> {
        return newLeafColor(AALinearGradientDirection.ToTop)
    }

    fun cottonCandyColor(): Map<String, Any> {
        return cottonCandyColor(AALinearGradientDirection.ToTop)
    }

    fun pixieDustColor(): Map<String, Any> {
        return pixieDustColor(AALinearGradientDirection.ToTop)
    }

    fun fizzyPeachColor(): Map<String, Any> {
        return fizzyPeachColor(AALinearGradientDirection.ToTop)
    }

    fun sweetDreamColor(): Map<String, Any> {
        return sweetDreamColor(AALinearGradientDirection.ToTop)
    }

    fun firebrickColor(): Map<String, Any> {
        return firebrickColor(AALinearGradientDirection.ToTop)
    }

    fun wroughtIronColor(): Map<String, Any> {
        return wroughtIronColor(AALinearGradientDirection.ToTop)
    }

    fun deepSeaColor(): Map<String, Any> {
        return deepSeaColor(AALinearGradientDirection.ToTop)
    }

    fun coastalBreezeColor(): Map<String, Any> {
        return coastalBreezeColor(AALinearGradientDirection.ToTop)
    }

    fun eveningDelightColor(): Map<String, Any> {
        return eveningDelightColor(AALinearGradientDirection.ToTop)
    }


    fun oceanBlueColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#2E3192", "#1BFFFF")
    }

    fun sanguineColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#D4145A", "#FBB03B")
    }

    fun lusciousLimeColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#009245", "#FCEE21")
    }

    fun purpleLakeColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#662D8C", "#ED1E79")
    }

    fun freshPapayaColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#ED1C24", "#FCEE21")
    }

    fun ultramarineColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#00A8C5", "#FFFF7E")
    }

    fun pinkSugarColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#D74177", "#FFE98A")
    }

    fun lemonDrizzleColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#FB872B", "#D9E021")
    }

    fun victoriaPurpleColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#312A6C", "#852D91")
    }

    fun springGreensColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#009E00", "#FFFF96")
    }

    fun mysticMauveColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#B066FE", "#63E2FF")
    }

    fun reflexSilverColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#808080", "#E6E6E6")
    }

    fun neonGlowColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#00FFA1", "#00FFFF")
    }

    fun berrySmoothieColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#8E78FF", "#FC7D7B")
    }

    fun newLeafColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#00537E", "#3AA17E")
    }

    fun cottonCandyColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#FCA5F1", "#B5FFFF")
    }

    fun pixieDustColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#D585FF", "#00FFEE")
    }

    fun fizzyPeachColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#F24645", "#EBC08D")
    }

    fun sweetDreamColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#3A3897", "#A3A1FF")
    }

    fun firebrickColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#45145A", "#FF5300")
    }

    fun wroughtIronColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#333333", "#5A5454")
    }

    fun deepSeaColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#4F00BC", "#29ABE2")
    }

    fun coastalBreezeColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#00B7FF", "#FFFFC7")
    }

    fun eveningDelightColor(direction: AALinearGradientDirection): Map<String, Any> {
        return linearGradient(direction,"#93278F", "#00A99D")
    }

     fun linearGradient(
         startColor: String,
         endColor: String
     ): HashMap<String, Any> {
        return linearGradient(
            AALinearGradientDirection.ToTop,
            startColor,
            endColor)
    }

     fun linearGradient(
        direction: AALinearGradientDirection,
        startColor: String,
        endColor: String
     ): HashMap<String, Any> {
        val stopsArr = arrayOf<Any>(
            arrayOf(0, startColor),
            arrayOf(1, endColor)
        )
        return linearGradient(direction,stopsArr)
     }

    fun linearGradient(
        direction: AALinearGradientDirection,
        stopsArr: Array<Any>
    ): HashMap<String, Any> {
        val linearGradientColorMap = linearGradientMap(direction)
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
    private fun linearGradientMap(
        direction: AALinearGradientDirection
    ):Map<String,Int> {
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
