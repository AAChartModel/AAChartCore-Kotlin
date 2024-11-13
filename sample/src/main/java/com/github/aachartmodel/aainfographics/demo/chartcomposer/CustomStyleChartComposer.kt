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

import android.graphics.PointF.length
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aachartcreator.AAShadow
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.*

object CustomStyleChartComposer  {

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
            AAColor.Red,
            AAColor.Orange,
            AAColor.Yellow,
            AAColor.Green,
            AAColor.Cyan,
            AAColor.Blue,
            AAColor.Purple,
            AAColor.Gray,
            AAColor.DarkGray,
            AAColor.LightGray,
            AAColor.Magenta,
            AAColor.Brown,
            AAColor.Black,
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
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4))
                    .colorByPoint(true)))
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
            AAGradientColor.OceanBlue,
            AAGradientColor.Sanguine,
            AAGradientColor.LusciousLime,
            AAGradientColor.PurpleLake,
            AAGradientColor.FreshPapaya,
            AAGradientColor.Ultramarine,
            AAGradientColor.PinkSugar,
            AAGradientColor.LemonDrizzle,
            AAGradientColor.VictoriaPurple,
            AAGradientColor.SpringGreens,
            AAGradientColor.MysticMauve,
            AAGradientColor.ReflexSilver,
            AAGradientColor.NewLeaf,
            AAGradientColor.CottonCandy,
            AAGradientColor.PixieDust,
            AAGradientColor.FizzyPeach,
            AAGradientColor.SweetDream,
            AAGradientColor.Firebrick,
            AAGradientColor.WroughtIron,
            AAGradientColor.DeepSea,
            AAGradientColor.CoastalBreeze,
            AAGradientColor.EveningDelight,
            AAGradientColor.NeonGlow,
            AAGradientColor.BerrySmoothie
        )

        return AAChartModel()
            .chartType(AAChartType.Bar)
            .title("Colorful Column Chart")
            .subtitle("single data array colorful column chart")
            .categories(gradientColorNamesArr)
            .colorsTheme(gradientColorArr)
            .yAxisTitle("gradient color")
            .stacking(AAChartStackingType.Percent)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(
                        149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4,
                        149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4))
                    .colorByPoint(true)))
    }

    fun configureDiscontinuousDataChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .title("Discontinuous Data Chart")
            .dataLabelsEnabled(true)
            .tooltipEnabled(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(6.9, 9.5, 14.5, 18.2, 21.5, "null", "null", "null", "null", 25.2, 26.5, 23.3, 18.3, 13.9, 9.6))
                    .color(AAGradientColor.DeepSea)))
    }

    fun configureColorfulColumnChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .title("Colorful Column Chart")
            .subtitle("single data array colorful column chart")
            .colorsTheme(arrayOf("#febc0f", "#FF14d4", "#0bf8f5", "#F33c52", "#1904dd"))
            .series(arrayOf(
                AASeriesElement()
                    .name("东京")
                    .data(arrayOf(149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4))
                    .colorByPoint(true)))
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
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .dataLabelsEnabled(true)
            .polar(true)//极地化图形
            .series(arrayOf(
                AASeriesElement()
                    .name("东京")
                    .data(arrayOf(7.0, 6.9, 9.5, 9.6, 13.9, 14.5, 18.3, 18.2, 21.5, 25.2, 26.5, 23.3))))
    }

    fun configureChartWithShadowStyle(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Spline)
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .markerRadius(0)
            .yAxisLineWidth(0)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(9.0)
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                    .shadow(AAShadow()
                        .offsetX(15.0)
                        .offsetY(15.0)
                        .opacity(0.2f)
                        .width(8.0)
                        .color(AAColor.Red))))
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
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .markerRadius(0)
            .yAxisLineWidth(0)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(15.0)
                    .color(linearGradientColor)
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))))
    }


    fun configureColorfulGradientSplineChart(): AAChartModel {
        val stopsArr:Array<Any> = arrayOf(
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
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .markerRadius(0)
            .yAxisLineWidth(0)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(3)
                    .color(linearGradientColor)
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))))
    }


    fun configureGradientColorAreasplineChart(): AAChartModel {
        val stopsArr:Array<Any> = arrayOf(
            arrayOf(0, "rgba(2255,20,147,1)"), //深粉色, alpha 透明度 1
            arrayOf(1, "rgba(255,105,180,0.1)")//热情的粉红, alpha 透明度 0.1
        ) //颜色字符串设置支持十六进制类型和 rgba 类型

        val linearGradientColor = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            stopsArr
        )

        return AAChartModel()
            .chartType(AAChartType.Areaspline)
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .markerRadius(8)//marker点半径为8个像素
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)//marker点为空心效果
            .markerSymbol(AAChartSymbolType.Circle)//marker点为圆形点○
            .yAxisLineWidth(0)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0)
                    .color("rgba(220,20,60,1)")//猩红色, alpha 透明度 1
                    .fillColor(linearGradientColor)
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))))
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
            .marker(AAMarker()
                .radius(10)//曲线连接点半径
                .symbol(AAChartSymbolType.Circle.value)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                .fillColor("#FFFFFF")//点的填充色(用来设置折线连接点的填充色)
                .lineWidth(5)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                .lineColor("#FF0000")//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
            )
            .y(26.5)

        return AAChartModel()
            .chartType(AAChartType.Spline)
            .backgroundColor("#4b2b7f")
            .dataLabelsEnabled(false)//是否显示值
            .tooltipEnabled(true)
            .markerRadius(0)
            .xAxisVisible(false)
            .yAxisVisible(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Virtual Data")
                    .lineWidth(9)
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, singleSpecialData, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                    .color(gradientColorDic1)))
    }

    internal fun configureSpecialStyleColumnOfSingleDataElementChart(): AAChartModel {
        val singleSpecialData = AADataElement()
            .color(AAGradientColor.FreshPapaya)
            .y(49.5)

        return AAChartModel()
            .chartType(AAChartType.Column)
            .dataLabelsEnabled(false)//是否显示值
            .tooltipEnabled(false)
            .markerRadius(0)
            .xAxisVisible(false)
            .yAxisVisible(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Virtual Data")
                    .lineWidth(6)
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, singleSpecialData, 5.2, 26.5, 23.3, 26.5, 13.9, 9.6))
                    .color(AAGradientColor.OceanBlue)
            ))
    }

    internal fun configureAreaChartThreshold(): AAChartModel {
        val gradientColorDic1 = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            "rgba(30, 144, 255,1)", //DodgerBlue, alpha 透明度 1
            "rgba(30, 144, 255,0.1)"//DodgerBlue, alpha 透明度 0.1
        )

        return AAChartModel()
            .chartType(AAChartType.Area)
            .yAxisGridLineWidth(0)
            .categories(arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Spe", "Oct", "Nov", "Dec"))
            .dataLabelsEnabled(false)//是否显示值
            .markerRadius(8)
            .markerSymbol(AAChartSymbolType.Circle)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .threshold(-200)
                    .data(arrayOf(106.4, 129.2, 269.9, -100.5, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4))
                    .lineWidth(6)
                    .color("rgba(30, 144, 255,1)")
                    .fillColor(gradientColorDic1)))
    }

    //refer to online sample https://jshare.com.cn/github/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-symbol/
    internal fun customScatterChartMarkerSymbolContent(): AAChartModel {
        val element1 = AASeriesElement()
            .name("Predefined symbol")
            .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36))
            .marker(AAMarker()
                .symbol(predefinedSymbol1))

        val element2 = AASeriesElement()
            .name("Image symbol")
            .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67))
            .marker(AAMarker()
                .symbol(imageSymbol))

        val element3 = AASeriesElement()
            .name("Base64 symbol (*)")
            .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64))
            .marker(AAMarker()
                .symbol(base64Symbol))

        val element4 = AASeriesElement()
            .name("Custom symbol")
            .data(arrayOf(0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53))
            .marker(AAMarker()
                .symbol(predefinedSymbol2))

        return AAChartModel()
            .chartType(AAChartType.Scatter)
            .yAxisMax(3.5)
            .yAxisGridLineWidth(0)
            .stacking(AAChartStackingType.Normal)
            .markerRadius(8)
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
            .yAxisMax(15.0)
            .yAxisGridLineWidth(0)
            .xAxisVisible(false)
            .markerRadius(0)
            .polar(true)//是否极化图形
            .series(arrayOf(
                AASeriesElement()
                    .data(arrayOf(15.0, 15.0, 15.0)),
                AASeriesElement()
                    .data(arrayOf(9.0, 9.0, 9.0)),
                AASeriesElement()
                    .data(arrayOf(6.0, 6.0, 6.0)),
                AASeriesElement()
                    .data(arrayOf(3.0, 3.0, 3.0))
            ))
    }

    //四边形雷达图
    internal fun configureQuadrangleRadarChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Area)
            .yAxisMax(15.0)
            .yAxisGridLineWidth(0)
            .xAxisVisible(false)
            .markerRadius(0)
            .polar(true)//是否极化图形
            .series(arrayOf(
                AASeriesElement()
                    .data(arrayOf(15.0, 15.0, 15.0, 15.0)),
                AASeriesElement()
                    .data(arrayOf(9.0, 9.0, 9.0, 9.0)),
                AASeriesElement()
                    .data(arrayOf(6.0, 6.0, 6.0, 6.0)),
                AASeriesElement()
                    .data(arrayOf(3.0, 3.0, 3.0, 3.0))
            ))
    }

    //五边形雷达图
    internal fun configurePentagonRadarChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Area)
            .yAxisMax(15.0)
            .yAxisGridLineWidth(0)
            .xAxisVisible(false)
            .markerRadius(0)
            .polar(true)//是否极化图形
            .series(arrayOf(
                AASeriesElement()
                    .data(arrayOf(15.0, 15.0, 15.0, 15.0, 15.0)),
                AASeriesElement()
                    .data(arrayOf(9.0, 9.0, 9.0, 9.0, 9.0)),
                AASeriesElement()
                    .data(arrayOf(6.0, 6.0, 6.0, 6.0, 6.0)),
                AASeriesElement()
                    .data(arrayOf(3.0, 3.0, 3.0, 3.0, 3.0))
            ))
    }

    //六边形雷达图
    internal fun configureHexagonRadarChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Area)
            .yAxisMax(15.0)
            .yAxisGridLineWidth(0)
            .xAxisVisible(false)
            .markerRadius(0)
            .polar(true)//是否极化图形
            .series(arrayOf(
                AASeriesElement()
                    .data(arrayOf(15.0, 15.0, 15.0, 15.0, 15.0, 15.0)),
                AASeriesElement()
                    .data(arrayOf(9.0, 9.0, 9.0, 9.0, 9.0, 9.0)),
                AASeriesElement()
                    .data(arrayOf(6.0, 6.0, 6.0, 6.0, 6.0, 6.0)),
                AASeriesElement()
                    .data(arrayOf(3.0, 3.0, 3.0, 3.0, 3.0, 3.0))
            ))
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
            .markerRadius(6)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .zoomType(AAChartZoomType.XY)
            .categories(categoriesArr)
            .yAxisMin(2.0)
            .yAxisMax(45.4)
            .xAxisTickInterval(2)
            .series(arrayOf(
                AASeriesElement()
                    .name("体重")
                    .color("#2494F3")
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
            ))
    }

    fun customSpecialStyleDataLabelOfSingleDataElementChart(): AAChartModel {
        val redStopsArr = arrayOf(
            arrayOf(0.0, AARgba(255, 0, 0, 0.6f)),
            arrayOf(0.5, AARgba(255, 0, 0, 0.0f)),
            arrayOf(1.0, AARgba(255, 0, 0, 0.0f))
        )
        val gradientColorDic1= AAGradientColor.linearGradient(
            AALinearGradientDirection.ToTop,
            AARgba(255, 215, 0, 0.1f),
            AARgba(255, 215, 0, 0.6f)
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
                    .style(AAStyle()
                        .fontWeight(AAChartFontWeightType.Bold)
                        .color(AAColor.White)
                        .fontSize(16))
                    .y(-35)
                    .align(AAChartAlignType.Center)
                    .verticalAlign(AAChartVerticalAlignType.Top)
                    .overflow("none")
                    .crop(false))
            .y(26.5)

        return AAChartModel()
            .chartType(AAChartType.Areaspline)
            .backgroundColor("#4b2b7f")
            .dataLabelsEnabled(false) //是否显示值
            .tooltipEnabled(true)
            .markerRadius(0)
            .xAxisVisible(false)
            .yAxisVisible(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Virtual Data")
                    .lineWidth(6)
                    .color("rgba(255,215,0,1)")
                    .fillColor(gradientColorDic1) // gold color, alpha: 1.0
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, singleSpecialData, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))))
    }

    fun customBarChartHoverColorAndSelectColor(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Bar)
            .title("Custom Bar Chart select color")
            .yAxisReversed(true)
            .xAxisReversed(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("ElementOne")
                    .data(arrayOf(211, 183, 157, 133, 111, 91, 73, 57, 43, 31, 21, 13, 7, 3))
                    .allowPointSelect(true)
                    .states(AAStates()
                        .hover(AAHover()
                            .color("rgba(220,20,60,1)")) //猩红色, alpha 透明度 1
                        .select(AASelect()
                            .color(AAColor.Red)))))
    }

    fun customChartHoverAndSelectHaloStyle(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Line)
            .title("Custom Chart Hover And Select Halo Style")
            .colorsTheme(arrayOf(AAColor.Red))
            .yAxisReversed(true)
            .xAxisReversed(true)
            .markerRadius(20)
            .series(arrayOf(
                AASeriesElement()
                    .name("ElementOne")
                    .data(arrayOf(211, 183, 157, 133, 111, 91, 73, 57, 43, 31, 21, 13, 7, 3))
                    .allowPointSelect(true)
                    .states(AAStates()
                        .hover(AAHover()
                            .halo(AAHalo()
                                .size(130)
                                .opacity(0.8f)
                                .attributes(
                                    AASVGAttributes()
                                        .strokeWidth(50)
                                        .fill("#00BFFF")
                                        .stroke("#00FA9A")
                                )))
                        .select(AASelect()
                            .halo(AAHalo()
                                .size(130)
                                .opacity(1.0f)
                                .attributes(
                                    AASVGAttributes()
                                        .strokeWidth(150)
                                        .fill(AARgba(138, 43, 226, 1.0f))
                                        .stroke(AARgba(30, 144, 255, 1.0f))
                                ))))))
    }

    fun customSplineChartMarkerStatesHoverStyle(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Areaspline)
            .title("Custom Spline Chart Marker States Hover Style")
            .categories(arrayOf(
                "一月", "二月", "三月", "四月", "五月", "六月",
                "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .markerRadius(8.0) //marker点半径为8个像素
            .yAxisLineWidth(0)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0)
                    .color("rgba(220,20,60,1)") //猩红色, alpha 透明度 1
                    .marker(AAMarker()
                        .states(AAMarkerStates()
                            .hover(AAMarkerHover()
                                .fillColor(AAColor.White)
                                .radius(40)
                                .lineColor(AAColor.Green)
                                .lineWidth(20))))
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))))
    }

    //Issue: https://github.com/AAChartModel/AAChartKit/issues/948
    fun splineChartHoverLineWithNoChangeAndCustomMarkerStatesHoverStyle(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Spline)
            .title("Spline Chart Hover Line Width No Change && Custom Marker States Hover Style")
            .categories(arrayOf(
                "一月", "二月", "三月", "四月", "五月", "六月",
                "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .markerRadius(8.0) //marker点半径为8个像素
            .yAxisLineWidth(0)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0)
                    .color(AAColor.Red)
                    .states(AAStates()
                        .hover(AAHover()
                            .enabled(true)
                            .lineWidthPlus(0))) //手指盘旋或选中图表时,禁止线条变粗
                    .marker(AAMarker()
                        .states(AAMarkerStates()
                            .hover(AAMarkerHover()
                                .fillColor(AAColor.Red) //设置手指选中点的颜色为红色
                                .radius(40))))
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))))
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
        val colorsTheme = arrayOf<Any>(
            "#fe117c",
            "#ffc069",
            "#06caf4",
            "#7dffc0"
        )

        val aaDataLabels = AADataLabels()
            .enabled(true)
            .y(-10)
            .format("{total} mm")
            .color(AAColor.Red)
            .shape("callout")
            .backgroundColor(AAColor.White)
            .borderColor(AAColor.Red)
            .borderRadius(1)
            .borderWidth(1)

        val element1 = AASeriesElement()
            .name("2017")
            .dataLabels(aaDataLabels)
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
            .yAxisGridLineWidth(0)
            .markerRadius(0)
            .categories(categories)
            .colorsTheme(colorsTheme)
            .series(arrayOf(element1, element2, element3, element4))
    }

    //Issue: https://github.com/AAChartModel/AAChartKit-Swift/issues/190
    //API Doc: https://api.highcharts.com/highcharts/plotOptions.pyramid.reversed
    fun upsideDownPyramidChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Pyramid)
            .yAxisTitle("摄氏度")
            .legendEnabled(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
                    .reversed(false)
                    .data(arrayOf(
                        arrayOf("Swift",      15654),
                        arrayOf("Objective-C", 4064),
                        arrayOf("JavaScript",  1987),
                        arrayOf("GO",           976),
                        arrayOf("Python",       846)))))
    }

    //Issue: https://github.com/AAChartModel/AAChartKit/issues/888
    fun doubleLayerPieChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Pie)
            .title("浏览器市场占比历史对比")
            .subtitle("无任何可靠依据的虚拟数据")
            .dataLabelsEnabled(true) //是否直接显示扇形图数据
            .yAxisTitle("摄氏度")
            .series(arrayOf(
                AASeriesElement()
                    .name("Past")
                    .size("40%") //尺寸大小
                    .innerSize("30%") //内部圆环半径大小占比
                    .borderWidth(0) //描边的宽度
                    .allowPointSelect(false) //是否允许在点击数据点标记(扇形图点击选中的块发生位移)
                    .data(arrayOf(
                        arrayOf("Firefox Past", 3336.2),
                        arrayOf("Chrome Past",    26.8),
                        arrayOf("Safari Past",    88.5),
                        arrayOf("Opera Past",     46.0),
                        arrayOf("Others Past",   223.0)
                    )),
                AASeriesElement()
                    .name("Now")
                    .size("80%") //尺寸大小
                    .innerSize("70%") //内部圆环半径大小占比
                    .borderWidth(0) //描边的宽度
                    .allowPointSelect(false) //是否允许在点击数据点标记(扇形图点击选中的块发生位移)
                    .data(arrayOf(
                        arrayOf("Firefox Now", 336.2),
                        arrayOf("Chrome Now", 6926.8),
                        arrayOf("Safari Now",  388.5),
                        arrayOf("Opera Now",   446.0),
                        arrayOf("Others Now",  223.0)
                    ))))
    }

    //GitHub issue https://github.com/AAChartModel/AAChartKit/issues/903
    fun disableSomeOfLinesMouseTrackingEffect(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Line) //图表类型
            .tooltipValueSuffix("万元") //设置浮动提示框单位后缀
            .yAxisTitle("万元") //设置 Y 轴标题
            .categories(arrayOf(
                "一月", "二月", "三月", "四月", "五月", "六月",
                "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .series(arrayOf(
                AASeriesElement()
                    .name("2017")
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)),
                AASeriesElement()
                    .name("2018")
                    .enableMouseTracking(false)
                    .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5)),
                AASeriesElement()
                    .name("2019")
                    .enableMouseTracking(false)
                    .data(arrayOf(0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0)),
                AASeriesElement()
                    .name("2020")
                    .enableMouseTracking(false)
                    .data(arrayOf(3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8))))
    }


    // GitHub issue https://github.com/AAChartModel/AAChartKit/issues/904
    fun configureColorfulShadowSplineChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Spline)
            .yAxisVisible(false)
            .stacking(AAChartStackingType.Normal)
            .colorsTheme(arrayOf("#1e90ff", "#ef476f", "#ffd066", "#04d69f"))
            .markerSymbol(AAChartSymbolType.Circle)
            .markerRadius(8.0)
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("2017")
                    .lineWidth(5)
                    .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36))
                    .shadow(AAShadow()
                        .offsetX(15.0)
                        .offsetY(15.0)
                        .opacity(0.2f)
                        .width(8.0)
                        .color("#1e90ff")),
                AASeriesElement()
                    .name("2018")
                    .lineWidth(5)
                    .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67))
                    .shadow(AAShadow()
                        .offsetX(15.0)
                        .offsetY(15.0)
                        .opacity(0.2f)
                        .width(8.0)
                        .color("#ef476f")),
                AASeriesElement()
                    .name("2019")
                    .lineWidth(5)
                    .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64))
                    .shadow(AAShadow()
                        .offsetX(15.0)
                        .offsetY(15.0)
                        .opacity(0.2f)
                        .width(8.0)
                        .color("#ffd066")),
                AASeriesElement()
                    .name("2020")
                    .lineWidth(5)
                    .data(arrayOf(0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53))
                    .shadow(AAShadow()
                        .offsetX(15.0)
                        .offsetY(15.0)
                        .opacity(0.2f)
                        .width(8.0)
                        .color("#04d69f"))))
    }

    // GitHub issue https://github.com/AAChartModel/AAChartKit/issues/905
    fun configureColorfulDataLabelsStepLineChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Line)
            .yAxisVisible(false)
            .stacking(AAChartStackingType.Normal)
            .colorsTheme(arrayOf("#1e90ff", "#ef476f", "#ffd066", "#04d69f"))
            .markerSymbol(AAChartSymbolType.Circle)
            .markerRadius(8.0)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("2017")
                    .step(true)
                    .dataLabels(AADataLabels()
                        .style(AAStyle()
                            .color("#1e90ff")
                            .fontSize(11)))
                    .data(arrayOf(2.10, 2.54, 2.78, 3.62, 4.41, 4.09, 3.83, 4.47, 4.20, 3.94, 3.80, 3.58, 3.19, 4.30, 3.69, 3.52, 3.02, 3.30)),
                AASeriesElement()
                    .name("2018")
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#ef476f")
                                .fontSize(11)))
                    .data(arrayOf(1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28)),
                AASeriesElement()
                    .name("2019")
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#ffd066")
                                .fontSize(11)))
                    .data(arrayOf(1.16, 1.67, 2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05, 2.18, 3.24)),
                AASeriesElement()
                    .name("2020")
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#04d69f")
                                .fontSize(11)))
                    .data(arrayOf(5.59, 3.09, 4.09, 6.14, 5.33, 6.05, 5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.22, 5.77, 6.19, 5.68, 4.33, 5.48))))
    }


    // GitHub issue https://github.com/AAChartModel/AAChartKit-Swift/issues/223
    fun configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart(): AAChartModel {
        val blueStopsArr: Array<Any> = arrayOf(
            arrayOf(0.0, AARgba(30, 144, 255, 1.0f)),
            arrayOf(0.5, AARgba(30, 144, 255, 0.2f)),
            arrayOf(1.0, AARgba(30, 144, 255, 0.0f))
        )
        val gradientBlueColorDic = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            blueStopsArr
        )

        val redStopsArr: Array<Any> = arrayOf(
            arrayOf(0.0, AARgba(255, 0, 0, 1.0f)),
            arrayOf(0.5, AARgba(255, 0, 0, 0.2f)),
            arrayOf(1.0, AARgba(255, 0, 0, 0.0f))
        )
        val gradientRedColorDic = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            redStopsArr
        )

        val goldStopsArr: Array<Any> = arrayOf(
            arrayOf(0.0, AARgba(255, 215, 0, 1.0f)),
            arrayOf(0.5, AARgba(255, 215, 0, 0.2f)),
            arrayOf(1.0, AARgba(255, 215, 0, 0.0f))
        )
        val gradientGoldColorDic = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            goldStopsArr
        )

        val greenStopsArr: Array<Any> = arrayOf(
            arrayOf(0.0, AARgba(50, 205, 50, 1.0f)),
            arrayOf(0.5, AARgba(50, 205, 50, 0.2f)),
            arrayOf(1.0, AARgba(50, 205, 50, 0.0f))
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
            .markerRadius(5)
            .dataLabelsEnabled(false)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("2017")
                    .fillColor(gradientBlueColorDic)
                    .lineWidth(6)
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#1e90ff")
                                .fontSize(11)))
                    .data(arrayOf(2.10, 2.54, 2.78, 3.62, 4.41, 4.09, 3.83, 4.47, 4.20, 3.94, 3.80, 3.58, 3.19, 4.30, 3.69, 3.52, 3.02, 3.30)),

                AASeriesElement()
                    .name("2018")
                    .fillColor(gradientRedColorDic)
                    .lineWidth(6)
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#ef476f")
                                .fontSize(11)))
                    .data(arrayOf(1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28)),

                AASeriesElement()
                    .name("2019")
                    .fillColor(gradientGoldColorDic)
                    .lineWidth(6)
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#ffd066")
                                .fontSize(11)))
                    .data(arrayOf(1.16, 1.67, 2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05, 2.18, 3.24)),

                AASeriesElement()
                    .name("2020")
                    .fillColor(gradientGreenColorDic)
                    .lineWidth(6)
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#04d69f")
                                .fontSize(11)))
                    .data(arrayOf(5.59, 3.09, 4.09, 6.14, 5.33, 6.05, 5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.22, 5.77, 6.19, 5.68, 4.33, 5.48))))
    }

    // Refer to https://api.highcharts.com.cn/highcharts#plotOptions.spline.marker.states.hover.enabled
    fun disableSplineChartMarkerHoverEffect(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Spline)
            .title("Disable Spline Chart Marker Hover Effect")
            .categories(arrayOf(
                "一月", "二月", "三月", "四月", "五月", "六月",
                "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .markerRadius(0) //marker点半径为0个像素
            .yAxisLineWidth(0)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0)
                    .color("rgba(220,20,60,1)") //猩红色, alpha 透明度 1
                    .marker(AAMarker()
                        .states(AAMarkerStates()
                            .hover(AAMarkerHover()
                                .enabled(false))))
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
            ))
    }


    //https://github.com/AAChartModel/AAChartKit/issues/1203
    fun configureMaxAndMinDataLabelsForChart(): AAChartModel {
        val aaDataLabels = AADataLabels()
            .enabled(true)
            .format("{y} 美元")
            .shape("callout")
            .style(AAStyle.style(AAColor.Red, 15f, AAChartFontWeightType.Bold))
            .backgroundColor(AAColor.White) // white color
            .borderColor(AAColor.Red) // red color
            .borderRadius(1.5)
            .borderWidth(1.3)

        val minData = AADataElement()
            .dataLabels(aaDataLabels)
            .y(2.5)

        val maxData = AADataElement()
            .dataLabels(aaDataLabels)
            .y(49.5)

        return AAChartModel()
            .chartType(AAChartType.Spline)
            .dataLabelsEnabled(false) //是否显示值
            .tooltipEnabled(false)
            .markerRadius(0)
            .xAxisVisible(false)
            .yAxisVisible(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Show The Max and Min values Data Labels")
                    .lineWidth(7)
                    .data(arrayOf(7.0, 6.9, minData, 14.5, 18.2, maxData, 5.2, 26.5, 23.3, 26.5, 13.9, 9.6))
                    .color(AAGradientColor.OceanBlue)
            ))
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1201
    fun customVerticalXAxisCategoriesLabelsByHTMLBreakLineTag(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Area)
            .categories(arrayOf(
                "孤<br>岛<br>危<br>机",
                "使<br>命<br>召<br>唤",
                "荣<br>誉<br>勋<br>章",
                "狙<br>击<br>精<br>英",
                "神<br>秘<br>海<br>域",
                "最<br>后<br>生<br>还<br>者",
                "巫<br>师<br>3<br>狂<br>猎",
                "对<br>马<br>之<br>魂",
                "蝙<br>蝠<br>侠<br>阿<br>甘<br>骑<br>士<br>",
                "地<br>狱<br>边<br>境",
                "闪<br>客",
                "忍<br>者<br>之<br>印"
            ))
            .tooltipEnabled(false)
            .borderRadius(3)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)),
                AASeriesElement()
                    .name("NewYork")
                    .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5)),
                AASeriesElement()
                    .name("London")
                    .data(arrayOf(0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0)),
                AASeriesElement()
                    .name("Berlin")
                    .data(arrayOf(3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8))
            ))
    }


    //https://github.com/AAChartModel/AAChartKit/issues/1269
    fun noMoreGroupingAndOverlapEachOtherColumnChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .categories(arrayOf("11/23", "11/24", "11/25", "11/26", "11/27", "11/28", "11/29"))
            //            .yAxisTickPositions([0, 10, 20, 30, 40, 50])
            .yAxisMax(50)
            .yAxisMin(0)
            .borderRadius(5)
            .series(arrayOf(
                AAColumn()
                    .name("总做题")
                    .color("#D8D8D8")
                    .data(arrayOf(30, 20, 28, 40, 42, 48, 50))
                    .grouping(false),
                AAColumn()
                    .name("正确做题")
                    .color("#00D9CD")
                    .data(arrayOf(28, 18, 26, 40, 40, 46, 39))
            ))
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1271
    fun noMoreGroupingAndNestedColumnChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .categories(arrayOf("11/23", "11/24", "11/25", "11/26", "11/27", "11/28", "11/29"))
            //            .yAxisTickPositions([0, 10, 20, 30, 40, 50])
            .yAxisMax(50)
            .yAxisMin(0)
            .borderRadius(5)
            .series(arrayOf(
                AAColumn()
                    .name("总目标")
                    .color("DeepSkyBlue")
                    .data(arrayOf(30, 20, 28, 40, 42, 48, 50))
                    .grouping(false)
                    .pointPadding(0.05f),
                AAColumn()
                    .name("完成度")
                    .color("#FF3030") //Firebrick1 color
                    .data(arrayOf(28, 18, 26, 40, 40, 46, 39))
                    .grouping(false)
                    .pointPadding(0.2f)
            ))
    }

    //https://github.com/AAChartModel/AAChartKit/issues/842
    fun topRoundedCornersStackingColumnChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .stacking(AAChartStackingType.Normal)
            .title("Top Rounded Corners Stacking Column Chart")
            .colorsTheme(arrayOf("#fe117c", "#ffc069", "#06caf4"))
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .borderRadiusTopLeft("50%")
                    .borderRadiusTopRight("50%")
                    .data(arrayOf(2.10, 2.54, 2.78, 3.62, 4.41, 4.09, 3.83, 4.47, 4.20, 3.94, 3.80, 3.58, 3.19, 4.30, 3.69, 3.52, 3.02, 3.3)),
                AASeriesElement()
                    .name("Berlin Hot")
                    .data(arrayOf(1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28)),
                AASeriesElement()
                    .name("Beijing Hot")
                    .data(arrayOf(1.16, 1.67, 2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05, 2.18, 3.24))
            ))
    }

    //https://github.com/AAChartModel/AAChartKit-Swift/issues/323
    //https://github.com/AAChartModel/AAChartKit-Swift/issues/346
    //https://github.com/highcharts/rounded-corners
    fun freeStyleRoundedCornersStackingColumnChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .stacking(AAChartStackingType.Normal)
            .title("Free-Style Rounded Corners Stacking Column Chart")
            .colorsTheme(arrayOf(
                AAGradientColor.linearGradient(AARgb(128, 255, 165), AARgb(1  , 191, 236)),
                AAGradientColor.linearGradient(AARgb(0  , 221, 255), AARgb(77 , 119, 255)),
                AAGradientColor.linearGradient(AARgb(55 , 162, 255), AARgb(116, 21 , 219)),
                AAGradientColor.linearGradient(AARgb(255, 0  , 135), AARgb(135, 0  , 157)),
                AAGradientColor.linearGradient(AARgb(255, 191, 0  ), AARgb(224, 62 , 76 ))
            ))
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .borderRadiusTopLeft("50%")
                    .borderRadiusTopRight("50%")
                    .data(arrayOf(2.10, 2.54, 2.78, 3.62, 4.41, 4.09, 3.83, 4.47, 4.20, 3.94, 3.80, 3.58, 3.19, 4.30, 3.69, 3.52, 3.02, 3.30)),
                AASeriesElement()
                    .name("Berlin Hot")
                    .borderRadiusBottomLeft("50%")
                    .borderRadiusBottomRight("50%")
                    .data(arrayOf(1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28)),
                AASeriesElement()
                    .name("Beijing Hot")
                    .borderRadiusTopLeft("50%")
                    .borderRadiusBottomRight("50%")
                    .data(arrayOf(1.16, 1.67, 2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05, 2.18, 3.24)),
                AASeriesElement()
                    .name("London Hot")
                    .borderRadiusTopRight("50%")
                    .borderRadiusBottomRight("50%")
                    .data(arrayOf(5.59, 3.09, 4.09, 6.14, 5.33, 6.05, 5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.22, 5.77, 6.19, 5.68, 4.33, 5.48)),
                AASeriesElement()
                    .name("NewYork Hot")
                    .borderRadius(20)
                    .data(arrayOf(2.10, 2.54, 2.78, 3.62, 4.41, 4.09, 3.83, 4.47, 4.20, 3.94, 3.80, 3.58, 3.19, 4.30, 3.69, 3.52, 3.02, 3.30))
            ))
    }

    //https://github.com/AAChartModel/AAChartKit-Swift/issues/365
    fun customColumnChartBorderStyleAndStatesHoverColor(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .stacking(AAChartStackingType.Normal)
            .colorsTheme(arrayOf(AAColor.DarkGray, AAColor.LightGray)) //Colors theme
            .categories(arrayOf(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
            ))
            .series(arrayOf(
                AASeriesElement()
                    .name("Berlin Hot")
                    .borderColor(AAColor.White)
                    .borderWidth(3)
                    .borderRadius(10)
                    .states(AAStates()
                        .hover(AAHover()
                            .color(AAColor.Red)))
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)),
                AASeriesElement()
                    .name("Beijing Hot")
                    .borderColor(AAColor.White)
                    .borderWidth(3)
                    .borderRadius(10)
                    .states(AAStates()
                        .hover(AAHover()
                            .color("dodgerblue"))) // Dodgerblue／道奇藍／#1e90ff十六进制颜色代码
                    .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5))
            ))
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1291
    fun customLineChartWithColorfulMarkersAndLines(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Line)
            .title("Custom Line Chart With Colorful Markers And Lines")
            .markerRadius(18.0) //marker点半径为8个像素
            .yAxisLineWidth(0)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0)
                    .marker(AAMarker()
                        .states(AAMarkerStates()
                            .hover(AAMarkerHover()
                                .radius(40)
                                .lineWidth(5))))
                    .data(arrayOf(
                        2, 4, 8, 16, 32, 64, 128,
                        AADataElement()
                            .y(256.0)
                            .color(AAColor.Red)))
                    .zoneAxis("x")
                    .zones(arrayOf(
                        AAZonesElement()
                            .value(1)
                            .color(AAColor.Red),
                        AAZonesElement()
                            .value(2)
                            .color(AAColor.Orange),
                        AAZonesElement()
                            .value(3)
                            .color(AAColor.Yellow),
                        AAZonesElement()
                            .value(4)
                            .color(AAColor.Green),
                        AAZonesElement()
                            .value(5)
                            .color(AAColor.Cyan),
                        AAZonesElement()
                            .value(6)
                            .color(AAColor.Blue),
                        AAZonesElement()
                            .value(7)
                            .color(AAColor.Purple)
                    ))
            ))
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1291
    //https://github.com/AAChartModel/AAChartKit/issues/1293
    fun customLineChartWithColorfulMarkersAndLines2(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Line)
            .title("Custom Line Chart With Colorful Markers And Lines")
            .markerRadius(25.0) //marker点半径为8个像素
            .markerSymbol(AAChartSymbolType.Circle)
            .yAxisLineWidth(0)
            .yAxisGridLineWidth(0)
            .legendEnabled(true)
            .stacking(AAChartStackingType.Normal)
            .series(arrayOf(
                AASeriesElement()
                    .name(AAColor.Blue)
                    .lineWidth(20.0)
                    .data(arrayOf(
                        2048, 1024, 1024, 1024, 1024,
                        AADataElement()
                            .y(2048f)
                            .color(AARgba(30, 144, 255, 1.0f))))
                    .zoneAxis("x")
                    .zones(arrayOf(
                        AAZonesElement()
                            .value(1)
                            .color(AARgba(30, 144, 255, 1.0f)),
                        AAZonesElement()
                            .value(2)
                            .color(AARgba(30, 144, 255, 0.8f)),
                        AAZonesElement()
                            .value(3)
                            .color(AARgba(30, 144, 255, 0.6f)),
                        AAZonesElement()
                            .value(4)
                            .color(AARgba(30, 144, 255, 0.4f)),
                        AAZonesElement()
                            .value(5)
                            .color(AARgba(30, 144, 255, 0.2f)))),
                AASeriesElement()
                    .name(AAColor.Red)
                    .lineWidth(20.0)
                    .data(arrayOf(
                        2048, 1024, 1024, 1024, 1024,
                        AADataElement()
                            .y(2048)
                            .color(AARgba(255, 0, 0, 1.0f))))
                    .zoneAxis("x")
                    .zones(arrayOf(
                        AAZonesElement()
                            .value(1)
                            .color(AARgba(255, 0, 0, 1.0f)),
                        AAZonesElement()
                            .value(2)
                            .color(AARgba(255, 0, 0, 0.8f)),
                        AAZonesElement()
                            .value(3)
                            .color(AARgba(255, 0, 0, 0.6f)),
                        AAZonesElement()
                            .value(4)
                            .color(AARgba(255, 0, 0, 0.4f)),
                        AAZonesElement()
                            .value(5)
                            .color(AARgba(255, 0, 0, 0.2f)))),
                AASeriesElement()
                    .name(AAColor.Yellow)
                    .lineWidth(20.0)
                    .data(arrayOf(
                        2048, 1024, 1024, 1024, 1024,
                        AADataElement()
                            .y(2048)
                            .color(AARgba(255, 215, 0, 1.0f))))
                    .zoneAxis("x")
                    .zones(arrayOf(
                        AAZonesElement()
                            .value(1)
                            .color(AARgba(255, 215, 0, 1.0f)),
                        AAZonesElement()
                            .value(2)
                            .color(AARgba(255, 215, 0, 0.8f)),
                        AAZonesElement()
                            .value(3)
                            .color(AARgba(255, 215, 0, 0.6f)),
                        AAZonesElement()
                            .value(4)
                            .color(AARgba(255, 215, 0, 0.4f)),
                        AAZonesElement()
                            .value(5)
                            .color(AARgba(255, 215, 0, 0.2f)))),
                AASeriesElement()
                    .name(AAColor.Green)
                    .lineWidth(20.0)
                    .data(arrayOf(
                        2048, 1024, 1024, 1024, 1024,
                        AADataElement()
                            .y(2048)
                            .color(AARgba(50, 205, 50, 1.0f))))
                    .zoneAxis("x")
                    .zones(arrayOf(
                        AAZonesElement()
                            .value(1)
                            .color(AARgba(50, 205, 50, 1.0f)),
                        AAZonesElement()
                            .value(2)
                            .color(AARgba(50, 205, 50, 0.8f)),
                        AAZonesElement()
                            .value(3)
                            .color(AARgba(50, 205, 50, 0.6f)),
                        AAZonesElement()
                            .value(4)
                            .color(AARgba(50, 205, 50, 0.4f)),
                        AAZonesElement()
                            .value(5)
                            .color(AARgba(50, 205, 50, 0.2f)))),
                AASeriesElement()
                    .name(AAColor.Purple)
                    .lineWidth(20.0)
                    .data(arrayOf(
                        2048, 1024, 1024, 1024, 1024,
                        AADataElement()
                            .y(2048)
                            .color(AARgba(138, 43, 226, 1.0f))))
                    .zoneAxis("x")
                    .zones(arrayOf(
                        AAZonesElement()
                            .value(1)
                            .color(AARgba(138, 43, 226, 1.0f)),
                        AAZonesElement()
                            .value(2)
                            .color(AARgba(138, 43, 226, 0.8f)),
                        AAZonesElement()
                            .value(3)
                            .color(AARgba(138, 43, 226, 0.6f)),
                        AAZonesElement()
                            .value(4)
                            .color(AARgba(138, 43, 226, 0.4f)),
                        AAZonesElement()
                            .value(5)
                            .color(AARgba(138, 43, 226, 0.2f))))
            ))
    }


    //https://github.com/AAChartModel/AAChartKit/issues/1294
    fun drawLineChartWithPointsCoordinates(): AAChartModel {
        val dataArr = arrayOf<Any>(
            arrayOf(0, 200),
            arrayOf(0, 300),
            arrayOf(0, 400),
            arrayOf(1, 100),
            arrayOf(2, 120),
            arrayOf(3, 130)
        )
        return AAChartModel()
            .chartType(AAChartType.Scatter)
            .title("Draw Line Chart With Points Coordinates")
            .markerSymbol(AAChartSymbolType.Circle)
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)
            .markerRadius(8)
            .colorsTheme(arrayOf(AAColor.Red))
            .series(arrayOf(
                AASeriesElement()
                    .type(AAChartType.Line)
                    .enableMouseTracking(false)
                    .showInLegend(false)
                    .marker(AAMarker()
                        .enabled(false))
                    .states(AAStates()
                        .inactive(AAInactive()
                            .enabled(false)))
                    .data(dataArr),
                AASeriesElement()
                    .name("Red Dot")
                    .type(AAChartType.Scatter)
                    .data(dataArr)
            ))
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1351
    fun configureSpecialStyleColumnForNegativeDataMixedPositiveData(): AAChartModel {
        val categoriesArr = arrayOf(
            "立春", "雨水", "惊蛰", "春分", "清明", "谷雨", "立夏", "小满", "芒种", "夏至", "小暑", "大暑",
            "立秋", "处暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至", "小寒", "大寒"
        )
        val dataArr = arrayOf(
            -70, -69, -25, -145, -182, -215, -52, -265, -233, -453, -139, -96,
            +70, +69, +25, +145, +182, +215, +52, +265, +233, +453, +139, +96
        )
        val newDataArr = ArrayList<AADataElement>()
        for (dataElementValue in dataArr) {
            val aaDataLabels = AADataLabels()
                .enabled(true)
                .verticalAlign(AAChartVerticalAlignType.Middle)
                .x(0)
                .y(-10)
            if (dataElementValue < 0) {
                val negativeDataElement = AADataElement()
                    .y(-dataElementValue.toFloat())
                    .color(AAColor.Green)
                    .dataLabels(
                        aaDataLabels
                            .format("-{y} 美元")
                            .style(AAStyle.style(AAColor.Green, 11f, AAChartFontWeightType.Thin))
                    )
                newDataArr.add(negativeDataElement)
            } else {
                val positiveDataElement = AADataElement()
                    .y(dataElementValue.toFloat())
                    .color(AAColor.Red)
                    .dataLabels(
                        aaDataLabels
                            .format("+{y} 美元")
                            .style(AAStyle.style(AAColor.Red, 11f, AAChartFontWeightType.Thin))
                    )
                newDataArr.add(positiveDataElement)
            }
        }
        return AAChartModel()
            .chartType(AAChartType.Column)
            .categories(categoriesArr)
            .tooltipEnabled(false)
            .yAxisVisible(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("虚构数据")
                    .data(newDataArr.toTypedArray())))
    }


    //https://github.com/AAChartModel/AAChartKit-Swift/issues/389
    fun configureMultiLevelStopsArrGradientColorAreasplineMixedLineChart(): AAChartModel {
        val randomNumArrA = java.util.ArrayList<Any>()
        val randomNumArrB = java.util.ArrayList<Any>()
        var y1: Double
        var y2: Double
        val Q = (Math.random() * 50).toInt()
        val range = 129
        for (x in 0 until range) {
            y1 = Math.sin(Q * (x * Math.PI / 180)) + x * 2.0 * 0.01
            y2 = Math.cos(Q * (x * Math.PI / 180)) + x * 3.0 * 0.01
            randomNumArrA.add(y1)
            randomNumArrB.add(y2)
        }
        val redStopsArr: Array<Any> = arrayOf(
            arrayOf(0.0, AARgba(255, 0, 0, 1.0f)),
            arrayOf(0.2, AARgba(255, 0, 0, 0.2f)),
            arrayOf(0.4, AARgba(255, 0, 0, 0.1f)),
            arrayOf(0.6, AARgba(255, 0, 0, 0.05f)),
            arrayOf(0.8, AARgba(255, 0, 0, 0.01f)),
            arrayOf(1.0, AAColor.Clear)
        )
        val gradientRedColorDic: Map<String, Any> = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            redStopsArr
        )
        return AAChartModel()
            .chartType(AAChartType.Areaspline)
            .stacking(AAChartStackingType.Normal)
            .backgroundColor(AAColor.Black)
            .colorsTheme(arrayOf("#1e90ff", "#04d69f", "#ef476f", "#ffd066"))
            .dataLabelsEnabled(false)
            .markerSymbol(AAChartSymbolType.Circle)
            .markerRadius(5)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .yAxisGridLineWidth(0.5f)
            .xAxisGridLineWidth(0.5f)
            .series(arrayOf(
                AASeriesElement()
                    .name("2017")
                    .type(AAChartType.Spline)
                    .lineWidth(6f)
                    .data(randomNumArrA.toTypedArray()),
                AASeriesElement()
                    .name("2018")
                    .type(AAChartType.Spline)
                    .lineWidth(6f)
                    .data(randomNumArrB.toTypedArray()),
                AASeriesElement()
                    .name("2020")
                    .fillColor(gradientRedColorDic)
                    .lineWidth(6f)
                    .threshold(-4f)
                    .data(randomNumArrA.toTypedArray())
            ))
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1401
    fun connectNullsForSingleAASeriesElement(): AAChartModel {
        val dataArr = arrayOf<Any>(
            0.45, "null", "null",
            0.55, 0.58, 0.62, "null", "null",
            0.56, 0.67, 0.50, 0.34, 0.50, "null", "null", "null", "null",
            0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36, "null", "null", "null", "null", "null", "null", "null", "null",
            0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53,
        )

        return AAChartModel()
            .chartType(AAChartType.Spline)
            .subtitle("虚拟数据")
            .colorsTheme(arrayOf("#1e90ff", "#ef476f", "#ffd066", "#04d69f"))
            .yAxisTitle("摄氏度")
            .dataLabelsEnabled(false)
            .yAxisGridLineWidth(0f)
            .stacking(AAChartStackingType.Normal)
            .markerRadius(8f)
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("Do NOT Connect Nulls")
                    .lineWidth(5f)
                    .connectNulls(false)
                    .data(dataArr),
                AASeriesElement()
                    .name("Connect Nulls")
                    .lineWidth(5f)
                    .connectNulls(true)
                    .data(dataArr),
                AASeriesElement()
                    .name("Do NOT Connect Nulls")
                    .lineWidth(5f)
                    .connectNulls(false)
                    .data(dataArr),
                AASeriesElement()
                    .name("Connect Nulls")
                    .lineWidth(5f)
                    .connectNulls(true)
                    .data(dataArr)
            ))
    }


