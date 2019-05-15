package com.example.chartcorekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.chartcorekotlin.AAChartConfiger.*

object SpecialChartComposer{


    fun configurePolarColumnChart(): AAChartModel  {

        return AAChartModel()
            .chartType(AAChartType.Column)
            .polar(true)
            .dataLabelEnabled(false)
            .categories(arrayOf(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
            )
            )
            .series(arrayOf(
                AASeriesElement()
                    .name("2018")
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)
                    )
            )
            )
    }

    fun configurePieChartModel(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Pie)
            .backgroundColor("#ffffff")
            .title("LANGUAGE MARKET SHARES JANUARY,2020 TO MAY")
            .subtitle("virtual data")
            .dataLabelEnabled(true)//是否直接显示扇形图数据
            .yAxisTitle("℃")
            .series(arrayOf(
                AASeriesElement()
                    .name("Language market shares")
                    .data(arrayOf(
                        arrayOf("Java",   67),
                        arrayOf("Swift", 999),
                        arrayOf("Python", 83),
                        arrayOf("OC",     11),
                        arrayOf("Go",     30)
                    )
                    )
            )
            )
    }

    fun configureBubbleChart(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Bubble)
            .title("AACHARTKIT BUBBLES")
            .subtitle("JUST FOR FUN")
            .yAxisTitle("℃")
            .gradientColorEnable(true)
            .colorsTheme(arrayOf("#0c9674", "#7dffc0", "#d11b5f", "#facd32", "#ffffa0", "#EA007B"))
            .series(arrayOf(
                AASeriesElement()
                    .name("BubbleOne")
                    .data(arrayOf(
                        arrayOf(97, 36, 79),
                        arrayOf(94, 74, 60),
                        arrayOf(68, 76, 58),
                        arrayOf(64, 87, 56),
                        arrayOf(68, 27, 73),
                        arrayOf(74, 99, 42),
                        arrayOf(7 , 93, 99),
                        arrayOf(51, 69, 40),
                        arrayOf(38, 23, 33),
                        arrayOf(57, 86, 31),
                        arrayOf(33, 24, 22)
                    )
                    ),
                AASeriesElement()
                    .name("BubbleTwo")
                    .data(arrayOf(
                        arrayOf(25, 60, 87),
                        arrayOf(2 , 75, 59),
                        arrayOf(11, 54, 8 ),
                        arrayOf(86, 55, 93),
                        arrayOf(5 , 33, 88),
                        arrayOf(90, 63, 44),
                        arrayOf(91, 43, 17),
                        arrayOf(97, 56, 56),
                        arrayOf(15, 67, 48),
                        arrayOf(54, 25, 81),
                        arrayOf(55, 66, 11)
                    )
                    ),
                AASeriesElement()
                    .name("BubbleThree")
                    .data(arrayOf(
                        arrayOf(47, 47, 21),
                        arrayOf(20, 12, 66),
                        arrayOf(6 , 76, 91),
                        arrayOf(38, 30, 60),
                        arrayOf(57, 98, 64),
                        arrayOf(61, 47, 80),
                        arrayOf(83, 60, 13),
                        arrayOf(67, 78, 75),
                        arrayOf(64, 12, 55),
                        arrayOf(30, 77, 82),
                        arrayOf(88, 66, 13)
                    )
                    )
            )
            )
    }

    fun configureAreaSplineRangeChartModel(): AAChartModel  {
        val gradientColorDic = "#ff0000"

        return AAChartModel()
            .chartType(AAChartType.Areasplinerange)
            .title("Area spline range chart")
            .subtitle("virtual data")
            .yAxisTitle("℃")
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
                    .color(gradientColorDic)//猩红色
                    .data(arrayOf(
                        /* 2014-06-01 */
                        arrayOf(140158080, 5.1,  20.6),
                        arrayOf(140166720, 6.6,  24.6),
                        arrayOf(140175360, 9.7,  22.2),
                        arrayOf(140184000, 9.6,  21.6),
                        arrayOf(140192640, 13.0, 20.0),
                        arrayOf(140201280, 12.9, 18.2),
                        arrayOf(140209920, 8.5,  23.2),
                        arrayOf(140218560, 9.2,  21.4),
                        arrayOf(140227200, 10.5, 22.0),
                        arrayOf(140235840, 7.3,  23.4),
                        arrayOf(140244480, 12.1, 18.2),
                        arrayOf(140253120, 11.1, 13.3),
                        arrayOf(140261760, 10.0, 20.7),
                        arrayOf(140270400, 5.8,  23.4),
                        arrayOf(140279040, 7.4,  20.1),
                        arrayOf(140287680, 10.3, 21.9),
                        arrayOf(140296320, 7.8,  16.8),
                        arrayOf(140304960, 11.6, 19.7),
                        arrayOf(140313600, 9.8,  16.0),
                        arrayOf(140322240, 10.7, 14.4),
                        arrayOf(140330880, 9.0,  15.5),
                        arrayOf(140339520, 5.1,  13.3),
                        arrayOf(140348160, 10.0, 19.3),
                        arrayOf(140356800, 5.2,  22.1),
                        arrayOf(140365440, 6.3,  21.3),
                        arrayOf(140374080, 5.5,  21.1),
                        arrayOf(140382720, 8.4,  19.7),
                        arrayOf(140391360, 7.1,  23.3),
                        arrayOf(140400000, 6.1,  20.8),
                        arrayOf(140408640, 8.4,  22.6)
                    )
                    )
            )
            )
    }

    fun configureColumnrangeChartModel(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Columnrange)
            .title("TEMPERATURE VARIATION BY MONTH")
            .subtitle("observed in Gotham city")
            .yAxisTitle("℃")
            .categories(arrayOf(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
            )
            )
            .dataLabelEnabled(true)
            .inverted(true)//x 轴是否垂直翻转
            .series(arrayOf(
                AASeriesElement()
                    .name("temperature")
                    .data(arrayOf(
                        arrayOf(-9.7,  9.4),
                        arrayOf(-8.7,  6.5),
                        arrayOf(-3.5,  9.4),
                        arrayOf(-1.4, 19.9),
                        arrayOf(0.0,  22.6),
                        arrayOf(2.9,  29.5),
                        arrayOf(9.2,  30.7),
                        arrayOf(7.3,  26.5),
                        arrayOf(4.4,  18.0),
                        arrayOf(-3.1, 11.4),
                        arrayOf(-5.2, 10.4),
                        arrayOf(-13.5, 9.8)
                    )
                    )
            )
            )
    }

    fun configureStepLineChartModel(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Line)//图形类型
            .animationType(AAChartAnimationType.Bounce)//图形渲染动画类型为"bounce"
            .title("STEP LINE CHART")//图形标题
            .subtitle("2020/08/08")//图形副标题
            .dataLabelEnabled(false)//是否显示数字
            .symbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式
            .markerRadius(7)//折线连接点半径长度,为0时相当于没有折线连接点
            .series(arrayOf(
                AASeriesElement()
                    .name("Berlin")
                    .data(arrayOf(450, 432, 401, 454, 590, 530, 510))
                    .step("right")//设置折线样式为直方折线,折线连接点位置靠右👉
                , AASeriesElement()
                    .name("New York")
                    .data(arrayOf(220, 282, 201, 234, 290, 430, 410))
                    .step("center")//设置折线样式为直方折线,折线连接点位置居中
                , AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(120, 132, 101, 134, 90, 230, 210))
                    .step("left")//设置折线样式为直方折线,折线连接点位置靠左👈
            )
            )
    }

    fun configureStepAreaChartModel(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Area)//图形类型
            .animationType(AAChartAnimationType.Bounce)//图形渲染动画类型为"bounce"
            .title("STEP AREA CHART")//图形标题
            .subtitle("2049/08/08")//图形副标题
            .dataLabelEnabled(false)//是否显示数字
            .symbolStyle(AAChartSymbolStyleType.InnerBlank)//折线连接点样式
            .markerRadius(0)//折线连接点半径长度,为0时相当于没有折线连接点
            .series(arrayOf(
                AASeriesElement()
                    .name("Berlin")
                    .data(arrayOf(450, 432, 401, 454, 590, 530, 510))
                    .step(true)//设置折线样式为直方折线,折线连接点位置靠左👈
                , AASeriesElement()
                    .name("New York")
                    .data(arrayOf(220, 282, 201, 234, 290, 430, 410))
                    .step(true)//设置折线样式为直方折线,折线连接点位置靠左👈
                , AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(120, 132, 101, 134, 90, 230, 210))
                    .step(true)//设置折线样式为直方折线,折线连接点位置靠左👈
            )
            )
    }

    fun configureBoxplotChartModel(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Boxplot)
            .title("BOXPLOT CHART")
            .subtitle("virtual data")
            .yAxisTitle("℃")
            .series(arrayOf(
                AASeriesElement()
                    .name("Observed Data")
                    .color("#ef476f")
                    .data(arrayOf(
                        arrayOf(760, 801, 848, 895, 965),
                        arrayOf(733, 853, 939, 980,1080),
                        arrayOf(714, 762, 817, 870, 918),
                        arrayOf(724, 802, 806, 871, 950),
                        arrayOf(834, 836, 864, 882, 910)
                    )
                    )
            )
            )
    }

    fun configurePyramidChartModel(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Pyramid)
            .title("THE HEAT OF PROGRAM LANGUAGE")
            .subtitle("virtual data")
            .yAxisTitle("℃")
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
                    .data(arrayOf(
                        arrayOf("Swift",       11850),
                        arrayOf("Objective-C", 12379),
                        arrayOf("JavaScript",  14286),
                        arrayOf("Go",          15552),
                        arrayOf("Python",      18654)
                    )
                    )
            )
            )
    }

    fun congfigureFunnelChartModel(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Funnel)
            .title("THE HEAT OF PROGRAM LANGUAGE")
            .subtitle("virtual data")
            .yAxisTitle("℉")
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
                    .data(arrayOf(
                        arrayOf("Swift",       11850),
                        arrayOf("Objective-C", 12379),
                        arrayOf("JavaScript",  14286),
                        arrayOf("Go",          15552),
                        arrayOf("Python",      18654)
                    )
                    )
            )
            )
    }

}
