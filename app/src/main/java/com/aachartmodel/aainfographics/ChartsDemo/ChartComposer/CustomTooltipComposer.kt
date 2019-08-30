/**
 * Copyright (C), 2015-2019,
 * FileName: CustomTooltipComposer
 * Author: ios-fn
 * Date: 2019-06-22 19:41
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

import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAOptions
import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAStyle
import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AATooltip
import com.example.chartcorekotlin.AAChartConfiger.*

class CustomTooltipComposer {
    companion object {
     fun customAreaChartTooltipStyleWithFormatterFunction1(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Area)//图形类型
            .title("近三个月金价起伏周期图")//图表主标题
            .subtitle("金价(元/克)")//图表副标题
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .categories(arrayOf(
                "10-01", "10-02", "10-03", "10-04", "10-05", "10-06", "10-07", "10-08", "10-09", "10-10", "10-11",
                "10-12", "10-13", "10-14", "10-15", "10-16", "10-17", "10-18", "10-19", "10-20", "10-21", "10-22",
                "10-23", "10-024", "10-25", "10-26", "10-27", "10-28", "10-29", "10-30", "10-31", "11-01", "11-02",
                "11-03", "11-04", "11-05", "11-06", "11-07", "11-08", "11-09", "11-10", "11-11", "11-12", "11-13",
                "11-14", "11-15", "11-16", "11-17", "11-18", "11-19", "11-20", "11-21", "11-22", "11-23", "11-024",
                "11-25", "11-26", "11-27", "11-28", "11-29", "11-30", "12-01", "12-02", "12-03", "12-04", "12-05",
                "12-06", "12-07", "12-08", "12-09", "12-10", "12-11", "12-12", "12-13", "12-14", "12-15", "12-16",
                "12-17", "12-18", "12-19", "12-20", "12-21", "12-22", "12-23", "12-024", "12-25", "12-26", "12-27",
                "12-28", "12-29", "12-30"))
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
                    .lineWidth(3f)
                    .color("#FFD700"/*纯金色*/)
                    .fillOpacity(0.5f)
                    .data(arrayOf(
                        1.51, 6.7, 0.94, 1.44, 1.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                        4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.51, 12.7, 0.94, 1.44,
                        18.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46,
                        3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.33, 4.68, 1.31, 1.10, 13.9, 1.10, 1.16, 1.67,
                        2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05,
                        2.18, 3.24, 3.23, 3.15, 2.90, 1.81, 2.11, 2.43, 5.59, 3.09, 4.09, 6.14, 5.33, 6.05,
                        5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.48))
            ))

        val aaTooltip = AATooltip()
            .useHTML(true)
            .formatter(
             """
function () {
        return ' 🌕 🌖 🌗 🌘 🌑 🌒 🌓 🌔 <br/> '
        + ' Support JavaScript Function Just Right Now !!! <br/> '
        + ' The Gold Price For <b>2020 '
        +  this.x
        + ' </b> Is <b> '
        +  this.y
        + ' </b> Dollars ';
        }
             """.trimIndent()
            )
            .valueDecimals(2)//设置取值精确到小数点后几位//设置取值精确到小数点后几位
            .backgroundColor("#000000")
            .borderColor("#000000")
            .style(
                AAStyle()
                    .color("#FFD700")
                    .fontSize(12f)
            )
        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
         aaOptions.tooltip(aaTooltip)
        return aaOptions
    }

     fun customAreaChartTooltipStyleWithFormatterFunction2(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Area)//图形类型
            .title("2014 ~ 2020 汪星人生存指数")//图表主标题
            .subtitle("数据来源：www.无任何可靠依据.com")//图表副标题
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .colorsTheme(arrayOf<Any>("#ff0000", "#0000ff"))
            .stacking(AAChartStackingType.Normal)
            .series(arrayOf(
                AASeriesElement()
                    .name("🐶狗子")
                    .lineWidth(5f)
                    .fillOpacity(0.5f)
                    .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58,
                        0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36)),
                AASeriesElement()
                    .name("🌲树木")
                    .lineWidth(5f)
                    .fillOpacity(0.5f)
                    .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46,
                        0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67))
            ))

        val aaTooltip = AATooltip()
            .useHTML(true)
            .formatter(
                """
function () {
        var s = '第' + '<b>' +  this.x + '</b>' + '年' + '<br/>';
        var colorDot1 = '<span style=\"' + 'color:#1e90ff; font-size:13px\"' + '>◉</span> ';
        var colorDot2 = '<span style=\"' + 'color:#ef476f; font-size:13px\"' + '>◉</span> ';
        var s1 = colorDot1  + this.points[0].series.name + ': ' + this.points[0].y + '只' + '<br/>';
        var s2 =  colorDot2 + this.points[1].series.name + ': ' + this.points[1].y + '棵';
        s += s1 + s2;
        return s;
    }
             """.trimIndent()
            )
        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
         aaOptions.tooltip = aaTooltip
        return aaOptions
    }

     fun customAreaChartTooltipStyleWithFormatterFunction3(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Area)//图形类型
            .title("2014 ~ 2020 汪星人生存指数")//图表主标题
            .subtitle("数据来源：www.无任何可靠依据.com")//图表副标题
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .categories(arrayOf("临床一期", "临床二期", "临床三期"))
            .series(arrayOf(
                AASeriesElement()
                    .name("上市")
                    .data(arrayOf(0, 0, 7)),
                AASeriesElement()
                    .name("中止")
                    .data(arrayOf(4, 5, 1)),
                AASeriesElement()
                    .name("无进展")
                    .data(arrayOf(2, 0, 1)),
                AASeriesElement()
                    .name("进行中")
                    .data(arrayOf(3, 5, 2))
            ))

        val aaTooltip = AATooltip()
            .useHTML(true)
            .formatter(
                """
function () {
        var colorDot0 = '<span style=\"' + 'color:red; font-size:13px\"' + '>◉</span> ';
        var colorDot1 = '<span style=\"' + 'color:mediumspringgreen; font-size:13px\"' + '>◉</span> ';
        var colorDot2 = '<span style=\"' + 'color:deepskyblue; font-size:13px\"' + '>◉</span> ';
        var colorDot3 = '<span style=\"' + 'color:sandybrown; font-size:13px\"' + '>◉</span> ';
        var colorDotArr = [colorDot0, colorDot1, colorDot2, colorDot3];
        var wholeContentString = this.points[0].x + '<br/>';
        for (var i = 0;i < 4;i++) {
            var yValue = this.points[i].y;
            if (yValue != 0) {
                var prefixStr = colorDotArr[i];
                wholeContentString += prefixStr + this.points[i].series.name + ': ' + this.points[i].y + '<br/>';
            }
        }
        return wholeContentString;
    }
                """.trimIndent()
            )
        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
         aaOptions.tooltip = aaTooltip
        return aaOptions
    }

     fun customAreaChartTooltipStyleWithFormatterFunction4(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline)//图形类型
            .title("")//图表主标题
            .subtitle("")//图表副标题
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .colorsTheme(arrayOf<Any>("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .markerRadius(0f)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0f)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50,
                        0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36)),
                AASeriesElement()
                    .name("Berlin Hot")
                    .lineWidth(5.0f)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54,
                        0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67)),
                AASeriesElement()
                    .name("New York Hot")
                    .lineWidth(5.0f)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60,
                        0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64)),
                AASeriesElement()
                    .name("London Hot")
                    .lineWidth(5.0f)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65,
                        0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53))
            ))

        val aaTooltip = AATooltip()
            .useHTML(true)
            .formatter(
                """
function () {
        var colorsArr = ["mediumspringgreen", "deepskyblue", "red", "sandybrown"];
        var wholeContentString ='<span style=\"' + 'color:lightGray; font-size:13px\"' + '>◉ Time: ' + this.x + ' year</span><br/>';
        for (var i = 0;i < 4;i++) {
            var thisPoint = this.points[i];
            var yValue = thisPoint.y;
            if (yValue != 0) {
                var spanStyleStartStr = '<span style=\"' + 'color:'+ colorsArr[i] + '; font-size:13px\"' + '>◉ ';
                var spanStyleEndStr = '</span> <br/>';
                wholeContentString += spanStyleStartStr + thisPoint.series.name + ': ' + thisPoint.y + '℃' + spanStyleEndStr;
            }
        }
        return wholeContentString;
    }
                """.trimIndent()
            )
            .backgroundColor("#050505")
            .borderColor("#050505")
        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
         aaOptions.tooltip = aaTooltip
        return aaOptions
    }

     fun customBoxplotTooltipContent(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Boxplot)
            .title("BOXPLOT CHART")
            .subtitle("virtual data")
            .yAxisTitle("℃")
            .series(arrayOf(
                    AASeriesElement()
                        .name("Observed Data")
                        .color("#ef476f")
                        .fillColor(AAGradientColor.deepSeaColor())
                        .data(arrayOf(
                                arrayOf(760, 801, 848, 895, 965),
                                arrayOf(733, 853, 939, 980, 1080),
                                arrayOf(714, 762, 817, 870, 918),
                                arrayOf(724, 802, 806, 871, 950),
                                arrayOf(834, 836, 864, 882, 910)
                            )
                        )
                )
            )

        val pointFormatStr = (
                "◉</span> <b> {series.name}</b><br/>"
                + "最大值: {point.high}<br/>"
                + "Q2: {point.q3}<br/>"
                + "中位数: {point.median}<br/>"
                + "Q1: {point.q1}<br/>"
                + "最小值: {point.low}<br/>"
                )

        val aaTooltip = AATooltip()
            .useHTML(true)
            .headerFormat("<em>实验号码： {point.key}</em><br/>")
            .pointFormat(pointFormatStr)
            .valueDecimals(2)//设置取值精确到小数点后几位//设置取值精确到小数点后几位
            .backgroundColor("#000000")
            .borderColor("#000000")
            .style(AAStyle()
                    .color("#1e90ff")
                    .fontSize(12f)
            )
        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
         aaOptions.tooltip = aaTooltip
        return aaOptions
    }
    }
}