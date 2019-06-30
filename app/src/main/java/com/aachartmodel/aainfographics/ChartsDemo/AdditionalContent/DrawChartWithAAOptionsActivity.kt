package com.aachartmodel.aainfographics.ChartsDemo.AdditionalContent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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

    internal fun configureTheChartOptions(chartType: String): HashMap<*, *> {
        when (chartType) {
            "configureAAPlotBandsForChart" -> return configureAAPlotBandsForChart()
            "configureAAPlotLinesForChart" -> return configureAAPlotLinesForChart()
            "customAATooltipWithJSFuntion" -> return customAATooltipWithJSFuntion()
            "customXAxisCrosshairStyle" -> return customXAxisCrosshairStyle()
        }
        return configureAAPlotBandsForChart()
    }
}
