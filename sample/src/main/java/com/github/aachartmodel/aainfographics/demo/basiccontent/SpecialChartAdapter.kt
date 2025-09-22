package com.github.aachartmodel.aainfographics.demo.basiccontent

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.SpecialChartComposer

data class ChartItem(val name: String, val chartType: String)

class SpecialChartAdapter(
    private val context: Context,
    private val chartItems: List<ChartItem>
) : RecyclerView.Adapter<SpecialChartAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val indexTextView: TextView = view.findViewById(R.id.tv_chart_index)
        val nameTextView: TextView = view.findViewById(R.id.tv_chart_name)
        val aaChartView: AAChartView = view.findViewById(R.id.aa_chart_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_special_chart, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = chartItems[position]
        holder.indexTextView.text = "${position + 1}."
        holder.nameTextView.text = item.name
        val aaChartModel = getChartModel(item.chartType)
        holder.aaChartView.aa_drawChartWithChartModel(aaChartModel)
    }

    override fun getItemCount(): Int = chartItems.size

    private fun getChartModel(chartType: String): AAChartModel {
        return when (chartType) {
            "Column" -> SpecialChartComposer.configurePolarColumnChart()
            "Bar" -> SpecialChartComposer.configurePolarBarChart()
            "Line" -> SpecialChartComposer.configurePolarLineChart()
            "Area" -> SpecialChartComposer.configurePolarAreaChart()
            "Pie" -> SpecialChartComposer.configurePieChart()
            "Bubble" -> SpecialChartComposer.configureBubbleChart()
            "Scatter" -> SpecialChartComposer.configureScatterChart()
            "Arearange" -> SpecialChartComposer.configureArearangeChart()
            "Areasplinerange" -> SpecialChartComposer.configureAreasplinerangeChart()
            "Columnrange" -> SpecialChartComposer.configureColumnrangeChart()
            "Spline" -> SpecialChartComposer.configureStepLineChart()
            "Areaspline" -> SpecialChartComposer.configureStepAreaChart()
            "Boxplot" -> SpecialChartComposer.configureBoxplotChart()
            "Waterfall" -> SpecialChartComposer.configureWaterfallChart()
            "Pyramid" -> SpecialChartComposer.configurePyramidChart()
            "Funnel" -> SpecialChartComposer.configureFunnelChart()
            "Errorbar" -> SpecialChartComposer.configureErrorbarChart()
            "Gauge" -> SpecialChartComposer.configureGaugeChart()
            "Polygon" -> SpecialChartComposer.configurePolygonChart()
            else -> SpecialChartComposer.configurePolarColumnChart()
        }
    }
}