package com.github.aachartmodel.aainfographics.demo.basiccontent

import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomStyleChartComposer

class CustomStyleChartAdapter(
    chartItems: List<ChartItem>
) : ChartListAdapter(
    layoutResId = R.layout.item_custom_style_chart,
    chartItems = chartItems,
    chartModelProvider = { item ->
        when (item.chartType) {
            "configureColorfulChart" -> CustomStyleChartComposer.configureColorfulChart()
            "configureColorfulGradientColorChart" -> CustomStyleChartComposer.configureColorfulGradientColorChart()
            "configureDiscontinuousDataChart" -> CustomStyleChartComposer.configureDiscontinuousDataChart()
            "configureColorfulColumnChart" -> CustomStyleChartComposer.configureColorfulColumnChart()
            "configureNightingaleRoseChart" -> CustomStyleChartComposer.configureNightingaleRoseChart()
            "configureChartWithShadowStyle" -> CustomStyleChartComposer.configureChartWithShadowStyle()
            "configureColorfulGradientAreaChart" -> CustomStyleChartComposer.configureColorfulGradientAreaChart()
            "configureColorfulGradientSplineChart" -> CustomStyleChartComposer.configureColorfulGradientSplineChart()
            "configureGradientColorAreasplineChart" -> CustomStyleChartComposer.configureGradientColorAreasplineChart()
            "configureSpecialStyleMarkerOfSingleDataElementChart" -> CustomStyleChartComposer.configureSpecialStyleMarkerOfSingleDataElementChart()
            "configureSpecialStyleColumnOfSingleDataElementChart" -> CustomStyleChartComposer.configureSpecialStyleColumnOfSingleDataElementChart()
            "configureAreaChartThreshold" -> CustomStyleChartComposer.configureAreaChartThreshold()
            "customScatterChartMarkerSymbolContent" -> CustomStyleChartComposer.customScatterChartMarkerSymbolContent()
            "customLineChartMarkerSymbolContent" -> CustomStyleChartComposer.customLineChartMarkerSymbolContent()
            "configureTriangleRadarChart" -> CustomStyleChartComposer.configureTriangleRadarChart()
            "configureQuadrangleRadarChart" -> CustomStyleChartComposer.configureQuadrangleRadarChart()
            "configurePentagonRadarChart" -> CustomStyleChartComposer.configurePentagonRadarChart()
            "configureHexagonRadarChart" -> CustomStyleChartComposer.configureHexagonRadarChart()
            "adjustYAxisMaxAndMinValues" -> CustomStyleChartComposer.adjustYAxisMaxAndMinValues()
            "customSpecialStyleDataLabelOfSingleDataElementChart" -> CustomStyleChartComposer.customSpecialStyleDataLabelOfSingleDataElementChart()
            "customBarChartHoverColorAndSelectColor" -> CustomStyleChartComposer.customBarChartHoverColorAndSelectColor()
            "customChartHoverAndSelectHaloStyle" -> CustomStyleChartComposer.customChartHoverAndSelectHaloStyle()
            "customSplineChartMarkerStatesHoverStyle" -> CustomStyleChartComposer.customSplineChartMarkerStatesHoverStyle()
            "splineChartHoverLineWithNoChangeAndCustomMarkerStatesHoverStyle" -> CustomStyleChartComposer.splineChartHoverLineWithNoChangeAndCustomMarkerStatesHoverStyle()
            "customNormalStackingChartDataLabelsContentAndStyle" -> CustomStyleChartComposer.customNormalStackingChartDataLabelsContentAndStyle()
            "upsideDownPyramidChart" -> CustomStyleChartComposer.upsideDownPyramidChart()
            "doubleLayerPieChart" -> CustomStyleChartComposer.doubleLayerPieChart()
            "disableSomeOfLinesMouseTrackingEffect" -> CustomStyleChartComposer.disableSomeOfLinesMouseTrackingEffect()
            "configureColorfulShadowChart" -> CustomStyleChartComposer.configureColorfulShadowSplineChart()
            "configureColorfulDataLabelsStepLineChart" -> CustomStyleChartComposer.configureColorfulDataLabelsStepLineChart()
            "configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart" -> CustomStyleChartComposer.configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart()
            "disableSplineChartMarkerHoverEffect" -> CustomStyleChartComposer.disableSplineChartMarkerHoverEffect()
            "configureMaxAndMinDataLabelsForChart" -> CustomStyleChartComposer.configureMaxAndMinDataLabelsForChart()
            "customVerticalXAxisCategoriesLabelsByHTMLBreakLineTag" -> CustomStyleChartComposer.customVerticalXAxisCategoriesLabelsByHTMLBreakLineTag()
            "noMoreGroupingAndOverlapEachOtherColumnChart" -> CustomStyleChartComposer.noMoreGroupingAndOverlapEachOtherColumnChart()
            "noMoreGroupingAndNestedColumnChart" -> CustomStyleChartComposer.noMoreGroupingAndNestedColumnChart()
            "topRoundedCornersStackingColumnChart" -> CustomStyleChartComposer.topRoundedCornersStackingColumnChart()
            "freeStyleRoundedCornersStackingColumnChart" -> CustomStyleChartComposer.freeStyleRoundedCornersStackingColumnChart()
            "customColumnChartBorderStyleAndStatesHoverColor" -> CustomStyleChartComposer.customColumnChartBorderStyleAndStatesHoverColor()
            "customLineChartWithColorfulMarkersAndLines" -> CustomStyleChartComposer.customLineChartWithColorfulMarkersAndLines()
            "customLineChartWithColorfulMarkersAndLines2" -> CustomStyleChartComposer.customLineChartWithColorfulMarkersAndLines2()
            "drawLineChartWithPointsCoordinates" -> CustomStyleChartComposer.drawLineChartWithPointsCoordinates()
            "configureSpecialStyleColumnForNegativeDataMixedPositiveData" -> CustomStyleChartComposer.configureSpecialStyleColumnForNegativeDataMixedPositiveData()
            "configureMultiLevelStopsArrGradientColorAreasplineMixedLineChart" -> CustomStyleChartComposer.configureMultiLevelStopsArrGradientColorAreasplineMixedLineChart()
            "connectNullsForSingleAASeriesElement" -> CustomStyleChartComposer.connectNullsForSingleAASeriesElement()
            "lineChartsWithLargeDifferencesInTheNumberOfDataInDifferentSeriesElement" -> CustomStyleChartComposer.lineChartsWithLargeDifferencesInTheNumberOfDataInDifferentSeriesElement()
            "customAreasplineChartWithColorfulGradientColorZones" -> CustomStyleChartComposer.customAreasplineChartWithColorfulGradientColorZones()
            else -> CustomStyleChartComposer.configureColorfulChart()
        }
    }
)