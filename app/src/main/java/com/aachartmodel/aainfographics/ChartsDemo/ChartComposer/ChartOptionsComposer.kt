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
import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.*

class ChartOptionsComposer {
    companion object {

        fun customChartLegendStyle(): AAOptions {
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
                .verticalAlign(AAChartVerticalAlignType.Top)
                .layout(AAChartLayoutType.Vertical)
                .align(AAChartAlignType.Right)

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
        val zonesArr:Array<Any> = arrayOf(
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
                                .fontWeight(AAChartFontWeightType.Bold)
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
                                .fontWeight(AAChartFontWeightType.Bold)
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
                                .fontWeight(AAChartFontWeightType.Bold)
                        )
                )
        )
         aaOptions.yAxis?.plotLines(aaPlotLinesElementsArr)

         return aaOptions
    }

     fun customAATooltipWithJSFunction(): AAOptions {
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

         fun configureXAxisLabelsFontColorWithHTMLString(): AAOptions {
            val categories = arrayOf(
                "<font color=\\\"#CC0066\\\">孤岛危机<\\/font>",
                "<font color=\\\"#CC0033\\\">使命召唤<\\/font>",
                "<font color=\\\"#FF0066\\\">荣誉勋章<\\/font>",
                "<font color=\\\"##66FF99\\\">狙击精英<\\/font>",
                "<font color=\\\"#00FF00\\\">神秘海域<\\/font>",
                "<font color=\\\"#00CC00\\\">美国末日<\\/font>",
                "<font color=\\\"#666FF\\\">巫师狂猎<\\/font>",
                "<font color=\\\"#000CC\\\">死亡搁浅<\\/font>",
                "<font color=\\\"#9933CC\\\">地狱边境<\\/font>",
                "<font color=\\\"##FFCC99\\\">忍者之印<\\/font>",
                "<font color=\\\"#FFCC00\\\">合金装备<\\/font>",
                "<font color=\\\"#CC99090\\\">全战三国<\\/font>"
            )

            val aaChartModel = AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("")
                .subtitle("")
                .stacking(AAChartStackingType.Normal)
                .categories(categories)
                .dataLabelsEnabled(false)
                .markerRadius(0f)
                .series(arrayOf(
                        AASeriesElement()
                            .name("Berlin Hot")
                            .color(AAGradientColor.mysticMauveColor())
                            .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                    )
                )

            val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
            aaOptions.xAxis?.labels?.useHTML(true)
            return aaOptions
        }

         fun configureXAxisLabelsFontColorAndFontSizeWithHTMLString(): AAOptions {
            val categories = arrayOf(
                "<span style=\\\"color:#CC0066;font-weight:bold;font-size:10px\\\">使命召唤</span>",
                "<span style=\\\"color:#CC0033;font-weight:bold;font-size:11px\\\">荣誉勋章</span>",
                "<span style=\\\"color:#FF0066;font-weight:bold;font-size:12px\\\">狙击精英</span>",
                "<span style=\\\"color:#66FF99;font-weight:bold;font-size:13px\\\">神秘海域</span>",
                "<span style=\\\"color:#00FF00;font-weight:bold;font-size:14px\\\">美国末日</span>",
                "<span style=\\\"color:#00CC00;font-weight:bold;font-size:15px\\\">巫师狂猎</span>",
                "<span style=\\\"color:#666FF;font-weight:bold;font-size:15px\\\">孤岛危机</span>",
                "<span style=\\\"color:#000CC;font-weight:bold;font-size:14px\\\">地狱边境</span>",
                "<span style=\\\"color:#9933CC;font-weight:bold;font-size:13px\\\">忍者之印</span>",
                "<span style=\\\"color:#FFCC99;font-weight:bold;font-size:12px\\\">合金装备</span>",
                "<span style=\\\"color:#FFCC00;font-weight:bold;font-size:11px\\\">全战三国</span>",
                "<span style=\\\"color:#CC99090;font-weight:bold;font-size:10px\\\">死亡搁浅</span>"
            )

            val aaChartModel = AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("")
                .subtitle("")
                .stacking(AAChartStackingType.Normal)
                .categories(categories)
                .dataLabelsEnabled(false)
                .markerRadius(0f)
                .series(arrayOf(
                        AASeriesElement()
                            .name("Berlin Hot")
                            .color(AAGradientColor.deepSeaColor())
                            .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                    )
                )

            val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
            aaOptions.xAxis?.labels?.useHTML(true)

            return aaOptions
        }

         fun configure_DataLabels_XAXis_YAxis_Legend_Style(): AAOptions {
            val backgroundColorGradientColor = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                "#4F00BC",
                "#29ABE2"//颜色字符串设置支持十六进制类型和 rgba 类型
            )

            val fillColorGradientColor = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                "rgba(256,256,256,0.3)",
                "rgba(256,256,256,1.0)"//颜色字符串设置支持十六进制类型和 rgba 类型
            )


            val aaChartModel = AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("")
                .subtitle("")
                .backgroundColor(backgroundColorGradientColor)
                .yAxisVisible(true)
                .yAxisTitle("")
                .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"))
                .markerRadius(0f)
                .series(arrayOf(
                        AASeriesElement()
                            .name("Berlin Hot")
                            .color(AAColor.whiteColor())
                            .lineWidth(7f)
                            .fillColor(fillColorGradientColor)
                            .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                    )
                )
            val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
            aaOptions.plotOptions?.areaspline
                ?.dataLabels(AADataLabels()
                             .enabled(true)
                             .style(AAStyle()
                                    .color(AAColor.blackColor())
                                    .fontSize(14f)
                                    .fontWeight(AAChartFontWeightType.Thin)))

            val aaCrosshair = AACrosshair()
                .dashStyle(AAChartLineDashStyleType.LongDashDot)
                .color(AAColor.whiteColor())
                .width(1f)

            val aaLabels = AALabels()
                .useHTML(true)
                .style(AAStyle()
                        .fontSize(10f)
                        .fontWeight(AAChartFontWeightType.Bold)
                        .color(AAColor.whiteColor())//轴文字颜色
                )

            aaOptions.yAxis!!
                .opposite(true)
                .tickWidth(2f)
                .lineWidth(1.5f)//Y轴轴线颜色
                .lineColor(AAColor.whiteColor())//Y轴轴线颜色
                .gridLineWidth(0f)//Y轴网格线宽度
                .crosshair(aaCrosshair)
                .labels(aaLabels)

            aaOptions.xAxis!!
                .tickWidth(2f)//X轴刻度线宽度
                .lineWidth(1.5f)//X轴轴线宽度
                .lineColor(AAColor.whiteColor())//X轴轴线颜色
                .crosshair(aaCrosshair)
                .labels(aaLabels)


            //设定图例项的CSS样式。只支持有关文本的CSS样式设定。
            /*默认是：{
         "color": "#333333",
         "cursor": "pointer",
         "fontSize": "12px",
         "fontWeight": "bold"
         }
         */

            aaOptions.legend!!
                .itemStyle(
                    AAItemStyle()
                        .color(AAColor.whiteColor())//字体颜色
                        .fontSize(13f)//字体大小
                        .fontWeight("thin")//字体为细体字

                )

            return aaOptions
        }
         fun configureXAxisPlotBand(): AAOptions {
            val aaChartModel = AAChartModel()
                .chartType(AAChartType.Areaspline)
                .title("")
                .subtitle("")
                .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月",
                    "七月", "八月", "九月", "十月", "十一月", "十二月"))
                .yAxisTitle("")
                .yAxisGridLineWidth(0f)
                .markerRadius(8f)
                .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
                .series(arrayOf(
                        AASeriesElement()
                            .name("New York Hot")
                            .lineWidth(5.0f)
                            .color("rgba(220,20,60,1)")////猩红色, alpha 透明度 1
                            .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6)),
                        AASeriesElement()
                            .type(AAChartType.Column)
                            .name("Berlin Hot")
                            .color("#25547c")
                            .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                        )
                )


            val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
            val aaPlotBandsElementArr = arrayOf<AAPlotBandsElement>(
                AAPlotBandsElement()
                    .from(-0.25f)//值域颜色带X轴起始值
                    .to(4.75f)//值域颜色带X轴结束值
                    .color("#06caf4")//值域颜色带填充色
                ,
                AAPlotBandsElement()
                    .from(4.75f)
                    .to(8.25f)
                    .color("#ffd066")
                ,
                AAPlotBandsElement()
                    .from(8.25f)
                    .to(11.25f)
                    .color("#04d69f")
            )

            val aaXAxis = aaOptions.xAxis
            aaXAxis?.plotBands(aaPlotBandsElementArr)

            return aaOptions
        }

         fun configureTheMirrorColumnChart(): AAOptions {
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

            val aaYAxis1 = AAYAxis()
                .visible(true)
                .labels(AALabels()
                        .enabled(true)//设置 y 轴是否显示数字
                        .style(AAStyle()
                                .color("#ff0000")//yAxis Label font color
                                .fontSize(15f)//yAxis Label font size
                                .fontWeight(AAChartFontWeightType.Bold)//yAxis Label font weight
                        )
                )
                .gridLineWidth(0f)// Y 轴网格线宽度
                .title(AATitle()
                        .text("收入"))//Y 轴标题

            val aaYAxis2 = AAYAxis()
                .visible(true)
                .opposite(true)
                .title(AATitle()
                        .text("支出"))

            return AAOptions()
                .chart(AAChart()
                        .type(AAChartType.Column))
                .title(AATitle()
                        .text("正负镜像柱形图")
                        .style(AAStyle()
                                .color(AAColor.whiteColor())
                                .fontSize(18f)))
                .xAxis(AAXAxis()
                        .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月",
                                "七月", "八月", "九月", "十月", "十一月", "十二月")))
                .yAxisArray(arrayOf(aaYAxis1, aaYAxis2))
                .plotOptions(AAPlotOptions()
                             .series(AASeries()
                                     .animation(AAAnimation()
                                                .duration(800)
                                                .easing(AAChartAnimationType.EaseInCirc)))
                        .column(AAColumn()
                                .grouping(false)
                                .borderWidth(0f)
                                .borderRadius(5f)))
                .series(arrayOf(
                        AASeriesElement()
                            .name("收入")
                            .color(gradientColorDic1)
                            .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9,7.0, 6.9, 9.5, 14.5)),
                        AASeriesElement()
                            .name("支出")
                            .color(gradientColorDic2)
                            .data(arrayOf(-20.1, -14.1, -8.6, -2.5, -0.8, -5.7, -11.3, -17.0, -22.0, -24.8, -24.1, -20.1, -14.1, -8.6, -2.5)
                            )))

        }

         fun configureDoubleYAxisChartOptions(): AAOptions {
            val aaTitle = AATitle()
                .text("")

            val aaXAxis = AAXAxis()
                .visible(true)
                .min(0f)
                .categories(arrayOf("Java", "Swift", "Python", "Ruby", "PHP", "Go","C",
                        "C#", "C++", "Perl", "R", "MATLAB", "SQL"))

            val aaYAxisTitleStyle = AAStyle()
                .color("#1e90ff")//Title font color
                .fontSize(14f)//Title font size
                .fontWeight(AAChartFontWeightType.Bold)//Title font weight
                .textOutline("0px 0px contrast")

            val aaYAxisLabels = AALabels()
                .enabled(true)//设置 y 轴是否显示数字
                .style(AAStyle()
                        .color("#ff0000")//yAxis Label font color
                        .fontSize(15f)//yAxis Label font size
                        .fontWeight(AAChartFontWeightType.Bold)//yAxis Label font weight
                )

            val yAxisOne = AAYAxis()
                .visible(true)
                .labels(aaYAxisLabels)
                .title(AATitle()
                        .text("冬季降雨量")
                        .style(aaYAxisTitleStyle)
                )
                .opposite(true)


            val yAxisTwo = AAYAxis()
                .visible(true)
                .labels(aaYAxisLabels)
                .title(AATitle()
                        .text("夏季降雨量")
                        .style(aaYAxisTitleStyle)
                )

            val aaTooltip = AATooltip()
                .enabled(true)
                .shared(true)

            val gradientColorDic1 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#f54ea2",
                "#ff7676"//颜色字符串设置支持十六进制类型和 rgba 类型
            )

            val gradientColorDic2 = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToTop,
                "#17ead9",
                "#6078ea"//颜色字符串设置支持十六进制类型和 rgba 类型
            )

            val aaMarker = AAMarker()
                .radius(7f)//曲线连接点半径，默认是4
                .symbol(AAChartSymbolType.Circle.value)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                .fillColor("#ffffff")//点的填充色(用来设置折线连接点的填充色)
                .lineWidth(3f)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                .lineColor("")//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)

            val element1 = AASeriesElement()
                .name("2017")
                .type(AAChartType.Areaspline)
                //          .borderRadius(4)
                .color(gradientColorDic1)
                .marker(aaMarker)
                .yAxis(1)
                .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))

            val element2 = AASeriesElement()
                .name("2018")
                .type(AAChartType.Column)
                .color(gradientColorDic2)
                .yAxis(0)
                .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))


            return AAOptions()
                .title(aaTitle)
                .xAxis(aaXAxis)
                .yAxisArray(arrayOf(yAxisOne, yAxisTwo))
                .tooltip(aaTooltip)
                .series(arrayOf(element1, element2))
        }

         fun configureTripleYAxesMixedChart(): AAOptions {
            val colorsThemeArr = arrayOf("red", "mediumspringgreen", "deepskyblue")

            val aaTitle = AATitle()
                .text("东京月平均天气数据")

            val aaSubtitle = AASubtitle()
                .text("数据来源: WorldClimate.com")

            val aaXAxis = AAXAxis()
                .visible(true)
                .min(0f)
                .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月",
                        "七月", "八月", "九月", "十月", "十一月", "十二月"))

            val yAxis1 = AAYAxis()
                .visible(true)
                .gridLineWidth(0f)
                .labels(AALabels()
                        .enabled(true)//设置 y 轴是否显示数字
                        .format("{value}°C")
                        .style(AAStyle()
                                .color(colorsThemeArr[2])))//yAxis Label font color
                .title(AATitle()
                        .text("温度")
                        .style(AAStyle()
                                .color(colorsThemeArr[2])))
                .opposite(true)

            val yAxis2 = AAYAxis()
                .visible(true)
                .gridLineWidth(0f)
                .labels(AALabels()
                        .enabled(true)//设置 y 轴是否显示数字
                        .format("{value}°mm")
                        .style(AAStyle()
                                .color(colorsThemeArr[0])))//yAxis Label font color
                .title(AATitle()
                        .text("降雨量")
                        .style(AAStyle()
                                .color(colorsThemeArr[0])))

            val yAxis3 = AAYAxis()
                .visible(true)
                .gridLineWidth(0f)
                .labels(AALabels()
                        .enabled(true)//设置 y 轴是否显示数字
                        .format("{value}°mb")
                        .style(AAStyle()
                                .color(colorsThemeArr[1])))//yAxis Label font color
                .title(AATitle()
                        .text("海平面气压")
                        .style(AAStyle()
                                .color(colorsThemeArr[1])))
                .opposite(true)


            val aaTooltip = AATooltip()
                .enabled(true)
                .shared(true)

            val aaLegend = AALegend()
                .enabled(true)
                .floating(true)
                .layout(AAChartLayoutType.Vertical)
                .align(AAChartAlignType.Left)
                .x(80f)
                .verticalAlign(AAChartVerticalAlignType.Top)
                .y(55f)

            val element1 = AASeriesElement()
                .name("降雨量")
                .type(AAChartType.Column)
                .yAxis(1)
                .data(arrayOf(49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4))
                .tooltip(AATooltip()
                        .valueSuffix(" mm"))

            val element2 = AASeriesElement()
                .name("海平面气压")
                .type(AAChartType.Line)
                .yAxis(2)
                .data(arrayOf(1016, 1016, 1015.9, 1015.5, 1012.3, 1009.5, 1009.6, 1010.2, 1013.1, 1016.9, 1018.2, 1016.7))
                .dashStyle(AAChartLineDashStyleType.ShortDot)
                .tooltip(AATooltip()
                        .valueSuffix(" mb"))

            val element3 = AASeriesElement()
                .name("温度")
                .type(AAChartType.Line)
                .yAxis(0)
                .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6))
                .tooltip(AATooltip()
                        .valueSuffix(" ℃"))

            return AAOptions()
                .title(aaTitle)
                .subtitle(aaSubtitle)
                .colors(colorsThemeArr as Array<Any>)
                .xAxis(aaXAxis)
                .yAxisArray(arrayOf(yAxis1, yAxis2, yAxis3))
                .tooltip(aaTooltip)
                .legend(aaLegend)
                .series(arrayOf(element1, element2, element3))
        }

       fun customLineChartDataLabelsFormat(): AAOptions {
            val aaChartModel = AAChartModel()
                //选择图表类型
                .chartType(AAChartType.Line)
                .colorsTheme(arrayOf("#465DBC"))
                //title标题
                .title("最近三十分钟数据展示")
                //title字体大小
                .titleFontSize(20f)
                //title字体颜色
                .titleFontColor("#0F0F0F")
                //坐标轴字体颜色
                .axesTextColor("#0F0F0F")
                //背景颜色
                .zoomType(AAChartZoomType.XY)
                .backgroundColor("#FFFFFF")
                //数据是否显示
                .dataLabelsEnabled(true)
                //x轴是否显示数据
                .xAxisLabelsEnabled(true)
                //x轴显示的数据间隔
                .xAxisTickInterval(5)
                //y轴是否显示数据
                .yAxisLabelsEnabled(true)
                //y轴标题
                .yAxisTitle("湿度%")
                //y轴最大值
                .yAxisMax(100.0f)
                //y轴最小值
                .yAxisMin(0.0f)
                .yAxisAllowDecimals(true) //y轴数据
                .series(arrayOf(
                        AASeriesElement()
                            .name("湿度")
                            .data(arrayOf(44.0999, 44.8880, 44.7770, 43.0066, 43.6660, 43.5550)
                            )
                    )
                )
            val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
            aaOptions.plotOptions?.line?.dataLabels?.format =
                "{point.y:.4f} ℃" //保留 Y 轴值的小数点后 4 位
            return aaOptions
        }

       fun configureDoubleYAxesAndColumnLineMixedChart(): AAOptions {
            val stopsArr: Array<Any> = arrayOf(
                    arrayOf(0.0, "rgba(156,107,211,0.5)"),
                    arrayOf(0.2, "rgba(156,107,211,0.3)"),
                    arrayOf(1.0, "rgba(156,107,211,0)")
                )
            val gradientColorDic1: Map<String, *> = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                stopsArr
            )
            val gradientColorDic2: Map<String, *> = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottom,
                "#956FD4",
                "#3EACE5" //颜色字符串设置支持十六进制类型和 rgba 类型
            )
            val category = arrayOf(
                "市区", "万州", "江北", "南岸", "北碚", "綦南", "长寿", "永川", "璧山", "江津",
                "城口", "大足", "垫江", "丰都", "奉节", "合川", "江津区", "开州", "南川", "彭水",
                "黔江", "石柱", "铜梁", "潼南", "巫山", "巫溪", "武隆", "秀山", "酉阳", "云阳",
                "忠县", "川东", "检修"
            )
            val goalValuesArr = arrayOf(
                18092, 20728, 24045, 28348, 32808
                , 36097, 39867, 44715, 48444, 50415
                , 56061, 62677, 59521, 67560, 18092, 20728, 24045, 28348, 32808
                , 36097, 39867, 44715, 48444, 50415, 36097, 39867, 44715, 48444, 50415
                , 50061, 32677, 49521, 32808
            )
            val realValuesArr = arrayOf(
                4600, 5000, 5500, 6500, 7500
                , 8500, 9900, 12500, 14000, 21500
                , 23200, 24450, 25250, 33300, 4600, 5000, 5500, 6500, 7500
                , 8500, 9900, 22500, 14000, 21500, 8500, 9900, 12500, 14000, 21500
                , 23200, 24450, 25250, 7500
            )
            val rateValuesArr = arrayOfNulls<Any>(33) 
            for (i in 0..32) {
                val goalValue: Float = goalValuesArr[i].toFloat()
                val realValue: Float = realValuesArr[i].toFloat()
                val rateValue = realValue / goalValue
                rateValuesArr[i] = rateValue
            }
            val aaChart = AAChart()
                .backgroundColor("#191E40")
            val aaTitle = AATitle()
                .text("")
            val aaLabels = AALabels()
                .enabled(true)
                .style(AAStyle()
                        .color(AAColor.lightGrayColor())
                )
            val aaXAxis = AAXAxis()
                .visible(true)
                .labels(aaLabels)
                .min(0f)
                .categories(category)
            val aaYAxisTitleStyle = AAStyle()
                .color("#1e90ff") //Title font color
                .fontSize(14f) //Title font size
                .fontWeight(AAChartFontWeightType.Bold) //Title font weight
                .textOutline("0px 0px contrast")
            val yAxis1 = AAYAxis()
                .visible(true)
                .labels(aaLabels)
                .gridLineWidth(0f)
                .title(AATitle()
                        .text("已贯通 / 计划贯通")
                        .style(aaYAxisTitleStyle)
                )
            val yAxis2 = AAYAxis()
                .visible(true)
                .labels(aaLabels)
                .gridLineWidth(0f)
                .title(AATitle()
                        .text("贯通率")
                        .style(aaYAxisTitleStyle)
                )
                .opposite(true)
            val aaTooltip = AATooltip()
                .enabled(true)
                .shared(true)
            val aaPlotOptions = AAPlotOptions()
                .series(
                    AASeries()
                        .animation(
                            AAAnimation()
                                .easing(AAChartAnimationType.EaseTo)
                                .duration(1000)
                        )
                )
                .column(AAColumn()
                        .grouping(false)
                        .pointPadding(0f)
                        .pointPlacement(0f)
                )
            val aaLegend = AALegend()
                .enabled(true)
                .itemStyle(
                    AAItemStyle()
                        .color(AAColor.lightGrayColor())
                )
                .floating(true)
                .layout(AAChartLayoutType.Horizontal)
                .align(AAChartAlignType.Left)
                .x(30f)
                .verticalAlign(AAChartVerticalAlignType.Top)
                .y(10f)
            val goalValuesElement: AASeriesElement = AASeriesElement()
                .name("计划贯通")
                .type(AAChartType.Column)
                .borderWidth(0f)
                .color(gradientColorDic1)
                .yAxis(0)
                .data(goalValuesArr as Array<Any>)
            val realValuesElement: AASeriesElement = AASeriesElement()
                .name("已贯通")
                .type(AAChartType.Column)
                .borderWidth(0f)
                .color(gradientColorDic2)
                .yAxis(0)
                .data(realValuesArr as Array<Any>)
            val rateValuesElement = AASeriesElement()
                .name("贯通率")
                .type(AAChartType.Line)
                .marker(
                    AAMarker()
                        .radius(7f) //曲线连接点半径，默认是4
                        .symbol(AAChartSymbolType.Circle.value) //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                        .fillColor("#ffffff") //点的填充色(用来设置折线连接点的填充色)
                        .lineWidth(3f) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                        .lineColor("") //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                )
                .color("#F02FC2")
                .yAxis(1)
                .data(rateValuesArr as Array<Any>)
            return AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .xAxis(aaXAxis)
                .yAxisArray(arrayOf(yAxis1, yAxis2))
                .tooltip(aaTooltip)
                .plotOptions(aaPlotOptions)
                .legend(aaLegend)
                .series(arrayOf(
                        goalValuesElement,
                        realValuesElement,
                        rateValuesElement
                    )
                )
        }

       fun configureDoubleYAxesMarketDepthChart(): AAOptions {
            val aaChart = AAChart()
                .type(AAChartType.Area)
            val aaTitle = AATitle()
                .text("ETH-BTC 市场深度图")
            val aaSubtitle = AASubtitle()
                .text("数据来源: https://github.com/AAChartModel")
            val aaXAxis = AAXAxis()
                .visible(true)
                .plotLines(arrayOf(
                        AAPlotLinesElement()
                            .color(AAColor.redColor())
                            .value(0.1523f)
                            .width(1.5f)
                            .label(
                                AALabel()
                                    .text("实际价格")
                                    .style(AAChartLineDashStyleType.ShortDashDotDot) //                                .rotation(90)
                            )
                    )
                )
            val yAxis1 = AAYAxis()
                .visible(true)
                .lineWidth(1f)
                .title(AATitle()
                        .text("")
                )
                .tickWidth(1f)
                .tickLength(5f)
                .tickPosition("inside")
                .gridLineWidth(1f)
                .labels(AALabels()
                        .enabled(true) //设置 y 轴是否显示数字
                        .align(AAChartAlignType.Left)
                        .x(8f)
                )
            val yAxis2 = AAYAxis()
                .opposite(true)
                .visible(true)
                .lineWidth(1f)
                .title(AATitle()
                        .text("")
                )
                .tickWidth(1f)
                .tickLength(5f)
                .tickPosition("inside")
                .gridLineWidth(0f)
                .labels(AALabels()
                        .enabled(true) //设置 y 轴是否显示数字
                        .align(AAChartAlignType.Right)
                        .x(-8f)
                )
            val aaTooltip = AATooltip()
                .enabled(true)
                .headerFormat("<span style=\\\"font-size=10px;\\\">Price: {point.key}</span><br/>")
                .valueDecimals(2)
            val aaLegend = AALegend()
                .enabled(false)
            val element1 = AASeriesElement()
                .name("Bids")
                .color("#04d69f")
                .step(true)
                .data(arrayOf(
                        arrayOf(0.1524, 0.948665),
                        arrayOf(0.1539, 35.510715),
                        arrayOf(0.154, 39.883437),
                        arrayOf(0.1541, 40.499661),
                        arrayOf(0.1545, 43.262994000000006),
                        arrayOf(0.1547, 60.14799400000001),
                        arrayOf(0.1553, 60.30799400000001),
                        arrayOf(0.1558, 60.55018100000001),
                        arrayOf(0.1564, 68.381696),
                        arrayOf(0.1567, 69.46518400000001),
                        arrayOf(0.1569, 69.621464),
                        arrayOf(0.157, 70.398015),
                        arrayOf(0.1574, 70.400197),
                        arrayOf(0.1575, 73.199217),
                        arrayOf(0.158, 77.700017),
                        arrayOf(0.1583, 79.449017),
                        arrayOf(0.1588, 79.584064),
                        arrayOf(0.159, 80.584064),
                        arrayOf(0.16, 81.58156),
                        arrayOf(0.1608, 83.38156)
                    )
                )
            val element2 = AASeriesElement()
                .name("Asks")
                .color("#1e90ff")
                .step(true)
                .data(arrayOf(
                        arrayOf(0.1435, 242.521842),
                        arrayOf(0.1436, 206.49862099999999),
                        arrayOf(0.1437, 205.823735),
                        arrayOf(0.1438, 197.33275),
                        arrayOf(0.1439, 153.677454),
                        arrayOf(0.144, 146.007722),
                        arrayOf(0.1442, 82.55212900000001),
                        arrayOf(0.1443, 59.152814000000006),
                        arrayOf(0.1444, 57.942260000000005),
                        arrayOf(0.1445, 57.483850000000004),
                        arrayOf(0.1446, 52.39210800000001),
                        arrayOf(0.1447, 51.867208000000005),
                        arrayOf(0.1448, 44.104697),
                        arrayOf(0.1449, 40.131217),
                        arrayOf(0.145, 31.878217),
                        arrayOf(0.1451, 22.794916999999998),
                        arrayOf(0.1453, 12.345828999999998),
                        arrayOf(0.1454, 10.035642),
                        arrayOf(0.148, 9.326642),
                        arrayOf(0.1522, 3.76317)
                    )
                )
            return AAOptions()
                .chart(aaChart)
                .title(aaTitle)
                .subtitle(aaSubtitle)
                .xAxis(aaXAxis)
                .yAxisArray(arrayOf(yAxis1, yAxis2))
                .tooltip(aaTooltip)
                .legend(aaLegend)
                .series(arrayOf(element1, element2))
        }

       fun customAreaChartTooltipStyleLikeHTMLTable(): AAOptions {
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
                .chartType(AAChartType.Areaspline) //图表类型
                .title("") //图表主标题
                .subtitle("") //图表副标题
                .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
                .stacking(AAChartStackingType.Normal)
                .yAxisTitle("") //设置 Y 轴标题
                .yAxisVisible(false)
                .markerRadius(0f)
                .series(arrayOf(element1, element2, element3, element4))

            val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
            aaOptions.tooltip!!
                .shared(true)
                .useHTML(true)
                .headerFormat("<small>{point.key} 摄氏度</small><table>")
                .pointFormat("<tr><td style=\\\"color: {series.color}\\\">{series.name}: </td>"
                            + "<td style=\\\"text-align: right\\\"><b>{point.y}EUR</b></td></tr>"
                )
                .footerFormat("</table>")
                .valueDecimals(2)
            return aaOptions
        }


    }
}