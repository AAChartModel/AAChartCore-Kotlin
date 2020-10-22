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
package com.github.aachartmodel.aainfographics.demo.chartcomposer

import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aachartcreator.AAShadow
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.AAColor
import com.github.aachartmodel.aainfographics.aatools.AAGradientColor
import com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection

class CustomStyleChartComposer {

    companion object {

        fun configureColorfulChart(): AAChartModel {
            val colorsNameArr = arrayOf(
                "red",
                "orange",
                "yellow",
                "green",
                "cyan",
                "blue",
                "purple",
                "gray",
                "darkGray",
                "lightGray",
                "magenta",
                "brown",
                "black"
            )

            val colorsArr = arrayOf<Any>(
                AAColor.redColor(),
                AAColor.orangeColor(),
                AAColor.yellowColor(),
                AAColor.greenColor(),
                AAColor.cyanColor(),
                AAColor.blueColor(),
                AAColor.purpleColor(),
                AAColor.grayColor(),
                AAColor.darkGrayColor(),
                AAColor.lightGrayColor(),
                AAColor.magentaColor(),
                AAColor.brownColor(),
                AAColor.blackColor()
            )

            return AAChartModel()
                .chartType(AAChartType.Bar)
                .animationType(AAChartAnimationType.Bounce)
                .title("Colorful Chart")
                .subtitle("use AAColor to get color string")
                .dataLabelsEnabled(false)
                .categories(colorsNameArr)
                .colorsTheme(colorsArr)
                .stacking(AAChartStackingType.Percent)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Tokyo")
                            .data(
                                arrayOf(
                                    149.9,
                                    171.5,
                                    106.4,
                                    129.2,
                                    144.0,
                                    176.0,
                                    135.6,
                                    188.5,
                                    276.4,
                                    214.1,
                                    95.6,
                                    54.4
                                )
                            )
                            .colorByPoint(true)
                    )
                )
        }


        fun configureColorfulGradientColorChart(): AAChartModel {
            val gradientColorNamesArr = arrayOf(
                "oceanBlue",
                "sanguine",
                "lusciousLime",
                "purpleLake",
                "freshPapaya",
                "ultramarine",
                "pinkSugar",
                "lemonDrizzle",
                "victoriaPurple",
                "springGreens",
                "mysticMauve",
                "reflexSilver",
                "newLeaf",
                "cottonCandy",
                "pixieDust",
                "fizzyPeach",
                "sweetDream",
                "firebrick",
                "wroughtIron",
                "deepSea",
                "coastalBreeze",
                "eveningDelight",
                "neonGlowColor",
                "berrySmoothieColor"
            )

            val gradientColorArr = arrayOf<Any>(
                AAGradientColor.oceanBlueColor(),
                AAGradientColor.sanguineColor(),
                AAGradientColor.lusciousLimeColor(),
                AAGradientColor.purpleLakeColor(),
                AAGradientColor.freshPapayaColor(),
                AAGradientColor.ultramarineColor(),
                AAGradientColor.pinkSugarColor(),
                AAGradientColor.lemonDrizzleColor(),
                AAGradientColor.victoriaPurpleColor(),
                AAGradientColor.springGreensColor(),
                AAGradientColor.mysticMauveColor(),
                AAGradientColor.reflexSilverColor(),
                AAGradientColor.newLeafColor(),
                AAGradientColor.cottonCandyColor(),
                AAGradientColor.pixieDustColor(),
                AAGradientColor.fizzyPeachColor(),
                AAGradientColor.sweetDreamColor(),
                AAGradientColor.firebrickColor(),
                AAGradientColor.wroughtIronColor(),
                AAGradientColor.deepSeaColor(),
                AAGradientColor.coastalBreezeColor(),
                AAGradientColor.eveningDelightColor(),
                AAGradientColor.neonGlowColor(),
                AAGradientColor.berrySmoothieColor()
            )

            return AAChartModel()
                .chartType(AAChartType.Bar)
                .title("Colorful Column Chart")
                .subtitle("single data array colorful column chart")
                .categories(gradientColorNamesArr)
                .colorsTheme(gradientColorArr)
                .yAxisTitle("gradient color")
                .stacking(AAChartStackingType.Percent)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Tokyo")
                            .data(
                                arrayOf(
                                    149.9,
                                    171.5,
                                    106.4,
                                    129.2,
                                    144.0,
                                    176.0,
                                    135.6,
                                    188.5,
                                    276.4,
                                    214.1,
                                    95.6,
                                    54.4,
                                    149.9,
                                    171.5,
                                    106.4,
                                    129.2,
                                    144.0,
                                    176.0,
                                    135.6,
                                    188.5,
                                    276.4,
                                    214.1,
                                    95.6,
                                    54.4
                                )
                            )
                            .colorByPoint(true)
                    )
                )
        }

        fun configureDiscontinuousDataChart(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Column)
                .title("Discontinuous Data Chart")
                .yAxisTitle("")
                .dataLabelsEnabled(true)
                .tooltipEnabled(true)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Tokyo")
                            .data(
                                arrayOf(
                                    arrayOf<Any?>(
                                        6.9,
                                        9.5,
                                        14.5,
                                        18.2,
                                        21.5,
                                        null,
                                        null,
                                        null,
                                        null,
                                        25.2,
                                        26.5,
                                        23.3,
                                        18.3,
                                        13.9,
                                        9.6
                                    )
                                )
                            )
                            .color(AAGradientColor.deepSeaColor())
                    )
                )
        }

        fun configureColorfulColumnChart(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Column)
                .title("Colorful Column Chart")
                .subtitle("single data array colorful column chart")
                .colorsTheme(arrayOf("#febc0f", "#FF14d4", "#0bf8f5", "#F33c52", "#1904dd"))
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("东京")
                            .data(
                                arrayOf(
                                    149.9,
                                    171.5,
                                    106.4,
                                    129.2,
                                    144.0,
                                    176.0,
                                    135.6,
                                    188.5,
                                    276.4,
                                    214.1,
                                    95.6,
                                    54.4
                                )
                            )
                            .colorByPoint(true)
                    )
                )
        }

        fun configureNightingaleRoseChart(): AAChartModel {
            return AAChartModel()
                .title("南丁格尔玫瑰图")
                .subtitle("极地图中的一种")
                .yAxisTitle("cm")
                .chartType(AAChartType.Column)
                .xAxisVisible(false)//是否显示最外一层圆环
                .yAxisVisible(true)//是否显示中间的多个圆环
                .legendEnabled(false)//隐藏图例(底部可点按的小圆点)
                .categories(
                    arrayOf(
                        "一月",
                        "二月",
                        "三月",
                        "四月",
                        "五月",
                        "六月",
                        "七月",
                        "八月",
                        "九月",
                        "十月",
                        "十一月",
                        "十二月"
                    )
                )
                .dataLabelsEnabled(true)
                .polar(true)//极地化图形
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("东京")
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    9.5,
                                    9.6,
                                    13.9,
                                    14.5,
                                    18.3,
                                    18.2,
                                    21.5,
                                    25.2,
                                    26.5,
                                    23.3
                                )
                            )
                    )
                )
        }

        fun configureChartWithShadowStyle(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Spline)
                .title("")
                .subtitle("")
                .categories(
                    arrayOf(
                        "一月",
                        "二月",
                        "三月",
                        "四月",
                        "五月",
                        "六月",
                        "七月",
                        "八月",
                        "九月",
                        "十月",
                        "十一月",
                        "十二月"
                    )
                )
                .yAxisTitle("")
                .markerRadius(0f)
                .yAxisLineWidth(0f)
                .yAxisGridLineWidth(0f)
                .legendEnabled(false)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Tokyo Hot")
                            .lineWidth(9.0f)
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    2.5,
                                    14.5,
                                    18.2,
                                    21.5,
                                    5.2,
                                    26.5,
                                    23.3,
                                    45.3,
                                    13.9,
                                    9.6
                                )
                            )
                            .shadow(
                                AAShadow()
                                    .offsetX(15.0f)
                                    .offsetY(15.0f)
                                    .opacity(0.2f)
                                    .width(8.0f)
                                    .color(AAColor.redColor())
                            )
                    )
                )
        }

        fun configureColorfulGradientAreaChart(): AAChartModel {
            val stopsArr: Array<Any> = arrayOf(
                arrayOf(0.00, "#febc0f"),
                arrayOf(0.50, "#FF14d4"),
                arrayOf(1.00, "#0bf8f5")
            )//颜色字符串设置支持十六进制类型和 rgba 类型

            val linearGradientColor = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToLeft,
                stopsArr
            )

            return AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("")
                .subtitle("")
                .categories(
                    arrayOf(
                        "一月",
                        "二月",
                        "三月",
                        "四月",
                        "五月",
                        "六月",
                        "七月",
                        "八月",
                        "九月",
                        "十月",
                        "十一月",
                        "十二月"
                    )
                )
                .yAxisTitle("")
                .markerRadius(0f)
                .yAxisLineWidth(0f)
                .yAxisGridLineWidth(0f)
                .legendEnabled(false)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Tokyo Hot")
                            .lineWidth(15.0f)
                            .color(linearGradientColor)
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    2.5,
                                    14.5,
                                    18.2,
                                    21.5,
                                    5.2,
                                    26.5,
                                    23.3,
                                    45.3,
                                    13.9,
                                    9.6
                                )
                            )
                    )
                )
        }


        fun configureColorfulGradientSplineChart(): AAChartModel {
            val stopsArr: Array<Any> = arrayOf(
                arrayOf(0.00, "#febc0f"),
                arrayOf(0.25, "#FF14d4"),
                arrayOf(0.50, "#0bf8f5"),
                arrayOf(0.75, "#F33c52"),
                arrayOf(1.00, "#1904dd")
            )//颜色字符串设置支持十六进制类型和 rgba 类型
            val linearGradientColor = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToLeft,
                stopsArr
            )

            return AAChartModel()
                .chartType(AAChartType.Spline)
                .title("")
                .subtitle("")
                .categories(
                    arrayOf(
                        "一月",
                        "二月",
                        "三月",
                        "四月",
                        "五月",
                        "六月",
                        "七月",
                        "八月",
                        "九月",
                        "十月",
                        "十一月",
                        "十二月"
                    )
                )
                .yAxisTitle("")
                .markerRadius(0f)
                .yAxisLineWidth(0f)
                .yAxisGridLineWidth(0f)
                .legendEnabled(false)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Tokyo Hot")
                            .lineWidth(3f)
                            .color(linearGradientColor)
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    2.5,
                                    14.5,
                                    18.2,
                                    21.5,
                                    5.2,
                                    26.5,
                                    23.3,
                                    45.3,
                                    13.9,
                                    9.6
                                )
                            )
                    )
                )
        }


        fun configureGradientColorAreasplineChart(): AAChartModel {
            val stopsArr: Array<Any> = arrayOf(
                arrayOf(0, "rgba(2255,20,147,1)"), //深粉色, alpha 透明度 1
                arrayOf(1, "rgba(255,105,180,0.1)")//热情的粉红, alpha 透明度 0.1
            ) //颜色字符串设置支持十六进制类型和 rgba 类型

            val linearGradientColor = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                stopsArr
            )

            return AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("")
                .subtitle("")
                .categories(
                    arrayOf(
                        "一月",
                        "二月",
                        "三月",
                        "四月",
                        "五月",
                        "六月",
                        "七月",
                        "八月",
                        "九月",
                        "十月",
                        "十一月",
                        "十二月"
                    )
                )
                .yAxisTitle("")
                .markerRadius(8f)//marker点半径为8个像素
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)//marker点为空心效果
                .markerSymbol(AAChartSymbolType.Circle)//marker点为圆形点○
                .yAxisLineWidth(0f)
                .yAxisGridLineWidth(0f)
                .legendEnabled(false)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Tokyo Hot")
                            .lineWidth(5.0f)
                            .color("rgba(220,20,60,1)")//猩红色, alpha 透明度 1
                            .fillColor(linearGradientColor)
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    2.5,
                                    14.5,
                                    18.2,
                                    21.5,
                                    5.2,
                                    26.5,
                                    23.3,
                                    45.3,
                                    13.9,
                                    9.6
                                )
                            )
                    )
                )
        }

        internal fun configureSpecialStyleMarkerOfSingleDataElementChart(): AAChartModel {
            val stopsArr: Array<Any> = arrayOf(
                arrayOf(0.00, "#febc0f"),
                arrayOf(0.25, "#FF14d4"),
                arrayOf(0.50, "#0bf8f5"),
                arrayOf(0.75, "#F33c52"),
                arrayOf(1.00, "#1904dd")
            )//颜色字符串设置支持十六进制类型和 rgba 类型

            val gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToRight,
                stopsArr
            )

            val singleSpecialData = AADataElement()
                .marker(
                    AAMarker()
                        .radius(10f)//曲线连接点半径
                        .symbol(AAChartSymbolType.Circle.value)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                        .fillColor("#FFFFFF")//点的填充色(用来设置折线连接点的填充色)
                        .lineWidth(5f)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                        .lineColor("#FF0000")//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                )
                .y(26.5f)

            return AAChartModel()
                .chartType(AAChartType.Spline)
                .title("")
                .backgroundColor("#4b2b7f")
                .yAxisTitle("")//设置Y轴标题
                .dataLabelsEnabled(false)//是否显示值
                .tooltipEnabled(true)
                .markerRadius(0f)
                .xAxisVisible(false)
                .yAxisVisible(false)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Virtual Data")
                            .lineWidth(9f)
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    2.5,
                                    14.5,
                                    18.2,
                                    singleSpecialData,
                                    5.2,
                                    26.5,
                                    23.3,
                                    45.3,
                                    13.9,
                                    9.6
                                )
                            )
                            .color(gradientColorDic1)
                    )
                )
        }

        internal fun configureSpecialStyleColumnOfSingleDataElementChart(): AAChartModel {
            val singleSpecialData = AADataElement()
                .color(AAGradientColor.freshPapayaColor())
                .y(49.5f)

            return AAChartModel()
                .chartType(AAChartType.Column)
                .title("")
                .yAxisTitle("")//设置Y轴标题
                .dataLabelsEnabled(false)//是否显示值
                .tooltipEnabled(false)
                .markerRadius(0f)
                .xAxisVisible(false)
                .yAxisVisible(false)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Virtual Data")
                            .lineWidth(6f)
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    2.5,
                                    14.5,
                                    18.2,
                                    singleSpecialData,
                                    5.2,
                                    26.5,
                                    23.3,
                                    26.5,
                                    13.9,
                                    9.6
                                )
                            )
                            .color(AAGradientColor.oceanBlueColor())
                    )
                )
        }

        internal fun configureAreaChartThreshold(): AAChartModel {
            val gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                "rgba(30, 144, 255,1)", //DodgerBlue, alpha 透明度 1
                "rgba(30, 144, 255,0.1)"//DodgerBlue, alpha 透明度 0.1
            )

            return AAChartModel()
                .chartType(AAChartType.Area)
                .title("")
                .yAxisTitle("")//设置Y轴标题
                .yAxisGridLineWidth(0f)
                .categories(
                    arrayOf(
                        "Jan",
                        "Feb",
                        "Mar",
                        "Apr",
                        "May",
                        "Jun",
                        "July",
                        "Aug",
                        "Spe",
                        "Oct",
                        "Nov",
                        "Dec"
                    )
                )
                .dataLabelsEnabled(false)//是否显示值
                .markerRadius(8f)
                .markerSymbol(AAChartSymbolType.Circle)
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
                .legendEnabled(false)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .threshold(-200f)
                            .data(
                                arrayOf(
                                    106.4,
                                    129.2,
                                    269.9,
                                    -100.5,
                                    144.0,
                                    176.0,
                                    135.6,
                                    148.5,
                                    216.4,
                                    194.1,
                                    95.6,
                                    54.4
                                )
                            )
                            .lineWidth(6f)
                            .color("rgba(30, 144, 255,1)")
                            .fillColor(gradientColorDic1)
                    )
                )
        }

        //refer to online sample https://jshare.com.cn/github/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-symbol/
        internal fun customScatterChartMarkerSymbolContent(): AAChartModel {
            val predefinedSymbol1 = AAChartSymbolType.Triangle.value
            val predefinedSymbol2 = AAChartSymbolType.Circle.value
            val imageSymbol = "url(https://www.highcharts.com/samples/graphics/sun.png)"
            val base64Symbol =
                "url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAOCAYAAAAfSC3RAAAACXBIWXMAAA7EAAAOxAGVKw4bAAAKT2lDQ1BQaG90b3Nob3AgSUNDIHByb2ZpbGUAAHjanVNnVFPpFj333vRCS4iAlEtvUhUIIFJCi4AUkSYqIQkQSoghodkVUcERRUUEG8igiAOOjoCMFVEsDIoK2AfkIaKOg6OIisr74Xuja9a89+bN/rXXPues852zzwfACAyWSDNRNYAMqUIeEeCDx8TG4eQuQIEKJHAAEAizZCFz/SMBAPh+PDwrIsAHvgABeNMLCADATZvAMByH/w/qQplcAYCEAcB0kThLCIAUAEB6jkKmAEBGAYCdmCZTAKAEAGDLY2LjAFAtAGAnf+bTAICd+Jl7AQBblCEVAaCRACATZYhEAGg7AKzPVopFAFgwABRmS8Q5ANgtADBJV2ZIALC3AMDOEAuyAAgMADBRiIUpAAR7AGDIIyN4AISZABRG8lc88SuuEOcqAAB4mbI8uSQ5RYFbCC1xB1dXLh4ozkkXKxQ2YQJhmkAuwnmZGTKBNA/g88wAAKCRFRHgg/P9eM4Ors7ONo62Dl8t6r8G/yJiYuP+5c+rcEAAAOF0ftH+LC+zGoA7BoBt/qIl7gRoXgugdfeLZrIPQLUAoOnaV/Nw+H48PEWhkLnZ2eXk5NhKxEJbYcpXff5nwl/AV/1s+X48/Pf14L7iJIEyXYFHBPjgwsz0TKUcz5IJhGLc5o9H/LcL//wd0yLESWK5WCoU41EScY5EmozzMqUiiUKSKcUl0v9k4t8s+wM+3zUAsGo+AXuRLahdYwP2SycQWHTA4vcAAPK7b8HUKAgDgGiD4c93/+8//UegJQCAZkmScQAAXkQkLlTKsz/HCAAARKCBKrBBG/TBGCzABhzBBdzBC/xgNoRCJMTCQhBCCmSAHHJgKayCQiiGzbAdKmAv1EAdNMBRaIaTcA4uwlW4Dj1wD/phCJ7BKLyBCQRByAgTYSHaiAFiilgjjggXmYX4IcFIBBKLJCDJiBRRIkuRNUgxUopUIFVIHfI9cgI5h1xGupE7yAAygvyGvEcxlIGyUT3UDLVDuag3GoRGogvQZHQxmo8WoJvQcrQaPYw2oefQq2gP2o8+Q8cwwOgYBzPEbDAuxsNCsTgsCZNjy7EirAyrxhqwVqwDu4n1Y8+xdwQSgUXACTYEd0IgYR5BSFhMWE7YSKggHCQ0EdoJNwkDhFHCJyKTqEu0JroR+cQYYjIxh1hILCPWEo8TLxB7iEPENyQSiUMyJ7mQAkmxpFTSEtJG0m5Si +ksqZs0SBojk8naZGuyBzmULCAryIXkneTD5DPkG+Qh8lsKnWJAcaT4U+IoUspqShnlEOU05QZlmDJBVaOaUt2ooVQRNY9aQq2htlKvUYeoEzR1mjnNgxZJS6WtopXTGmgXaPdpr+h0uhHdlR5Ol9BX0svpR+iX6AP0dwwNhhWDx4hnKBmbGAcYZxl3GK+YTKYZ04sZx1QwNzHrmOeZD5lvVVgqtip8FZHKCpVKlSaVGyovVKmqpqreqgtV81XLVi +pXlN9rkZVM1PjqQnUlqtVqp1Q61MbU2epO6iHqmeob1Q/pH5Z/YkGWcNMw09DpFGgsV/jvMYgC2MZs3gsIWsNq4Z1gTXEJrHN2Xx2KruY/R27iz2qqaE5QzNKM1ezUvOUZj8H45hx+Jx0TgnnKKeX836K3hTvKeIpG6Y0TLkxZVxrqpaXllirSKtRq0frvTau7aedpr1Fu1n7gQ5Bx0onXCdHZ4/OBZ3nU9lT3acKpxZNPTr1ri6qa6UbobtEd79up+6Ynr5egJ5Mb6feeb3n+hx9L/1U/W36p/VHDFgGswwkBtsMzhg8xTVxbzwdL8fb8VFDXcNAQ6VhlWGX4YSRudE8o9VGjUYPjGnGXOMk423GbcajJgYmISZLTepN7ppSTbmmKaY7TDtMx83MzaLN1pk1mz0x1zLnm+eb15vft2BaeFostqi2uGVJsuRaplnutrxuhVo5WaVYVVpds0atna0l1rutu6cRp7lOk06rntZnw7Dxtsm2qbcZsOXYBtuutm22fWFnYhdnt8Wuw+6TvZN9un2N/T0HDYfZDqsdWh1+c7RyFDpWOt6azpzuP33F9JbpL2dYzxDP2DPjthPLKcRpnVOb00dnF2e5c4PziIuJS4LLLpc+Lpsbxt3IveRKdPVxXeF60vWdm7Obwu2o26/uNu5p7ofcn8w0nymeWTNz0MPIQ+BR5dE/C5+VMGvfrH5PQ0+BZ7XnIy9jL5FXrdewt6V3qvdh7xc+9j5yn+M+4zw33jLeWV/MN8C3yLfLT8Nvnl+F30N/I/9k/3r/0QCngCUBZwOJgUGBWwL7+Hp8Ib+OPzrbZfay2e1BjKC5QRVBj4KtguXBrSFoyOyQrSH355jOkc5pDoVQfujW0Adh5mGLw34MJ4WHhVeGP45wiFga0TGXNXfR3ENz30T6RJZE3ptnMU85ry1KNSo+qi5qPNo3ujS6P8YuZlnM1VidWElsSxw5LiquNm5svt/87fOH4p3iC+N7F5gvyF1weaHOwvSFpxapLhIsOpZATIhOOJTwQRAqqBaMJfITdyWOCnnCHcJnIi/RNtGI2ENcKh5O8kgqTXqS7JG8NXkkxTOlLOW5hCepkLxMDUzdmzqeFpp2IG0yPTq9MYOSkZBxQqohTZO2Z+pn5mZ2y6xlhbL+xW6Lty8elQfJa7OQrAVZLQq2QqboVFoo1yoHsmdlV2a/zYnKOZarnivN7cyzytuQN5zvn//tEsIS4ZK2pYZLVy0dWOa9rGo5sjxxedsK4xUFK4ZWBqw8uIq2Km3VT6vtV5eufr0mek1rgV7ByoLBtQFr6wtVCuWFfevc1+ 1dT1gvWd+ 1YfqGnRs+FYmKrhTbF5cVf9go3HjlG4dvyr+Z3JS0qavEuWTPZtJm6ebeLZ5bDpaql+aXDm4N2dq0Dd9WtO319kXbL5fNKNu7g7ZDuaO/PLi8ZafJzs07P1SkVPRU+lQ27tLdtWHX+G7R7ht7vPY07NXbW7z3/T7JvttVAVVN1WbVZftJ+7P3P66Jqun4lvttXa1ObXHtxwPSA/0HIw6217nU1R3SPVRSj9Yr60cOxx+ 1/p3vdy0NNg1VjZzG4iNwRHnk6fcJ3/ceDTradox7rOEH0x92HWcdL2pCmvKaRptTmvtbYlu6T8w+0dbq3nr8R9sfD5w0PFl5SvNUyWna6YLTk2fyz4ydlZ19fi753GDborZ752PO32oPb+ 16EHTh0kX/i +c7vDvOXPK4dPKy2+UTV7hXmq86X23qdOo8/pPTT8e7nLuarrlca7nuer21e2b36RueN87d9L158Rb/1tWeOT3dvfN6b/fF9/XfFt1+cif9zsu72Xcn7q28T7xf9EDtQdlD3YfVP1v+3Njv3H9qwHeg89HcR/cGhYPP/pH1jw9DBY+Zj8uGDYbrnjg+OTniP3L96fynQ89kzyaeF/6i/suuFxYvfvjV69fO0ZjRoZfyl5O/bXyl/erA6xmv28bCxh6+yXgzMV70VvvtwXfcdx3vo98PT+R8IH8o/2j5sfVT0Kf7kxmTk/8EA5jz/GMzLdsAAAAgY0hSTQAAeiUAAICDAAD5/wAAgOkAAHUwAADqYAAAOpgAABdvkl/FRgAAAVVJREFUeNpi/P37NwOxYM2pHtm7lw8uYmBgYGAiVtPC3RWh+88vuneT474Dv4DkcUZibJy8PG72le/nkn+zMzAaMhnNyY1clMpCjKbz/86lMLAzMMA0MTAwMOC1Ea6JgYFB9pPwncbMg6owOaY1p3pk15zqkcWnie8j63ddY18nZHmWI2eW3vzN/Jf168c3UfGuHathAXHl+7lkBnYGBtafDP8NVd3jQ8xKHiNrZMyeqPPtE/9vTgYGBgb1H4oHlHXt43ZfWfDwNzsDIwMDA4POX831RXGrg9BdxLhob63VgTurjsAUsv5k+A9jC3/g/NCdfVoQm/+ZIu3qjhnyW3XABJANMNL19cYVcPBQrZpq9eyFwCdJmIT6D8UD5cmbHXFphKccI9Mgc84vTH9goYhPE4rGELOSx0bSjsUMDAwMunJ2FQST0+/fv1Hw5BWJbehi2DBgAHTKsWmiz+rJAAAAAElFTkSuQmCC)"

            val element1 = AASeriesElement()
                .name("Predefined symbol")
                .data(
                    arrayOf(
                        0.45,
                        0.43,
                        0.50,
                        0.55,
                        0.58,
                        0.62,
                        0.83,
                        0.39,
                        0.56,
                        0.67,
                        0.50,
                        0.34,
                        0.50,
                        0.67,
                        0.58,
                        0.29,
                        0.46,
                        0.23,
                        0.47,
                        0.46,
                        0.38,
                        0.56,
                        0.48,
                        0.36
                    )
                )
                .marker(
                    AAMarker()
                        .symbol(predefinedSymbol1)
                )

            val element2 = AASeriesElement()
                .name("Image symbol")
                .data(
                    arrayOf(
                        0.38,
                        0.31,
                        0.32,
                        0.32,
                        0.64,
                        0.66,
                        0.86,
                        0.47,
                        0.52,
                        0.75,
                        0.52,
                        0.56,
                        0.54,
                        0.60,
                        0.46,
                        0.63,
                        0.54,
                        0.51,
                        0.58,
                        0.64,
                        0.60,
                        0.45,
                        0.36,
                        0.67
                    )
                )
                .marker(
                    AAMarker()
                        .symbol(imageSymbol)
                )

            val element3 = AASeriesElement()
                .name("Base64 symbol (*)")
                .data(
                    arrayOf(
                        0.46,
                        0.32,
                        0.53,
                        0.58,
                        0.86,
                        0.68,
                        0.85,
                        0.73,
                        0.69,
                        0.71,
                        0.91,
                        0.74,
                        0.60,
                        0.50,
                        0.39,
                        0.67,
                        0.55,
                        0.49,
                        0.65,
                        0.45,
                        0.64,
                        0.47,
                        0.63,
                        0.64
                    )
                )
                .marker(
                    AAMarker()
                        .symbol(base64Symbol)
                )

            val element4 = AASeriesElement()
                .name("Custom symbol")
                .data(
                    arrayOf(
                        0.60,
                        0.51,
                        0.52,
                        0.53,
                        0.64,
                        0.84,
                        0.65,
                        0.68,
                        0.63,
                        0.47,
                        0.72,
                        0.60,
                        0.65,
                        0.74,
                        0.66,
                        0.65,
                        0.71,
                        0.59,
                        0.65,
                        0.77,
                        0.52,
                        0.53,
                        0.58,
                        0.53
                    )
                )
                .marker(
                    AAMarker()
                        .symbol(predefinedSymbol2)
                )

            return AAChartModel()
                .chartType(AAChartType.Scatter)
                .title("")
                .subtitle("")
                .yAxisTitle("")
                .yAxisMax(3.5f)
                .yAxisGridLineWidth(0f)
                .stacking(AAChartStackingType.Normal)
                .markerRadius(8f)
                .series(arrayOf(element1, element2, element3, element4))
        }

        //refer to online sample https://jshare.com.cn/github/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-symbol/
        internal fun customLineChartMarkerSymbolContent(): AAChartModel {
            val aaChartModel = customScatterChartMarkerSymbolContent()
            aaChartModel.chartType(AAChartType.Line)
            return aaChartModel
        }

        //三角形雷达图
        internal fun configureTriangleRadarChart(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Area)
                .title("")
                .subtitle("")
                .yAxisTitle("")
                .yAxisMax(15.0f)
                .yAxisGridLineWidth(0f)
                .xAxisVisible(false)
                .markerRadius(0f)
                .polar(true)//是否极化图形
                .series(
                    arrayOf(
                        AASeriesElement()
                            .data(arrayOf(15.0, 15.0, 15.0)),
                        AASeriesElement()
                            .data(arrayOf(9.0, 9.0, 9.0)),
                        AASeriesElement()
                            .data(arrayOf(6.0, 6.0, 6.0)),
                        AASeriesElement()
                            .data(arrayOf(3.0, 3.0, 3.0))
                    )
                )
        }

        //四边形雷达图
        internal fun configureQuadrangleRadarChart(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Area)
                .title("")
                .subtitle("")
                .yAxisTitle("")
                .yAxisMax(15.0f)
                .yAxisGridLineWidth(0f)
                .xAxisVisible(false)
                .markerRadius(0f)
                .polar(true)//是否极化图形
                .series(
                    arrayOf(
                        AASeriesElement()
                            .data(arrayOf(15.0, 15.0, 15.0, 15.0)),
                        AASeriesElement()
                            .data(arrayOf(9.0, 9.0, 9.0, 9.0)),
                        AASeriesElement()
                            .data(arrayOf(6.0, 6.0, 6.0, 6.0)),
                        AASeriesElement()
                            .data(arrayOf(3.0, 3.0, 3.0, 3.0))
                    )
                )
        }

        //五边形雷达图
        internal fun configurePentagonRadarChart(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Area)
                .title("")
                .subtitle("")
                .yAxisTitle("")
                .yAxisMax(15.0f)
                .yAxisGridLineWidth(0f)
                .xAxisVisible(false)
                .markerRadius(0f)
                .polar(true)//是否极化图形
                .series(
                    arrayOf(
                        AASeriesElement()
                            .data(arrayOf(15.0, 15.0, 15.0, 15.0, 15.0)),
                        AASeriesElement()
                            .data(arrayOf(9.0, 9.0, 9.0, 9.0, 9.0)),
                        AASeriesElement()
                            .data(arrayOf(6.0, 6.0, 6.0, 6.0, 6.0)),
                        AASeriesElement()
                            .data(arrayOf(3.0, 3.0, 3.0, 3.0, 3.0))
                    )
                )
        }

        //六边形雷达图
        internal fun configureHexagonRadarChart(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Area)
                .title("")
                .subtitle("")
                .yAxisTitle("")
                .yAxisMax(15.0f)
                .yAxisGridLineWidth(0f)
                .xAxisVisible(false)
                .markerRadius(0f)
                .polar(true)//是否极化图形
                .series(
                    arrayOf(
                        AASeriesElement()
                            .data(arrayOf(15.0, 15.0, 15.0, 15.0, 15.0, 15.0)),
                        AASeriesElement()
                            .data(arrayOf(9.0, 9.0, 9.0, 9.0, 9.0, 9.0)),
                        AASeriesElement()
                            .data(arrayOf(6.0, 6.0, 6.0, 6.0, 6.0, 6.0)),
                        AASeriesElement()
                            .data(arrayOf(3.0, 3.0, 3.0, 3.0, 3.0, 3.0))
                    )
                )
        }


        fun adjustYAxisMaxAndMinValues(): AAChartModel {
            val categoriesArr = arrayOf(
                "孤岛危机",
                "使命召唤",
                "荣誉勋章",
                "狙击精英",
                "神秘海域",
                "最后生还者",
                "巫师3狂猎",
                "对马之魂",
                "蝙蝠侠阿甘骑士",
                "地狱边境",
                "闪客",
                "忍者之印"
            )
            return AAChartModel()
                .chartType(AAChartType.Areaspline)
                .legendEnabled(false)
                .yAxisVisible(true)
                .markerRadius(6f)
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
                .zoomType(AAChartZoomType.XY)
                .categories(categoriesArr)
                .yAxisMin(2.0f)
                .yAxisMax(45.4f)
                .xAxisTickInterval(2)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("体重")
                            .color("#2494F3")
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    2.5,
                                    14.5,
                                    18.2,
                                    21.5,
                                    5.2,
                                    26.5,
                                    23.3,
                                    45.3,
                                    13.9,
                                    9.6
                                )
                            )
                    )
                )
        }

        fun customSpecialStyleDataLabelOfSingleDataElementChart(): AAChartModel {
            val redStopsArr = arrayOf(
                arrayOf(0.0, AAColor.rgbaColor(255, 0, 0, 0.6f)),
                arrayOf(0.5, AAColor.rgbaColor(255, 0, 0, 0.0f)),
                arrayOf(1.0, AAColor.rgbaColor(255, 0, 0, 0.0f))
            )
            val gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                AAColor.rgbaColor(255, 215, 0, 0.1f),
                AAColor.rgbaColor(255, 215, 0, 0.6f)
            )
            val formatStr =
                "<img src=\"https://www.highcharts.com/samples/graphics/sun.png\">" +
                        "<span style=\"color:#FFFFFF;font-weight:thin;font-size:25px\">{y}</span>" +
                        "<span style=\"color:#FFFFFF;font-weight:thin;font-size:17px\"> m</span>"
            val singleSpecialData = AADataElement()
                .dataLabels(
                    AADataLabels()
                        .enabled(true)
                        .useHTML(true)
                        .format(formatStr)
                        .style(
                            AAStyle()
                                .fontWeight(AAChartFontWeightType.Bold)
                                .color(AAColor.whiteColor())
                                .fontSize(16f)
                        )
                        .y(-35f)
                        .align(AAChartAlignType.Center)
                        .verticalAlign(AAChartVerticalAlignType.Top)
                        .overflow("none")
                        .crop(false)
                )
                .y(26.5f)

            return AAChartModel()
                .chartType(AAChartType.Areaspline)
                .backgroundColor("#4b2b7f")
                .dataLabelsEnabled(false) //是否显示值
                .tooltipEnabled(true)
                .markerRadius(0f)
                .xAxisVisible(false)
                .yAxisVisible(false)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Virtual Data")
                            .lineWidth(6f)
                            .color("rgba(255,215,0,1)")
                            .fillColor(gradientColorDic1) // gold color, alpha: 1.0
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    2.5,
                                    14.5,
                                    18.2,
                                    singleSpecialData,
                                    5.2,
                                    26.5,
                                    23.3,
                                    45.3,
                                    13.9,
                                    9.6
                                )
                            )
                    )
                )
        }

        fun customBarChartHoverColorAndSelectColor(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Bar)
                .title("Custom Bar Chart select color")
                .yAxisReversed(true)
                .xAxisReversed(true)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("ElementOne")
                            .data(
                                arrayOf(
                                    211,
                                    183,
                                    157,
                                    133,
                                    111,
                                    91,
                                    73,
                                    57,
                                    43,
                                    31,
                                    21,
                                    13,
                                    7,
                                    3
                                )
                            )
                            .allowPointSelect(true)
                            .states(
                                AAStates()
                                    .hover(
                                        AAHover()
                                            .color("rgba(220,20,60,1)")
                                    ) //猩红色, alpha 透明度 1
                                    .select(
                                        AASelect()
                                            .color(AAColor.redColor())
                                    )
                            )
                    )
                )
        }

        fun customChartHoverAndSelectHaloStyle(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Line)
                .title("Custom Chart Hover And Select Halo Style")
                .colorsTheme(arrayOf(AAColor.redColor()))
                .yAxisReversed(true)
                .xAxisReversed(true)
                .markerRadius(20f)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("ElementOne")
                            .data(
                                arrayOf(
                                    211,
                                    183,
                                    157,
                                    133,
                                    111,
                                    91,
                                    73,
                                    57,
                                    43,
                                    31,
                                    21,
                                    13,
                                    7,
                                    3
                                )
                            )
                            .allowPointSelect(true)
                            .states(
                                AAStates()
                                    .hover(
                                        AAHover()
                                            .halo(
                                                AAHalo()
                                                    .size(130f)
                                                    .opacity(0.8f)
                                                    .attributes(
                                                        mapOf(
                                                            "stroke-width" to 50,
                                                            "fill" to "#00BFFF",
                                                            "stroke" to "#00FA9A"
                                                        )
                                                    )
                                            )
                                    )
                                    .select(
                                        AASelect()
                                            .halo(
                                                AAHalo()
                                                    .size(130f)
                                                    .opacity(1.0f)
                                                    .attributes(
                                                        mapOf(
                                                            "stroke-width" to 150,
                                                            "fill" to AAColor.rgbaColor(
                                                                138,
                                                                43,
                                                                226,
                                                                1f
                                                            ),
                                                            "stroke" to AAColor.rgbaColor(
                                                                30,
                                                                144,
                                                                255,
                                                                1f
                                                            )
                                                        )
                                                    )
                                            )
                                    )
                            )
                    )
                )
        }

        fun customSplineChartMarkerStatesHoverStyle(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("Custom Spline Chart Marker States Hover Style")
                .categories(
                    arrayOf(
                        "一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"
                    )
                )
                .markerRadius(8.0f) //marker点半径为8个像素
                .yAxisLineWidth(0f)
                .yAxisGridLineWidth(0f)
                .legendEnabled(false)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Tokyo Hot")
                            .lineWidth(5.0f)
                            .color("rgba(220,20,60,1)") //猩红色, alpha 透明度 1
                            .marker(
                                AAMarker()
                                    .states(
                                        AAMarkerStates()
                                            .hover(
                                                AAMarkerHover()
                                                    .fillColor(AAColor.whiteColor())
                                                    .radius(40f)
                                                    .lineColor(AAColor.greenColor())
                                                    .lineWidth(20f)
                                            )
                                    )
                            )
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    2.5,
                                    14.5,
                                    18.2,
                                    21.5,
                                    5.2,
                                    26.5,
                                    23.3,
                                    45.3,
                                    13.9,
                                    9.6
                                )
                            )
                    )
                )
        }


        //Issue: https://github.com/AAChartModel/AAChartKit/issues/827
        fun customNormalStackingChartDataLabelsContentAndStyle(): AAChartModel {
            val categories = arrayOf(
                "孤岛危机",
                "使命召唤",
                "荣誉勋章",
                "狙击精英",
                "神秘海域",
                "最后生还者",
                "巫师3狂猎",
                "对马之魂",
                "死亡搁浅",
                "地狱边境",
                "闪客",
                "忍者之印"
            )
            val colorsTheme: Array<Any> = arrayOf(
                "#fe117c",
                "#ffc069",
                "#06caf4",
                "#7dffc0"
            )
            val element1 = AASeriesElement()
                .name("2017")
                .dataLabels(
                    AADataLabels()
                        .y(-10f)
                        .format("{total} mm")
                        .color(AAColor.redColor())
                        .shape("callout")
                        .backgroundColor(AAColor.whiteColor())
                        .borderColor(AAColor.redColor())
                        .borderRadius(1f)
                        .borderWidth(1f)
                )
                .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
            val element2 = AASeriesElement()
                .name("2018")
                .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5))
            val element3 = AASeriesElement()
                .name("2019")
                .data(arrayOf(0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0))
            val element4 = AASeriesElement()
                .name("2020")
                .data(arrayOf(3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8))

            return AAChartModel()
                .chartType(AAChartType.Column)
                .stacking(AAChartStackingType.Normal)
                .yAxisGridLineWidth(0f)
                .markerRadius(0f)
                .categories(categories)
                .colorsTheme(colorsTheme)
                .series(arrayOf(element1, element2, element3, element4))
        }

        //Issue: https://github.com/AAChartModel/AAChartKit-Swift/issues/190
