package com.github.aachartmodel.aainfographics.demo.basiccontent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.aachartmodel.aainfographics.demo.R

class MixedChartListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mixed_chart_list)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val chartItems = getChartItems()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MixedChartAdapter(chartItems)
    }

    private fun getChartItems(): List<ChartItem> {
        return listOf(
            ChartItem("Arearange Mixed Line", "arearangeMixedLine"),
            ChartItem("Columnrange Mixed Line", "columnrangeMixedLine"),
            ChartItem("Stacking Column Mixed Line", "stackingColumnMixedLine"),
            ChartItem("Dash Style Type Mixed", "dashStyleTypeMixed"),
            ChartItem("Negative Color Mixed", "negativeColorMixed"),
            ChartItem("Scatter Mixed Line", "scatterMixedLine"),
            ChartItem("Negative Color Mixed Bubble", "negativeColorMixedBubble"),
            ChartItem("Polygon Mixed Scatter", "polygonMixedScatter"),
            ChartItem("Polar Chart Mixed", "polarChartMixed"),
            ChartItem("Pie Mixed Line Mixed Column", "configurePieMixedLineMixedColumnChart"),
            ChartItem("Negative Color Mixed Areaspline", "configureNegativeColorMixedAreasplineChart")
        )
    }
}