/**
 * Copyright (C), 2015-2019
 * FileName: ChartOptionsComposer
 * Author: ios-fn
 * Date: 2019-06-16 18:56
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
package com.aachartmodel.aainfographics.ChartsDemo.ChartComposer

import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.*
import com.example.chartcorekotlin.AAChartConfiger.*

class ChartOptionsComposer {
    companion object {

        private fun customChartLegendStyle(): AAOptions {
            val element1 = AASeriesElement()
                .name("Predefined symbol")
                .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36))
            val element2 = AASeriesElement()
                .name("Image symbol")
                .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67))
            val element3 = AASeriesElement()
                .name("Base64 symbol (*)")
                .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64))
            val element4 = AASeriesElement()
                .name("Custom symbol")
                .data(arrayOf(0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53))

            val aaChartModel = AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("CUSTOM LEGEND STYLE")
                .subtitle("LEGEND ON THE TOP_RIGHT SIDE WITH VERTICAL STYLE")
                .subtitleAlign(AAChartAlignType.Left)
                .markerRadius(0f)
                .backgroundColor(AAColor.whiteColor())
                .dataLabelsEnabled(false)
                .yAxisGridLineWidth(0f)
                .yAxisTitle("percent values")
                .stacking(AAChartStackingType.Normal)
                .colorsTheme(arrayOf("mediumspringgreen", "deepskyblue", "red", "sandybrown"))
                .series(arrayOf(element1, element2, element3, element4))

            val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)

            aaOptions.legend!!
                .enabled(true)
                .align(AAChartAlignType.Right)
                .layout(AAChartLayoutType.Vertical)
                .verticalAlign(AAChartVerticalAlignType.Top)

            aaOptions.yAxis?.labels?.format = "{value} %"//给y轴添加单位
            return aaOptions
        }


        fun configureAAPlotBandsForChart(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Spline)//图形类型
            .dataLabelsEnabled(false)
            .markerRadius(0f)
            .series(arrayOf(
                    AASeriesElement()
                        .name("Tokyo")
                        .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                        .color(AAColor.whiteColor())
                        .lineWidth(10.0f)
                )
            )

        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
        val aaPlotBandsElementArr = arrayOf(
            AAPlotBandsElement()
                .from(0f)
                .to(5f)
                .color("#BC2B44"),
            AAPlotBandsElement()
                .from(5f)
                .to(10f)
                .color("#EC6444"),
            AAPlotBandsElement()
                .from(10f)
                .to(15f)
                .color("#f19742"),
            AAPlotBandsElement()
                .from(15f)
                .to(20f)
                .color("#f3da60"),
            AAPlotBandsElement()
                .from(20f)
                .to(25f)
                .color("#9bd040"),
            AAPlotBandsElement()
                .from(25f)
                .to(50f)
                .color("#acf08f")
        )

         aaOptions.yAxis?.plotBands(aaPlotBandsElementArr)
        return aaOptions
    }

     fun configureAAPlotLinesForChart(): AAOptions {
        val zonesArr = arrayOf(
            mapOf(
                "value" to 12,
                "color" to "#1e90ff"
            ),
            mapOf(
                "value" to 24,
                "color" to "#ef476f"
            ),
            mapOf(
                "value" to 36,
                "color" to "#04d69f"
            ),
            mapOf(
                "color" to "#ffd066"
            )
            )

        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline)//图形类型
            .dataLabelsEnabled(false)
            .series(arrayOf(
                    AASeriesElement()
                        .name("Tokyo")
                        .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                        .fillOpacity(0.5f)
                        .lineWidth(10f)
                        .zones(zonesArr)
                )
            )

        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
        val aaPlotLinesElementsArr = arrayOf<AAPlotLinesElement>(
            AAPlotLinesElement()
                .color("#1e90ff")//颜色值(16进制)
                .dashStyle(AAChartLineDashStyleType.LongDashDotDot)//样式：Dash,Dot,Solid等,默认Solid
                .width(1f) //标示线粗细
                .value(12f) //所在位置
                .zIndex(1) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                .label(AALabel()
                        .text("PLOT LINES ONE")
                        .style(AAStyle()
                                .color("#1e90ff")
                                .fontWeight("bold")
                        )
                ),
            AAPlotLinesElement()
                .color("#ef476f")//颜色值(16进制)
                .dashStyle(AAChartLineDashStyleType.LongDashDot)//样式：Dash,Dot,Solid等,默认Solid
                .width(1f) //标示线粗细
                .value(24f) //所在位置
                .zIndex(1) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                .label(AALabel()
                        .text("PLOT LINES TWO")
                        .style(AAStyle()
                                .color("#ef476f")
                                .fontWeight("bold")
                        )
                ),
            AAPlotLinesElement()
                .color("#1e90ff")//颜色值(16进制)
                .dashStyle(AAChartLineDashStyleType.LongDash)//样式：Dash,Dot,Solid等,默认Solid
                .width(1f) //标示线粗细
                .value(36f) //所在位置
                .zIndex(1) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                .label(AALabel()
                        .text("PLOT LINES THREE")
                        .style(AAStyle()
                                .color("#04d69f")
                                .fontWeight("bold")
                        )
                )
        )
         aaOptions.yAxis?.plotLines(aaPlotLinesElementsArr)

         return aaOptions
    }

     fun customAATooltipWithJSFuntion(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Area)//图形类型
            .title("近三个月金价起伏周期图")//图表主标题
            .subtitle("金价(元/克)")//图表副标题
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .categories(arrayOf(
                "10-01", "10-02", "10-03", "10-04", "10-05", "10-06", "10-07", "10-08", "10-09", "10-10",
                "10-11", "10-12", "10-13", "10-14", "10-15", "10-16", "10-17", "10-18", "10-19", "10-20",
                "10-21", "10-22", "10-23", "10-024", "10-25", "10-26", "10-27", "10-28", "10-29", "10-30",
                "10-31", "11-01", "11-02", "11-03", "11-04", "11-05", "11-06", "11-07", "11-08", "11-09",
                "11-10", "11-11", "11-12", "11-13", "11-14", "11-15", "11-16", "11-17", "11-18", "11-19",
                "11-20", "11-21", "11-22", "11-23", "11-024", "11-25", "11-26", "11-27", "11-28", "11-29",
                "11-30", "12-01", "12-02", "12-03", "12-04", "12-05", "12-06", "12-07", "12-08", "12-09",
                "12-10", "12-11", "12-12", "12-13", "12-14", "12-15", "12-16", "12-17", "12-18", "12-19",
                "12-20", "12-21", "12-22", "12-23", "12-024", "12-25", "12-26", "12-27", "12-28", "12-29", "12-30"))
            .series(arrayOf(
                AASeriesElement()
                .name("2020")
                .lineWidth(3f)
                .color("#FFD700"/*纯金色*/)
                .fillOpacity(0.5f)
                .data(arrayOf(
                    1.51, 6.7, 0.94, 1.44, 1.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85,
                    4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.51, 12.7, 0.94, 1.44, 18.6, 1.63, 1.56, 1.91,
                    2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28,
                    1.33, 4.68, 1.31, 1.10, 13.9, 1.10, 1.16, 1.67, 2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11,
                    3.41, 3.25, 3.32, 3.07, 3.92, 3.05, 2.18, 3.24, 3.23, 3.15, 2.90, 1.81, 2.11, 2.43, 5.59, 3.09,
                    4.09, 6.14, 5.33, 6.05, 5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.48)
                )))

        val aaTooltip = AATooltip()
            .useHTML(true)
            .formatter("""
function () {
        return ' 🌕 🌖 🌗 🌘 🌑 🌒 🌓 🌔 <br/> '
        + ' Support JavaScript Function Just Right Now !!! <br/> '
        + ' The Gold Price For <b>2020 '
        +  this.x
        + ' </b> Is <b> '
        +  this.y
        + ' </b> Dollars ';
        }
""")
            .valueDecimals(2)//设置取值精确到小数点后几位//设置取值精确到小数点后几位
            .backgroundColor("#000000")
            .borderColor("#000000")
            .style(AAStyle()
                .color("#FFD700")
                .fontSize(12f)
            )
        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
        aaOptions.tooltip = aaTooltip
        return aaOptions
    }

     fun customXAxisCrosshairStyle(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Line)//图表类型
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
                    .color(AAGradientColor.deepSeaColor())
                    .data(arrayOf(
                        arrayOf(12464064, 21.5),
                        arrayOf(12464928, 22.1),
                        arrayOf(12465792, 23.2),
                        arrayOf(12466656, 23.8),
                        arrayOf(12467520, 21.4),
                        arrayOf(12468384, 21.3),
                        arrayOf(12469248, 18.3),
                        arrayOf(12470112, 15.4),
                        arrayOf(12470976, 16.4),
                        arrayOf(12471840, 17.7),
                        arrayOf(12472704, 17.5),
                        arrayOf(12473568, 17.6),
                        arrayOf(12474432, 17.7),
                        arrayOf(12475296, 16.8),
                        arrayOf(12476160, 17.7),
                        arrayOf(12477024, 16.3),
                        arrayOf(12477888, 17.8),
                        arrayOf(12478752, 18.1),
                        arrayOf(12479616, 17.2),
                        arrayOf(12480480, 14.4),
                        arrayOf(12481344, 13.7),
                        arrayOf(12482208, 15.7),
                        arrayOf(12483072, 14.6),
                        arrayOf(12483936, 15.3),
                        arrayOf(12484800, 15.3),
                        arrayOf(12485664, 15.8),
                        arrayOf(12486528, 15.2),
                        arrayOf(12487392, 14.8),
                        arrayOf(12488256, 14.4),
                        arrayOf(12489120, 15.5),
                        arrayOf(12489984, 13.6)
                    )
                    )
            )
            )

        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
        val aaCrosshair = AACrosshair()
            .color(AAColor.redColor())
            .width(1f)
            .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
         aaOptions.xAxis?.crosshair(aaCrosshair)
        return aaOptions
    }

        private fun customDoubleXAxesChart():AAOptions {
            val gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#7052f4",
                "#00b0ff"//颜色字符串设置支持十六进制类型和 rgba 类型
            )

            val gradientColorDic2 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#EF71FF",
                "#4740C8"//颜色字符串设置支持十六进制类型和 rgba 类型
            )

            val aaChart = AAChart()
                .type(AAChartType.Bar)

            val aaTitle = AATitle()
                .text("2015 年德国人口金字塔")
                .style(AAStyle()
                    .color("#000000")
                    .fontSize(12.0f))

            val aaCategories = arrayOf("0-4", "5-9", "10-14", "15-19", "20-24", "25-29", "30-34", "35-39", "40-44", "45-49", "50-54", "55-59", "60-64", "65-69", "70-74", "75-79", "80-84", "85-89", "90-94", "95-99", "100 + ")

            val aaXAxis1 = AAXAxis()
                .reversed(true)
                .categories(aaCategories)
                .labels(AALabels()
                    .step(1))

            val aaXAxis2 = AAXAxis()
                .reversed(true)
                .opposite(true)
                .categories(aaCategories)
                .linkedTo(0)
                .labels(AALabels()
                    .step(1))

            val aaYAxis = AAYAxis()
                .gridLineWidth(0f)// Y 轴网格线宽度
                .title(AATitle()
                    .text(""))//Y 轴标题
                .labels(AALabels()
                    .formatter(
                        "function () {\n" +
                                "    return (Math.abs(this.value) / 1000000) + 'M';\n" +
                                "}"
                    ))
                .min(-4000000f)
                .max(4000000f)

            val aaPlotOptions = AAPlotOptions()
                .series(AASeries()
                    .animation(AAAnimation()
                        .duration(800)
                        .easing(AAChartAnimationType.Bounce)
                    )
                    .stacking(AAChartStackingType.Normal))

            val aaTooltip = AATooltip()
                .enabled(true)
                .shared(false)
                .formatter(("function () {\n" +
                        "    return '<b>' + this.series.name + ', age ' + this.point.category + '</b><br/>' +\n" +
                        "        '人口: ' + Highcharts.numberFormat(Math.abs(this.point.y), 0);\n" +
                        "}"))

            val aaSeriesElement1 = AASeriesElement()
                .name("Men")
                .color(gradientColorDic1)
                .data(arrayOf(-1746181, -1884428, -2089758, -2222362, -2537431, -2507081, -2443179,
                    -2664537, -3556505, -3680231, -3143062, -2721122, -2229181, -2227768, -2176300,
                    -1329968, -836804, -354784, -90569, -28367, -3878))

            val aaSeriesElement2 = AASeriesElement()
                .name("Women")
                .color(gradientColorDic2)
                .data(arrayOf(1656154, 1787564, 1981671, 2108575, 2403438, 2366003, 2301402, 2519874,
                    3360596, 3493473, 3050775, 2759560, 2304444, 2426504, 2568938, 1785638, 1447162,
                    1005011, 330870, 130632, 21208))

            return AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .xAxisArray(arrayOf(aaXAxis1, aaXAxis2))
                .yAxis(aaYAxis)
                .plotOptions(aaPlotOptions)
                .tooltip(aaTooltip)
                .series(arrayOf(aaSeriesElement1, aaSeriesElement2))
        }

    }
}