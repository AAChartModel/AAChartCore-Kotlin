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
package com.github.aachartmodel.aainfographics.demo.chartcomposer

import android.util.DisplayMetrics
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.AAColor
import com.github.aachartmodel.aainfographics.aatools.AAGradientColor
import com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection
import com.github.aachartmodel.aainfographics.aatools.AARgba

object JSFunctionForAATooltipComposer {

    fun customAreaChartTooltipStyleWithSimpleFormatString(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Area)//图形类型
            .title("近三个月金价起伏周期图")//图表主标题
            .subtitle("金价(元/克)")//图表副标题
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .zoomType(AAChartZoomType.X)
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
                    .lineWidth(3)
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
            .style(AAStyle()
                .color("#FFD700")
                .fontSize(12))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip(aaTooltip)

        aaOptions.chart
            ?.resetZoomButton(AAResetZoomButton()
                .theme(mapOf(("display" to "none"))) //隐藏图表缩放后的默认显示的缩放按钮
            )

        return aaOptions
    }

    fun customAreaChartTooltipStyleWithDifferentUnitSuffix(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Area)//图形类型
            .title("2014 ~ 2020 汪星人生存指数")//图表主标题
            .subtitle("数据来源：www.无任何可靠依据.com")//图表副标题
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .colorsTheme(arrayOf("#ff0000", "#0000ff"))
            .stacking(AAChartStackingType.Normal)
            .series(arrayOf(
                AASeriesElement()
                    .name("🐶狗子")
                    .lineWidth(5)
                    .fillOpacity(0.5f)
                    .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36)),
                AASeriesElement()
                    .name("🌲树木")
                    .lineWidth(5)
                    .fillOpacity(0.5f)
                    .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67))
            ))

        val aaTooltip = AATooltip()
            .useHTML(true)
            .formatter(
                """
function () {
        var s = '第' + '<b>' +  this.x + '</b>' + '年' + '<br/>';
        let colorDot1 = '<span style=\"' + 'color:#1e90ff; font-size:13px\"' + '>◉</span> ';
        let colorDot2 = '<span style=\"' + 'color:#ef476f; font-size:13px\"' + '>◉</span> ';
        let s1 = colorDot1  + this.points[0].series.name + ': ' + this.points[0].y + '只' + '<br/>';
        let s2 =  colorDot2 + this.points[1].series.name + ': ' + this.points[1].y + '棵';
        s += s1 + s2;
        return s;
    }
             """.trimIndent()
            )
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip = aaTooltip
        return aaOptions
    }


    fun customAreaChartTooltipStyleWithColorfulHtmlLabels(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline)//图形类型
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .markerRadius(0)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36)),
                AASeriesElement()
                    .name("Berlin Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67)),
                AASeriesElement()
                    .name("New York Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64)),
                AASeriesElement()
                    .name("London Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53))
            ))

        val aaTooltip = AATooltip()
            .useHTML(true)
            .formatter(
                """
function () {
        let wholeContentStr ='<span style=\"' + 'color:lightGray; font-size:13px\"' + '>◉ Time: ' + this.x + ' year</span><br/>';
        let length = this.points.length;
        for (let i = 0; i < length; i++) {
            let thisPoint = this.points[i];
            let yValue = thisPoint.y;
            if (yValue != 0) {
                let spanStyleStartStr = '<span style=\"' + 'color:'+ thisPoint.color + '; font-size:13px\"' + '>◉ ';
                let spanStyleEndStr = '</span> <br/>';
                wholeContentStr += spanStyleStartStr + thisPoint.series.name + ': ' + thisPoint.y + '℃' + spanStyleEndStr;
            }
        }
        return wholeContentStr;
    }
                """.trimIndent()
            )
            .backgroundColor("#050505")
            .borderColor("#050505")
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip = aaTooltip
        return aaOptions
    }

    fun customLineChartTooltipStyleWhenValueBeZeroDoNotShow(): AAOptions {
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
        let wholeContentStr = this.points[0].x + '<br/>';
        let length = this.points.length;
        for (let i = 0; i < length; i++) {
            let thisPoint = this.points[i];
            let yValue = thisPoint.y;
            if (yValue != 0) {
                let prefixStr = '<span style=\"' + 'color:'+ thisPoint.color + '; font-size:13px\"' + '>◉ ';
                wholeContentStr += prefixStr + thisPoint.series.name + ': ' + yValue + '<br/>';
            }
        }
        return wholeContentStr;
    }
                """.trimIndent()
            )
        val aaOptions = aaChartModel.aa_toAAOptions()
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
                    .fillColor(AAGradientColor.DeepSea)
                    .data(arrayOf(
                        arrayOf(760, 801, 848, 895, 965),
                        arrayOf(733, 853, 939, 980, 1080),
                        arrayOf(714, 762, 817, 870, 918),
                        arrayOf(724, 802, 806, 871, 950),
                        arrayOf(834, 836, 864, 882, 910)
                    ))))

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
                .fontSize(12)
            )
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip = aaTooltip
        return aaOptions
    }

    fun customYAxisLabels(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Line)//图形类型
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .markerRadius(8)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4))))

        val aaYAxisLabels = AALabels()
            .formatter("""
function () {
        var yValue = this.value;
        if (yValue >= 200) {
            return "极佳";
        } else if (yValue >= 150 && yValue < 200) {
            return "非常棒";
        } else if (yValue >= 100 && yValue < 150) {
            return "相当棒";
        } else if (yValue >= 50 && yValue < 100) {
            return "还不错";
        } else {
            return "一般";
        }
    }
                """.trimIndent()
            )

        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.yAxis?.labels(aaYAxisLabels)

        return aaOptions
    }

    fun customYAxisLabels2(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Line)//图形类型
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .markerRadius(8)
            .series(arrayOf(AASeriesElement()
                .name("Tokyo Hot")
                .lineWidth(5.0)
                .fillOpacity(0.4f)
                .data(arrayOf(229.9, 771.5, 1106.4, 1129.2, 6644.0, 1176.0, 8835.6, 148.5, 8816.4, 6694.1, 7795.6, 9954.4))))

        val aaYAxisLabels = AALabels()
            .style(AAStyle()
                .fontSize(10)
                .fontWeight(AAChartFontWeightType.Bold)
                .color(AAColor.Gray))
            .formatter("""
