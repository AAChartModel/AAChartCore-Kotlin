package com.aachartmodel.aainfographics.ChartsDemo.BasicContent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomStyleChartComposer
import com.aachartmodel.aainfographics.R
import com.aachartmodel.aainfographics.aainfographicsLib.aachartConfiger.AAChartView
import com.example.chartcorekotlin.AAChartConfiger.AAChartModel

class CustomStyleChartActivity : AppCompatActivity() {

    private var aaChartModel: AAChartModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_style_chart)

        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        aaChartModel = configureTheAAChartModel(chartType)

        val aaChartView: AAChartView = findViewById(R.id.AAChartView)
        aaChartView.aa_drawChartWithChartModel(aaChartModel!!)
    }

    private fun configureTheAAChartModel(chartType: String): AAChartModel {
        when (chartType) {
            "colorfulChart" -> return CustomStyleChartComposer.configureColorfulChart()
            "gradientColorfulChart" -> return CustomStyleChartComposer.configureColorfulGradientColorChart()
            "discontinuousDataChart" -> return CustomStyleChartComposer.configureDiscontinuousDataChart()
            "colorfulColumnChart" -> return CustomStyleChartComposer.configureColorfulColumnChart()
            "nightingaleRoseChart" -> return CustomStyleChartComposer.configureNightingaleRoseChart()
            "chartWithShadowStyle" -> return CustomStyleChartComposer.configureChartWithShadowStyle()
            "colorfulGradientAreaChart" -> return CustomStyleChartComposer.configureColorfulGradientAreaChart()
            "colorfulGradientSplineChart" -> return CustomStyleChartComposer.configureColorfulGradientSplineChart()
            "gradientColorAreasplineChart" -> return CustomStyleChartComposer.configureGradientColorAreasplineChart()
        }
        return CustomStyleChartComposer.configureColorfulChart()
    }
}
