package com.github.aachartmodel.aainfographics.demo.chartcomposer

import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.AAColor
import java.util.*

class JSFunctionForAAChartEventsComposer {
    //https://github.com/AAChartModel/AAChartKit-Swift/issues/345
    fun setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart(): AAOptions {
        val aaChartModel: AAChartModel = AAChartModel()
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

        val aaOptions: AAOptions = aaChartModel.aa_toAAOptions()

        aaOptions.tooltip?.apply {
            style(AAStyle.style(AAColor.White))
           .backgroundColor("#050505")
           .borderColor("#050505")
        }

        aaOptions.xAxis?.apply {
            crosshair(AACrosshair()
                .color(AAColor.DarkGray)
                .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
                .width(2))
        }

        //默认选中的位置索引
        val defaultSelectedIndex = 5

        //https://api.highcharts.com/highcharts/chart.events.load
        //https://www.highcharts.com/forum/viewtopic.php?t=36508
        aaOptions.chart?.apply {
            events(AAChartEvents()
                    .load(String.format(
                            """
            function() {
                let points = [];
                let chart = this;
                let series = chart.series;
                let length = series.length;
                           
                for (let i = 0; i < length; i++) {
                    let pointElement = series[i].data[%s];
                    points.push(pointElement);
                }
                chart.xAxis[0].drawCrosshair(null, points[0]);
                chart.tooltip.refresh(points);
                       }""", defaultSelectedIndex
                        )))
        }
        return aaOptions
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1093
    //https://github.com/highcharts/highcharts-ios/issues/97
    fun automaticallyHideTooltipAfterItIsShown(): AAOptions? {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline) //图表类型
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .yAxisVisible(false)
            .markerRadius(0)
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


        //https://api.highcharts.com/highcharts/chart.events.load
        //https://www.highcharts.com/forum/viewtopic.php?t=36508
        aaOptions.chart
            ?.events(AAChartEvents()
                    .load("""
            function() {
                const chart = this;
                Highcharts.addEvent(
                    chart.tooltip,
                    'refresh',
                    function () {
                        chart.tooltip.hide(888);
                });
            }"""
                    )
            )
        return aaOptions
    }


