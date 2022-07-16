package com.github.aachartmodel.aainfographics.demo.additionalcontent

import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.Toast
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.basiccontent.BasicChartActivity

class AdvancedUpdatingFeatureActivity : BasicChartActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        var options: Any? = Any()
        when (group.id) {
            R.id.stackingTypeRadioGroup -> {
                var stackingType = AAChartStackingType.False
                when (group.checkedRadioButtonId) {
                    R.id.noStackingRadio -> stackingType = AAChartStackingType.False
                    R.id.normalStackingRadio -> stackingType = AAChartStackingType.Normal
                    R.id.percentStackingRadio -> stackingType = AAChartStackingType.Percent
                }
                val aaPlotOptions: AAPlotOptions = AAPlotOptions()
                    .series(AASeries()
                            .stacking(stackingType))
                options = aaPlotOptions
            }
            R.id.cornerStyleTypeRadioGroup -> {
                var borderRadius: Float? = null
                when (group.checkedRadioButtonId) {
                    R.id.squareCornersRadio -> borderRadius = 1f
                    R.id.roundedCornersRadio -> borderRadius = 10f
                    R.id.wedgeCornersRadio -> borderRadius = 100f
                }
                val aaPlotOptions: AAPlotOptions
                aaPlotOptions = if (chartType == AAChartType.Column.value) {
                    AAPlotOptions()
                        .column(AAColumn()
                                .borderRadius(borderRadius))
                } else {
                    AAPlotOptions()
                        .bar(AABar()
                                .borderRadius(borderRadius))
                }
                options = aaPlotOptions
            }
            else -> {
                var markerSymbol = AAChartSymbolType.Circle
                when (group.checkedRadioButtonId) {
                    R.id.circleSymbolRadio -> markerSymbol = AAChartSymbolType.Circle
                    R.id.diamondSymbolRadio -> markerSymbol = AAChartSymbolType.Diamond
                    R.id.squareSymbolRadio -> markerSymbol = AAChartSymbolType.Square
                    R.id.triangleSymbolRadio -> markerSymbol = AAChartSymbolType.Triangle
                    R.id.triangleDownSymbolRadio -> markerSymbol = AAChartSymbolType.TriangleDown
                }
                val aaPlotOptions: AAPlotOptions = AAPlotOptions()
                    .series(AASeries()
                            .marker(AAMarker()
                                    .symbol(markerSymbol.value)))
                options = aaPlotOptions
            }
        }
        aaChartView?.aa_updateChartWithOptions(options, true)
    }

    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        var options = Any()
        when (buttonView.id) {
            R.id.xReversedSwitch -> {
                val aaXAxis: AAXAxis = AAXAxis()
                    .reversed(isChecked)
                options = aaXAxis
            }
            R.id.yReversedSwitch -> {
                val aaYAxis: AAYAxis = AAYAxis()
                    .reversed(isChecked)
                options = aaYAxis
            }
            R.id.xInvertedSwitch -> {
                if (this.aaChartModel.chartType == AAChartType.Bar) {
                    Toast.makeText(
                        this,
                        "⚠️⚠️⚠️inverted is useless for Bar Chart",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                    Log.d("", "⚠️⚠️⚠️inverted is useless for Bar Chart")
                }
                val aaChart: AAChart = AAChart()
                    .inverted(isChecked)
                    .polar(this.aaChartModel.polar)
                options = aaChart
            }
            R.id.polarSwitch -> {
                this.aaChartModel.polar = isChecked
                val aaChart: AAChart = AAChart()
                    .polar(isChecked)
                    .inverted(this.aaChartModel.inverted)
                options = aaChart
                if (this.aaChartModel.chartType == AAChartType.Column) {
                    options = if (this.aaChartModel.polar == true) {
                        AAOptions()
                            .chart(aaChart)
                            .plotOptions(AAPlotOptions()
                                    .column(AAColumn()
                                            .pointPadding(0f)
                                            .groupPadding(0.005f)))
                    } else {
                        AAOptions()
                            .chart(aaChart)
                            .plotOptions(AAPlotOptions()
                                    .column(AAColumn()
                                            .pointPadding(0.1f)
                                            .groupPadding(0.2f)))
                    }
                } else if (this.aaChartModel.chartType == AAChartType.Bar) {
                    options = if (this.aaChartModel.polar == true)  {
                        AAOptions()
                            .chart(aaChart)
                            .plotOptions(AAPlotOptions()
                                    .bar(AABar()
                                            .pointPadding(0f)
                                            .groupPadding(0.005f)))
                    } else {
                        AAOptions()
                            .chart(aaChart)
                            .plotOptions(AAPlotOptions()
                                    .bar(AABar()
                                            .pointPadding(0.1f)
                                            .groupPadding(0.2f)))
                    }
                }
            }
            R.id.dataShowSwitch -> {
                val aaPlotOptions: AAPlotOptions = AAPlotOptions()
                    .series(AASeries()
                            .dataLabels(AADataLabels()
                                    .enabled(isChecked)))
                options = aaPlotOptions
            }
            R.id.markerHideSwitch -> {
                val aaMarker: AAMarker = if (isChecked)
                    AAMarker()
                    .enabled(false)
                else AAMarker()
                    .enabled(true)
                    .radius(6f)
                val aaPlotOptions: AAPlotOptions = AAPlotOptions()
                    .series(AASeries()
                            .marker(aaMarker))
                options = aaPlotOptions
            }
        }
        aaChartView?.aa_updateChartWithOptions(options, true)
    }
}