//    - (NSArray *)generateRandomNumberArrayWithLength:(NSUInteger)length
//    randomRange:(NSUInteger)randomRange
//    minNum:(NSUInteger)minNum {
//        NSMutableArray *randomNumArrA = [NSMutableArray array];
//        for (NSUInteger x = 0; x < length; x++) {
//            NSUInteger randomNum = arc4random() % randomRange + minNum;
//            [randomNumArrA addObject:@(randomNum)];
//        }
//        return randomNumArrA;
//    }
//
//
//    - (NSArray *)generateRandomNumberMixedNullArrayWithLength:(NSUInteger)length
//    randomRange:(NSUInteger)randomRange
//    minNum:(NSUInteger)minNum {
//        NSMutableArray *randomNumArrA = [NSMutableArray array];
//        for (NSUInteger x = 0; x < length; x++) {
//            if ((100 < x && x < 150) || (300 < x && x < 350)) {
//                NSUInteger randomNum = arc4random() % randomRange + minNum;
//                [randomNumArrA addObject:@(randomNum)];
//            } else {
//                [randomNumArrA addObject:NSNull.null];
//            }
//        }
//        return randomNumArrA;
//    }
//
////https://github.com/AAChartModel/AAChartKit/issues/1419
//    - (AAChartModel *)lineChartsWithLargeDifferencesInTheNumberOfDataInDifferentSeriesElement {
//        return AAChartModel.new
//            .chartTypeSet(AAChartTypeLine)
//            .backgroundColorSet(AAColor.blackColor)
//            .colorsThemeSet(@[@"#1e90ff",@"#04d69f",@"#ef476f",@"#ffd066",])
//        .dataLabelsEnabledSet(false)
//            .markerRadiusSet(@0)
//            .seriesSet(@[
//            AASeriesElement.new
//            .nameSet(@"2017")
//            .lineWidthSet(@6)
//                .dataSet([self generateRandomNumberMixedNullArrayWithLength:3550 randomRange:5 minNum:100]),
//        AASeriesElement.new
//            .nameSet(@"2018")
//            .lineWidthSet(@6)
//            .dataSet([self generateRandomNumberArrayWithLength:3550 randomRange:100 minNum:200]),
//        AASeriesElement.new
//            .nameSet(@"2019")
//            .lineWidthSet(@6)
//            .dataSet([self generateRandomNumberArrayWithLength:3550 randomRange:150 minNum:400]),
//        AASeriesElement.new
//            .nameSet(@"2020")
//            .lineWidthSet(@6)
//            .dataSet([self generateRandomNumberArrayWithLength:3550 randomRange:150 minNum:600]),
//        ]);
//    }

