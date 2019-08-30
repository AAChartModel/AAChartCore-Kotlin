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
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureAAPlotBandsForChart
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.configureAAPlotLinesForChart
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.customAATooltipWithJSFuntion
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.ChartOptionsComposer.Companion.customXAxisCrosshairStyle
import com.aachartmodel.aainfographics.R
import com.aachartmodel.aainfographics.aainfographicsLib.aachartConfiger.AAChartView
import java.util.HashMap

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
            "configureAAPlotBandsForChart" -> return configureAAPlotBandsForChart()
            "configureAAPlotLinesForChart" -> return configureAAPlotLinesForChart()
            "customAATooltipWithJSFuntion" -> return customAATooltipWithJSFuntion()
            "customXAxisCrosshairStyle" -> return customXAxisCrosshairStyle()
        }
        return configureAAPlotBandsForChart()
    }
}
