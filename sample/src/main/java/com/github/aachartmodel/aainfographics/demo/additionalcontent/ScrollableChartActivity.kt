package com.github.aachartmodel.aainfographics.demo.additionalcontent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer
import com.github.aachartmodel.aainfographics.demo.R
import kotlin.math.sin


class ScrollableChartActivity : AppCompatActivity() {
    private var aaChartView1: AAChartView? = null
    private var aaChartModel: AAChartModel? = null
    private var aaOptions: AAOptions? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scollable_chart)
        aaChartView1 = findViewById(R.id.AAChartView1)
        val aaChartModel: AAChartModel = configureChartModel()
        if (aaOptions == null) {
            aaOptions = aaChartModel.aa_toAAOptions()
        }
        aaChartView1?.aa_drawChartWithChartOptions(aaOptions!!)
    }

    private fun configureChartModel(): AAChartModel {
        val chartType = intent.getStringExtra("chartType").toString()
        val position = intent.getIntExtra("position", 0)
        val chartTypeEnum = convertStringToEnum(chartType)

        val seriesDataArray = configureSeriesDataArray() as Array<Any>

        val aaChartModel = AAChartModel()
            .chartType(chartTypeEnum)
            .title("")
            .yAxisTitle("")
            .legendEnabled(false)
            .yAxisGridLineWidth(0f)
            .scrollablePlotArea(
                AAScrollablePlotArea()
                    .minWidth(3000)
                    .scrollPositionX(1f)
            )
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo")
                    .data(seriesDataArray)
            ))

        this.aaChartModel = aaChartModel
        configureTheStyleForDifferentTypeChart(chartTypeEnum, position)
        return aaChartModel
    }

    private fun convertStringToEnum(chartTypeStr: String): AAChartType {
        var chartTypeEnum = AAChartType.Column
        when (chartTypeStr) {
            AAChartType.Column.value -> chartTypeEnum = AAChartType.Column
            AAChartType.Bar.value -> chartTypeEnum = AAChartType.Bar
            AAChartType.Area.value -> chartTypeEnum = AAChartType.Area
            AAChartType.Areaspline.value -> chartTypeEnum = AAChartType.Areaspline
            AAChartType.Line.value -> chartTypeEnum = AAChartType.Line
            AAChartType.Spline.value -> chartTypeEnum = AAChartType.Spline
        }
        return chartTypeEnum
    }

    private fun configureTheStyleForDifferentTypeChart(
        chartType: AAChartType,
        position: Int
    ) {
        if ((chartType == AAChartType.Area || chartType == AAChartType.Line)
            && (position == 4 || position == 5)
        ) {
            configureStepAreaChartAndStepLineChart()
        } else if (chartType == AAChartType.Column || chartType == AAChartType.Bar) {
            configureColumnChartAndBarChartStyle()
        } else if (chartType == AAChartType.Area || chartType == AAChartType.Areaspline) {
            configureAreaChartAndAreasplineChartStyle(chartType)
        } else if (chartType == AAChartType.Line || chartType == AAChartType.Spline) {
            configureLineChartAndSplineChartStyle(chartType)
        }
    }

    private fun configureStepAreaChartAndStepLineChart() {
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

        aaChartModel?.series(arrayOf(element1, element2, element3))
    }

    private fun configureColumnChartAndBarChartStyle() {
        if (aaChartModel?.chartType == AAChartType.Bar) {
            val pureJSStr: String = AAJSStringPurer.pureJavaScriptFunctionString(
                "Source: <a href=\"https://highcharts.uservoice.com/forums/55896-highcharts-javascript-api\">UserVoice</a>"
            )
            val element: AASeriesElement = AASeriesElement()
                .data(arrayOf(
                        arrayOf("Gantt chart", 1000),
                        arrayOf("Autocalculation and plotting of trend lines", 575),
                        arrayOf("Allow navigator to have multiple data series", 523),
                        arrayOf("Implement dynamic font size", 427),
                        arrayOf("Multiple axis alignment control", 399),
                        arrayOf("Stacked area (spline etc) in irregular datetime series", 309),
                        arrayOf("Adapt chart height to legend height", 278),
                        arrayOf("Export charts in excel sheet", 239),
                        arrayOf("Toggle legend box", 235),
                        arrayOf("Venn Diagram", 203),
                        arrayOf("Add ability to change Rangeselector position", 182),
                        arrayOf("Draggable legend box", 157),
                        arrayOf("Sankey Diagram", 149),
                        arrayOf("Add Navigation bar for Y-Axis in Highstock", 144),
                        arrayOf("Grouped x-axis", 143),
                        arrayOf("ReactJS plugin", 137),
                        arrayOf("3D surface charts", 134),
                        arrayOf("Draw lines over a stock chart, for analysis purpose", 118),
                        arrayOf("Data module for database tables", 118),
                        arrayOf("Draggable points", 117)
                    ))

            val aaOptions: AAOptions = AAOptions()
                .chart(AAChart()
                        .type(AAChartType.Bar)
                        .scrollablePlotArea(
                            AAScrollablePlotArea()
                                .minHeight(900)
                        ))
                .title(AATitle()
                        .text("Most popular ideas by April 2016"))
                .subtitle(AASubtitle()
                        .text(pureJSStr))
                .xAxis(AAXAxis()
                        .type(AAChartAxisType.Category))
                .series(arrayOf(element))
            this.aaOptions = aaOptions
        } else {
            aaChartModel!!
                .categories(arrayOf(
                        "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
                    ))
                .legendEnabled(true)
                .colorsTheme(arrayOf("#fe117c", "#ffc069", "#06caf4", "#7dffc0"))
                .animationType(AAChartAnimationType.EaseOutCubic)
                .animationDuration(1200)
        }
    }

    private fun configureAreaChartAndAreasplineChartStyle(chartType: AAChartType) {
        aaChartModel!!
            .animationType(AAChartAnimationType.EaseOutQuart)
            .legendEnabled(true)
            .markerRadius(5f)
            .markerSymbol(AAChartSymbolType.Circle)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
        if (chartType == AAChartType.Areaspline) {
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

            aaChartModel!!
                .animationType(AAChartAnimationType.EaseFrom) //设置图表渲染动画类型为 EaseFrom
                .series(arrayOf(element1, element2, element3, element4))
        }
    }

    private fun configureLineChartAndSplineChartStyle(chartType: AAChartType) {
        aaChartModel!!
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank) //设置折线连接点样式为:边缘白色
            .markerRadius(6f)
        if (chartType == AAChartType.Line) {
            val element1 = AASeriesElement()
                .name("Hestavollane")
                .data(arrayOf(
                        0.2, 0.8, 0.8, 0.8, 1, 1.3, 1.5, 2.9, 1.9, 2.6, 1.6, 3, 4, 3.6,
                        5.5, 6.2, 5.5, 4.5, 4, 3.1, 2.7, 4, 2.7, 2.3, 2.3, 4.1, 7.7, 7.1,
                        5.6, 6.1, 5.8, 8.6, 7.2, 9, 10.9, 11.5, 11.6, 11.1, 12, 12.3, 10.7,
                        9.4, 9.8, 9.6, 9.8, 9.5, 8.5, 7.4, 7.6
                    ))

            val element2 = AASeriesElement()
                .name("Vik")
                .data(arrayOf(
                        0, 0, 0.6, 0.9, 0.8, 0.2, 0, 0, 0, 0.1, 0.6, 0.7, 0.8, 0.6, 0.2,
                        0, 0.1, 0.3, 0.3, 0, 0.1, 0, 0, 0, 0.2, 0.1, 0, 0.3, 0, 0.1, 0.2,
                        0.1, 0.3, 0.3, 0, 3.1, 3.1, 2.5, 1.5, 1.9, 2.1, 1, 2.3, 1.9, 1.2,
                        0.7, 1.3, 0.4, 0.3
                    ))

            aaChartModel!!
                .series(arrayOf(element1, element2))
        } else if (chartType == AAChartType.Spline) {
            val element1 = AASeriesElement()
                .name("Tokyo")
                .lineWidth(7f)
                .data(arrayOf(50, 320, 230, 370, 230, 400))

            val element2 = AASeriesElement()
                .name("Berlin")
                .lineWidth(7f)
                .data(arrayOf(80, 390, 210, 340, 240, 350))

            val element3 = AASeriesElement()
                .name("New York")
                .lineWidth(7f)
                .data(arrayOf(100, 370, 180, 280, 260, 300))

            val element4 = AASeriesElement()
                .name("London")
                .lineWidth(7f)
                .data(arrayOf(130, 350, 160, 310, 250, 268))

            aaChartModel!!
                .animationType(AAChartAnimationType.SwingFromTo)
                .series(arrayOf(element1, element2, element3, element4))
        }
    }

    private fun configureSeriesDataArray(): Array<AADataElement?> {
        val maxRange = 388
        val numberArr1 = arrayOfNulls<AADataElement>(maxRange)
        var y1: Double
        val max = 38
        val min = 1
        val random = (Math.random() * (max - min) + min).toInt()
        for (i in 0 until maxRange) {
            y1 = sin(random * (i * Math.PI / 180)) + i * 2 * 0.01
            val aaDataElement: AADataElement = AADataElement()
                .y(y1.toFloat())
            numberArr1[i] = aaDataElement
        }
        return numberArr1
    }
}