//kotlin



////https://github.com/AAChartModel/AAChartKit/issues/1419
fun lineChartsWithLargeDifferencesInTheNumberOfDataInDifferentSeriesElement(): AAChartModel {
    fun generateRandomNumberArrayWithLength(length: Int, randomRange: Int, minNum: Int): Array<Any> {
        val randomNumArrA = mutableListOf<Int>()
        for (x in 0 until length) {
            val randomNum = (Math.random() * randomRange + minNum).toInt()
            randomNumArrA.add(randomNum)
        }
        return randomNumArrA.toTypedArray()
    }

    fun generateRandomNumberMixedNullArrayWithLength(length: Int, randomRange: Int, minNum: Int): Array<Any> {
        val randomNumArrA = mutableListOf<Any>()
        for (x in 0 until length) {
            if ((100 < x && x < 150) || (300 < x && x < 350)) {
                val randomNum = (Math.random() * randomRange + minNum).toInt()
                randomNumArrA.add(randomNum)
            } else {
                randomNumArrA.add("null")
            }
        }
        return randomNumArrA.toTypedArray()
    }

    val randomNumArrA = generateRandomNumberMixedNullArrayWithLength(3550, 5, 100)
    val randomNumArrB = generateRandomNumberArrayWithLength(3550, 100, 200)
    val randomNumArrC = generateRandomNumberArrayWithLength(3550, 150, 400)
    val randomNumArrD = generateRandomNumberArrayWithLength(3550, 150, 600)

    return AAChartModel()
        .chartType(AAChartType.Line)
        .backgroundColor("#000000")
        .colorsTheme(arrayOf("#1e90ff", "#04d69f", "#ef476f", "#ffd066"))
        .dataLabelsEnabled(false)
        .markerRadius(0f)
        .series(arrayOf(
                AASeriesElement()
                    .name("2017")
                    .lineWidth(6f)
                    .data(randomNumArrA),
                AASeriesElement()
                    .name("2018")
                    .lineWidth(6f)
                    .data(randomNumArrB),
                AASeriesElement()
                    .name("2019")
                    .lineWidth(6f)
                    .data(randomNumArrC),
                AASeriesElement()
                    .name("2020")
                    .lineWidth(6f)
                    .data(randomNumArrD)
            ))

}

