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
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAOptions
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction1
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction2
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction3
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction4
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customArearangeChartTooltip
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customBoxplotTooltipContent
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customDoubleXAxesChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customStackedAndGroupedColumnChartTooltip
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customTooltipWhichDataSourceComeFromOutSideRatherThanSeries
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customYAxisLabels
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.Companion.customYAxisLabels2

class JSFormatterFunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_tooltip_with_jsfunction)
        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        val aaOptions = configureTheChartOptions(chartType!!)

        val aaChartView: AAChartView = findViewById(R.id.AAChartView)
        aaChartView.aa_drawChartWithChartOptions(aaOptions)

    }

    private fun configureTheChartOptions(chartType: String): AAOptions {
        when (chartType) {
            "formatterFunction1" -> return customAreaChartTooltipStyleWithFormatterFunction1()
            "formatterFunction2" -> return customAreaChartTooltipStyleWithFormatterFunction2()
            "formatterFunction3" -> return customAreaChartTooltipStyleWithFormatterFunction3()
            "formatterFunction4" -> return customAreaChartTooltipStyleWithFormatterFunction4()
            "formatterFunction5" -> return customBoxplotTooltipContent()
            "customYAxisLabels" -> return customYAxisLabels()
            "customYAxisLabels2" -> return customYAxisLabels2()
            "customStackedAndGroupedColumnChartTooltip" -> return customStackedAndGroupedColumnChartTooltip()
            "customDoubleXAxesChart" -> return customDoubleXAxesChart()
            "customArearangeChartTooltip" -> return customArearangeChartTooltip()
            "customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter" ->
                return customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter()
            "customTooltipWhichDataSourceComeFromOutSideRatherThanSeries" ->
                return customTooltipWhichDataSourceComeFromOutSideRatherThanSeries()

        }
        return customAreaChartTooltipStyleWithFormatterFunction1()
    }
}
