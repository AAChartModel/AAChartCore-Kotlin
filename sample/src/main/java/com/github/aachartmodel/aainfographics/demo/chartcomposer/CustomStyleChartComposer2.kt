package com.github.aachartmodel.aainfographics.demo.chartcomposer

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAZonesElement
import com.github.aachartmodel.aainfographics.aatools.AANull
import kotlin.math.sin

object CustomStyleChartComposer2 {
    fun colorfulMarkerWithZonesChart(): AAChartModel {
        // 生成平滑波浪数据
        fun generateWaveData(amplitude: Double, phase: Double, step: Double, count: Int, noise: Double = 0.0): Array<Any> {
            val data = mutableListOf<Double>()
            for (i in 0 until count) {
                val y = amplitude * sin((i * step) + phase) + 120
                val noisyY = y + (Math.random() - 0.5) * noise
                data.add(String.format("%.2f", noisyY).toDouble())
            }
            return data.toTypedArray()
        }

        // 色系分区
        val zones = arrayOf(
            AAZonesElement().apply {
                value(80.0)
                color("#25547c")
            },
            AAZonesElement().apply {
                value(110.0)
                color("#1e90ff")
            },
            AAZonesElement().apply {
                value(140.0)
                color("#ffd066")
            },
            AAZonesElement().apply {
                value(170.0)
                color("#04d69f")
            },
            AAZonesElement().apply {
                color("#ef476f")
            }
        )

        return AAChartModel().apply {
            chartType(AAChartType.Scatter)
            title("⚡️高饱和度波浪图 — 实心与空心 Marker 对比")
            legendEnabled(true)
            tooltipEnabled(true)
            series(arrayOf(
                AASeriesElement().apply {
                    name("实心数据")
                    data(generateWaveData(85.0, 0.0, 0.25, 60, 4.0))
                    zones(zones)
                    zoneAxis("y")
                    marker(AAMarker().apply {
                        symbol(AAChartSymbolType.Circle.value)
                        radius(6)
                        lineWidth(1)
                    })
                },
                AASeriesElement().apply {
                    name("空心数据")
                    data(generateWaveData(85.0, Math.PI / 2, 0.25, 60, 4.0))
                    zones(zones)
                    zoneAxis("y")
                    marker(AAMarker().apply {
                        symbol(AAChartSymbolType.Diamond.value)
                        fillColor("transparent")
                        lineColor(AANull())
                        radius(7)
                        lineWidth(2)
                    })
                    dashStyle(AAChartLineDashStyleType.DashDot)
                }
            ))
        }
    }
}