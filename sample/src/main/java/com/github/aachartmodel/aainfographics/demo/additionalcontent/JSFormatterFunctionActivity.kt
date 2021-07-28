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
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customAreaChartTooltipStyleWithColorfulHtmlLabels
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customAreaChartTooltipStyleWithDifferentUnitSuffix
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customAreaChartTooltipStyleWithSimpleFormatString
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customArearangeChartTooltip
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customBoxplotTooltipContent
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customDoubleXAxesChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customLineChartTooltipStyleWhenValueBeZeroDoNotShow
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customStackedAndGroupedColumnChartTooltip
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customTooltipWhichDataSourceComeFromOutSideRatherThanSeries
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customYAxisLabels
import com.github.aachartmodel.aainfographics.demo.chartcomposer.CustomTooltipComposer.customYAxisLabels2

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
            "customAreaChartTooltipStyleWithSimpleFormatString" -> return customAreaChartTooltipStyleWithSimpleFormatString()//简单字符串拼接
            "customAreaChartTooltipStyleWithDifferentUnitSuffix" -> return customAreaChartTooltipStyleWithDifferentUnitSuffix()//自定义不同单位后缀
            "customAreaChartTooltipStyleWithColorfulHtmlLabels" -> return customAreaChartTooltipStyleWithColorfulHtmlLabels()//自定义多彩颜色文字
            "customLineChartTooltipStyleWhenValueBeZeroDoNotShow" -> return customLineChartTooltipStyleWhenValueBeZeroDoNotShow()//值为0时,在tooltip中不显示
            "customBoxplotTooltipContent" -> return customBoxplotTooltipContent()
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
        return customAreaChartTooltipStyleWithSimpleFormatString()
    }
}
