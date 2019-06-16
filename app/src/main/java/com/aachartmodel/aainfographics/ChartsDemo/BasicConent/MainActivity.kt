package com.aachartmodel.aainfographics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.chartcorekotlin.AAChartConfiger.*
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Line)
            .title("title")
            .subtitle("this is the subtitle of chart")
            .backgroundColor("#ffffff")
            .dataLabelEnabled(true)
            .yAxisGridLineWidth(0)
            .legendVerticalAlign(AAChartLegendVerticalAlignType.Bottom)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)),
                AASeriesElement()
                    .name("New York")
                    .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.10, 14.1, 8.6, 2.5)),
                AASeriesElement()
                    .name("Berlin")
                    .data(arrayOf(0.9, 0.6, 3.5, 8.40, 13.5, 17.0, 18.6, 17.9, 14.30, 9.0, 3.90, 1.0)),
                AASeriesElement()
                    .name("London")
                    .data(arrayOf(3.9, 4.2, 5.7, 8.50, 11.9, 15.2, 17.0, 16.6, 14.20, 10.3, 6.6, 4.8))
            )
            )

        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)

        print(Gson().toJson(aaOptions))
    }
}
