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
package com.github.aachartmodel.aainfographics.demo.additionalcontent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.configureAAPlotBandsForChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.configureAAPlotLinesForChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.configureDoubleYAxesAndColumnLineMixedChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.configureDoubleYAxesMarketDepthChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.configureDoubleYAxisChartOptions
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.configureTheMirrorColumnChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.configureTripleYAxesMixedChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.configureXAxisLabelsFontColorAndFontSizeWithHTMLString
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.configureXAxisLabelsFontColorWithHTMLString
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.configureXAxisPlotBand
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.configure_DataLabels_XAXis_YAxis_Legend_Style
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.customAATooltipWithJSFunction
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.customAreaChartTooltipStyleLikeHTMLTable
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.customChartLegendStyle
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.customLineChartDataLabelsFormat
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.customXAxisCrosshairStyle
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.gaugeChartWithPlotBand
import com.github.aachartmodel.aainfographics.demo.chartcomposer.ChartOptionsComposer.Companion.simpleGaugeChart

class DrawChartWithAAOptionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw_chart_with_aaoptions)

        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        val aaOptions = configureTheChartOptions(chartType!!)

        val aaChartView: AAChartView = findViewById(R.id.AAChartView)
        aaChartView.aa_drawChartWithChartOptions(aaOptions)

    }

    private fun configureTheChartOptions(chartType: String): AAOptions {
        when (chartType) {
            "customLegendStyle" -> return customChartLegendStyle()
            "AAPlotBandsForChart" -> return configureAAPlotBandsForChart()
            "AAPlotLinesForChart" -> return configureAAPlotLinesForChart()
            "customAATooltipWithJSFuntion" -> return customAATooltipWithJSFunction()
            "customXAxisCrosshairStyle" -> return customXAxisCrosshairStyle()
            "XAxisLabelsFontColorWithHTMLString" -> return configureXAxisLabelsFontColorWithHTMLString()
            "XAxisLabelsFontColorAndFontSizeWithHTMLString" -> return configureXAxisLabelsFontColorAndFontSizeWithHTMLString()
            "_DataLabels_XAXis_YAxis_Legend_Style" -> return configure_DataLabels_XAXis_YAxis_Legend_Style()
            "XAxisPlotBand" -> return configureXAxisPlotBand()
            "configureTheMirrorColumnChart" -> return configureTheMirrorColumnChart()
            "configureDoubleYAxisChartOptions" -> return configureDoubleYAxisChartOptions()
            "configureTripleYAxesMixedChart" -> return configureTripleYAxesMixedChart()
            "customLineChartDataLabelsFormat" -> return customLineChartDataLabelsFormat()
            "configureDoubleYAxesAndColumnLineMixedChart" -> return configureDoubleYAxesAndColumnLineMixedChart()
            "configureDoubleYAxesMarketDepthChart" -> return configureDoubleYAxesMarketDepthChart()
            "customAreaChartTooltipStyleLikeHTMLTable" -> return customAreaChartTooltipStyleLikeHTMLTable()
            "simpleGaugeChart" -> return simpleGaugeChart()
            "gaugeChartWithPlotBand" -> return gaugeChartWithPlotBand()
        }
        return configureAAPlotBandsForChart()
    }
}
