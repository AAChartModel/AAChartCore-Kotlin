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

import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.*

object CustomTooltipComposer {

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
            .style(AAStyle()
                .color("#FFD700")
                .fontSize(12f))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip(aaTooltip)

        aaOptions.chart!!
            .resetZoomButton(AAResetZoomButton()
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
                    .lineWidth(5f)
                    .fillOpacity(0.5f)
                    .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36)),
                AASeriesElement()
                    .name("🌲树木")
                    .lineWidth(5f)
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
            .title("")//图表主标题
            .subtitle("")//图表副标题
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .markerRadius(0f)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0f)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36)),
                AASeriesElement()
                    .name("Berlin Hot")
                    .lineWidth(5.0f)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67)),
                AASeriesElement()
                    .name("New York Hot")
                    .lineWidth(5.0f)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64)),
                AASeriesElement()
                    .name("London Hot")
                    .lineWidth(5.0f)
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
                .fontSize(12f)
            )
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.tooltip = aaTooltip
        return aaOptions
    }

    fun customYAxisLabels(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Line)//图形类型
            .title("")//图表主标题
            .subtitle("")//图表副标题
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .markerRadius(8f)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0f)
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
            .title("")//图表主标题
            .subtitle("")//图表副标题
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .markerRadius(8f)
            .series(arrayOf(AASeriesElement()
                .name("Tokyo Hot")
                .lineWidth(5.0f)
                .fillOpacity(0.4f)
                .data(arrayOf(229.9, 771.5, 1106.4, 1129.2, 6644.0, 1176.0, 8835.6, 148.5, 8816.4, 6694.1, 7795.6, 9954.4))))

        val aaYAxisLabels = AALabels()
            .style(AAStyle()
                .fontSize(10f)
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
        aaOptions.yAxis!!
            .opposite(true)
            .tickWidth(2f)
            .lineWidth(1.5f)//Y轴轴线颜色
            .lineColor(AAColor.LightGray)//Y轴轴线颜色
            .gridLineWidth(0f)//Y轴网格线宽度
            .tickPositions(arrayOf(0, 2500, 5000, 7500, 10000))
            .labels(aaYAxisLabels)

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
                .fontSize(12.0f))

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
            .gridLineWidth(0f)// Y 轴网格线宽度
            .title(AATitle()
                .text(""))//Y 轴标题
            .labels(AALabels()
                .formatter("""
function () {
    return (Math.abs(this.value) / 1000000) + 'M';
}
                    """.trimIndent()
                ))
            .min(-4000000f)
            .max(4000000f)

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

        aaOptions.tooltip!!
            .useHTML(true)
            .formatter("""
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
                .fontSize(12f))

        return aaOptions
    }

    fun customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter(): AAOptions {
        val categories = arrayOf(
            "Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        )
        val categoryJSArrStr = (categories as Array<Any>).aa_toJSArray()

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
            .yAxisGridLineWidth(0f)
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
            .title("")
            .yAxisTitle("") //设置 Y 轴标题
            .yAxisLineWidth(1f) //Y轴轴线线宽为0即是隐藏Y轴轴线
            .yAxisGridLineWidth(1f) //y轴横向分割线宽度为1(为0即是隐藏分割线)
            .xAxisGridLineWidth(1f) //x轴横向分割线宽度为1(为0即是隐藏分割线)
            .colorsTheme(arrayOf("#FFD700" /*纯金色*/))
            .categories(arrayOf(
                "一月", "二月", "三月", "四月", "五月", "六月",
                "七月", "八月", "九月", "十月", "十一月", "十二月"
            ))
            .yAxisMax(110f)
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

        var jsFormatterStr: String? = """
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
            .formatter(jsFormatterStr!!)
            .backgroundColor("#000000") //黑色背景色
            .borderColor("#FFD700") //边缘颜色纯金色
            .style(
                AAStyle()
                    .color("#FFD700") //文字颜色纯金色
                    .fontSize(12f)
            )
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

}
