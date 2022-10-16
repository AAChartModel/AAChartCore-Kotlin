package com.github.aachartmodel.aainfographics.demo.additionalcontent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAAxisComposer.customYAxisLabels
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAAxisComposer.customYAxisLabels2
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAAxisComposer.customAreaChartXAxisLabelsTextUnitSuffix1
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAAxisComposer.customAreaChartXAxisLabelsTextUnitSuffix2
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAAxisComposer.configureTheAxesLabelsFormattersOfDoubleYAxesChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAAxisComposer.configureTheAxesLabelsFormattersOfDoubleYAxesChart2
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAAxisComposer.configureTheAxesLabelsFormattersOfDoubleYAxesChart3
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAAxisComposer.customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAAxisComposer.customSpiderChartStyle
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAAxisComposer.customizeEveryDataLabelSinglelyByDataLabelsFormatter
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAAxisComposer.customXAxisLabelsBeImages


class JSFunctionForAAAxisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_tooltip_with_jsfunction)
        val intent = intent
        val chartType = intent.getStringExtra("chartType")
        val aaOptions: AAOptions = chartConfigurationWithSelectedIndex(chartType)
        val aaChartView: AAChartView = findViewById(R.id.AAChartView)
        aaChartView.aa_drawChartWithChartOptions(aaOptions)
    }

    fun chartConfigurationWithSelectedIndex(chartType: String?): AAOptions {
        return when (chartType) {
            "customYAxisLabels" -> customYAxisLabels() //自定义Y轴文字
            "customYAxisLabels2" -> customYAxisLabels2() //自定义Y轴文字2
            "customAreaChartXAxisLabelsTextUnitSuffix1" -> customAreaChartXAxisLabelsTextUnitSuffix1() //自定义X轴文字单位后缀(通过 formatter 函数)
            "customAreaChartXAxisLabelsTextUnitSuffix2" -> customAreaChartXAxisLabelsTextUnitSuffix2() //自定义X轴文字单位后缀(不通过 formatter 函数)
            "configureTheAxesLabelsFormattersOfDoubleYAxesChart" -> configureTheAxesLabelsFormattersOfDoubleYAxesChart() //配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 1
            "configureTheAxesLabelsFormattersOfDoubleYAxesChart2" -> configureTheAxesLabelsFormattersOfDoubleYAxesChart2() //配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 2
            "configureTheAxesLabelsFormattersOfDoubleYAxesChart3" -> configureTheAxesLabelsFormattersOfDoubleYAxesChart3() //配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 3
            "customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters" -> customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters() //通过截取前四个字符来自定义 X 轴 labels
            "customSpiderChartStyle" -> customSpiderChartStyle() //自定义蜘蛛🕷🕸图样式
            "customizeEveryDataLabelSinglelyByDataLabelsFormatter" -> customizeEveryDataLabelSinglelyByDataLabelsFormatter() //通过 DataLabels 的 formatter 函数来实现单个数据标签🏷自定义
            "customXAxisLabelsBeImages" -> customXAxisLabelsBeImages() //自定义 X轴 labels 为一组图片
            else -> customYAxisLabels()
        }
    }
}
