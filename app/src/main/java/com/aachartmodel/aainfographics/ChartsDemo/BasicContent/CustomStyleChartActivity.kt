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
package com.aachartmodel.aainfographics.ChartsDemo.BasicContent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomStyleChartComposer
import com.aachartmodel.aainfographics.R
import com.aachartmodel.aainfographics.aainfographicsLib.aachartConfiger.AAChartView
import com.example.chartcorekotlin.AAChartConfiger.AAChartModel

class CustomStyleChartActivity : AppCompatActivity() {

    private var aaChartModel: AAChartModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_style_chart)

        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        aaChartModel = configureTheAAChartModel(chartType)

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
        }
        return CustomStyleChartComposer.configureColorfulChart()
    }
}
