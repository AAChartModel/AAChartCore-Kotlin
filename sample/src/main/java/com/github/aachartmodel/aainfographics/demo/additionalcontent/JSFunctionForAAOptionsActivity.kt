package com.github.aachartmodel.aainfographics.demo.additionalcontent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAOptionsComposer.configureColorfulDataLabelsForPieChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAOptionsComposer.customDoubleXAxesChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAOptionsComposer.customizeEveryDataLabelSinglelyByDataLabelsFormatter
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAOptionsComposer.disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction

class JSFunctionForAAOptionsActivity : AppCompatActivity() {
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
            "customDoubleXAxesChart" -> customDoubleXAxesChart() //自定义双 X 轴图表
            "disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction" -> disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction() //禁用柱状图图表的选中状态
            "customizeEveryDataLabelSinglelyByDataLabelsFormatter" -> customizeEveryDataLabelSinglelyByDataLabelsFormatter() //自定义每个数据点的数据标签内容
            "configureColorfulDataLabelsForPieChart" -> configureColorfulDataLabelsForPieChart() //为饼图图表配置多彩的数据标签
            else -> customDoubleXAxesChart()
        }
    }
}