function () {
        var yValue = this.value;
        if (yValue == 0) {
            return "0";
        } else if (yValue == 2500) {
            return "25%";
        } else if (yValue == 5000) {
            return "50%";
        } else if (yValue == 7500) {
            return "75%";
        } else if (yValue == 10000) {
            return "100%";
        }
    }
                """.trimIndent()
            )

        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.yAxis?.apply {
            opposite(true)
            .tickWidth(2)
            .lineWidth(1.5)//Y轴轴线颜色
            .lineColor(AAColor.LightGray)//Y轴轴线颜色
            .gridLineWidth(0)//Y轴网格线宽度
            .tickPositions(arrayOf(0, 2500, 5000, 7500, 10000))
            .labels(aaYAxisLabels)
        }

        return aaOptions
    }

    fun customStackedAndGroupedColumnChartTooltip(): AAOptions {
        val aaChartModel = AAChartModel()
            .title("Total fruit consumption, grouped by gender")
            .subtitle("stacked and grouped")
            .yAxisTitle("Number of fruits")
            .chartType(AAChartType.Column)
            .legendEnabled(false)//隐藏图例(底部可点按的小圆点)
            .stacking(AAChartStackingType.Normal)
            .categories(arrayOf("Apples", "Oranges", "Pears", "Grapes", "Bananas"))
            .dataLabelsEnabled(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("John")
                    .data(arrayOf(5, 3, 4, 7, 2))
                    .stack("male"),
                AASeriesElement()
                    .name("Joe")
                    .data(arrayOf(3, 4, 4, 2, 5))
                    .stack("male"),
                AASeriesElement()
                    .name("Jane")
                    .data(arrayOf(2, 5, 6, 2, 1))
                    .stack("female"),
                AASeriesElement()
                    .name("Janet")
                    .data(arrayOf(3, 0, 4, 4, 3))
                    .stack("female"))
            )

        /*Custom Tooltip Style --- 自定义图表浮动提示框样式及内容*/
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip
            ?.shared(false)
            ?.formatter("""
function () {
                return '<b>'
                + this.x
                + '</b><br/>'
                + this.series.name
                + ': '
                + this.y
                + '<br/>'
                + 'Total: '
                + this.point.stackTotal;
     }
                """.trimIndent()
            )

        return aaOptions
    }

    fun customDoubleXAxesChart(): AAOptions {
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
                .fontSize(12.0))

        val aaCategories = arrayOf("0-4", "5-9", "10-14", "15-19", "20-24", "25-29",
            "30-34", "35-39", "40-44", "45-49", "50-54", "55-59", "60-64", "65-69", "70-74",
            "75-79", "80-84", "85-89", "90-94", "95-99", "100 + ")

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
            .gridLineWidth(0)// Y 轴网格线宽度
            .title(AATitle()
                .text(""))//Y 轴标题
            .labels(AALabels()
                .formatter("""
function () {
    return (Math.abs(this.value) / 1000000) + 'M';
}
                    """.trimIndent()
                ))
            .min(-4000000)
            .max(4000000)

        val aaPlotOptions = AAPlotOptions()
            .series(AASeries()
                .animation(AAAnimation()
                    .duration(800)
                    .easing(AAChartAnimationType.Bounce))
                .stacking(AAChartStackingType.Normal))

        val aaTooltip = AATooltip()
            .enabled(true)
            .shared(false)
            .formatter("""
function () {
    return '<b>' + this.series.name + ', age ' + this.point.category + '</b><br/>' +
        '人口: ' + Highcharts.numberFormat(Math.abs(this.point.y), 0);
}
                """.trimIndent()
            )

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

    fun customArearangeChartTooltip(): AAOptions {
        val aaChartModel =  AAChartModel()
            .chartType(AAChartType.Areasplinerange)
            .title("Area spline range chart")
            .subtitle("virtual data")
            .yAxisTitle("℃")
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
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
                    ))
            )
        val aaOptions = aaChartModel.aa_toAAOptions()

        aaOptions.tooltip?.apply {
             useHTML(true)
            .formatter(
                """
function () {
            var myPointOptions = this.points[0].point.options;
            var xValue = myPointOptions.x;
            var lowValue = myPointOptions.low;
            var highValue = myPointOptions.high;
            var titleStr = '🌕 this is my custom tooltip description text content <br>';
            var xValueStr = '🌖 this is x value  : ' + xValue + '<br>';
            var lowValueStr = ' 🌗 this is low value  : ' + lowValue + '<br>';
            var highValueStr = '🌘 this is high value : ' + highValue + '<br>';
            var tooltipDescStr =  titleStr + xValueStr + lowValueStr + highValueStr;
            return tooltipDescStr;
        }
                 """.trimIndent()
            )
            .backgroundColor("#000000")
            .borderColor("#000000")
            .style(AAStyle()
                    .color("#FFD700")
                    .fontSize(12)
            )
        }

        return aaOptions
    }

    fun customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter(): AAOptions {
        val categories: Array<Any> = arrayOf(
            "Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        )
        val categoryJSArrStr = categories.aa_toJSArray()

        val tooltipFormatter = """
function () {
        return  'The value for <b>' + $categoryJSArrStr[this.x] +
        '</b> is <b>' + this.y + '</b> ' + "℃";
        }
            """.trimIndent()

        val xAxisLabelsFormatter = """
function () {
        return $categoryJSArrStr[this.value];
        }
            """.trimIndent()

        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Area)
            .title("THE HEAT OF PROGRAMMING LANGUAGE")
            .subtitle("Virtual Data")
            .dataLabelsEnabled(false)
            .yAxisGridLineWidth(0)
            .touchEventEnabled(true)
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
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip
            ?.useHTML(true)
            ?.formatter(tooltipFormatter)
        aaOptions.xAxis?.labels
            ?.formatter(xAxisLabelsFormatter)
        return aaOptions
    }

    @Suppress("NonAsciiCharacters")
    fun customTooltipWhichDataSourceComeFromOutSideRatherThanSeries(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Column) //图表类型
            .yAxisLineWidth(1) //Y轴轴线线宽为0即是隐藏Y轴轴线
            .yAxisGridLineWidth(1) //y轴横向分割线宽度为1(为0即是隐藏分割线)
            .xAxisGridLineWidth(1) //x轴横向分割线宽度为1(为0即是隐藏分割线)
            .colorsTheme(arrayOf("#FFD700" /*纯金色*/))
            .categories(arrayOf(
                "一月", "二月", "三月", "四月", "五月", "六月",
                "七月", "八月", "九月", "十月", "十一月", "十二月"
            ))
            .yAxisMax(110)
            .series(arrayOf(
                AASeriesElement()
                    .name("2017")
                    .data(arrayOf(55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55)
                    )))

        val 看近时长数组 = arrayOf<Any>(70, 69, 95, 14, 18, 21, 25, 26, 23, 18, 13, 96)
        val 看中时长数组 = arrayOf<Any>(20, 80, 57, 11, 17, 22, 24, 24, 20, 14, 86, 25)
        val 看远时长数组 = arrayOf<Any>(90, 60, 35, 84, 13, 17, 18, 17, 14, 90, 39, 10)
        val 总时长数组 = arrayOfNulls<Any>(12)
        for (i in 0..11) {
            val 单个总时长= (看近时长数组[i] as Int
                    + 看中时长数组[i] as Int
                    + 看远时长数组[i] as Int)
            总时长数组[i] = 单个总时长
        }
        val 有效时长数组 =
            arrayOf<Any>(39, 42, 57, 85, 19, 15, 17, 16, 14, 13, 66, 48)



        fun randomNumber(): Int {
            val max = 38
            val min = 1
            return (Math.random() * (max - min) + min).toInt()
        }

        val 切换次数数组 = arrayOf<Any>(
            randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber()
        )
        val 停止次数数组 = arrayOf<Any>(
            randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber()
        )
        val 干预次数数组 = arrayOf<Any>(
            randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber()
        )
        val 总时长JS数组 = (总时长数组 as Array<Any>).aa_toJSArray()
        val 有效时长JS数组 = (有效时长数组).aa_toJSArray()
        val 看近时长JS数组 = (看近时长数组).aa_toJSArray()
        val 看中时长JS数组 = (看中时长数组).aa_toJSArray()
        val 看远时长JS数组 = (看远时长数组).aa_toJSArray()
        val 切换次数JS数组 = (切换次数数组).aa_toJSArray()
        val 停止次数JS数组 = (停止次数数组).aa_toJSArray()
        val 干预次数JS数组 = (干预次数数组).aa_toJSArray()

        val jsFormatterStr = """
