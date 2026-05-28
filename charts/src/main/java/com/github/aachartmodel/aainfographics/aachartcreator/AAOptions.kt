/**
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore            ◉◉◉
 * ◉◉◉   https://github.com/AAChartModel/AAChartCore-Kotlin     ◉◉◉
 * ◉◉◉...................................................       ◉◉◉
 * ◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉ ...... SOURCE CODE ......◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉
 */

/**

 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/AAChartCore-Kotlin/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */
package com.github.aachartmodel.aainfographics.aachartcreator

import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAAnimation
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AABar
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAColumn
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAColumnrange
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AACredits
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAItemStyle
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALang
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALegend
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPane
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPie
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotOptions
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASeries
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASubtitle
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis
import com.github.aachartmodel.aainfographics.aatools.AAColor

class AAOptions {
    var chart: AAChart? = null
    var title: AATitle? = null
    var subtitle: AASubtitle? = null
    var xAxis: AAXAxis? = null
    var yAxis: AAYAxis? = null
    var xAxisArray: Array<AAXAxis>? = null
    var yAxisArray: Array<AAYAxis>? = null
    var tooltip: AATooltip? = null
    var plotOptions: AAPlotOptions? = null
    var series: Array<Any>? = null
    var legend: AALegend? = null
    var pane: AAPane? = null
    var colors: Array<Any>? = null
    var credits: AACredits? = null
    var defaultOptions: AALang? = null
    var clickEventEnabled: Boolean? = null
    var touchEventEnabled: Boolean? = null

    fun chart(prop: AAChart): AAOptions {
        chart = prop
        return this
    }

    fun title(prop: AATitle): AAOptions {
        title = prop
        return this
    }

    fun subtitle(prop: AASubtitle): AAOptions {
        subtitle = prop
        return this
    }

    fun xAxis(prop: AAXAxis): AAOptions {
        xAxis = prop
        return this
    }

    fun yAxis(prop: AAYAxis): AAOptions {
        yAxis = prop
        return this
    }

    fun xAxisArray(prop: Array<AAXAxis>): AAOptions {
        xAxisArray = prop
        return this
    }

    fun yAxisArray(prop: Array<AAYAxis>): AAOptions {
        yAxisArray = prop
        return this
    }

    fun tooltip(prop: AATooltip): AAOptions {
        tooltip = prop
        return this
    }

    fun plotOptions(prop: AAPlotOptions): AAOptions {
        plotOptions = prop
        return this
    }

    fun series(prop: Array<Any>?): AAOptions {
        series = prop
        return this
    }

    fun legend(prop: AALegend): AAOptions {
        legend = prop
        return this
    }

    fun pane(prop: AAPane?): AAOptions {
        pane = prop
        return this
    }

    fun colors(prop: Array<Any>?): AAOptions {
        colors = prop
        return this
    }

    fun credits(prop: AACredits): AAOptions {
        credits = prop
        return this
    }

    fun defaultOptions(prop: AALang): AAOptions {
        defaultOptions = prop
        return this
    }

    fun clickEventEnabled(prop: Boolean?): AAOptions {
        clickEventEnabled = prop
        return this
    }

    fun touchEventEnabled(prop: Boolean?): AAOptions {
        touchEventEnabled = prop
        return this
    }


     init {
        val aaCredits = AACredits()
        aaCredits.enabled = false
        credits = aaCredits
    }
}