//API Doc: https://api.highcharts.com.cn/highcharts#series%3Cpyramid%3E.reversed
        fun upsideDownPyramidChart(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Pyramid)
                .yAxisTitle("摄氏度")
                .inverted(true)
                .legendEnabled(true)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("2020")
                            .reversed(true)
                            .data(
                                arrayOf(
                                    arrayOf("Swift", 15654),
                                    arrayOf("Objective-C", 4064),
                                    arrayOf("JavaScript", 1987),
                                    arrayOf("GO", 976),
                                    arrayOf("Python", 846)
                                )
                            )
                    )
                )
        }

        //Issue: https://github.com/AAChartModel/AAChartKit/issues/888
        fun doubleLayerPieChart(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Pie)
                .title("浏览器市场占比历史对比")
                .subtitle("无任何可靠依据的虚拟数据")
                .dataLabelsEnabled(true) //是否直接显示扇形图数据
                .yAxisTitle("摄氏度")
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Past")
                            .size("40%") //尺寸大小
                            .innerSize("30%") //内部圆环半径大小占比
                            .borderWidth(0f) //描边的宽度
                            .allowPointSelect(false) //是否允许在点击数据点标记(扇形图点击选中的块发生位移)
                            .data(
                                arrayOf(
                                    arrayOf("Firefox Past", 3336.2),
                                    arrayOf("Chrome Past", 26.8),
                                    arrayOf("Safari Past", 88.5),
                                    arrayOf("Opera Past", 46.0),
                                    arrayOf("Others Past", 223.0)
                                )
                            ),
                        AASeriesElement()
                            .name("Now")
                            .size("80%") //尺寸大小
                            .innerSize("70%") //内部圆环半径大小占比
                            .borderWidth(0f) //描边的宽度
                            .allowPointSelect(false) //是否允许在点击数据点标记(扇形图点击选中的块发生位移)
                            .data(
                                arrayOf(
                                    arrayOf("Firefox Now", 336.2),
                                    arrayOf("Chrome Now", 6926.8),
                                    arrayOf("Safari Now", 388.5),
                                    arrayOf("Opera Now", 446.0),
                                    arrayOf("Others Now", 223.0)
                                )
                            )
                    )
                )
        }

        //GitHub issue https://github.com/AAChartModel/AAChartKit/issues/903
        fun disableSomeOfLinesMouseTrackingEffect(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Line) //图表类型
                .tooltipValueSuffix("万元") //设置浮动提示框单位后缀
                .yAxisTitle("万元") //设置 Y 轴标题
                .categories(
                    arrayOf(
                        "一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"
                    )
                )
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("2017")
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    9.5,
                                    14.5,
                                    18.2,
                                    21.5,
                                    25.2,
                                    26.5,
                                    23.3,
                                    18.3,
                                    13.9,
                                    9.6
                                )
                            ),
                        AASeriesElement()
                            .name("2018")
                            .enableMouseTracking(false)
                            .data(
                                arrayOf(
                                    0.2,
                                    0.8,
                                    5.7,
                                    11.3,
                                    17.0,
                                    22.0,
                                    24.8,
                                    24.1,
                                    20.1,
                                    14.1,
                                    8.6,
                                    2.5
                                )
                            ),
                        AASeriesElement()
                            .name("2019")
                            .enableMouseTracking(false)
                            .data(
                                arrayOf(
                                    0.9,
                                    0.6,
                                    3.5,
                                    8.4,
                                    13.5,
                                    17.0,
                                    18.6,
                                    17.9,
                                    14.3,
                                    9.0,
                                    3.9,
                                    1.0
                                )
                            ),
                        AASeriesElement()
                            .name("2020")
                            .enableMouseTracking(false)
                            .data(
                                arrayOf(
                                    3.9,
                                    4.2,
                                    5.7,
                                    8.5,
                                    11.9,
                                    15.2,
                                    17.0,
                                    16.6,
                                    14.2,
                                    10.3,
                                    6.6,
                                    4.8
                                )
                            )
                    )
                )
        }


        // GitHub issue https://github.com/AAChartModel/AAChartKit/issues/904
        fun configureColorfulShadowSplineChart(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Spline)
                .yAxisVisible(false)
                .stacking(AAChartStackingType.Normal)
                .colorsTheme(arrayOf("#1e90ff", "#ef476f", "#ffd066", "#04d69f"))
                .markerSymbol(AAChartSymbolType.Circle)
                .markerRadius(8.0f)
                .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("2017")
                            .lineWidth(5f)
                            .data(
                                arrayOf(
                                    0.45,
                                    0.43,
                                    0.50,
                                    0.55,
                                    0.58,
                                    0.62,
                                    0.83,
                                    0.39,
                                    0.56,
                                    0.67,
                                    0.50,
                                    0.34,
                                    0.50,
                                    0.67,
                                    0.58,
                                    0.29,
                                    0.46,
                                    0.23,
                                    0.47,
                                    0.46,
                                    0.38,
                                    0.56,
                                    0.48,
                                    0.36
                                )
                            )
                            .shadow(
                                AAShadow()
                                    .offsetX(15.0f)
                                    .offsetY(15.0f)
                                    .opacity(0.2f)
                                    .width(8.0f)
                                    .color("#1e90ff")
                            ),
                        AASeriesElement()
                            .name("2018")
                            .lineWidth(5f)
                            .data(
                                arrayOf(
                                    0.38,
                                    0.31,
                                    0.32,
                                    0.32,
                                    0.64,
                                    0.66,
                                    0.86,
                                    0.47,
                                    0.52,
                                    0.75,
                                    0.52,
                                    0.56,
                                    0.54,
                                    0.60,
                                    0.46,
                                    0.63,
                                    0.54,
                                    0.51,
                                    0.58,
                                    0.64,
                                    0.60,
                                    0.45,
                                    0.36,
                                    0.67
                                )
                            )
                            .shadow(
                                AAShadow()
                                    .offsetX(15.0f)
                                    .offsetY(15.0f)
                                    .opacity(0.2f)
                                    .width(8.0f)
                                    .color("#ef476f")
                            ),
                        AASeriesElement()
                            .name("2019")
                            .lineWidth(5f)
                            .data(
                                arrayOf(
                                    0.46,
                                    0.32,
                                    0.53,
                                    0.58,
                                    0.86,
                                    0.68,
                                    0.85,
                                    0.73,
                                    0.69,
                                    0.71,
                                    0.91,
                                    0.74,
                                    0.60,
                                    0.50,
                                    0.39,
                                    0.67,
                                    0.55,
                                    0.49,
                                    0.65,
                                    0.45,
                                    0.64,
                                    0.47,
                                    0.63,
                                    0.64
                                )
                            )
                            .shadow(
                                AAShadow()
                                    .offsetX(15.0f)
                                    .offsetY(15.0f)
                                    .opacity(0.2f)
                                    .width(8.0f)
                                    .color("#ffd066")
                            ),
                        AASeriesElement()
                            .name("2020")
                            .lineWidth(5f)
                            .data(
                                arrayOf(
                                    0.60,
                                    0.51,
                                    0.52,
                                    0.53,
                                    0.64,
                                    0.84,
                                    0.65,
                                    0.68,
                                    0.63,
                                    0.47,
                                    0.72,
                                    0.60,
                                    0.65,
                                    0.74,
                                    0.66,
                                    0.65,
                                    0.71,
                                    0.59,
                                    0.65,
                                    0.77,
                                    0.52,
                                    0.53,
                                    0.58,
                                    0.53
                                )
                            )
                            .shadow(
                                AAShadow()
                                    .offsetX(15.0f)
                                    .offsetY(15.0f)
                                    .opacity(0.2f)
                                    .width(8.0f)
                                    .color("#04d69f")
                            )
                    )
                )
        }

        // GitHub issue https://github.com/AAChartModel/AAChartKit/issues/905
        fun configureColorfulDataLabelsStepLineChart(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Line)
                .yAxisVisible(false)
                .stacking(AAChartStackingType.Normal)
                .colorsTheme(arrayOf("#1e90ff", "#ef476f", "#ffd066", "#04d69f"))
                .markerSymbol(AAChartSymbolType.Circle)
                .markerRadius(8.0f)
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("2017")
                            .step(true)
                            .dataLabels(
                                AADataLabels()
                                    .style(
                                        AAStyle()
                                            .color("#1e90ff")
                                            .fontSize(11f)
                                    )
                            )
                            .data(
                                arrayOf(
                                    2.10,
                                    2.54,
                                    2.78,
                                    3.62,
                                    4.41,
                                    4.09,
                                    3.83,
                                    4.47,
                                    4.20,
                                    3.94,
                                    3.80,
                                    3.58,
                                    3.19,
                                    4.30,
                                    3.69,
                                    3.52,
                                    3.02,
                                    3.30
                                )
                            ),
                        AASeriesElement()
                            .name("2018")
                            .step(true)
                            .dataLabels(
                                AADataLabels()
                                    .style(
                                        AAStyle()
                                            .color("#ef476f")
                                            .fontSize(11f)
                                    )
                            )
                            .data(
                                arrayOf(
                                    1.56,
                                    1.91,
                                    2.45,
                                    3.87,
                                    3.24,
                                    4.90,
                                    4.61,
                                    4.10,
                                    4.17,
                                    3.85,
                                    4.17,
                                    3.46,
                                    3.46,
                                    3.55,
                                    3.50,
                                    4.13,
                                    2.58,
                                    2.28
                                )
                            ),
                        AASeriesElement()
                            .name("2019")
                            .step(true)
                            .dataLabels(
                                AADataLabels()
                                    .style(
                                        AAStyle()
                                            .color("#ffd066")
                                            .fontSize(11f)
                                    )
                            )
                            .data(
                                arrayOf(
                                    1.16,
                                    1.67,
                                    2.64,
                                    2.86,
                                    3.00,
                                    3.21,
                                    4.14,
                                    4.07,
                                    3.68,
                                    3.11,
                                    3.41,
                                    3.25,
                                    3.32,
                                    3.07,
                                    3.92,
                                    3.05,
                                    2.18,
                                    3.24
                                )
                            ),
                        AASeriesElement()
                            .name("2020")
                            .step(true)
                            .dataLabels(
                                AADataLabels()
                                    .style(
                                        AAStyle()
                                            .color("#04d69f")
                                            .fontSize(11f)
                                    )
                            )
                            .data(
                                arrayOf(
                                    5.59,
                                    3.09,
                                    4.09,
                                    6.14,
                                    5.33,
                                    6.05,
                                    5.71,
                                    6.22,
                                    6.56,
                                    4.75,
                                    5.27,
                                    6.02,
                                    5.22,
                                    5.77,
                                    6.19,
                                    5.68,
                                    4.33,
                                    5.48
                                )
                            )
                    )
                )
        }


        // GitHub issue https://github.com/AAChartModel/AAChartKit-Swift/issues/223
        fun configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart(): AAChartModel {
            val blueStopsArr: Array<Any> = arrayOf(
                arrayOf(0.0, AAColor.rgbaColor(30, 144, 255, 1.0f)),
                arrayOf(0.5, AAColor.rgbaColor(30, 144, 255, 0.2f)),
                arrayOf(1.0, AAColor.rgbaColor(30, 144, 255, 0.0f))
            )
            val gradientBlueColorDic = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                blueStopsArr
            )

            val redStopsArr: Array<Any> = arrayOf(
                arrayOf(0.0, AAColor.rgbaColor(255, 0, 0, 1.0f)),
                arrayOf(0.5, AAColor.rgbaColor(255, 0, 0, 0.2f)),
                arrayOf(1.0, AAColor.rgbaColor(255, 0, 0, 0.0f))
            )
            val gradientRedColorDic = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                redStopsArr
            )

            val goldStopsArr: Array<Any> = arrayOf(
                arrayOf(0.0, AAColor.rgbaColor(255, 215, 0, 1.0f)),
                arrayOf(0.5, AAColor.rgbaColor(255, 215, 0, 0.2f)),
                arrayOf(1.0, AAColor.rgbaColor(255, 215, 0, 0.0f))
            )
            val gradientGoldColorDic = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                goldStopsArr
            )

            val greenStopsArr: Array<Any> = arrayOf(
                arrayOf(0.0, AAColor.rgbaColor(50, 205, 50, 1.0f)),
                arrayOf(0.5, AAColor.rgbaColor(50, 205, 50, 0.2f)),
                arrayOf(1.0, AAColor.rgbaColor(50, 205, 50, 0.0f))
            )
            val gradientGreenColorDic = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                greenStopsArr
            )


            return AAChartModel()
                .chartType(AAChartType.Area)
                .yAxisVisible(false)
                .stacking(AAChartStackingType.Normal)
                .colorsTheme(arrayOf("#1e90ff", "#ef476f", "#ffd066", "#04d69f"))
                .markerSymbol(AAChartSymbolType.Circle)
                .markerRadius(5f)
                .dataLabelsEnabled(false)
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("2017")
                            .fillColor(gradientBlueColorDic)
                            .lineWidth(6f)
                            .step(true)
                            .dataLabels(
                                AADataLabels()
                                    .style(
                                        AAStyle()
                                            .color("#1e90ff")
                                            .fontSize(11f)
                                    )
                            )
                            .data(
                                arrayOf(
                                    2.10,
                                    2.54,
                                    2.78,
                                    3.62,
                                    4.41,
                                    4.09,
                                    3.83,
                                    4.47,
                                    4.20,
                                    3.94,
                                    3.80,
                                    3.58,
                                    3.19,
                                    4.30,
                                    3.69,
                                    3.52,
                                    3.02,
                                    3.30
                                )
                            ),

                        AASeriesElement()
                            .name("2018")
                            .fillColor(gradientRedColorDic)
                            .lineWidth(6f)
                            .step(true)
                            .dataLabels(
                                AADataLabels()
                                    .style(
                                        AAStyle()
                                            .color("#ef476f")
                                            .fontSize(11f)
                                    )
                            )
                            .data(
                                arrayOf(
                                    1.56,
                                    1.91,
                                    2.45,
                                    3.87,
                                    3.24,
                                    4.90,
                                    4.61,
                                    4.10,
                                    4.17,
                                    3.85,
                                    4.17,
                                    3.46,
                                    3.46,
                                    3.55,
                                    3.50,
                                    4.13,
                                    2.58,
                                    2.28
                                )
                            ),

                        AASeriesElement()
                            .name("2019")
                            .fillColor(gradientGoldColorDic)
                            .lineWidth(6f)
                            .step(true)
                            .dataLabels(
                                AADataLabels()
                                    .style(
                                        AAStyle()
                                            .color("#ffd066")
                                            .fontSize(11f)
                                    )
                            )
                            .data(
                                arrayOf(
                                    1.16,
                                    1.67,
                                    2.64,
                                    2.86,
                                    3.00,
                                    3.21,
                                    4.14,
                                    4.07,
                                    3.68,
                                    3.11,
                                    3.41,
                                    3.25,
                                    3.32,
                                    3.07,
                                    3.92,
                                    3.05,
                                    2.18,
                                    3.24
                                )
                            ),

                        AASeriesElement()
                            .name("2020")
                            .fillColor(gradientGreenColorDic)
                            .lineWidth(6f)
                            .step(true)
                            .dataLabels(
                                AADataLabels()
                                    .style(
                                        AAStyle()
                                            .color("#04d69f")
                                            .fontSize(11f)
                                    )
                            )
                            .data(
                                arrayOf(
                                    5.59,
                                    3.09,
                                    4.09,
                                    6.14,
                                    5.33,
                                    6.05,
                                    5.71,
                                    6.22,
                                    6.56,
                                    4.75,
                                    5.27,
                                    6.02,
                                    5.22,
                                    5.77,
                                    6.19,
                                    5.68,
                                    4.33,
                                    5.48
                                )
                            )
                    )
                )
        }

        // Refer to https://api.highcharts.com.cn/highcharts#plotOptions.spline.marker.states.hover.enabled
        fun disableSplineChartMarkerHoverEffect(): AAChartModel {
            return AAChartModel()
                .chartType(AAChartType.Spline)
                .title("Disable Spline Chart Marker Hover Effect")
                .categories(
                    arrayOf(
                        "一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"
                    )
                )
                .markerRadius(0f) //marker点半径为0个像素
                .yAxisLineWidth(0f)
                .yAxisGridLineWidth(0f)
                .legendEnabled(false)
                .series(
                    arrayOf(
                        AASeriesElement()
                            .name("Tokyo Hot")
                            .lineWidth(5.0f)
                            .color("rgba(220,20,60,1)") //猩红色, alpha 透明度 1
                            .marker(
                                AAMarker()
                                    .states(
                                        AAMarkerStates()
                                            .hover(
                                                AAMarkerHover()
                                                    .enabled(false)
                                            )
                                    )
                            )
                            .data(
                                arrayOf(
                                    7.0,
                                    6.9,
                                    2.5,
                                    14.5,
                                    18.2,
                                    21.5,
                                    5.2,
                                    26.5,
                                    23.3,
                                    45.3,
                                    13.9,
                                    9.6
                                )
                            )
                    )
                )
        }

    }


}
