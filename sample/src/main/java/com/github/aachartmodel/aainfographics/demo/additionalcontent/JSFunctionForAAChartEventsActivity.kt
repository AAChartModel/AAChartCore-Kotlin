package com.github.aachartmodel.aainfographics.demo.additionalcontent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAChartEventsComposer.setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAChartEventsComposer.advancedTimeLineChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAChartEventsComposer.automaticallyHideTooltipAfterItIsShown
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAChartEventsComposer.configureBlinkMarkerChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAChartEventsComposer.configureECGStyleChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAChartEventsComposer.configureScatterChartWithBlinkEffect
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAChartEventsComposer.configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAChartEventsComposer.customizeYAxisPlotLinesLabelBeSpecialStyle
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAChartEventsComposer.dynamicHeightGridLineAreaChart
import com.github.aachartmodel.aainfographics.demo.chartcomposer.JSFunctionForAAChartEventsComposer.generalDrawingChart

class JSFunctionForAAChartEventsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_tooltip_with_jsfunction)

        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        val aaOptions = configureTheChartOptions(chartType!!)

        val aaChartView: AAChartView = findViewById(R.id.AAChartView)
        aaChartView.aa_drawChartWithChartOptions(aaOptions)    }

    fun configureTheChartOptions(chartType: String?): AAOptions {
        when (chartType) {
            "setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart" -> return setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart() //图表加载完成后,自动设置默认的十字准星和浮动提示框的位置
            "generalDrawingChart" -> return generalDrawingChart() //自由绘图
            "advancedTimeLineChart" -> return advancedTimeLineChart() //高级时间线图
            "configureBlinkMarkerChart" -> return configureBlinkMarkerChart() //配置闪烁的标记点
            "configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect" -> return configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect() //配置单个数据元素的特殊样式标记点即闪烁特效
            "configureScatterChartWithBlinkEffect" -> return configureScatterChartWithBlinkEffect() //配置散点图的闪烁特效
            "automaticallyHideTooltipAfterItIsShown" -> return automaticallyHideTooltipAfterItIsShown() //图表加载完成后,自动隐藏浮动提示框
            "dynamicHeightGridLineAreaChart" -> return dynamicHeightGridLineAreaChart() //动态高度网格线的区域填充图
            "customizeYAxisPlotLinesLabelBeSpecialStyle" -> return customizeYAxisPlotLinesLabelBeSpecialStyle() //自定义 Y 轴轴线上面的标签文字特殊样式
            "configureECGStyleChart" -> return configureECGStyleChart() //配置 ECG 样式的图表
        }
        return setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart()
    }
}