package com.aachartmodel.aainfographics.ChartsDemo.ChartComposer

import com.example.chartcorekotlin.AAChartConfiger.*
import java.util.HashMap

class CustomStyleChartComposer  {

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
            .dataLabelEnabled(false)
            .categories(colorsNameArr)
            .colorsTheme(colorsArr)
            .stacking(AAChartStackingType.Percent)
            .series(arrayOf(
                    AASeriesElement()
                        .name("Tokyo")
                        .data(arrayOf(149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4))
                        .colorByPoint(true)
                )
            )

    }


    internal fun configureColorfulGradientColorChart(): AAChartModel {

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
            "eveningDelight"
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
            AAGradientColor.eveningDelightColor()
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
                        .data(arrayOf(149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4))
                        .colorByPoint(true)
                )
            )

    }

    internal fun configureDiscontinuousDataChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .title("Discontinuous Data Chart")
            .yAxisTitle("")
            .dataLabelEnabled(true)
            .tooltipEnabled(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(
                        arrayOf<Any?>(6.9, 9.5, 14.5, 18.2, 21.5, null, null, null, null, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)
                    )
                    )
                    .color(AAGradientColor.deepSeaColor())
            )
            )

    }

    internal fun configureColorfulColumnChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .title("Colorful Column Chart")
            .subtitle("single data array colorful column chart")
            .colorsTheme(arrayOf("#febc0f", "#FF14d4", "#0bf8f5", "#F33c52", "#1904dd"))
            .series(arrayOf(
                    AASeriesElement()
                        .name("东京")
                        .data(arrayOf(149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4))
                        .colorByPoint(true)
                )
            )
    }

    internal fun configureNightingaleRoseChart(): AAChartModel {
        return AAChartModel()
            .title("南丁格尔玫瑰图")
            .subtitle("极地图中的一种")
            .yAxisTitle("cm")
            .chartType(AAChartType.Column)
            .xAxisVisible(false)//是否显示最外一层圆环
            .yAxisVisible(true)//是否显示中间的多个圆环
            .legendEnabled(false)//隐藏图例(底部可点按的小圆点)
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .dataLabelEnabled(true)
            .polar(true)//极地化图形
            .series(arrayOf(
                    AASeriesElement()
                        .name("东京")
                        .data(arrayOf(7.0, 6.9, 9.5, 9.6, 13.9, 14.5, 18.3, 18.2, 21.5, 25.2, 26.5, 23.3))
                )
            )
    }

    internal fun configureChartWithShadowStyle(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Areaspline)
            .title("")
            .subtitle("")
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .yAxisTitle("")
            .markerRadius(0)
            .yAxisLineWidth(0f)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(8.0f)
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                    .shadow(AAShadow()
                        .offsetX(15.0f)
                        .offsetY(15.0f)
                        .opacity(0.2f)
                        .width(8.0f)
                        .color(AAColor.redColor())
                    )
            )
            )
    }

    internal fun configureColorfulGradientAreaChart(): AAChartModel {
        val linearGradientColorMap = HashMap<String, Int>()
        linearGradientColorMap["x1"] = 0
        linearGradientColorMap["y1"] = 0
        linearGradientColorMap["x2"] = 1
        linearGradientColorMap["y2"] = 0
        val stopsArr = arrayOf(
            arrayOf(0.00, "#febc0f"),
            arrayOf(0.50, "#FF14d4"),
            arrayOf(1.00, "#0bf8f5")
        )//颜色字符串设置支持十六进制类型和 rgba 类型
        val gradientColorMap = HashMap<String, Any>()
        gradientColorMap["linearGradient"] = linearGradientColorMap
        gradientColorMap["stops"] = stopsArr

        return AAChartModel()
            .chartType(AAChartType.Areaspline)
            .title("")
            .subtitle("")
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .yAxisTitle("")
            .markerRadius(0)
            .yAxisLineWidth(0f)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .series(arrayOf(
                    AASeriesElement()
                        .name("Tokyo Hot")
                        .lineWidth(15.0f)
                        .color(gradientColorMap)
                        .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                )
            )
    }


    internal fun configureColorfulGradientSplineChart(): AAChartModel {
        val linearGradientColorMap = mapOf(
            "x1" to 0,
            "y1" to 0,
            "x2" to 1,
            "y2" to 0
        )
        val stopsArr = arrayOf(
            arrayOf(0.00, "#febc0f"),
            arrayOf(0.25, "#FF14d4"),
            arrayOf(0.50, "#0bf8f5"),
            arrayOf(0.75, "#F33c52"),
            arrayOf(1.00, "#1904dd")
        )//颜色字符串设置支持十六进制类型和 rgba 类型
        val gradientColorMap = HashMap<String, Any>()
        gradientColorMap["linearGradient"] = linearGradientColorMap
        gradientColorMap["stops"] = stopsArr

        return AAChartModel()
            .chartType(AAChartType.Spline)
            .title("")
            .subtitle("")
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .yAxisTitle("")
            .markerRadius(0)
            .yAxisLineWidth(0f)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .series(arrayOf(
                    AASeriesElement()
                        .name("Tokyo Hot")
                        .lineWidth(15.0f)
                        .color(gradientColorMap)
                        .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                )
            )
    }


    internal fun configureGradientColorAreasplineChart(): AAChartModel {
        val linearGradientColorMap = HashMap<String, Int>()
        linearGradientColorMap["x1"] = 0
        linearGradientColorMap["y1"] = 0
        linearGradientColorMap["x2"] = 0
        linearGradientColorMap["y2"] = 1
        val stopsArr = arrayOf(
            arrayOf(0, "rgba(2255,20,147,1)"), //深粉色, alpha 透明度 1
            arrayOf(1, "rgba(255,105,180,0.1)")
        )//热情的粉红, alpha 透明度 0.1
        //颜色字符串设置支持十六进制类型和 rgba 类型
        val gradientColorMap = HashMap<String, Any>()
        gradientColorMap["linearGradient"] = linearGradientColorMap
        gradientColorMap["stops"] = stopsArr

        return AAChartModel()
            .chartType(AAChartType.Areaspline)
            .title("")
            .subtitle("")
            .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"))
            .yAxisTitle("")
            .markerRadius(8)//marker点半径为8个像素
            .symbolStyle(AAChartSymbolStyleType.InnerBlank)//marker点为空心效果
            .symbol(AAChartSymbolType.Circle)//marker点为圆形点○
            .yAxisLineWidth(0f)
            .yAxisGridLineWidth(0)
            .legendEnabled(false)
            .series(arrayOf(
                    AASeriesElement()
                        .name("Tokyo Hot")
                        .lineWidth(5.0f)
                        .color("rgba(220,20,60,1)")//猩红色, alpha 透明度 1
                        .fillColor(gradientColorMap)
                        .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                )
            )

    }


}
