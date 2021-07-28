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
            .yAxisTitle("")
            .dataLabelsEnabled(true)
            .tooltipEnabled(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(
                        arrayOf<Any?>(6.9, 9.5, 14.5, 18.2, 21.5, null, null, null, null, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)))
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
            .title("")
            .subtitle("")
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .yAxisTitle("")
            .markerRadius(0f)
            .yAxisLineWidth(0f)
            .yAxisGridLineWidth(0f)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(9.0f)
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                    .shadow(AAShadow()
                        .offsetX(15.0f)
                        .offsetY(15.0f)
                        .opacity(0.2f)
                        .width(8.0f)
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
            .title("")
            .subtitle("")
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .yAxisTitle("")
            .markerRadius(0f)
            .yAxisLineWidth(0f)
            .yAxisGridLineWidth(0f)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(15.0f)
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
            .title("")
            .subtitle("")
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .yAxisTitle("")
            .markerRadius(0f)
            .yAxisLineWidth(0f)
            .yAxisGridLineWidth(0f)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(3f)
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
            .title("")
            .subtitle("")
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .yAxisTitle("")
            .markerRadius(8f)//marker点半径为8个像素
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)//marker点为空心效果
            .markerSymbol(AAChartSymbolType.Circle)//marker点为圆形点○
            .yAxisLineWidth(0f)
            .yAxisGridLineWidth(0f)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0f)
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
            .series(arrayOf(
                AASeriesElement()
                    .name("Virtual Data")
                    .lineWidth(9f)
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, singleSpecialData, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                    .color(gradientColorDic1)))
    }

    internal fun configureSpecialStyleColumnOfSingleDataElementChart(): AAChartModel {
        val singleSpecialData = AADataElement()
            .color(AAGradientColor.FreshPapaya)
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
            .series(arrayOf(
                AASeriesElement()
                    .name("Virtual Data")
                    .lineWidth(6f)
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
            .title("")
            .yAxisTitle("")//设置Y轴标题
            .yAxisGridLineWidth(0f)
            .categories(arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Spe", "Oct", "Nov", "Dec"))
            .dataLabelsEnabled(false)//是否显示值
            .markerRadius(8f)
            .markerSymbol(AAChartSymbolType.Circle)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .threshold(-200f)
                    .data(arrayOf(106.4, 129.2, 269.9, -100.5, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4))
                    .lineWidth(6f)
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
            .title("")
            .subtitle("")
            .yAxisTitle("")
            .yAxisMax(15.0f)
            .yAxisGridLineWidth(0f)
            .xAxisVisible(false)
            .markerRadius(0f)
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
            .title("")
            .subtitle("")
            .yAxisTitle("")
            .yAxisMax(15.0f)
            .yAxisGridLineWidth(0f)
            .xAxisVisible(false)
            .markerRadius(0f)
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
            .title("")
            .subtitle("")
            .yAxisTitle("")
            .yAxisMax(15.0f)
            .yAxisGridLineWidth(0f)
            .xAxisVisible(false)
            .markerRadius(0f)
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
            .markerRadius(6f)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .zoomType(AAChartZoomType.XY)
            .categories(categoriesArr)
            .yAxisMin(2.0f)
            .yAxisMax(45.4f)
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
                        .fontSize(16f))
                    .y(-35f)
                    .align(AAChartAlignType.Center)
                    .verticalAlign(AAChartVerticalAlignType.Top)
                    .overflow("none")
                    .crop(false))
            .y(26.5f)

        return AAChartModel()
            .chartType(AAChartType.Areaspline)
            .backgroundColor("#4b2b7f")
            .dataLabelsEnabled(false) //是否显示值
            .tooltipEnabled(true)
            .markerRadius(0f)
            .xAxisVisible(false)
            .yAxisVisible(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Virtual Data")
                    .lineWidth(6f)
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
            .markerRadius(20f)
            .series(arrayOf(
                AASeriesElement()
                    .name("ElementOne")
                    .data(arrayOf(211, 183, 157, 133, 111, 91, 73, 57, 43, 31, 21, 13, 7, 3))
                    .allowPointSelect(true)
                    .states(AAStates()
                        .hover(AAHover()
                            .halo(AAHalo()
                                .size(130f)
                                .opacity(0.8f)
                                .attributes(mapOf(
                                    "stroke-width" to 50,
                                    "fill" to "#00BFFF",
                                    "stroke" to "#00FA9A"
                                ))))
                        .select(AASelect()
                            .halo(AAHalo()
                                .size(130f)
                                .opacity(1.0f)
                                .attributes(mapOf(
                                    "stroke-width" to 150,
                                    "fill" to AARgba(138, 43, 226, 1f),
                                    "stroke" to AARgba(30, 144, 255, 1f)
                                )))))))
    }

    fun customSplineChartMarkerStatesHoverStyle(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Areaspline)
            .title("Custom Spline Chart Marker States Hover Style")
            .categories(arrayOf(
                "一月", "二月", "三月", "四月", "五月", "六月",
                "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .markerRadius(8.0f) //marker点半径为8个像素
            .yAxisLineWidth(0f)
            .yAxisGridLineWidth(0f)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0f)
                    .color("rgba(220,20,60,1)") //猩红色, alpha 透明度 1
                    .marker(AAMarker()
                        .states(AAMarkerStates()
                            .hover(AAMarkerHover()
                                .fillColor(AAColor.White)
                                .radius(40f)
                                .lineColor(AAColor.Green)
                                .lineWidth(20f))))
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
            .y(-10f)
            .format("{total} mm")
            .color(AAColor.Red)
            .shape("callout")
            .backgroundColor(AAColor.White)
            .borderColor(AAColor.Red)
            .borderRadius(1f)
            .borderWidth(1f)

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
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
                    .reversed(true)
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
                    .borderWidth(0f) //描边的宽度
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
                    .borderWidth(0f) //描边的宽度
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
            .markerRadius(8.0f)
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("2017")
                    .lineWidth(5f)
                    .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36))
                    .shadow(AAShadow()
                        .offsetX(15.0f)
                        .offsetY(15.0f)
                        .opacity(0.2f)
                        .width(8.0f)
                        .color("#1e90ff")),
                AASeriesElement()
                    .name("2018")
                    .lineWidth(5f)
                    .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67))
                    .shadow(AAShadow()
                        .offsetX(15.0f)
                        .offsetY(15.0f)
                        .opacity(0.2f)
                        .width(8.0f)
                        .color("#ef476f")),
                AASeriesElement()
                    .name("2019")
                    .lineWidth(5f)
                    .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64))
                    .shadow(AAShadow()
                        .offsetX(15.0f)
                        .offsetY(15.0f)
                        .opacity(0.2f)
                        .width(8.0f)
                        .color("#ffd066")),
                AASeriesElement()
                    .name("2020")
                    .lineWidth(5f)
                    .data(arrayOf(0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53))
                    .shadow(AAShadow()
                        .offsetX(15.0f)
                        .offsetY(15.0f)
                        .opacity(0.2f)
                        .width(8.0f)
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
            .markerRadius(8.0f)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .series(arrayOf(AASeriesElement()
                .name("2017")
                .step(true)
                .dataLabels(AADataLabels()
                    .style(AAStyle()
                        .color("#1e90ff")
                        .fontSize(11f)))
                .data(arrayOf(2.10, 2.54, 2.78, 3.62, 4.41, 4.09, 3.83, 4.47, 4.20, 3.94, 3.80, 3.58, 3.19, 4.30, 3.69, 3.52, 3.02, 3.30)),
                AASeriesElement()
                    .name("2018")
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#ef476f")
                                .fontSize(11f)))
                    .data(arrayOf(1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28)),
                AASeriesElement()
                    .name("2019")
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#ffd066")
                                .fontSize(11f)))
                    .data(arrayOf(1.16, 1.67, 2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05, 2.18, 3.24)),
                AASeriesElement()
                    .name("2020")
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#04d69f")
                                .fontSize(11f)))
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
            .markerRadius(5f)
            .dataLabelsEnabled(false)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("2017")
                    .fillColor(gradientBlueColorDic)
                    .lineWidth(6f)
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#1e90ff")
                                .fontSize(11f)))
                    .data(arrayOf(2.10, 2.54, 2.78, 3.62, 4.41, 4.09, 3.83, 4.47, 4.20, 3.94, 3.80, 3.58, 3.19, 4.30, 3.69, 3.52, 3.02, 3.30)),

                AASeriesElement()
                    .name("2018")
                    .fillColor(gradientRedColorDic)
                    .lineWidth(6f)
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#ef476f")
                                .fontSize(11f)))
                    .data(arrayOf(1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28)),

                AASeriesElement()
                    .name("2019")
                    .fillColor(gradientGoldColorDic)
                    .lineWidth(6f)
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#ffd066")
                                .fontSize(11f)))
                    .data(arrayOf(1.16, 1.67, 2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05, 2.18, 3.24)),

                AASeriesElement()
                    .name("2020")
                    .fillColor(gradientGreenColorDic)
                    .lineWidth(6f)
                    .step(true)
                    .dataLabels(
                        AADataLabels()
                            .style(AAStyle()
                                .color("#04d69f")
                                .fontSize(11f)))
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
            .markerRadius(0f) //marker点半径为0个像素
            .yAxisLineWidth(0f)
            .yAxisGridLineWidth(0f)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0f)
                    .color("rgba(220,20,60,1)") //猩红色, alpha 透明度 1
                    .marker(AAMarker()
                        .states(AAMarkerStates()
                            .hover(AAMarkerHover()
                                .enabled(false))))
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
            ))
    }

}
