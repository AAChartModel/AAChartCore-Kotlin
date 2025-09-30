package com.github.aachartmodel.aainfographics.demo.basiccontent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.aachartmodel.aainfographics.demo.R

class CustomStyleChartListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_style_chart_list)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val chartItems = getChartItems()
        recyclerView.layoutManager = LinearLayoutManager(this)
    recyclerView.adapter = CustomStyleChartAdapter(chartItems)
    }

    private fun getChartItems(): List<ChartItem> {
        return listOf(
            ChartItem("Colorful Chart", "configureColorfulChart"),
            ChartItem("Colorful Gradient Color Chart", "configureColorfulGradientColorChart"),
            ChartItem("Discontinuous Data Chart", "configureDiscontinuousDataChart"),
            ChartItem("Colorful Column Chart", "configureColorfulColumnChart"),
            ChartItem("Nightingale Rose Chart", "configureNightingaleRoseChart"),
            ChartItem("Chart With Shadow Style", "configureChartWithShadowStyle"),
            ChartItem("Colorful Gradient Area Chart", "configureColorfulGradientAreaChart"),
            ChartItem("Colorful Gradient Spline Chart", "configureColorfulGradientSplineChart"),
            ChartItem("Gradient Color Areaspline Chart", "configureGradientColorAreasplineChart"),
            ChartItem("Special Style Marker Of Single Data Element Chart", "configureSpecialStyleMarkerOfSingleDataElementChart"),
            ChartItem("Special Style Column Of Single Data Element Chart", "configureSpecialStyleColumnOfSingleDataElementChart"),
            ChartItem("Area Chart Threshold", "configureAreaChartThreshold"),
            ChartItem("Custom Scatter Chart Marker Symbol Content", "customScatterChartMarkerSymbolContent"),
            ChartItem("Custom Line Chart Marker Symbol Content", "customLineChartMarkerSymbolContent"),
            ChartItem("Triangle Radar Chart", "configureTriangleRadarChart"),
            ChartItem("Quadrangle Radar Chart", "configureQuadrangleRadarChart"),
            ChartItem("Pentagon Radar Chart", "configurePentagonRadarChart"),
            ChartItem("Hexagon Radar Chart", "configureHexagonRadarChart"),
            ChartItem("Adjust YAxis Max And Min Values", "adjustYAxisMaxAndMinValues"),
            ChartItem("Custom Special Style Data Label Of Single Data Element Chart", "customSpecialStyleDataLabelOfSingleDataElementChart"),
            ChartItem("Custom Bar Chart Hover Color And Select Color", "customBarChartHoverColorAndSelectColor"),
            ChartItem("Custom Chart Hover And Select Halo Style", "customChartHoverAndSelectHaloStyle"),
            ChartItem("Custom Spline Chart Marker States Hover Style", "customSplineChartMarkerStatesHoverStyle"),
            ChartItem("Spline Chart Hover Line With No Change And Custom Marker States Hover Style", "splineChartHoverLineWithNoChangeAndCustomMarkerStatesHoverStyle"),
            ChartItem("Custom Normal Stacking Chart Data Labels Content And Style", "customNormalStackingChartDataLabelsContentAndStyle"),
            ChartItem("Upside Down Pyramid Chart", "upsideDownPyramidChart"),
            ChartItem("Double Layer Pie Chart", "doubleLayerPieChart"),
            ChartItem("Disable Some Of Lines Mouse Tracking Effect", "disableSomeOfLinesMouseTrackingEffect"),
            ChartItem("Configure Colorful Shadow Chart", "configureColorfulShadowChart"),
            ChartItem("Configure Colorful Data Labels Step Line Chart", "configureColorfulDataLabelsStepLineChart"),
            ChartItem("Configure Colorful Gradient Color And Colorful Data Labels Step Area Chart", "configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart"),
            ChartItem("Disable Spline Chart Marker Hover Effect", "disableSplineChartMarkerHoverEffect"),
            ChartItem("Configure Max And Min Data Labels For Chart", "configureMaxAndMinDataLabelsForChart"),
            ChartItem("Custom Vertical XAxis Categories Labels By HTML Break Line Tag", "customVerticalXAxisCategoriesLabelsByHTMLBreakLineTag"),
            ChartItem("No More Grouping And Overlap Each Other Column Chart", "noMoreGroupingAndOverlapEachOtherColumnChart"),
            ChartItem("No More Grouping And Nested Column Chart", "noMoreGroupingAndNestedColumnChart"),
            ChartItem("Top Rounded Corners Stacking Column Chart", "topRoundedCornersStackingColumnChart"),
            ChartItem("Free Style Rounded Corners Stacking Column Chart", "freeStyleRoundedCornersStackingColumnChart"),
            ChartItem("Custom Column Chart Border Style And States Hover Color", "customColumnChartBorderStyleAndStatesHoverColor"),
            ChartItem("Custom Line Chart With Colorful Markers And Lines", "customLineChartWithColorfulMarkersAndLines"),
            ChartItem("Custom Line Chart With Colorful Markers And Lines 2", "customLineChartWithColorfulMarkersAndLines2"),
            ChartItem("Draw Line Chart With Points Coordinates", "drawLineChartWithPointsCoordinates"),
            ChartItem("Configure Special Style Column For Negative Data Mixed Positive Data", "configureSpecialStyleColumnForNegativeDataMixedPositiveData"),
            ChartItem("Configure Multi Level Stops Arr Gradient Color Areaspline Mixed Line Chart", "configureMultiLevelStopsArrGradientColorAreasplineMixedLineChart"),
            ChartItem("Connect Nulls For Single AASeries Element", "connectNullsForSingleAASeriesElement"),
            ChartItem("Line Charts With Large Differences In The Number Of Data In Different Series Element", "lineChartsWithLargeDifferencesInTheNumberOfDataInDifferentSeriesElement"),
            ChartItem("Custom Areaspline Chart With Colorful Gradient Color Zones", "customAreasplineChartWithColorfulGradientColorZones")
        )
    }
}