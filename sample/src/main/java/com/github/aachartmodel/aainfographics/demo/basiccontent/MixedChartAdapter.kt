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
import com.github.aachartmodel.aainfographics.demo.chartcomposer.MixedChartComposer

data class MixedChartItem(val name: String, val chartType: String)

class MixedChartAdapter(
    private val context: Context,
    private val chartItems: List<MixedChartItem>
) : RecyclerView.Adapter<MixedChartAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.tv_chart_name)
        val aaChartView: AAChartView = view.findViewById(R.id.aa_chart_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_mixed_chart, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = chartItems[position]
        holder.nameTextView.text = item.name
        val aaChartModel = getChartModel(item.chartType)
        holder.aaChartView.aa_drawChartWithChartModel(aaChartModel)
    }

    override fun getItemCount(): Int = chartItems.size

    private fun getChartModel(chartType: String): AAChartModel {
        return when (chartType) {
            "arearangeMixedLine" -> MixedChartComposer.arearangeMixedLine()
            "columnrangeMixedLine" -> MixedChartComposer.configureColumnrangeMixedLineChart()
            "stackingColumnMixedLine" -> MixedChartComposer.configureStackingColumnMixedLineChart()
            "dashStyleTypeMixed" -> MixedChartComposer.dashStyleTypeMixedChart()
            "negativeColorMixed" -> MixedChartComposer.negativeColorMixedChart()
            "scatterMixedLine" -> MixedChartComposer.scatterMixedLine()
            "negativeColorMixedBubble" -> MixedChartComposer.negativeColorMixedBubble()
            "polygonMixedScatter" -> MixedChartComposer.polygonMixedScatter()
            "polarChartMixed" -> MixedChartComposer.polarChartMixedChart()
            "configurePieMixedLineMixedColumnChart" -> MixedChartComposer.configurePieMixedLineMixedColumnChart()
            "configureNegativeColorMixedAreasplineChart" -> MixedChartComposer.configureNegativeColorMixedAreasplineChart()
            else -> MixedChartComposer.arearangeMixedLine()
        }
    }
}