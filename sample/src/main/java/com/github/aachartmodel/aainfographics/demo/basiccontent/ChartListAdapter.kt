package com.github.aachartmodel.aainfographics.demo.basiccontent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.demo.R

/**
 * Reusable RecyclerView adapter for chart demo lists.
 */
open class ChartListAdapter(
    @LayoutRes private val layoutResId: Int,
    private val chartItems: List<ChartItem>,
    private val chartModelProvider: (ChartItem) -> AAChartModel,
    private val onBindAdditionalViews: (holder: ViewHolder, item: ChartItem, position: Int) -> Unit = { _, _, _ -> }
) : RecyclerView.Adapter<ChartListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView? = view.findViewById(R.id.tv_chart_name)
        val indexTextView: TextView? = view.findViewById(R.id.tv_chart_index)
        val aaChartView: AAChartView = view.findViewById(R.id.aa_chart_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutResId, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = chartItems[position]
        holder.nameTextView?.text = item.name
        holder.indexTextView?.let { indexView ->
            indexView.text = "${position + 1}."
        }
        holder.aaChartView.aa_drawChartWithChartModel(chartModelProvider(item))
        onBindAdditionalViews(holder, item, position)
    }

    override fun getItemCount(): Int = chartItems.size
}

/**
 * Represents a chart demo entry with a display name and internal type.
 */
data class ChartItem(val name: String, val chartType: String)
