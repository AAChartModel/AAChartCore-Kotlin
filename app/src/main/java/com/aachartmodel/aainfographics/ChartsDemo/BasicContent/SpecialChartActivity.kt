package com.aachartmodel.aainfographics.ChartsDemo.BasicContent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.SpecialChartComposer
import com.aachartmodel.aainfographics.R
import com.aachartmodel.aainfographics.aainfographicsLib.aachartConfiger.AAChartView
import com.example.chartcorekotlin.AAChartConfiger.AAChartModel
import com.example.chartcorekotlin.AAChartConfiger.AAChartType

class SpecialChartActivity : AppCompatActivity() {

    private var aaChartModel: AAChartModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_special_chart)

        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        val chartTypeEnum = convertStringToEnum(chartType)

        aaChartModel = configureChartModelWithChartType(chartTypeEnum)
        val aaChartView: AAChartView = findViewById(R.id.AAChartView)
        aaChartView.aa_drawChartWithChartModel(aaChartModel!!)


    }

    private fun configureChartModelWithChartType(chartType: AAChartType): AAChartModel? {
        when (chartType) {
            AAChartType.Column -> return SpecialChartComposer.configurePolarColumnChart()
            AAChartType.Pie -> return SpecialChartComposer.configurePieChart()
            AAChartType.Bubble -> return SpecialChartComposer.configureBubbleChart()
            AAChartType.Scatter -> return SpecialChartComposer.configureScatterChart()
            AAChartType.Arearange -> return SpecialChartComposer.configureArearangeChart()
            AAChartType.Areasplinerange -> return SpecialChartComposer.configureAreasplinerangeChart()
            AAChartType.Columnrange -> return SpecialChartComposer.configureColumnrangeChart()
            AAChartType.Line -> return SpecialChartComposer.configureStepLineChart()
            AAChartType.Area -> return SpecialChartComposer.configureStepAreaChart()
            AAChartType.Boxplot -> return SpecialChartComposer.configureBoxplotChart()
            AAChartType.Waterfall -> return SpecialChartComposer.configureWaterfallChart()
            AAChartType.Pyramid -> return SpecialChartComposer.configurePyramidChart()
            AAChartType.Funnel -> return SpecialChartComposer.configureFunnelChart()
            else -> {
            }
        }

        return null
    }

    private fun convertStringToEnum(chartTypeStr: String): AAChartType {
        when (chartTypeStr) {
            AAChartType.Column.toString() -> return AAChartType.Column
            AAChartType.Bar.toString() -> return AAChartType.Bar
            AAChartType.Area.toString() -> return AAChartType.Area
            AAChartType.Areaspline.toString() -> return AAChartType.Areaspline
            AAChartType.Line.toString() -> return AAChartType.Line
            AAChartType.Spline.toString() -> return AAChartType.Spline
            AAChartType.Scatter.toString() -> return AAChartType.Scatter
            AAChartType.Pie.toString() -> return AAChartType.Pie
            AAChartType.Bubble.toString() -> return AAChartType.Bubble
            AAChartType.Pyramid.toString() -> return AAChartType.Pyramid
            AAChartType.Funnel.toString() -> return AAChartType.Funnel
            AAChartType.Columnrange.toString() -> return AAChartType.Columnrange
            AAChartType.Arearange.toString() -> return AAChartType.Arearange
            AAChartType.Areasplinerange.toString() -> return AAChartType.Areasplinerange
            AAChartType.Boxplot.toString() -> return AAChartType.Boxplot
            AAChartType.Waterfall.toString() -> return AAChartType.Waterfall
            AAChartType.Polygon.toString() -> return AAChartType.Polygon
        }
        return AAChartType.Column
    }
}