object AAOptionsConstructor {
    fun configureChartOptions(
        aaChartModel: AAChartModel
    ): AAOptions {
        val aaChart = AAChart()
            .type(aaChartModel.chartType) //绘图类型
            .inverted(aaChartModel.inverted) //设置是否反转坐标轴，使X轴垂直，Y轴水平。 如果值为 true，则 x 轴默认是 倒置 的。 如果图表中出现条形图系列，则会自动反转
            .backgroundColor(aaChartModel.backgroundColor) //设置图表的背景色(包含透明度的设置)
            .panning(true) //设置手势缩放后是否可平移
            .polar(aaChartModel.polar) //是否极化图表(开启极坐标模式)
            .margin(aaChartModel.margin)
            .scrollablePlotArea(aaChartModel.scrollablePlotArea)

        if (aaChartModel.zooming == null) {
            aaChart.pinchType(aaChartModel.zoomType) //设置手势缩放方向
        } else {
            aaChart.zooming(aaChartModel.zooming) //设置手势缩放方向
        }

        val aaTitle = AATitle()
            .text(aaChartModel.title) //标题文本内容
            .style(aaChartModel.titleStyle)

        val aaSubtitle = AASubtitle()
            .text(aaChartModel.subtitle) //副标题内容
            .align(aaChartModel.subtitleAlign) //图表副标题文本水平对齐方式。可选的值有 “left”，”center“和“right”。 默认是：center.
            .style(aaChartModel.subtitleStyle)

        val aaTooltip = AATooltip()
            .enabled(aaChartModel.tooltipEnabled) //启用浮动提示框
            .shared(true) //多组数据共享一个浮动提示框
            .valueSuffix(aaChartModel.tooltipValueSuffix) //浮动提示框的单位名称后缀

        val aaPlotOptions = AAPlotOptions()
            .series(AASeries()
                .stacking(aaChartModel.stacking) //设置是否百分比堆叠显示图形
            )

        if (aaChartModel.animationType != AAChartAnimationType.Linear) {
            aaPlotOptions.series?.animation(
                AAAnimation()
                    .easing(aaChartModel.animationType)
                    .duration(aaChartModel.animationDuration)
            )
        }

        configureAAPlotOptionsMarkerStyle(aaChartModel, aaPlotOptions)
        configureAAPlotOptionsDataLabels(aaPlotOptions, aaChartModel)

        val aaLegend = AALegend()
            .enabled(aaChartModel.legendEnabled) //是否显示 legend
            .itemStyle(AAItemStyle()
                .color(aaChartModel.axesTextColor))

        val aaOptions = AAOptions()
            .chart(aaChart)
            .title(aaTitle)
            .subtitle(aaSubtitle)
            .tooltip(aaTooltip)
            .plotOptions(aaPlotOptions)
            .legend(aaLegend)
            .series(aaChartModel.series)
            .colors(aaChartModel.colorsTheme) //设置颜色主题
            .clickEventEnabled(aaChartModel.clickEventEnabled) //是否支持点击事件
            .touchEventEnabled(aaChartModel.touchEventEnabled) //是否支持触摸(手指掠过)事件

        configureAxisContentAndStyle(aaOptions, aaChartModel)

        return aaOptions
    }

