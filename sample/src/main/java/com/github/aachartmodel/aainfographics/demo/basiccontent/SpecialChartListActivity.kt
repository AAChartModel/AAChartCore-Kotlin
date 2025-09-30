package com.github.aachartmodel.aainfographics.demo.basiccontent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.aachartmodel.aainfographics.demo.R

class SpecialChartListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_special_chart_list)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val chartItems = getChartItems()
        recyclerView.layoutManager = LinearLayoutManager(this)
    recyclerView.adapter = SpecialChartAdapter(chartItems)
    }

    private fun getChartItems(): List<ChartItem> {
        return listOf(
            ChartItem("Polar Column Chart", "Column"),
            ChartItem("Polar Bar Chart", "Bar"),
            ChartItem("Polar Line Chart", "Line"),
            ChartItem("Polar Area Chart", "Area"),
            ChartItem("Pie Chart", "Pie"),
            ChartItem("Bubble Chart", "Bubble"),
            ChartItem("Scatter Chart", "Scatter"),
            ChartItem("Arearange Chart", "Arearange"),
            ChartItem("Areasplinerange Chart", "Areasplinerange"),
            ChartItem("Columnrange Chart", "Columnrange"),
            ChartItem("Step Line Chart", "Spline"),
            ChartItem("Step Area Chart", "Areaspline"),
            ChartItem("Boxplot Chart", "Boxplot"),
            ChartItem("Waterfall Chart", "Waterfall"),
            ChartItem("Pyramid Chart", "Pyramid"),
            ChartItem("Funnel Chart", "Funnel"),
            ChartItem("Errorbar Chart", "Errorbar"),
            ChartItem("Gauge Chart", "Gauge"),
            ChartItem("Polygon Chart", "Polygon")
        )
    }
}