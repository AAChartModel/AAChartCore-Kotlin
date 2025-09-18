package com.github.aachartmodel.aainfographics.demo.basiccontent

import android.content.Intent
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
        recyclerView.adapter = MixedChartAdapter(this, chartItems)
    }

    private fun getChartItems(): List<MixedChartItem> {
        return listOf(
            MixedChartItem("Arearange Mixed Line", "arearangeMixedLine"),
            MixedChartItem("Columnrange Mixed Line", "columnrangeMixedLine"),
            MixedChartItem("Stacking Column Mixed Line", "stackingColumnMixedLine"),
            MixedChartItem("Dash Style Type Mixed", "dashStyleTypeMixed"),
            MixedChartItem("Negative Color Mixed", "negativeColorMixed"),
            MixedChartItem("Scatter Mixed Line", "scatterMixedLine"),
            MixedChartItem("Negative Color Mixed Bubble", "negativeColorMixedBubble"),
            MixedChartItem("Polygon Mixed Scatter", "polygonMixedScatter"),
            MixedChartItem("Polar Chart Mixed", "polarChartMixed"),
            MixedChartItem("Pie Mixed Line Mixed Column", "configurePieMixedLineMixedColumnChart"),
            MixedChartItem("Negative Color Mixed Areaspline", "configureNegativeColorMixedAreasplineChart")
        )
    }
}