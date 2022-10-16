package com.github.aachartmodel.aainfographics.demo.additionalcontent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAALegendComposer.customLegendItemClickEvent
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAALegendComposer.disableLegendClickEventForNormalChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAALegendComposer.disableLegendClickEventForPieChart

class JSFunctionForAALegendActivity : AppCompatActivity() {
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
            "disableLegendClickEventForNormalChart" -> disableLegendClickEventForNormalChart() //禁用普通图表的图例点击事件
            "disableLegendClickEventForPieChart" -> disableLegendClickEventForPieChart() //禁用饼图图表的图例点击事件
            "customLegendItemClickEvent" -> customLegendItemClickEvent() //自定义图例点击事件
            else -> disableLegendClickEventForNormalChart()
        }
    }
}