    //https://github.com/AAChartModel/AAChartKit-Swift/issues/394
    //https://www.highcharts.com/forum/viewtopic.php?t=44985
    fun configureBlinkMarkerChart(): AAOptions? {
        val dataArr: Array<Any> = arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6)
        val selectedIndex = dataArr.size - 1
        return AAOptions()
            .chart(
                AAChart()
                    .events(
                        AAChartEvents()
                            .load(
                                String.format(
                                    Locale.CHINA, "function() {" +
                                            "const chart = this;" +
                                            "const point = chart.series[0].points[%d];" +
                                            "let big = true;" +
                                            "setInterval(() => {" +
                                            "big = !big;" +
                                            "point.update({" +
                                            "marker: {" +
                                            "radius: big ? 5 : 15" +
                                            "}" +
                                            "})" +
                                            "}, 500);" +
                                            "}",
                                    selectedIndex
                                )
                            )
                    )
            )
            .series(
                arrayOf(
                    AASeriesElement()
                        .data(dataArr)
                        .marker(
                            AAMarker()
                                .lineColor(AAColor.Red)
                                .lineWidth(3f)
                                .radius(10f)
                        )
                )
            )
    }


    //https://github.com/AAChartModel/AAChartKit-Swift/issues/394
    //https://www.highcharts.com/forum/viewtopic.php?t=44985
    fun configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect(): AAOptions? {
        val stopsArr = arrayOf<Any>(
            arrayOf<Any>(0.00f, "#febc0f"),
            arrayOf<Any>(0.25f, "#FF14d4"),
            arrayOf<Any>(0.50f, "#0bf8f5"),
            arrayOf<Any>(0.75f, "#F33c52"),
            arrayOf<Any>(1.00f, "#1904dd")
        )
        val aaMarker = AAMarker()
            .radius(8f) //曲线连接点半径
            .symbol(AAChartSymbolType.Circle.value) //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
            .fillColor(AAColor.White) //点的填充色(用来设置折线连接点的填充色)
            .lineWidth(5f) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
            //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
            .lineColor(AAColor.Red)
        val singleSpecialData = AADataElement()
            .marker(aaMarker)
            .y(26.5f)
        return AAOptions()
            .chart(
                AAChart()
                    .type(AAChartType.Spline)
                    .backgroundColor("#4b2b7f")
                    .events(
                        AAChartEvents()
                            .load(
                                """function () {
                          const chart = this;
                          const point = chart.series[0].points[11];
                          let big = true;
                          setInterval(() => {
                                 big = !big;
                                 point.update({
                                      marker: {
                                        radius: big ? 5 : 55,
                                        fillColor: big ? "white": "red",
                                        lineWidth: big ? 5 : 15,
                                        lineColor: big ? "green": "yellow",
                                      }
                                 })
                          }, 500)
                     }"""
                            )
                    )
            )
            .title(
                AATitle()
                    .text("Special style single data element chart")
            )
            .tooltip(
                AATooltip()
                    .enabled(true)
            )
            .xAxis(
                AAXAxis()
                    .visible(false)
            )
            .yAxis(
                AAYAxis()
                    .visible(false)
            )
            .series(
                arrayOf(
                    AASeriesElement()
                        .name("Virtual Data")
                        .lineWidth(6f)
                        .data(
                            arrayOf(
                                7.0f,
                                6.9f,
                                2.5f,
                                14.5f,
                                18.2f,
                                singleSpecialData,
                                5.2f,
                                26.5f,
                                23.3f,
                                45.3f,
                                13.9f,
                                9.6f
                            )
                        )
                        .color(AAColor.Red)
                )
            )
    }

    //https://github.com/AAChartModel/AAChartKit-Swift/issues/394
    //https://echarts.apache.org/examples/zh/editor.html?c=scatter-effect
    fun configureScatterChartWithBlinkEffect(): AAOptions?{
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Scatter)
            .title("Height and weight distribution by sex")
            .yAxisTitle("kg")
            .markerRadius(8)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("Blink Scatter")
                    .color(AAColor.Green)
                    .data(arrayOf(arrayOf<Any>(172.7, 105.2), arrayOf<Any>(153.4, 42))),
                AASeriesElement()
                    .name("Female")
                    .color("#ff0000")
                    .data( arrayOf(
                        arrayOf(161.2, 51.6), arrayOf(167.5, 59.0), arrayOf(159.5, 49.2), arrayOf(157.0, 63.0), arrayOf(155.8, 53.6),
                        arrayOf(170.0, 59.0), arrayOf(159.1, 47.6), arrayOf(166.0, 69.8), arrayOf(176.2, 66.8), arrayOf(160.2, 75.2),
                        arrayOf(172.5, 55.2), arrayOf(170.9, 54.2), arrayOf(172.9, 62.5), arrayOf(153.4, 42.0), arrayOf(160.0, 50.0),
                        arrayOf(147.2, 49.8), arrayOf(168.2, 49.2), arrayOf(175.0, 73.2), arrayOf(157.0, 47.8), arrayOf(167.6, 68.8),
                        arrayOf(159.5, 50.6), arrayOf(175.0, 82.5), arrayOf(166.8, 57.2), arrayOf(176.5, 87.8), arrayOf(170.2, 72.8),
                        arrayOf(174.0, 54.5), arrayOf(173.0, 59.8), arrayOf(179.9, 67.3), arrayOf(170.5, 67.8), arrayOf(160.0, 47.0),
                        arrayOf(154.4, 46.2), arrayOf(162.0, 55.0), arrayOf(176.5, 83.0), arrayOf(160.0, 54.4), arrayOf(152.0, 45.8),
                        arrayOf(162.1, 53.6), arrayOf(170.0, 73.2), arrayOf(160.2, 52.1), arrayOf(161.3, 67.9), arrayOf(166.4, 56.6),
                        arrayOf(168.9, 62.3), arrayOf(163.8, 58.5), arrayOf(167.6, 54.5), arrayOf(160.0, 50.2), arrayOf(161.3, 60.3),
                        arrayOf(167.6, 58.3), arrayOf(165.1, 56.2), arrayOf(160.0, 50.2), arrayOf(170.0, 72.9), arrayOf(157.5, 59.8),
                        arrayOf(167.6, 61.0), arrayOf(160.7, 69.1), arrayOf(163.2, 55.9), arrayOf(152.4, 46.5), arrayOf(157.5, 54.3),
                        arrayOf(168.3, 54.8), arrayOf(180.3, 60.7), arrayOf(165.5, 60.0), arrayOf(165.0, 62.0), arrayOf(164.5, 60.3),
                        arrayOf(156.0, 52.7), arrayOf(160.0, 74.3), arrayOf(163.0, 62.0), arrayOf(165.7, 73.1), arrayOf(161.0, 80.0),
                        arrayOf(162.0, 54.7), arrayOf(166.0, 53.2), arrayOf(174.0, 75.7), arrayOf(172.7, 61.1), arrayOf(167.6, 55.7),
                        arrayOf(151.1, 48.7), arrayOf(164.5, 52.3), arrayOf(163.5, 50.0), arrayOf(152.0, 59.3), arrayOf(169.0, 62.5),
                        arrayOf(164.0, 55.7), arrayOf(161.2, 54.8), arrayOf(155.0, 45.9), arrayOf(170.0, 70.6), arrayOf(176.2, 67.2),
                        arrayOf(170.0, 69.4), arrayOf(162.5, 58.2), arrayOf(170.3, 64.8), arrayOf(164.1, 71.6), arrayOf(169.5, 52.8),
                        arrayOf(163.2, 59.8), arrayOf(154.5, 49.0), arrayOf(159.8, 50.0), arrayOf(173.2, 69.2), arrayOf(170.0, 55.9),
                        arrayOf(161.4, 63.4), arrayOf(169.0, 58.2), arrayOf(166.2, 58.6), arrayOf(159.4, 45.7), arrayOf(162.5, 52.2),
                        arrayOf(159.0, 48.6), arrayOf(162.8, 57.8), arrayOf(159.0, 55.6), arrayOf(179.8, 66.8), arrayOf(162.9, 59.4),
                        arrayOf(161.0, 53.6), arrayOf(151.1, 73.2), arrayOf(168.2, 53.4), arrayOf(168.9, 69.0), arrayOf(173.2, 58.4),
                        arrayOf(171.8, 56.2), arrayOf(178.0, 70.6), arrayOf(164.3, 59.8), arrayOf(163.0, 72.0), arrayOf(168.5, 65.2),
                        arrayOf(166.8, 56.6), arrayOf(172.7, 88.8), arrayOf(163.5, 51.8), arrayOf(169.4, 63.4), arrayOf(167.8, 59.0),
                        arrayOf(159.5, 47.6), arrayOf(167.6, 63.0), arrayOf(161.2, 55.2), arrayOf(160.0, 45.0), arrayOf(163.2, 54.0),
                        arrayOf(162.2, 50.2), arrayOf(161.3, 60.2), arrayOf(149.5, 44.8), arrayOf(157.5, 58.8), arrayOf(163.2, 56.4),
                        arrayOf(172.7, 62.0), arrayOf(155.0, 49.2), arrayOf(156.5, 67.2), arrayOf(164.0, 53.8), arrayOf(160.9, 54.4),
                        arrayOf(162.8, 58.0), arrayOf(167.0, 59.8), arrayOf(160.0, 54.8), arrayOf(160.0, 43.2), arrayOf(168.9, 60.5),
                        arrayOf(158.2, 46.4), arrayOf(156.0, 64.4), arrayOf(160.0, 48.8), arrayOf(167.1, 62.2), arrayOf(158.0, 55.5),
                        arrayOf(167.6, 57.8), arrayOf(156.0, 54.6), arrayOf(162.1, 59.2), arrayOf(173.4, 52.7), arrayOf(159.8, 53.2),
                        arrayOf(170.5, 64.5), arrayOf(159.2, 51.8), arrayOf(157.5, 56.0), arrayOf(161.3, 63.6), arrayOf(162.6, 63.2),
                        arrayOf(160.0, 59.5), arrayOf(168.9, 56.8), arrayOf(165.1, 64.1), arrayOf(162.6, 50.0), arrayOf(165.1, 72.3),
                        arrayOf(166.4, 55.0), arrayOf(160.0, 55.9), arrayOf(152.4, 60.4), arrayOf(170.2, 69.1), arrayOf(162.6, 84.5),
                        arrayOf(170.2, 55.9), arrayOf(158.8, 55.5), arrayOf(172.7, 69.5), arrayOf(167.6, 76.4), arrayOf(162.6, 61.4),
                        arrayOf(167.6, 65.9), arrayOf(156.2, 58.6), arrayOf(175.2, 66.8), arrayOf(172.1, 56.6), arrayOf(162.6, 58.6),
                        arrayOf(160.0, 55.9), arrayOf(165.1, 59.1), arrayOf(182.9, 81.8), arrayOf(166.4, 70.7), arrayOf(165.1, 56.8),
                        arrayOf(177.8, 60.0), arrayOf(165.1, 58.2), arrayOf(175.3, 72.7), arrayOf(154.9, 54.1), arrayOf(158.8, 49.1),
                        arrayOf(172.7, 75.9), arrayOf(168.9, 55.0), arrayOf(161.3, 57.3), arrayOf(167.6, 55.0), arrayOf(165.1, 65.5),
                        arrayOf(175.3, 65.5), arrayOf(157.5, 48.6), arrayOf(163.8, 58.6), arrayOf(167.6, 63.6), arrayOf(165.1, 55.2),
                        arrayOf(165.1, 62.7), arrayOf(168.9, 56.6), arrayOf(162.6, 53.9), arrayOf(164.5, 63.2), arrayOf(176.5, 73.6),
                        arrayOf(168.9, 62.0), arrayOf(175.3, 63.6), arrayOf(159.4, 53.2), arrayOf(160.0, 53.4), arrayOf(170.2, 55.0),
                        arrayOf(162.6, 70.5), arrayOf(167.6, 54.5), arrayOf(162.6, 54.5), arrayOf(160.7, 55.9), arrayOf(160.0, 59.0),
                        arrayOf(157.5, 63.6), arrayOf(162.6, 54.5), arrayOf(152.4, 47.3), arrayOf(170.2, 67.7), arrayOf(165.1, 80.9),
                        arrayOf(172.7, 70.5), arrayOf(165.1, 60.9), arrayOf(170.2, 63.6), arrayOf(170.2, 54.5), arrayOf(170.2, 59.1),
                        arrayOf(161.3, 70.5), arrayOf(167.6, 52.7), arrayOf(167.6, 62.7), arrayOf(165.1, 86.3), arrayOf(162.6, 66.4),
                        arrayOf(152.4, 67.3), arrayOf(168.9, 63.0), arrayOf(170.2, 73.6), arrayOf(175.2, 62.3), arrayOf(175.2, 57.7),
                        arrayOf(160.0, 55.4), arrayOf(165.1, 77.7), arrayOf(174.0, 55.5), arrayOf(170.2, 77.3), arrayOf(160.0, 80.5),
                        arrayOf(167.6, 64.5), arrayOf(167.6, 72.3), arrayOf(167.6, 61.4), arrayOf(154.9, 58.2), arrayOf(162.6, 81.8),
                        arrayOf(175.3, 63.6), arrayOf(171.4, 53.4), arrayOf(157.5, 54.5), arrayOf(165.1, 53.6), arrayOf(160.0, 60.0),
                        arrayOf(174.0, 73.6), arrayOf(162.6, 61.4), arrayOf(174.0, 55.5), arrayOf(162.6, 63.6), arrayOf(161.3, 60.9),
                        arrayOf(156.2, 60.0), arrayOf(149.9, 46.8), arrayOf(169.5, 57.3), arrayOf(160.0, 64.1), arrayOf(175.3, 63.6),
                        arrayOf(169.5, 67.3), arrayOf(160.0, 75.5), arrayOf(172.7, 68.2), arrayOf(162.6, 61.4), arrayOf(157.5, 76.8),
                        arrayOf(176.5, 71.8), arrayOf(164.4, 55.5), arrayOf(160.7, 48.6), arrayOf(174.0, 66.4), arrayOf(163.8, 67.3)))
            ))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.chart!!.events(AAChartEvents()
            .load(
                """function() {
                const chart = this;
                const blinkScatterPointsArr = chart.series[0].points;
                const range = blinkScatterPointsArr.length;
                for (let i = 0; i < range; i++) {
                    const point = blinkScatterPointsArr[i];
                    let big = true;
                    setInterval(() => {
                            big = !big;
                            point.update({
                                marker: {
                                radius: big ? 5 : 25,
                                    fillColor: big ? "pink": "red",
                                        lineWidth: big ? 5 : 15,
                                        lineColor: big ? "gold": "yellow",
                            }
                            })
                    }, 600)
                }
            }"""
            ))
        return aaOptions
    }


    //https://github.com/AAChartModel/AAChartKit/issues/1383
    //https://www.highcharts.com/forum/viewtopic.php?t=49409
    //    dynamicHeightGridLineAreaChart in Java
    fun dynamicHeightGridLineAreaChart(): AAOptions? {
        return AAOptions()
            .title(
                AATitle()
                    .text("dynamicHeightGridLineAreaChart")
            )
            .chart(
                AAChart()
                    .type(AAChartType.Scatter)
                    .events(
                        AAChartEvents()
                            .load(
                                """function() {
   const chart = this;
   const mainSeries = chart.series[0];
   mainSeries.data.forEach((point, i) => {
       chart.addSeries({
           data: [
               [i, 0],
               [i, point.y]
           ]
       })
   })
}"""
                            )
                    )
            )
            .plotOptions(
                AAPlotOptions()
                    .scatter(
                        AAScatter()
                            .lineWidth(2)
                            .lineColor("#dbe751")
                            .dashStyle(AAChartLineDashStyleType.LongDash)
                            .enableMouseTracking(false)
                            .linkedTo("main")
                            .states(
                                AAStates()
                                    .inactive(
                                        AAInactive()
                                            .enabled(false)
                                    )
                            )
                            .marker(
                                AAMarker()
                                    .enabled(false)
                            )
                    )
            )
            .yAxis(
                AAYAxis()
                    .gridLineWidth(0)
            )
            .series(
                arrayOf(
                    AASeriesElement()
                        .type(AAChartType.Areaspline)
                        .id("main")
                        .data(
                            arrayOf<Any>(
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
                        .lineWidth(6)
                        .color("#dbe751")
                        .fillOpacity(0.4f)
                        .marker(
                            AAMarker()
                                .enabled(false)
                        )
                )
            )
    }

    //https://github.com/AAChartModel/AAChartKit-Swift-Pro/issues/3
    //https://www.highcharts.com/forum/viewtopic.php?f=9&t=49492
    fun customizeYAxisPlotLinesLabelBeSpecialStyle(): AAOptions? {
        return AAOptions()
            .chart(
                AAChart()
                    .events(
                        AAChartEvents()
                            .load(
                                "function() {\n" +
                                        "   const chart = this,\n" +
                                        "   ren = chart.renderer,\n" +
                                        "   plotLineLabel = chart.yAxis[0].plotLinesAndBands[0].label,\n" +
                                        "   {\n" +
                                        "           x: labelX,\n" +
                                        "       y: labelY,\n" +
                                        "       width: labelWidth,\n" +
                                        "       height: labelHeight\n" +
                                        "       } = plotLineLabel.getBBox(),\n" +
                                        "   x = labelX + labelWidth,\n" +
                                        "   y = labelY,\n" +
                                        "   lh = labelHeight,\n" +
                                        "   ll = 40;\n" +
                                        "\n" +
                                        "   chart.customLabelTriangle = ren.path(['M', x - ll, y, x, y, x + lh, y + lh / 2, x, y + lh, x - ll, y + lh, 'Z']).attr({\n" +
                                        "       fill: '#a9a9ff',\n" +
                                        "                  }).add().toFront();\n" +
                                        "              }"
                            )
                    )
            )
            .yAxis(
                AAYAxis()
                    .visible(true)
                    .lineWidth(2)
                    .plotLines(
                        arrayOf(
                            AAPlotLinesElement()
                                .value(6.5f)
                                .color("#a9a9ff")
                                .width(2)
                                .dashStyle(AAChartLineDashStyleType.Dash)
                                .label(
                                    AALabel()
                                        .useHTML(true)
                                        .textAlign(AAChartAlignType.Center)
                                        .x(0)
                                        .y(2)
                                        .formatter(
                                            ("function () {\n" +
                                                    "               return `<span style=\"padding: 2px 10px; display: block; color: white\">`+this.options.value+`</span>`\n" +
                                                    "               }")
                                        )
                                )
                        )
                    )
            )
            .series(
                arrayOf(
                    AASeriesElement()
                        .data(arrayOf(2, 5, 2, 3, 6))
                )
            )
    }
}

