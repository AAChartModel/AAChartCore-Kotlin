package com.example.chartcorekotlin

import com.example.chartcorekotlin.AAChartConfiger.*

object MixedChartComposer {


    fun configureColumnrangeMixedLineChartModel(): AAChartModel {
        return AAChartModel()
            .colorsTheme(arrayOf("#1e90ff", "#EA007B", "#49C1B6", "#FDC20A", "#F78320", "#068E81"))//主题颜色数组
            .title("")//图形标题
            .subtitle("")//图形副标题
            .chartType(AAChartType.Line)
            .dataLabelEnabled(false)
            .symbolStyle(AAChartSymbolStyleType.BorderBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("Temperature")
                    .type(AAChartType.Columnrange)  //COLUMN_RANGE
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
                        arrayOf(-9.9, 16.8)
                    )
                    ),
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)),
                AASeriesElement()
                    .name("New York")
                    .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5)),
                AASeriesElement()
                    .name("Berlin")
                    .data(arrayOf(0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0)),
                AASeriesElement()
                    .name("London")
                    .data(arrayOf(3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8))
            )
            )
    }

    fun configurestackingColumnMixedLineChartModel(): AAChartModel {
        return AAChartModel()
            .title("16年1月-16年11月充值客单分析")//图形标题
            .subtitle("BY MICVS")//图形副标题
            .chartType(AAChartType.Column)
            .stacking(AAChartStackingType.Normal)
            .legendEnabled(true)
            .colorsTheme(arrayOf(
                AAGradientColor.oceanBlueColor(),
                AAGradientColor.sanguineColor(),
                AAGradientColor.lusciousLimeColor()
            )
            )
            .series(arrayOf(
                AASeriesElement()
                    .name("新用户")
                    .data(arrayOf(82.89,67.54,62.07,59.43,67.02,67.09,35.66,71.78,81.61,78.85,79.12,72.30)),
                AASeriesElement()
                    .name("老用户")
                    .data(arrayOf(198.66,330.81,151.95,160.12,222.56,229.05,128.53,250.91,224.47,473.99,126.85,260.50)),
                AASeriesElement()
                    .name("总量")
                    .type(AAChartType.Line)
                    .data(arrayOf(281.55,398.35,214.02,219.55,289.57,296.14,164.18,322.69,306.08,552.84,205.97,332.79))
            )
            )
    }

    fun dashStyleTypeMixedChartModel(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Spline)//图形类型
            .dataLabelEnabled(false)//是否显示数字
            .stacking(AAChartStackingType.Normal)
            .markerRadius(0)
            .series(arrayOf(
                AASeriesElement()
                    .name("SolidLine")
                    .lineWidth(3f)
                    .data(arrayOf(50, 320, 230, 370, 230, 400, 320)),
                AASeriesElement()
                    .name("Dash")
                    .lineWidth(3f)
                    .dashStyle(AAChartLineDashSyleType.Dash)
                    .data(arrayOf(50, 320, 230, 370, 230, 400, 320)),
                AASeriesElement()
                    .name("DashDot")
                    .lineWidth(3f)
                    .dashStyle(AAChartLineDashSyleType.DashDot)
                    .data(arrayOf(50, 320, 230, 370, 230, 400, 320)),
                AASeriesElement()
                    .name("LongDash")
                    .lineWidth(3f)
                    .dashStyle(AAChartLineDashSyleType.LongDash)
                    .data(arrayOf(50, 320, 230, 370, 230, 400, 320)),
                AASeriesElement()
                    .name("LongDashDot")
                    .lineWidth(3f)
                    .dashStyle(AAChartLineDashSyleType.LongDashDot)
                    .data(arrayOf(50, 320, 230, 370, 230, 400, 320))
            )
            )
    }

    fun negativeColorMixedChartModel(): AAChartModel {
        return AAChartModel()
            .dataLabelEnabled(false)//是否显示数字
            .series(arrayOf(
                AASeriesElement()
                    .name("Column")
                    .type(AAChartType.Column)
                    .data(arrayOf(
                        -6.4, -5.2, -3.0, 0.2, 2.3, 5.5, 8.4, 8.3, 5.1, 0.9, -1.1, -4.0,
                        -6.4, -5.2, -3.0, 0.2, 2.3, 5.5, 8.4, 8.3, 5.1, 0.9, -1.1, -4.0,
                        -6.4, -5.2, -3.0, 0.2, 2.3, 5.5, 8.4, 8.3, 5.1, 0.9, -1.1, -4.0
                    )
                    )
                    .color("#0088FF")
                    .negativeColor("#FF0000")
                    .threshold(4f)//default:0
            )
            )
    }

//    fun scatterMixedLineChartModel(): AAChartModel {
//
//    }

    fun polarChartMixedChartModel(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .polar(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("Column")
                    .type(AAChartType.Column)
                    .data(arrayOf(8, 7, 6, 5, 4, 3, 2, 1)),
                AASeriesElement()
                    .name("Line")
                    .type(AAChartType.Line)
                    .data(arrayOf(1, 2, 3, 4, 5, 6, 7, 8)),
                AASeriesElement()
                    .name("Area")
                    .type(AAChartType.Area)
                    .data(arrayOf(1, 8, 2, 7, 3, 6, 4, 5))
            )
            )
    }
}
