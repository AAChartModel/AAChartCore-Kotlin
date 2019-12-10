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
package com.aachartmodel.aainfographics.ChartsDemo.AdditionalContent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAOptions
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.customChartLegendStyle
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureAAPlotBandsForChart
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureAAPlotLinesForChart
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureDoubleYAxesAndColumnLineMixedChart
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureDoubleYAxesMarketDepthChart
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureDoubleYAxisChartOptions
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureTheMirrorColumnChart
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureTripleYAxesMixedChart
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureXAxisLabelsFontColorAndFontSizeWithHTMLString
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureXAxisLabelsFontColorWithHTMLString
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureXAxisPlotBand
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configure_DataLabels_XAXis_YAxis_Legend_Style
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.customAATooltipWithJSFunction
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.customAreaChartTooltipStyleLikeHTMLTable
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.customLineChartDataLabelsFormat
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.customXAxisCrosshairStyle
import com.aachartmodel.aainfographics.R
import com.aachartmodel.aainfographics.aainfographicsLib.aachartConfiger.AAChartView

class DrawChartWithAAOptionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw_chart_with_aaoptions)

        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        val aaOptions = configureTheChartOptions(chartType)

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
            "customLineChartDataLabelsFormat"-> return customLineChartDataLabelsFormat()
            "configureDoubleYAxesAndColumnLineMixedChart"-> return configureDoubleYAxesAndColumnLineMixedChart()
            "configureDoubleYAxesMarketDepthChart"-> return configureDoubleYAxesMarketDepthChart()
            "customAreaChartTooltipStyleLikeHTMLTable"-> return customAreaChartTooltipStyleLikeHTMLTable()
        }
        return configureAAPlotBandsForChart()
    }
}