function () {
        let 总时长数组 = $总时长JS数组;
        let 有效时长数组 = $有效时长JS数组;
        let 看近时长数组 = $看近时长JS数组;
        let 看中时长数组 = $看中时长JS数组;
        let 看远时长数组 = $看远时长JS数组;
        let 切换次数数组 = $切换次数JS数组;
        let 停止次数数组 = $停止次数JS数组;
        let 干预次数数组 = $干预次数JS数组;
        let 时间单位后缀 = "min<br/>";
        let 频率单位后缀 = "次<br/>";
        
        let 单个总时长字符串 = "总时长: &nbsp &nbsp" + 总时长数组[this.point.index] + 时间单位后缀;
        let 单个有效时长字符串 = "有效时长: &nbsp" + 有效时长数组[this.point.index] + 时间单位后缀;
        let 单个看近时长字符串 = "看近时长: &nbsp" + 看近时长数组[this.point.index] + 时间单位后缀;
        let 单个看中时长字符串 = "看中时长: &nbsp" + 看中时长数组[this.point.index] + 时间单位后缀;
        let 单个看远时长字符串 = "看远时长: &nbsp" + 看远时长数组[this.point.index] + 时间单位后缀;
        let 单个切换次数字符串 = "切换次数: &nbsp" + 切换次数数组[this.point.index] + 频率单位后缀;
        let 单个停止次数字符串 = "停止次数: &nbsp" + 停止次数数组[this.point.index] + 频率单位后缀;
        let 单个干预次数字符串 = "干预次数: &nbsp" + 干预次数数组[this.point.index] + 频率单位后缀;
        
        let wholeContentString =  单个总时长字符串 + 单个有效时长字符串 + 单个看近时长字符串 + 单个看中时长字符串 + 单个看远时长字符串 + 单个切换次数字符串 + 单个停止次数字符串 + 单个干预次数字符串;
        
        return wholeContentString;
        }
            """.trimIndent()

        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip?.apply {
            //‼️以 this.point.index 这种方式获取选中的点的索引必须设置 tooltip 的 shared 为 false
            //‼️共享时是 this.points (由多个 point 组成的 points 数组)
            //‼️非共享时是 this.point 单个 point 对象
            shared(false)
                .useHTML(true)
                .formatter(jsFormatterStr)
                .backgroundColor("#000000") //黑色背景色
                .borderColor("#FFD700") //边缘颜色纯金色
                .style(AAStyle()
                    .color("#FFD700") //文字颜色纯金色
                    .fontSize(12))
        }
        return aaOptions
    }

    private fun Array<Any>.aa_toJSArray(): String {
        var originalJsArrStr = ""
        for (i in this.indices) {
            val element = this[i]
            originalJsArrStr = "$originalJsArrStr'$element',"
        }
        return "[$originalJsArrStr]"
    }

    fun javaScriptArrayStringWithJavaArray(javaArray: Array<String>): String {
        val originalJsArrStr = StringBuilder()
        for (element: Any in javaArray) {
            originalJsArrStr.append("'").append(element.toString()).append("',")
        }
        return "[$originalJsArrStr]"
    }

    //https://github.com/AAChartModel/AAChartKit/issues/852 自定义蜘蛛🕷图样式
    fun customSpiderChartStyle(): AAOptions {
        val categoryArr = arrayOf(
            "周转天数(天)",
            "订单满足率",
            "订单履约时效",
            "动销率",
            "畅销商品缺货率",
            "高库存金额占比",
            "不动销金额占比",
            "停采金额占比"
        )

//        String categoryJSArrStr = {categoryArr aa_toJSArray];

//
//        String xAxisLabelsFormatter ={String stringWithFormat:(AAJSFunc(function () {
//            return %[this.value];
//        })),categoryJSArrStr];
        val categoryJSArrStr = javaScriptArrayStringWithJavaArray(categoryArr)
        val xAxisLabelsFormatter = String.format(
            "function () {\n" +
                    "        return %s[this.value];\n" +
                    "    }", categoryJSArrStr
        )
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Line) //图表类型
            .title("健康体检表") //图表主标题
            .colorsTheme(arrayOf("#fe117c", "#ffc069")) //设置主体颜色数组
            .yAxisLineWidth(0) //                .yAxisGridLineStyle([AALineStyle styleWithWidth:0})
            //    .yAxisTickPositions([0, 5, 10, 15, 20, 25, 30, 35})
            .markerRadius(5)
            .markerSymbol(AAChartSymbolType.Circle)
            .polar(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("本月得分")
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5)),
                AASeriesElement()
                    .name("上月得分")
                    .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1))))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.chart?.apply {
            marginLeft(80)
                .marginRight(80)
        }
        aaOptions.xAxis?.apply {
            lineWidth(0) //避免多边形外环之外有额外套了一层无用的外环
                .labels
                ?.style(AAStyle.style(AAColor.Black))
                ?.formatter(xAxisLabelsFormatter)
        }
        aaOptions.yAxis?.apply {
            gridLineInterpolation("polygon") //设置蜘蛛网🕸图表的网线为多边形
                .labels?.style(AAStyle.style(AAColor.Black))
        }


        //设定图例项的CSS样式。只支持有关文本的CSS样式设定。
//                /默认是：{
//            "color": "#333333",
//                    "cursor": "pointer",
//                    "fontSize": "12px",
//                    "fontWeight": "bold"
//        }
//     /
        val aaItemStyle = AAItemStyle()
            .color(AAColor.Gray) //字体颜色
            .cursor("pointer") //(在移动端这个属性没什么意义,其实不用设置)指定鼠标滑过数据列时鼠标的形状。当绑定了数据列点击事件时，可以将此参数设置为 "pointer"，用来提醒用户改数据列是可以点击的。
            .fontSize(14) //字体大小
            .fontWeight(AAChartFontWeightType.Thin) //字体为细体字
        aaOptions.legend?.apply {
            enabled(true)
                .align(AAChartAlignType.Center) //设置图例位于水平方向上的右侧
                .layout(AAChartLayoutType.Horizontal) //设置图例排列方式为垂直排布
                .verticalAlign(AAChartVerticalAlignType.Top) //设置图例位于竖直方向上的顶部
                .itemStyle(aaItemStyle)
        }
        return aaOptions
    }

    // Refer to the issue https://github.com/AAChartModel/AAChartKit/issues/589
    fun customizeEveryDataLabelSinglelyByDataLabelsFormatter(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline) //图表类型
            .dataLabelsEnabled(true)
            .tooltipEnabled(false)
            .colorsTheme(arrayOf(AAGradientColor.FizzyPeach))
            .markerRadius(0)
            .legendEnabled(false)
            .categories(arrayOf(
                "美国🇺🇸",
                "欧洲🇪🇺",
                "中国🇨🇳",
                "日本🇯🇵",
                "韩国🇰🇷",
                "越南🇻🇳",
                "中国香港🇭🇰"))
            .series(arrayOf(
                AASeriesElement()
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2))))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.yAxis?.gridLineDashStyle = AAChartLineDashStyleType.LongDash.value //设置Y轴的网格线样式为 AAChartLineDashStyleType.LongDash
        val unitArr = arrayOf("美元", "欧元", "人民币", "日元", "韩元", "越南盾", "港币")
        val unitJSArrStr: String = javaScriptArrayStringWithJavaArray(unitArr)
        val dataLabelsFormatter = String.format(
            "function () {\n" +
                    "        return this.y + %s[this.point.index];  \n" +  //单组 series 图表, 获取选中的点的索引是 this.point.index ,多组并且共享提示框,则是this.points[0].index
                    "    }", unitJSArrStr
        )
        val aaDatalabels = aaOptions.plotOptions?.series?.dataLabels
        aaDatalabels?.apply {
            style(AAStyle.style(AAColor.Red, 10, AAChartFontWeightType.Bold, "1px 1px contrast"))
                .formatter(dataLabelsFormatter)
                .backgroundColor(AAColor.White) // white color
                .borderColor(AAColor.Red) // red color
                .borderRadius(1.5)
                .borderWidth(1.3)
                .x(3).y(-20)
                .verticalAlign(AAChartVerticalAlignType.Middle)
        }
        return aaOptions
    }


    // Refer to GitHub issue: https://github.com/AAChartModel/AAChartKit/issues/938
    // Refer to online chart sample: https://www.highcharts.com/demo/column-comparison
    fun customXAxisLabelsBeImages(): AAOptions {
        val nameArr: Array<String> = arrayOf(
            "South Korea",
            "Japan",
            "Australia",
            "Germany",
            "Russia",
            "China",
            "Great Britain",
            "United States"
        )
        val colorArr: Array<Any> = arrayOf(
            AARgba(201, 36, 39, 1f),
            AARgba(201, 36, 39, 1f),
            AARgba(0, 82, 180, 1f),
            AARgba(0, 0, 0, 1f),
            AARgba(240, 240, 240, 1f),
            AARgba(255, 217, 68, 1f),
            AARgba(0, 82, 180, 1f),
            AARgba(215, 0, 38, 1f)
        )
        val imageLinkFlagArr: Array<String> = arrayOf(
            "197582",
            "197604",
            "197507",
            "197571",
            "197408",
            "197375",
            "197374",
            "197484"
        )
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Column)
            .title("Custom X Axis Labels Be Images")
            .subtitle("use HTML")
            .categories(nameArr)
            .colorsTheme(colorArr)
            .borderRadius(5)
            .series(arrayOf(
                AASeriesElement()
                    .name("AD 2020")
                    .data(arrayOf(9.0, 9.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5))
                    .colorByPoint(true)
                    .borderRadiusTopLeft("50%")
                    .borderRadiusTopRight("50%")))
        val imageLinkFlagJSArrStr: String = javaScriptArrayStringWithJavaArray(imageLinkFlagArr)
        val xLabelsFormatter = String.format(
            "function () {\n" +
                    "        let imageFlag = %s[this.pos];\n" +
                    "        let imageLink = \"\";\n" +
                    "        return imageLink;\n" +
                    "    }", imageLinkFlagJSArrStr
        )

        //    https://api.highcharts.com.cn/highcharts#xAxis.labels.formatter
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.xAxis?.labels?.apply {
             useHTML(true)
            .formatter(xLabelsFormatter)
        }
        aaOptions.plotOptions?.column?.groupPadding(0.005f)

//    /Custom tooltip style/
//                String tooltipFormatter ={String stringWithFormat:(AAJSFunc(function () {
//            let imageFlag = %[this.point.index];
//            let imageLink = "
//            ";
//            return imageLink
//                    + " 🌕 🌖 🌗 🌘 🌑 🌒 🌓 🌔
//            "
//                    + " Support JavaScript Function Just Right Now !!!
//            "
//                    + " The Gold Price For 2020 "
//                    +  this.x
//                    + "  Is  "
//                    +  this.y
//                    + "  Dollars ";
//        })),imageLinkFlagJSArrStr];
        val tooltipFormatter = String.format(
            ("function () {\n" +
                    "        let imageFlag = %s[this.point.index];\n" +
                    "        let imageLink = \"<span><img src=\\\"https://image.flaticon.com/icons/svg/197/\" + imageFlag + \".svg\\\" style=\\\"width: 30px; height: 30px;\\\"/><br></span>\";\n" +
                    "        return imageLink\n" +
                    "        + \" \uD83C\uDF15 \uD83C\uDF16 \uD83C\uDF17 \uD83C\uDF18 \uD83C\uDF11 \uD83C\uDF12 \uD83C\uDF13 \uD83C\uDF14 <br/> \"\n" +
                    "        + \" Support JavaScript Function Just Right Now !!! <br/> \"\n" +
                    "        + \" The Gold Price For <b>2020 \"\n" +
                    "        +  this.x\n" +
                    "        + \" </b> Is <b> \"\n" +
                    "        +  this.y\n" +
                    "        + \" </b> Dollars \";\n" +
                    "    }"), imageLinkFlagJSArrStr
        )
        aaOptions.tooltip?.apply {
             shared(false)
            .useHTML(true)
            .formatter(tooltipFormatter)
        }
        return aaOptions
    }

    //https://bbs.hcharts.cn/article-109-1.html
    //图表自带的图例点击事件是：
    //点击某个显示/隐藏的图例，该图例对应的serie就隐藏/显示。
    //个人觉得不合理，正常来说，有多条折线(或其他类型的图表)，点击某个图例是想只看该图例对应的数据；
    //于是修改了图例点击事件。
    //
    //实现的效果是(以折线图为例)：
    //1. 当某条折线隐藏时，点击该折线的图例 --> 该折线显示；
    //2. 当全部折线都显示时，点击某个图例 --> 该图例对应的折线显示，其他折线均隐藏；
    //3. 当只有一条折线显示时，点击该折线的图例 --> 全部折线均显示；
    //4. 其他情况，按默认处理：
    //显示 --> 隐藏；
    //隐藏 --> 显示；
    //Customized legengItemClick Event online: http://code.hcharts.cn/rencht/hhhhLv/share
    fun customLegendItemClickEvent(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Column)
            .stacking(AAChartStackingType.Normal)
            .colorsTheme(arrayOf("#fe117c", "#ffc069", "#06caf4", "#7dffc0")) //设置主题颜色数组
            .markerRadius(0)
            .series(arrayOf(
                AASeriesElement()
                    .name("2017")
                    .data(arrayOf(
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
                    .data(arrayOf(
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
                    )),
                AASeriesElement()
                    .name("2019")
                    .data(arrayOf(
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
                    )),
                AASeriesElement()
                    .name("2020")
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
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.legend?.apply {
             enabled(true)
            .align(AAChartAlignType.Right) //设置图例位于水平方向上的右侧
            .layout(AAChartLayoutType.Vertical) //设置图例排列方式为垂直排布
            .verticalAlign(AAChartVerticalAlignType.Top) //设置图例位于竖直方向上的顶部
        }

        //自定义图例点击事件
        aaOptions.plotOptions?.series?.events = AASeriesEvents()
            .legendItemClick(
                """function(event) {
        function getVisibleMode(series, serieName) {
            var allVisible = true;
            var allHidden = true;
            for (var i = 0; i < series.length; i++) {
                if (series[i].name == serieName)
                    continue;
                allVisible &= series[i].visible;
                allHidden &= (!series[i].visible);
            }
            if (allVisible && !allHidden)
                return 'all-visible';
            if (allHidden && !allVisible)
                return 'all-hidden';
            return 'other-cases';
        }
        
        var series = this.chart.series;
        var mode = getVisibleMode(series, this.name);
        var enableDefault = false;
        if (!this.visible) {
            enableDefault = true;
        }
        else if (mode == 'all-visible') {
            var seriesLength = series.length;
            for (var i = 0; i < seriesLength; i++) {
                var serie = series[i];
                serie.hide();
            }
            this.show();
        }
        else if (mode == 'all-hidden') {
            var seriesLength = series.length;
            for (var i = 0; i < seriesLength; i++) {
                var serie = series[i];
                serie.show();
            }
        }
        else {
            enableDefault = true;
        }
        return enableDefault;
    }"""
            )
        return aaOptions
    }

    //https://github.com/AAChartModel/AAChartKit/issues/966
    fun customTooltipPostionerFunction(): AAOptions {
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
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Column)
            .categories(categoriesArr)
            .series(arrayOf(
                AASeriesElement()
                    .name("单机大作")
                    .color(AAColor.Red)
                    .data(arrayOf(
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
                    )
            )
            )
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip
            ?.positioner("function (labelWidth, labelHeight, point) {\n" +
                    "        let position = {};\n" +
                    "        position[\"x\"] = point.plotX;\n" +
                    "        position[\"y\"] = 20;\n" +
                    "        return position;\n" +
                    "    }"
            )
        return aaOptions
    }

    fun fixedTooltipPositionByCustomPositionerFunction(): AAOptions {
        val aaOptions: AAOptions = customTooltipPostionerFunction()
        aaOptions.tooltip
            ?.positioner("function () {\n" +
                    "        let position = {};\n" +
                    "        position[\"x\"] = 50;\n" +
                    "        position[\"y\"] = 50;\n" +
                    "        return position;\n" +
                    "    }"
            )
        return aaOptions
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1033
    fun customPlotAreaOutsideComlicatedTooltipStyle(): AAOptions {
        val categoriesArr = arrayOf(
            "11 月 01 日",
            "11 月 02 日",
            "11 月 03 日",
            "11 月 04 日",
            "11 月 05 日",
            "11 月 06 日",
            "11 月 07 日",
            "11 月 08 日",
            "11 月 09 日",
            "11 月 10 日",
            "11 月 11 日",
            "11 月 12 日",
            "11 月 13 日",
            "11 月 14 日",
            "11 月 15 日",
            "11 月 16 日",
            "11 月 17 日",
            "11 月 18 日",
            "11 月 19 日",
            "11 月 20 日",
            "11 月 21 日",
            "11 月 22 日",
            "11 月 23 日",
            "11 月 24 日",
            "11 月 25 日",
            "11 月 26 日",
            "11 月 27 日",
            "11 月 28 日",
            "11 月 29 日",
            "11 月 30 日",
            "12 月 01 日",
            "12 月 02 日",
            "12 月 03 日",
            "12 月 04 日",
            "12 月 05 日",
            "12 月 06 日",
            "12 月 07 日",
            "12 月 08 日",
            "12 月 09 日",
            "12 月 10 日",
            "12 月 11 日",
            "12 月 12 日",
            "12 月 13 日",
            "12 月 14 日",
            "12 月 15 日",
            "12 月 16 日",
            "12 月 17 日",
            "12 月 18 日",
            "12 月 19 日",
            "12 月 20 日",
            "12 月 21 日",
            "12 月 22 日",
            "12 月 23 日",
            "12 月 24 日",
            "12 月 25 日",
            "12 月 26 日",
            "12 月 27 日",
            "12 月 28 日",
            "12 月 29 日",
            "12 月 30 日",
            "12 月 31 日"
        )
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Column)
            .categories(categoriesArr)
            .series(arrayOf(
                AASeriesElement()
                    .name("个人徒步数据统计")
                    .color(AARgba(235, 88, 40, 1.0f))
                    .borderRadiusTopLeft("50%")
                    .borderRadiusTopRight("50%")
                    .data(arrayOf(
                        1300.988, 900.699, 1000.089, 1100.965, 1000.534, 1400.523,
                        1800.254, 1900.377, 2100.523, 2500.256, 2600.555, 2800.366,
                        1300.988, 900.699, 1000.089, 1100.965, 1000.534, 1400.523,
                        1800.254, 1900.377, 2100.523, 2500.256, 2600.555, 2800.366,
                        1300.988, 900.699, 1000.089, 1100.965, 1000.534, 1400.523,
                        1800.254, 1900.377, 2100.523, 2500.256, 2600.555, 2800.366,
                        1300.988, 900.699, 1000.089, 1100.965, 1000.534, 1400.523,
                        1800.254, 1900.377, 2100.523, 2500.256, 2600.555, 2800.366,
                        1300.988, 900.699, 1000.089, 1100.965, 1000.534, 1400.523,
                        1800.254, 1900.377, 2100.523, 2500.256, 2600.555, 2800.366
                    ))))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.xAxis
            ?.crosshair(AACrosshair()
                .color(AARgba(209, 209, 209, 1.0f))
                .dashStyle(AAChartLineDashStyleType.LongDash)
                .width(3))



//                aaOptions.yAxis
//                        .top("30%")//https://api.highcharts.com/highcharts/yAxis.top
//                        .height("70%")//https://api.highcharts.com/highcharts/yAxis.height
        val dm = DisplayMetrics()
        val screenWidth = dm.widthPixels
        val positionerStr = String.format(
            """function (labelWidth, labelHeight, point) {
        let xPosition = point.plotX;
        let maxXPosition = %s - 268;
        if (xPosition >= maxXPosition) {
            xPosition = maxXPosition
        }
        let position = {};
        position["x"] = xPosition;
        position["y"] = 50;
        return position;
    }""", screenWidth
        )
        aaOptions.tooltip?.apply {
             useHTML(true)
            .headerFormat("总计 ")
            .pointFormat("{point.y}  步")
            .footerFormat("2020 年 {point.x} ")
            .valueDecimals(2) //设置取值精确到小数点后几位
            .backgroundColor(AARgba(242, 242, 242, 1.0f))
            .borderWidth(0)
            .shape("square")
            .style(AAStyle.style(AARgba(132, 132, 132, 1.0f), 28))
            .positioner(positionerStr)
        }
        return aaOptions
    }

    //https://github.com/AAChartModel/AAChartKit/issues/967
    fun disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction(): AAOptions {
        val aaChartModel = AAChartModel()
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
                            .color(AAColor.Yellow))
                        .select(AASelect()
                            .color(AAColor.Red)))))
        val aaOptions = aaChartModel.aa_toAAOptions()
        val aaPoint: AAPoint = AAPoint()
            .events(AAPointEvents()
                .click("""function () {
         if (this.selected == true) {
             this.selected = false;
         }
         return;
     }"""
                ))
        aaOptions.plotOptions?.series
            ?.point(aaPoint)
        return aaOptions
    }

    //https://github.com/AAChartModel/AAChartKit/issues/970
    //通过自定义 div 的 css 样式来自定义复杂效果的 tooltip 浮动提示框
    fun customAreasplineChartTooltipStyleByDivWithCSS(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline) //图表类型
            .colorsTheme(arrayOf("#FFD700" /*(纯金色)*/, "#ffc069")) //设置主体颜色数组
            .markerSymbol(AAChartSymbolType.Circle)
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank) //折线连接点样式为外边缘空白
            .xAxisTickInterval(3) //x轴刻度点间隔数(设置每隔几个点显示一个 X轴的内容)
            //                            .yAxisGridLineStyle([AALineStyle styleWithWidth:0})//y轴横向分割线宽度(为0即是隐藏分割线)
            .stacking(AAChartStackingType.Normal)
            .categories(arrayOf(
                "10-01", "10-02", "10-03", "10-04", "10-05", "10-06", "10-07", "10-08", "10-09", "10-10", "10-11",
                "10-12", "10-13", "10-14", "10-15", "10-16", "10-17", "10-18", "10-19", "10-20", "10-21", "10-22",
                "10-23", "10-24", "10-25", "10-26", "10-27", "10-28", "10-29", "10-30", "10-31", "11-01", "11-02",
                "11-03", "11-04", "11-05", "11-06", "11-07", "11-08", "11-09", "11-10", "11-11", "11-12", "11-13",
                "11-14", "11-15", "11-16", "11-17", "11-18", "11-19", "11-20", "11-21", "11-22", "11-23", "11-24",
                "11-25", "11-26", "11-27", "11-28", "11-29", "11-30", "12-01", "12-02", "12-03", "12-04", "12-05",
                "12-06", "12-07", "12-08", "12-09", "12-10", "12-11", "12-12", "12-13", "12-14", "12-15", "12-16",
                "12-17", "12-18", "12-19", "12-20", "12-21", "12-22", "12-23", "12-24" ,"12-25" ,"12-26" ,"12-27",
                "12-28", "12-29", "12-30"))
            .series(arrayOf(
                AASeriesElement()
                    .lineWidth(1.5)
                    .fillOpacity(0.4f)
                    .name("黄金上涨")
                    .data(arrayOf(
                        1.51, 6.70, 0.94, 1.44, 1.60, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                        4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.51, 12.7, 0.94, 1.44,
                        18.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46,
                        3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.33, 4.68, 1.31, 1.10, 13.9, 1.10, 1.16, 1.67,
                        2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05,
                        2.18, 3.24, 3.23, 3.15, 2.90, 1.81, 2.11, 2.43, 5.59, 3.09, 4.09, 6.14, 5.33, 6.05,
                        5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.48)),
                AASeriesElement()
                    .lineWidth(1.5)
                    .fillOpacity(0.4f)
                    .name("房价下跌")
                    .data(arrayOf(
                        1.51, 6.70, 0.94, 1.44, 1.60, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                        4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.51, 12.7, 0.94, 1.44,
                        18.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46,
                        3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.33, 4.68, 1.31, 1.10, 13.9, 1.10, 1.16, 1.67,
                        2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05,
                        2.18, 3.24, 3.23, 3.15, 2.90, 1.81, 2.11, 2.43, 5.59, 3.09, 4.09, 6.14, 5.33, 6.05,
                        5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.48))))


        //https://zhidao.baidu.com/question/301691908.html
        //https://jshare.com.cn/highcharts/hhhhGc
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip?.apply {
             shared(true)
            .useHTML(true)
            .padding(0)
            .borderWidth(0)
            .formatter(
                "function () {\n" +
                        "        var box1Text = \"&nbsp 2021-\" + this.x + this.points[0].series.name + this.y;\n" +
                        "        var box2Text = \"&nbsp 2021-\" + this.x + this.points[1].series.name + this.y;\n" +
                        "        \n" +
                        "        return '<style>\\\n" +
                        "        div{margin:0;padding:0}\\\n" +
                        "        #container{width:300px;height:40px;border:80px;}\\\n" +
                        "        #container .box1{width:150px;height:40px;float:left;background:red;line-height:40px;color:#fff}\\\n" +
                        "        #container .box2{width:150px;height:40px;float:right;background:green;line-height:40px;color:#fff}\\\n" +
                        "        </style>\\\n" +
                        "        <div id=\\\"container\\\">'\n" +
                        "        +\n" +
                        "        '<div class=\\\"box1\\\">' + box1Text + '</div>'\n" +
                        "        +\n" +
                        "        '<div class=\\\"box2\\\">' + box2Text + '</div>'\n" +
                        "        +\n" +
                        "        '</div>';\n" +
                        "    }"
            )
        }

        //禁用图例点击事件
        aaOptions.plotOptions?.series?.events = AASeriesEvents()
            .legendItemClick(
                ("function() {\n" +
                        "         return false;\n" +
                        "     }")
            )
        return aaOptions
    }


    //https://github.com/AAChartModel/AAChartKit/issues/901
    //https://github.com/AAChartModel/AAChartKit/issues/952
    fun configureTheAxesLabelsFormattersOfDoubleYAxesChart(): AAOptions {
        val aaChart = AAChart()
            .backgroundColor(AAColor.White)
        val aaTitle = AATitle()
            .text("")
        val aaXAxis = AAXAxis()
            .visible(true)
            .min(0)
            .categories(arrayOf(
                    "Java", "Swift", "Python", "Ruby", "PHP", "Go", "C",
                    "C#", "C++", "Perl", "R", "MATLAB", "SQL"
            ))
        val aaPlotOptions = AAPlotOptions()
            .series(AASeries()
                .marker(AAMarker()
                    .radius(7) //曲线连接点半径，默认是4
                    .symbol(AAChartSymbolType.Circle.value) //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                    .fillColor(AAColor.White) //点的填充色(用来设置折线连接点的填充色)
                    .lineWidth(3) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                    .lineColor("") //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                ))
        val yAxis1 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color("DodgerBlue"))
                .formatter("""function () {
        let yValue = this.value;
        if (yValue >= 200) {
            return "极佳";
        } else if (yValue >= 150 && yValue < 200) {
            return "非常棒";
        } else if (yValue >= 100 && yValue < 150) {
            return "相当棒";
        } else if (yValue >= 50 && yValue < 100) {
            return "还不错";
        } else {
            return "一般";
        }
    }"""))
            .gridLineWidth(0)
            .title(AATitle()
                .text("中文")
                .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)))
        val yAxis2 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color(AAColor.Red))
                .formatter("""function () {
        let yValue = this.value;
        if (yValue >= 200) {
            return "Awesome";
        } else if (yValue >= 150 && yValue < 200) {
            return "Great";
        } else if (yValue >= 100 && yValue < 150) {
            return "Very Good";
        } else if (yValue >= 50 && yValue < 100) {
            return "Not Bad";
        } else {
            return "Just So So";
        }
    }"""))
            .gridLineWidth(0)
            .title(AATitle()
                .text("ENGLISH")
                .style(AAStyle.style(AAColor.Red, 14, AAChartFontWeightType.Bold)))
            .opposite(true)
        val aaTooltip = AATooltip()
            .enabled(true)
            .shared(true)
        val seriesArr: Array<Any> = arrayOf(
            AASeriesElement()
                .name("2020")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.DeepSea)
                .borderRadius(4)
                .yAxis(1)
                .data(arrayOf(
                    0, 71.5, 106.4, 129.2, 144.0, 176.0,
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4
                )),
            AASeriesElement()
                .name("2021")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.Sanguine)
                .yAxis(0)
                .data(arrayOf(
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4,
                    0, 71.5, 106.4, 129.2, 144.0, 176.0
                )))
        return AAOptions()
            .chart(aaChart)
            .title(aaTitle)
            .plotOptions(aaPlotOptions)
            .xAxis(aaXAxis)
            .yAxisArray(arrayOf(yAxis1, yAxis2))
            .tooltip(aaTooltip)
            .series(seriesArr)
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1324
    fun configureTheAxesLabelsFormattersOfDoubleYAxesChart2(): AAOptions {
        val aaChart = AAChart()
            .backgroundColor(AAColor.White)
        val aaTitle = AATitle()
            .text("")
        val aaXAxis = AAXAxis()
            .visible(true)
            .min(0)
            .categories(arrayOf(
                "Java", "Swift", "Python", "Ruby", "PHP", "Go", "C",
                "C#", "C++", "Perl", "R", "MATLAB", "SQL"))
        val aaPlotOptions = AAPlotOptions()
            .series(AASeries()
                .marker(AAMarker()
                    .radius(7) //曲线连接点半径，默认是4
                    .symbol(AAChartSymbolType.Circle.value) //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                    .fillColor(AAColor.White) //点的填充色(用来设置折线连接点的填充色)
                    .lineWidth(3) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                    .lineColor("") //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                ))
        val yAxis1 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color("DodgerBlue"))
                .formatter("""function () {
       var yValue = this.value;
       var formattedYValue = (yValue / 1000).toFixed(3) + '千';
       return formattedYValue;
   }"""
                ))
            .gridLineWidth(0)
            .title(AATitle()
                .text("以「千」为单位")
                .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)))
        val yAxis2 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color(AAColor.Red))
                .formatter("""function () {
       var yValue = this.value;
       var formattedYValue = (yValue / 10000).toFixed(4) + '万';
       return formattedYValue;
   }"""
                ))
            .gridLineWidth(0)
            .title(AATitle()
                .text("以『万』为单位")
                .style(AAStyle.style(AAColor.Red, 14, AAChartFontWeightType.Bold)))
            .opposite(true)
        val aaTooltip = AATooltip()
            .enabled(true)
            .shared(true)
        val seriesArr: Array<Any> = arrayOf(
            AASeriesElement()
                .name("2020")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.DeepSea)
                .borderRadius(4)
                .yAxis(1)
                .data(arrayOf(
                    0, 71.5, 106.4, 129.2, 144.0, 176.0,
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4)),
            AASeriesElement()
                .name("2021")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.Sanguine)
                .yAxis(0)
                .data(arrayOf(
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4,
                    0, 71.5, 106.4, 129.2, 144.0, 176.0
                )))
        return AAOptions()
            .chart(aaChart)
            .title(aaTitle)
            .plotOptions(aaPlotOptions)
            .xAxis(aaXAxis)
            .yAxisArray(arrayOf(yAxis1, yAxis2))
            .tooltip(aaTooltip)
            .series(seriesArr)
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1324
    //https://github.com/AAChartModel/AAChartKit/issues/1330
    fun configureTheAxesLabelsFormattersOfDoubleYAxesChart3(): AAOptions {
        val aaChart = AAChart()
            .backgroundColor(AAColor.White)
        val aaTitle = AATitle()
            .text("")
        val aaXAxis = AAXAxis()
            .visible(true)
            .min(0)
            .categories(arrayOf(
                "Java", "Swift", "Python", "Ruby", "PHP", "Go", "C",
                "C#", "C++", "Perl", "R", "MATLAB", "SQL"
            ))
        val aaPlotOptions = AAPlotOptions()
            .series(AASeries()
                .marker(AAMarker()
                    .radius(7) //曲线连接点半径，默认是4
                    .symbol(AAChartSymbolType.Circle.value) //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                    .fillColor(AAColor.White) //点的填充色(用来设置折线连接点的填充色)
                    .lineWidth(3) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                    .lineColor("") //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                ))
        val yAxis1 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color("DodgerBlue"))
                .formatter("""function () {
       var yValue = this.value;
       var unitStr = "千";
       if (yValue == 0) {
           unitStr = "";
       }
       var formattedYValue = (yValue / 1000).toFixed(3) + unitStr;
       return formattedYValue;
   }""")) //Y轴文字数值为 0 的时候, 不显示单位
            .gridLineWidth(0)
            .title(AATitle()
                .text("以「千」为单位")
                .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)))
        val yAxis2 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color(AAColor.Red))
                .formatter("""function () {
       var yValue = this.value;
       var unitStr = "万";
       if (yValue == 0) {
           unitStr = "";
       }
       var formattedYValue = (yValue / 10000).toFixed(4) + unitStr;
       return formattedYValue;
   }""")) //Y轴文字数值为 0 的时候, 不显示单位
            .gridLineWidth(0)
            .title(AATitle()
                .text("以『万』为单位")
                .style(AAStyle.style(AAColor.Red, 14, AAChartFontWeightType.Bold)))
            .opposite(true)
        val aaTooltip = AATooltip()
            .enabled(true)
            .shared(true)
        val seriesArr: Array<Any> = arrayOf(
            AASeriesElement()
                .name("2020")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.DeepSea)
                .borderRadius(4)
                .yAxis(1)
                .data(arrayOf(
                    0, 71.5, 106.4, 129.2, 144.0, 176.0,
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4)),
            AASeriesElement()
                .name("2021")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.Sanguine)
                .yAxis(0)
                .data(arrayOf(
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4,
                    0, 71.5, 106.4, 129.2, 144.0, 176.0)))
        return AAOptions()
            .chart(aaChart)
            .title(aaTitle)
            .plotOptions(aaPlotOptions)
            .xAxis(aaXAxis)
            .yAxisArray(arrayOf(yAxis1, yAxis2))
            .tooltip(aaTooltip)
            .series(seriesArr)
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1042
    fun makePieChartShow0Data(): AAOptions {
        return AAOptions() //        .title((id)NSNull.null)
            .chart(AAChart()
                .type(AAChartType.Pie))
            .series(arrayOf(
                AASeriesElement()
                    .name("ZeroDataPie")
                    .data(arrayOf(
                        mapOf("y" to 1, "isZero" to true, "name" to "One"),
                        mapOf("y" to 1, "isZero" to true, "name" to "Two"),
                        mapOf("y" to 1, "isZero" to true, "name" to "Three")
                    ))
                    .tooltip(AATooltip()
                        .shared(false)
                        .pointFormatter("function() {\n" +
                                "            return \"<span style=\\'color:\" + this.color + \"\\'> ◉ </span>\"\n" +
                                "            + this.series.name\n" +
                                "            + \": <b>\"\n" +
                                "            + (this.options.isZero ? 0 : this.y)\n" +
                                "            + \"</b><br/>\";\n" +
                                "        }"))))
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1217
    fun customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Bar) //图表类型
            .title("春江花月夜") //图表主标题
            .subtitle("张若虚") //图表副标题
            //        .yAxisGridLineStyle([AALineStyle styleWithWidth:0})//y轴横向分割线宽度(为0即是隐藏分割线)
            .xAxisReversed(true) //        .xAxisLabelsStyle(AAStyle.style(AAColor.Black))
            .legendEnabled(false)
            .categories(arrayOf(
                "春江潮水连海平", "海上明月共潮生",
                "滟滟随波千万里", "何处春江无月明",
                "江流宛转绕芳甸", "月照花林皆似霰",
                "空里流霜不觉飞", "汀上白沙看不见",
                "江天一色无纤尘", "皎皎空中孤月轮",
                "江畔何人初见月", "江月何年初照人",
                "人生代代无穷已", "江月年年望相似",
                "不知江月待何人", "但见长江送流水",
                "白云一片去悠悠", "青枫浦上不胜愁",
                "谁家今夜扁舟子", "何处相思明月楼",
                "可怜楼上月裴回", "应照离人妆镜台",
                "玉户帘中卷不去", "捣衣砧上拂还来",
                "此时相望不相闻", "愿逐月华流照君",
                "鸿雁长飞光不度", "鱼龙潜跃水成文",
                "昨夜闲潭梦落花", "可怜春半不还家",
                "江水流春去欲尽", "江潭落月复西斜",
                "斜月沉沉藏海雾", "碣石潇湘无限路",
                "不知乘月几人归", "落月摇情满江树"))
            .series(arrayOf(
                AASeriesElement()
                    .lineWidth(1.5)
                    .color(AAGradientColor.DeepSea)
                    .name("2018")
                    .data(arrayOf(
                        1.51, 3.7, 0.94, 1.44, 1.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                        4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28,1.51, 2.7, 0.94, 1.44,
                        3.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90,))))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.xAxis?.labels
            ?.formatter("function () {\n" +
                    "        let xAxisCategory = this.value;\n" +
                    "        if (xAxisCategory.length > 4) {\n" +
                    "            return xAxisCategory.substr(0, 4);\n" +
                    "        } else {\n" +
                    "            return xAxisCategory;\n" +
                    "        }\n" +
                    "    }")
        return aaOptions
    }

    //https://github.com/AAChartModel/AAChartKit-Swift/issues/345
    fun setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline) //图表类型
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .yAxisVisible(false)
            .markerRadius(0)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36)),
                AASeriesElement()
                    .name("Berlin Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67)),
                AASeriesElement()
                    .name("New York Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64)),
                AASeriesElement()
                    .name("London Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53))
            ))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip?.apply {
             style(AAStyle.style(AAColor.White))
            .backgroundColor("#050505")
            .borderColor("#050505")
        }
        aaOptions.xAxis
            ?.crosshair(AACrosshair()
                .color(AAColor.DarkGray)
                .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
                .width(2))

        //默认选中的位置索引
        val defaultSelectedIndex = 5

        //https://api.highcharts.com/highcharts/chart.events.load
        //https://www.highcharts.com/forum/viewtopic.php?t=36508
        aaOptions.chart
            ?.events(AAChartEvents()
                .load(String.format("function() {\n" +
                        "                let points = [];\n" +
                        "                let chart = this;\n" +
                        "                let series = chart.series;\n" +
                        "                let length = series.length;\n" +
                        "                           \n" +
                        "                for (let i = 0; i < length; i++) {\n" +
                        "                    let pointElement = series[i].data[%s];\n" +
                        "                    points.push(pointElement);\n" +
                        "                }\n" +
                        "                chart.xAxis[0].drawCrosshair(null, points[0]);\n" +
                        "                chart.tooltip.refresh(points);\n" +
                        "                       }", defaultSelectedIndex)))
        return aaOptions
    }

    //https://github.com/AAChartModel/AAChartKit-Swift/issues/365
    //https://api.highcharts.com/highcharts/tooltip.formatter
    //Callback function to format the text of the tooltip from scratch. In case of single or shared tooltips,
    //a string should be returned. In case of split tooltips, it should return an array where the first item
    //is the header, and subsequent items are mapped to the points. Return `false` to disable tooltip for a
    //specific point on series.
    fun customColumnChartBorderStyleAndStatesHoverColor(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Column)
            .stacking(AAChartStackingType.Normal)
            .colorsTheme(arrayOf(AAColor.DarkGray, AAColor.LightGray)) //Colors theme
            .categories(arrayOf(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"))
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
                    .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5))))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip
            ?.formatter(
                """function () {
               return false;
        }"""
            )
        return aaOptions
    }

}
