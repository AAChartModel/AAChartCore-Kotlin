package com.github.aachartmodel.aainfographics.demo.chartcomposer

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartEvents
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis
import com.github.aachartmodel.aainfographics.aatools.AAColor

object JSFunctionForAAChartEventsComposer2 {
    fun toggleDataLabelsOnTouch(): AAOptions {
        val options = AAOptions()
            .chart(AAChart()
                .type(AAChartType.Areaspline)
                .events(AAChartEvents()
                    .load("""
                    function() {
                        const chart = this;
                        const container = document.getElementById('container');

                        container.addEventListener('touchstart', function() {
                            hideDataLabels(chart);
                        });

                        container.addEventListener('touchend', function() {
                            showDataLabels(chart);
                        });

                        function hideDataLabels(chart) {
                            chart.series.forEach(function(series) {
                                series.data.forEach(function(point) {
                                    point.update({ dataLabels: { enabled: false } });
                                });
                            });
                        }

                        function showDataLabels(chart) {
                            chart.series.forEach(function(series) {
                                series.data.forEach(function(point) {
                                    point.update({ dataLabels: { enabled: true } });
                                });
                            });
                        }
                    }
                """.trimIndent())))
            .xAxis(AAXAxis()
                .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月")))
            .series(arrayOf(
                AASeriesElement()
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                    .dataLabels(AADataLabels()
                        .enabled(true))
                    .marker(AAMarker()
                        .lineColor(AAColor.Red)
                        .lineWidth(3f)
                        .radius(10f))
            ))

        return options
    }
}