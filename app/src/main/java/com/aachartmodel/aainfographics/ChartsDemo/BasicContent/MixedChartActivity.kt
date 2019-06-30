package com.aachartmodel.aainfographics.ChartsDemo.BasicContent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.MixedChartComposer
import com.aachartmodel.aainfographics.R
import com.aachartmodel.aainfographics.aainfographicsLib.aachartConfiger.AAChartView
import com.example.chartcorekotlin.AAChartConfiger.AAChartModel

class MixedChartActivity : AppCompatActivity() {
    private var aaChartModel: AAChartModel? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mixed_chart)

        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        this.aaChartModel = configureTheAAChartModel(chartType)

        aaChartModel = configureTheAAChartModel(chartType)
        val aaChartView: AAChartView = findViewById(R.id.AAChartView)
        aaChartView.aa_drawChartWithChartModel(aaChartModel!!)
    }


    private fun configureTheAAChartModel(chartType: String): AAChartModel? {
        when (chartType) {
            "arearangeMixedLine" -> return MixedChartComposer.arearangeMixedLine()
            "columnrangeMixedLine" -> return MixedChartComposer.configureColumnrangeMixedLineChart()
            "stackingColumnMixedLine" -> return MixedChartComposer.configurestackingColumnMixedLineChart()
            "dashStyleTypeMixed" -> return MixedChartComposer.dashStyleTypeMixedChart()
            "negativeColorMixed" -> return MixedChartComposer.negativeColorMixedChart()
            "scatterMixedLine" -> return MixedChartComposer.scatterMixedLine()
            "negativeColorMixedBubble" -> return MixedChartComposer.negativeColorMixedBubble()
            "polygonMixedScatter" -> return MixedChartComposer.polygonMixedScatter()
            "polarChartMixed" -> return MixedChartComposer.polarChartMixedChart()
        }
        return null
    }
}
