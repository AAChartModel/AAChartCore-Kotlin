package com.github.aachartmodel.aainfographics.demo.basiccontent

import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.MixedChartComposer

class MixedChartAdapter(
    chartItems: List<ChartItem>
) : ChartListAdapter(
    layoutResId = R.layout.item_mixed_chart,
    chartItems = chartItems,
    chartModelProvider = { item ->
        when (item.chartType) {
            "arearangeMixedLine" -> MixedChartComposer.arearangeMixedLine()
            "columnrangeMixedLine" -> MixedChartComposer.configureColumnrangeMixedLineChart()
            "stackingColumnMixedLine" -> MixedChartComposer.configureStackingColumnMixedLineChart()
            "dashStyleTypeMixed" -> MixedChartComposer.dashStyleTypeMixedChart()
            "negativeColorMixed" -> MixedChartComposer.negativeColorMixedChart()
            "scatterMixedLine" -> MixedChartComposer.scatterMixedLine()
            "negativeColorMixedBubble" -> MixedChartComposer.negativeColorMixedBubble()
            "polygonMixedScatter" -> MixedChartComposer.polygonMixedScatter()
            "polarChartMixed" -> MixedChartComposer.polarChartMixedChart()
            "configurePieMixedLineMixedColumnChart" -> MixedChartComposer.configurePieMixedLineMixedColumnChart()
            "configureNegativeColorMixedAreasplineChart" -> MixedChartComposer.configureNegativeColorMixedAreasplineChart()
            else -> MixedChartComposer.arearangeMixedLine()
        }
    }
)