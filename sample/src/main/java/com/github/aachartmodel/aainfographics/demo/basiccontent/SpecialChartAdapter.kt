package com.github.aachartmodel.aainfographics.demo.basiccontent

import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.SpecialChartComposer

class SpecialChartAdapter(
    chartItems: List<ChartItem>
) : ChartListAdapter(
    layoutResId = R.layout.item_special_chart,
    chartItems = chartItems,
    chartModelProvider = { item ->
        when (item.chartType) {
            "Column" -> SpecialChartComposer.configurePolarColumnChart()
            "Bar" -> SpecialChartComposer.configurePolarBarChart()
            "Line" -> SpecialChartComposer.configurePolarLineChart()
            "Area" -> SpecialChartComposer.configurePolarAreaChart()
            "Pie" -> SpecialChartComposer.configurePieChart()
            "Bubble" -> SpecialChartComposer.configureBubbleChart()
            "Scatter" -> SpecialChartComposer.configureScatterChart()
            "Arearange" -> SpecialChartComposer.configureArearangeChart()
            "Areasplinerange" -> SpecialChartComposer.configureAreasplinerangeChart()
            "Columnrange" -> SpecialChartComposer.configureColumnrangeChart()
            "Spline" -> SpecialChartComposer.configureStepLineChart()
            "Areaspline" -> SpecialChartComposer.configureStepAreaChart()
            "Boxplot" -> SpecialChartComposer.configureBoxplotChart()
            "Waterfall" -> SpecialChartComposer.configureWaterfallChart()
            "Pyramid" -> SpecialChartComposer.configurePyramidChart()
            "Funnel" -> SpecialChartComposer.configureFunnelChart()
            "Errorbar" -> SpecialChartComposer.configureErrorbarChart()
            "Gauge" -> SpecialChartComposer.configureGaugeChart()
            "Polygon" -> SpecialChartComposer.configurePolygonChart()
            else -> SpecialChartComposer.configurePolarColumnChart()
        }
    }
)