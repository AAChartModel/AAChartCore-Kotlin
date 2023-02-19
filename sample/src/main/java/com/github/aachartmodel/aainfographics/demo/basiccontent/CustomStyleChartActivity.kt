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
package com.github.aachartmodel.aainfographics.demo.basiccontent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomStyleChartComposer

class CustomStyleChartActivity : AppCompatActivity() {

    private var aaChartModel: AAChartModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_style_chart)

        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        aaChartModel = configureTheAAChartModel(chartType!!)

        val aaChartView: AAChartView = findViewById(R.id.AAChartView)
        aaChartView.aa_drawChartWithChartModel(aaChartModel!!)
    }

    private fun configureTheAAChartModel(chartType: String): AAChartModel {
        when (chartType) {
            "colorfulChart" ->
                return CustomStyleChartComposer.configureColorfulChart()
            "gradientColorfulChart" ->
                return CustomStyleChartComposer.configureColorfulGradientColorChart()
            "discontinuousDataChart" ->
                return CustomStyleChartComposer.configureDiscontinuousDataChart()
            "colorfulColumnChart" ->
                return CustomStyleChartComposer.configureColorfulColumnChart()
            "nightingaleRoseChart" ->
                return CustomStyleChartComposer.configureNightingaleRoseChart()
            "chartWithShadowStyle" ->
                return CustomStyleChartComposer.configureChartWithShadowStyle()
            "colorfulGradientAreaChart" ->
                return CustomStyleChartComposer.configureColorfulGradientAreaChart()
            "colorfulGradientSplineChart" ->
                return CustomStyleChartComposer.configureColorfulGradientSplineChart()
            "gradientColorAreasplineChart" ->
                return CustomStyleChartComposer.configureGradientColorAreasplineChart()
            "SpecialStyleMarkerOfSingleDataElementChart" ->
                return CustomStyleChartComposer.configureSpecialStyleMarkerOfSingleDataElementChart()
            "SpecialStyleColumnOfSingleDataElementChart" ->
                return CustomStyleChartComposer.configureSpecialStyleColumnOfSingleDataElementChart()
            "AreaChartThreshold" ->
                return CustomStyleChartComposer.configureAreaChartThreshold()
            "customScatterChartMarkerSymbolContent" ->
                return CustomStyleChartComposer.customScatterChartMarkerSymbolContent()
            "customLineChartMarkerSymbolContent" ->
                return CustomStyleChartComposer.customLineChartMarkerSymbolContent()
            "TriangleRadarChart" ->
                return CustomStyleChartComposer.configureTriangleRadarChart()
            "QuadrangleRadarChart" ->
                return CustomStyleChartComposer.configureQuadrangleRadarChart()
            "PentagonRadarChart" ->
                return CustomStyleChartComposer.configurePentagonRadarChart()
            "HexagonRadarChart" ->
                return CustomStyleChartComposer.configureHexagonRadarChart()

             "adjustYAxisMaxAndMinValues"-> return CustomStyleChartComposer.adjustYAxisMaxAndMinValues()
             "customSpecialStyleDataLabelOfSingleDataElementChart"-> return CustomStyleChartComposer.customSpecialStyleDataLabelOfSingleDataElementChart()
             "customBarChartHoverColorAndSelectColor"-> return CustomStyleChartComposer.customBarChartHoverColorAndSelectColor()
             "customChartHoverAndSelectHaloStyle"-> return CustomStyleChartComposer.customChartHoverAndSelectHaloStyle()
             "customSplineChartMarkerStatesHoverStyle"-> return CustomStyleChartComposer.customSplineChartMarkerStatesHoverStyle()
            "splineChartHoverLineWithNoChangeAndCustomMarkerStatesHoverStyle" -> return CustomStyleChartComposer.splineChartHoverLineWithNoChangeAndCustomMarkerStatesHoverStyle()
             "customNormalStackingChartDataLabelsContentAndStyle"-> return CustomStyleChartComposer.customNormalStackingChartDataLabelsContentAndStyle()
             "upsideDownPyramidChart"-> return CustomStyleChartComposer.upsideDownPyramidChart()
             "doubleLayerPieChart"-> return CustomStyleChartComposer.doubleLayerPieChart()
             "disableSomeOfLinesMouseTrackingEffect"-> return CustomStyleChartComposer.disableSomeOfLinesMouseTrackingEffect()
             "configureColorfulShadowSplineChart"-> return CustomStyleChartComposer.configureColorfulShadowSplineChart()
             "configureColorfulDataLabelsStepLineChart"-> return CustomStyleChartComposer.configureColorfulDataLabelsStepLineChart()
             "configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart"-> return CustomStyleChartComposer.configureColorfulGradientColorAndColorfulDataLabelsStepAreaChart()
             "disableSplineChartMarkerHoverEffect"-> return CustomStyleChartComposer.disableSplineChartMarkerHoverEffect()
             "configureMaxAndMinDataLabelsForChart"-> return CustomStyleChartComposer.configureMaxAndMinDataLabelsForChart()
             "customVerticalXAxisCategoriesLabelsByHTMLBreakLineTag"-> return CustomStyleChartComposer.customVerticalXAxisCategoriesLabelsByHTMLBreakLineTag()

            "noMoreGroupingAndOverlapEachOtherColumnChart" ->
                return CustomStyleChartComposer.noMoreGroupingAndOverlapEachOtherColumnChart()
            "noMoreGroupingAndNestedColumnChart" ->
                return CustomStyleChartComposer.noMoreGroupingAndNestedColumnChart()
            "topRoundedCornersStackingColumnChart" ->
                return CustomStyleChartComposer.topRoundedCornersStackingColumnChart()
            "freeStyleRoundedCornersStackingColumnChart" ->
                return CustomStyleChartComposer.freeStyleRoundedCornersStackingColumnChart()
            "customColumnChartBorderStyleAndStatesHoverColor" ->
                return CustomStyleChartComposer.customColumnChartBorderStyleAndStatesHoverColor()

            "customLineChartWithColorfulMarkersAndLines" ->
                return CustomStyleChartComposer.customLineChartWithColorfulMarkersAndLines()
            "customLineChartWithColorfulMarkersAndLines2" ->
                return CustomStyleChartComposer.customLineChartWithColorfulMarkersAndLines2()
            "drawLineChartWithPointsCoordinates" ->
                return CustomStyleChartComposer.drawLineChartWithPointsCoordinates()
            "configureSpecialStyleColumnForNegativeDataMixedPositiveData" ->
                return CustomStyleChartComposer.configureSpecialStyleColumnForNegativeDataMixedPositiveData()
            "configureMultiLevelStopsArrGradientColorAreasplineMixedLineChart" ->
                return CustomStyleChartComposer.configureMultiLevelStopsArrGradientColorAreasplineMixedLineChart()
            "connectNullsForSingleAASeriesElement" ->
            return CustomStyleChartComposer.connectNullsForSingleAASeriesElement()
            "lineChartsWithLargeDifferencesInTheNumberOfDataInDifferentSeriesElement" ->
                return CustomStyleChartComposer.lineChartsWithLargeDifferencesInTheNumberOfDataInDifferentSeriesElement()
            "customAreasplineChartWithColorfulGradientColorZones" ->
                return CustomStyleChartComposer.customAreasplineChartWithColorfulGradientColorZones()


        }
        return CustomStyleChartComposer.configureColorfulChart()
    }
}