//
//https://github.com/AAChartModel/AAChartCore-Kotlin/issues/149
//    - (AAChartModel *)customAreasplineChartWithColorfulGradientColorZones {
//        NSArray *redStopsArr = @[
//        @[@0.0, AARgbaColor(255, 0, 0, 1.0)],//颜色字符串设置支持十六进制类型和 rgba 类型
//        @[@1.0, AAColor.clearColor]
//        ];
//
//        NSArray *greenStopsArr = @[
//        @[@0.0, AARgbaColor(0, 255, 0, 1.0)],//颜色字符串设置支持十六进制类型和 rgba 类型
//        @[@1.0, AAColor.clearColor]
//        ];
//
//        NSArray *blueStopsArr = @[
//        @[@0.0, AARgbaColor(0, 0, 255, 1.0)],//颜色字符串设置支持十六进制类型和 rgba 类型
//        @[@1.0, AAColor.clearColor]
//        ];
//
//        NSDictionary *redGradientColorDic = [AAGradientColor gradientColorWithDirection:AALinearGradientDirectionToBottom stopsArray:redStopsArr];
//        NSDictionary *greenGradientColorDic = [AAGradientColor gradientColorWithDirection:AALinearGradientDirectionToBottom stopsArray:greenStopsArr];
//        NSDictionary *blueGradientColorDic = [AAGradientColor gradientColorWithDirection:AALinearGradientDirectionToBottom stopsArray:blueStopsArr];
//
//        AADataElement *singleSpecialData = AADataElement.new
//            .markerSet(AAMarker.new
//                .radiusSet(@8)//曲线连接点半径
//                .symbolSet(AAChartSymbolTypeCircle)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
//                .fillColorSet(AAColor.whiteColor)//点的填充色(用来设置折线连接点的填充色)
//                .lineWidthSet(@5)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
//                //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
//                .lineColorSet(@"#1E90FF")//道奇蓝
//            )
//            .dataLabelsSet(AADataLabels.new
//                .enabledSet(true)
//                .allowOverlapSet(true)
//                .useHTMLSet(true)
//                .backgroundColorSet(AARgbaColor(65, 111, 166, 1.0))
//                .borderRadiusSet(@10)
//                .shapeSet(@"callout")
//                .formatSet(@"{point.category}<br>{series.name}: {point.y} %")
//                .styleSet(AAStyleColorSizeWeight(AAColor.whiteColor, 12, AAChartFontWeightTypeBold))
//                .xSet(@-80).ySet(@(5))
//                .alignSet(AAChartAlignTypeCenter)
//                .verticalAlignSet(AAChartVerticalAlignTypeTop)
//                .overflowSet(@"none")
//                .cropSet(false)
//            )
//            .ySet(@85.3);
//
//        AAStyle *axisLabelsStyle = AAStyleColorSizeWeight(AAColor.whiteColor, 12, AAChartFontWeightTypeBold);
//
//        return AAChartModel.new
//            .chartTypeSet(AAChartTypeAreaspline)
//            .backgroundColorSet(AAColor.blackColor)
//            .categoriesSet(@[
//            @"Jan", @"Feb", @"Mar", @"Apr", @"May", @"Jun",
//                @"Jul", @"Aug", @"Sep", @"Oct", @"Nov", @"Dec"
//        ])
//        .dataLabelsEnabledSet(false)
//            .legendEnabledSet(false)
//            .markerRadiusSet(@0)
//            .xAxisLabelsStyleSet(axisLabelsStyle)
//            .yAxisLabelsStyleSet(axisLabelsStyle)
//            .xAxisGridLineStyleSet([AALineStyle styleWithColor:AAColor.whiteColor dashStyle:AAChartLineDashStyleTypeLongDashDotDot width:@0.5])
//        .yAxisGridLineStyleSet([AALineStyle styleWithWidth:@0])
//        .seriesSet(@[
//        AASeriesElement.new
//        .nameSet(@"空气湿度")
//        .lineWidthSet(@6)
//            .zoneAxisSet(@"x")
//            .zonesSet(@[
//            AAZonesElement.new
//            .valueSet(@2)
//            .colorSet(AAColor.redColor)
//                .fillColorSet((id)redGradientColorDic ),
//                AAZonesElement.new
//                    .valueSet(@5)
//                    .colorSet(AAColor.greenColor)
//                    .fillColorSet((id)greenGradientColorDic),
//                AAZonesElement.new
//                    .colorSet(AAColor.blueColor)
//                    .fillColorSet((id)blueGradientColorDic),
//        ])
//        .dataSet(@[@56.5, @33.3, @85.3, @23.9, @29.6, @34.5, @28.2, @26.5, @15.2, @56.5, @33.3, singleSpecialData]),
//        ]);
//    }


    //https://github.com/AAChartModel/AAChartCore-Kotlin/issues/149
    fun customAreasplineChartWithColorfulGradientColorZones() :AAChartModel {
        val redStopsArr: Array<Any> = arrayOf(
            arrayOf(0.0, "#FF0000"),//颜色字符串设置支持十六进制类型和 rgba 类型
            arrayOf(1.0, AAColor.Clear)
        )

        val greenStopsArr: Array<Any> = arrayOf(
            arrayOf(0.0, "#00FF00"),//颜色字符串设置支持十六进制类型和 rgba 类型
            arrayOf(1.0, AAColor.Clear)
        )

        val blueStopsArr: Array<Any> = arrayOf(
            arrayOf(0.0, "#0000FF"),//颜色字符串设置支持十六进制类型和 rgba 类型
            arrayOf(1.0, AAColor.Clear)
        )

        val redGradientColorDic = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            redStopsArr
        )

        val greenGradientColorDic = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            greenStopsArr
        )

        val blueGradientColorDic = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            blueStopsArr
        )

        val singleSpecialData = AADataElement()
            .marker(AAMarker()
                .radius(10f)//曲线连接点半径，默认是4
                .symbol(AAChartSymbolType.Circle.value)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                .fillColor(AAColor.White)//点的填充色(用来设置折线连接点的填充色)
                .lineWidth(5f)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                //外沿线的颜色(用来设置折线连接点的轮廓描边的颜色, 当值为空字符串时，默认取数据点或数据列的颜色)
                .lineColor("#1E90FF")//道奇蓝
            )
