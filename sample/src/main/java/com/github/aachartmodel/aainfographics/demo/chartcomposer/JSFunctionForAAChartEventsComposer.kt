package com.github.aachartmodel.aainfographics.demo.chartcomposer

import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartEvents
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AACrosshair
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle
import com.github.aachartmodel.aainfographics.aatools.AAColor

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
}

