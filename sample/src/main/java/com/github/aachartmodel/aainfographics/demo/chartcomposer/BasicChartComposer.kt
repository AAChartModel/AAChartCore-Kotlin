package com.github.aachartmodel.aainfographics.demo.chartcomposer

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartAnimationType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolStyleType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartSymbolType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
import com.github.aachartmodel.aainfographics.aatools.AAGradientColor
import com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection

object BasicChartComposer {

    private fun configureBasicOptions(): AAChartModel {
        return AAChartModel()
            .backgroundColor("#4b2b7f")
            .dataLabelsEnabled(false)
            .yAxisGridLineWidth(0)
            .touchEventEnabled(true)
    }

    fun configureAreaChart(): AAChartModel {
        val element1: AASeriesElement = AASeriesElement()
            .name("Tokyo")
            .data(arrayOf<Any>(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6))
        val element2: AASeriesElement = AASeriesElement()
            .name("NewYork")
            .data(arrayOf<Any>(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5))
        val element3: AASeriesElement = AASeriesElement()
            .name("London")
            .data(arrayOf<Any>(0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0))
        val element4: AASeriesElement = AASeriesElement()
            .name("Berlin")
            .data(arrayOf<Any>(3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8))
        return configureBasicOptions()
            .chartType(AAChartType.Area)
            .categories(arrayOf("Java","Swift","Python","Ruby", "PHP","Go","C","C#","C++"))
            .series(arrayOf(element1, element2, element3, element4))
    }

    fun configureStepAreaChartAndStepLineChart(): AAChartModel {
        val element1 = AASeriesElement()
            .name("Tokyo")
            .step(true)
            .data(arrayOf(149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4))

        val element2 = AASeriesElement()
            .name("NewYork")
            .step(true)
            .data(arrayOf(83.6, 78.8, 188.5, 93.4, 106.0, 84.5, 105.0, 104.3, 131.2, 153.5, 226.6, 192.3))

        val element3 = AASeriesElement()
            .name("London")
            .step(true)
            .data(arrayOf(48.9, 38.8, 19.3, 41.4, 47.0, 28.3, 59.0, 69.6, 52.4, 65.2, 53.3, 72.2))

        return configureBasicOptions()
            .chartType(AAChartType.Area)
            .series(arrayOf(element1, element2, element3))
    }

    fun configureColumnChartAndBarChart(): AAChartModel {
        return configureAreaChart()
            .categories(arrayOf(
                "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"))
            .legendEnabled(true)
            .colorsTheme(arrayOf("#fe117c", "#ffc069", "#06caf4", "#7dffc0"))
            .animationType(AAChartAnimationType.EaseOutCubic)
            .animationDuration(1200)
    }

    fun configureAreaChartAndAreasplineChartStyle(chartType: String): AAChartModel {
        val aaChartModel: AAChartModel = configureAreaChart()
            .animationType(AAChartAnimationType.EaseOutQuart)
            .legendEnabled(true)
            .markerRadius(6)
            .markerSymbol(AAChartSymbolType.Circle)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
        if (chartType == AAChartType.Areaspline.value) {
            val gradientColorDic: Map<String, Any> = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottomRight,
                "rgba(138,43,226,1)",
                "rgba(30,144,255,1)" //颜色字符串设置支持十六进制类型和 rgba 类型
            )
            val element1 = AASeriesElement()
                .name("Predefined symbol")
                .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36))

            val element2 = AASeriesElement()
                .name("Image symbol")
                .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67))

            val element3 = AASeriesElement()
                .name("Base64 symbol (*)")
                .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64))

            val element4 = AASeriesElement()
                .name("Custom symbol")
                .data(arrayOf(0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53))

            aaChartModel
                .animationType(AAChartAnimationType.EaseFrom) //设置图表渲染动画类型为 EaseFrom
                .series(arrayOf(element1, element2, element3, element4))
        }
        return aaChartModel
    }


    fun configureLineChartAndSplineChartStyle(chartType: String): AAChartModel {
        val aaChartModel: AAChartModel = configureAreaChart()
//            .chartType(chartType)
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank) //设置折线连接点样式为:边缘白色
            .markerRadius(6)
        if (chartType == AAChartType.Spline.value) {
            val element1: AASeriesElement = AASeriesElement()
                .name("Tokyo")
                .lineWidth(7)
                .data(arrayOf<Any>(50, 320, 230, 370, 230, 400))
            val element2: AASeriesElement = AASeriesElement()
                .name("Berlin")
                .lineWidth(7)
                .data(arrayOf<Any>(80, 390, 210, 340, 240, 350))
            val element3: AASeriesElement = AASeriesElement()
                .name("New York")
                .lineWidth(7)
                .data(arrayOf<Any>(100, 370, 180, 280, 260, 300))
            val element4: AASeriesElement = AASeriesElement()
                .name("London")
                .lineWidth(7)
                .data(arrayOf<Any>(130, 350, 160, 310, 250, 268))
            aaChartModel
                .animationType(AAChartAnimationType.SwingFromTo)
                .series(arrayOf(element1, element2, element3, element4))
        }
        return aaChartModel
    }
}