    private fun configureAAPlotOptionsMarkerStyle(
        aaChartModel: AAChartModel,
        aaPlotOptions: AAPlotOptions
    ) {
        //数据点标记相关配置，只有线性图(折线图、曲线图、折线区域填充图、曲线区域填充图,散点图)才有数据点标记
        when (aaChartModel.chartType) {
            AAChartType.Area,
            AAChartType.Areaspline,
            AAChartType.Line,
            AAChartType.Spline,
            AAChartType.Scatter,
            AAChartType.Arearange,
            AAChartType.Areasplinerange,
            AAChartType.Polygon -> {
                val aaMarker = AAMarker()
                    .radius(aaChartModel.markerRadius) //曲线连接点半径，默认是4
                    .symbol(aaChartModel.markerSymbol?.value) //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                if (aaChartModel.markerSymbolStyle == AAChartSymbolStyleType.InnerBlank) {
                    aaMarker.fillColor(AAColor.White) //点的填充色(用来设置折线连接点的填充色)
                        .lineWidth(2f) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                        .lineColor("") //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                } else if (aaChartModel.markerSymbolStyle == AAChartSymbolStyleType.BorderBlank) {
                    aaMarker.lineWidth(2f)
                        .lineColor(aaChartModel.backgroundColor)
                }
                val aaSeries = aaPlotOptions.series
                aaSeries?.marker(aaMarker)
            }
            else -> {

            }
        }
    }


    private fun configureAAPlotOptionsDataLabels(
        aaPlotOptions: AAPlotOptions,
        aaChartModel: AAChartModel
    ) {
        val aaDataLabels = AADataLabels()
        if (aaChartModel.dataLabelsEnabled == true) {
            aaDataLabels
                .enabled(true)
                .style(aaChartModel.dataLabelsStyle)
        }

        when (aaChartModel.chartType) {
            AAChartType.Column -> {
                val aaColumn = AAColumn()
                    .borderWidth(0f)
                    .borderRadius(aaChartModel.borderRadius)
                if (aaChartModel.polar == true) {
                    aaColumn.pointPadding(0f)
                        .groupPadding(0.005f)
                }
                aaPlotOptions.column(aaColumn)
            }
            AAChartType.Bar -> {
                val aaBar = AABar()
                    .borderWidth(0f)
                    .borderRadius(aaChartModel.borderRadius)
                if (aaChartModel.polar == true) {
                    aaBar.pointPadding(0f)
                        .groupPadding(0.005f)
                }
                aaPlotOptions.bar(aaBar)
            }
            AAChartType.Pie -> {
                val aaPie = AAPie()
                    .allowPointSelect(true)
                    .cursor("pointer")
                    .showInLegend(true)
                if (aaChartModel.dataLabelsEnabled == true) {
                    aaDataLabels.format("<b>{point.name}</b>: {point.percentage:.1f} %")
                }
                aaPlotOptions.pie(aaPie)
            }
            AAChartType.Columnrange -> {
                val aaColumnrange = AAColumnrange()
                    .borderRadius(0f) //The color of the border surrounding each column or bar
                    .borderWidth(0f) //The corner radius of the border surrounding each column or bar. default：0
                aaPlotOptions.columnrange(aaColumnrange)
            }
            else -> {

            }

        }
        aaPlotOptions.series?.dataLabels(aaDataLabels)
    }


    private fun configureAxisContentAndStyle(
        aaOptions: AAOptions,
        aaChartModel: AAChartModel
    ) {
        //x 轴和 Y 轴的相关配置,扇形图、金字塔图和漏斗图则不需要设置 X 轴和 Y 轴的相关内容
        when (val aaChartType = aaChartModel.chartType) {
            AAChartType.Column,
            AAChartType.Bar,
            AAChartType.Area,
            AAChartType.Areaspline,
            AAChartType.Line,
            AAChartType.Spline, 
            AAChartType.Scatter,
            AAChartType.Bubble,
            AAChartType.Columnrange,
            AAChartType.Arearange,
            AAChartType.Areasplinerange,
            AAChartType.Boxplot,
            AAChartType.Waterfall,
            AAChartType.Polygon,
            AAChartType.Gauge -> {
                if (aaChartType != AAChartType.Gauge) {
                    val aaXAxisLabelsEnabled = aaChartModel.xAxisLabelsEnabled
                    val aaXAxisLabels = AALabels()
                        .enabled(aaXAxisLabelsEnabled) //设置 x 轴是否显示文字
                    if (aaXAxisLabelsEnabled!!) {
                        aaXAxisLabels.style(AAStyle()
                            .color(aaChartModel.axesTextColor)
                        )
                    }

                    val aaXAxis = AAXAxis()
                        .labels(aaXAxisLabels) //设置 x 轴是否显示文字
                        .reversed(aaChartModel.xAxisReversed)
                        .gridLineWidth(aaChartModel.xAxisGridLineWidth) //x轴网格线宽度
                        .categories(aaChartModel.categories)
                        .visible(aaChartModel.xAxisVisible) //x轴是否可见
                        .tickInterval(aaChartModel.xAxisTickInterval) //x轴坐标点间隔数

                    aaOptions.xAxis(aaXAxis)
                }

                val aaYAxisLabelsEnabled = aaChartModel.yAxisLabelsEnabled
                val aaYAxisLabels = AALabels()
                    .enabled(aaChartModel.yAxisLabelsEnabled)
                if (aaYAxisLabelsEnabled!!) {
                    aaYAxisLabels.style(AAStyle()
                        .color(aaChartModel.axesTextColor))
                }

                val aaYAxis = AAYAxis()
                    .labels(aaYAxisLabels) //设置 y 轴是否显示数字
                    .min(aaChartModel.yAxisMin) //设置 y 轴最小值,最小值等于零就不能显示负值了
                    .max(aaChartModel.yAxisMax) //y轴最大值
                    .allowDecimals(aaChartModel.yAxisAllowDecimals) //是否允许显示小数
                    .reversed(aaChartModel.yAxisReversed)
                    .gridLineWidth(aaChartModel.yAxisGridLineWidth) //y轴网格线宽度
                    .title(AATitle()
                        .text(aaChartModel.yAxisTitle)
                        .style(AAStyle()
                            .color(aaChartModel.axesTextColor)))
                    .lineWidth(aaChartModel.yAxisLineWidth) //设置 y轴轴线的宽度,为0即是隐藏 y轴轴线
                    .visible(aaChartModel.yAxisVisible)

                aaOptions.yAxis(aaYAxis)
            }

            else -> {
                
            }
        }
    }
}