//            .dataLabels(AADataLabels()
//                .enabled(true)
//                .useHTML(true)
//                .style(AAStyle()
//                    .color("#1E90FF")//字体颜色
//                    .fontSize(12f)//字体大小
//                    .fontWeight(AAChartFontWeightType.Bold)//字体为加粗体
//
//                )
////                .format("<div style=\"text-align:center; color:#1E90FF; font-size:12px; font-weight: bold\">{y}</div>")
//                .y(85.3f)
//                .align(AAChartAlignType.Center)
//                .verticalAlign(AAChartVerticalAlignType.Top)
//                .overflow("none")
//                .crop(false)
//            )
            .y(85.3f)

               val axisLabelsStyle = AAStyle()
            .color(AAColor.White)//字体颜色
            .fontSize(12f)//字体大小
            .fontWeight(AAChartFontWeightType.Bold)//字体为加粗体

        return AAChartModel()
            .chartType(AAChartType.Areaspline)
            .backgroundColor(AAColor.Black)
            .categories(arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"))
            .title("Colorful Gradient Color Zones")
            .subtitle("custom areaspline chart with colorful gradient color zones")
            .dataLabelsEnabled(false)
            .legendEnabled(false)
            .markerRadius(0f)
            .yAxisGridLineWidth(0f)
            .yAxisTitle("")
            .series(arrayOf(
                AASeriesElement()
                    .name("空气湿度")
                    .lineWidth(6f)
                    .zoneAxis("x")
                    .zones(arrayOf(
                        AAZonesElement()
                            .value(2)
                            .color(AAColor.Red)
                            .fillColor(redGradientColorDic),
                        AAZonesElement()
                            .value(5)
                            .color(AAColor.Green)
                            .fillColor(greenGradientColorDic),
                        AAZonesElement()
                            .color(AAColor.Blue)
                            .fillColor(blueGradientColorDic),
                    ))
                    .data(arrayOf(56.5, 33.3, 85.3, 23.9, 29.6, 34.5, 28.2, 26.5, 15.2, 56.5, 33.3, singleSpecialData))
            ))


    }
}
