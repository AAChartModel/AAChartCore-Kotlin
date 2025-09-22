package com.github.aachartmodel.aainfographics.demo.basiccontent

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomStyleChartComposer

class CustomStyleChartAdapter(
    private val context: Context,
    private val chartItems: List<ChartItem>
) : RecyclerView.Adapter<CustomStyleChartAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.tv_chart_name)
        val aaChartView: AAChartView = view.findViewById(R.id.aa_chart_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_style_chart, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = chartItems[position]
        holder.nameTextView.text = item.name
        val aaChartModel = getChartModel(item.chartType)
        holder.aaChartView.aa_drawChartWithChartModel(aaChartModel)
    }

    override fun getItemCount(): Int = chartItems.size

    private fun getChartModel(chartType: String): AAChartModel {
        return when (chartType) {
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
}