/**
//  AAChartModel.java
//  ChartCore-Slim
//
//  Created by AnAn on 2018/12/08.
//  Copyright © 2018年 An An. All rights reserved.
*/
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
package com.example.chartcorekotlin.AAChartConfiger

import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.*


object AAOptionsConstructor {
    fun configureChartOptions(
        aaChartModel:AAChartModel
    ):AAOptions {
        val aaChart = AAChart()
            .type(aaChartModel.chartType)//绘图类型
            .inverted(aaChartModel.inverted)//设置是否反转坐标轴，使X轴垂直，Y轴水平。 如果值为 true，则 x 轴默认是 倒置 的。 如果图表中出现条形图系列，则会自动反转
            .backgroundColor(aaChartModel.backgroundColor)//设置图表的背景色(包含透明度的设置)
            .pinchType(aaChartModel.zoomType)//设置手势缩放方向
            .panning(true)//设置手势缩放后是否可平移
            .polar(aaChartModel.polar)//是否极化图表(开启极坐标模式)
            .marginLeft(aaChartModel.marginLeft)//图表左边距
            .marginRight(aaChartModel.marginRight)//图表右边距

        val aaTitle = AATitle()
            .text(aaChartModel.title)//标题文本内容
            .style(AAStyle()
                .color(aaChartModel.titleFontColor)//Title font color
                .fontSize(aaChartModel.titleFontSize)//Title font size
                .fontWeight(aaChartModel.titleFontWeight)//Title font weight
            )

        val aaSubtitle = AASubtitle()
            .text(aaChartModel.subtitle)//副标题内容
            .align(aaChartModel.subtitleAlign)//图表副标题文本水平对齐方式。可选的值有 “left”，”center“和“right”。 默认是：center.
            .style(AAStyle()
                .color(aaChartModel.subtitleFontColor)//Subtitle font color
                .fontSize(aaChartModel.subtitleFontSize)//Subtitle font size
                .fontWeight(aaChartModel.subtitleFontWeight)//Subtitle font weight
            )

        val aaTooltip = AATooltip()
            .enabled(aaChartModel.tooltipEnabled)//启用浮动提示框
            .shared(true)//多组数据共享一个浮动提示框
            .crosshairs(true)//启用准星线
            .valueSuffix(aaChartModel.tooltipValueSuffix)//浮动提示框的单位名称后缀

        val aaPlotOptions = AAPlotOptions()
            .series(AASeries()
                .stacking(aaChartModel.stacking)//设置是否百分比堆叠显示图形
            )

        if (aaChartModel.animationType !== AAChartAnimationType.Linear.value) {
            aaPlotOptions
                .series?.animation(AAAnimation()
                .easing(aaChartModel.animationType)
                .duration(aaChartModel.animationDuration)
            )
        }

        configureAAPlotOptionsMarkerStyle(aaChartModel, aaPlotOptions)
        configureAAPlotOptionsDataLabels(aaPlotOptions, aaChartModel)

        val aaLegend = AALegend()
            .enabled(aaChartModel.legendEnabled)//是否显示 legend

        val aaOptions = AAOptions()
            .chart(aaChart)
            .title(aaTitle)
            .subtitle(aaSubtitle)
            .tooltip(aaTooltip)
            .plotOptions(aaPlotOptions)
            .legend(aaLegend)
            .series(aaChartModel.series)
            .colors(aaChartModel.colorsTheme)//设置颜色主题
            .touchEventEnabled(aaChartModel.touchEventEnabled)//是否支持点击事件

        configureAxisContentAndStyle(aaOptions, aaChartModel)

        return aaOptions
    }

    private fun configureAAPlotOptionsMarkerStyle(aaChartModel: AAChartModel,
                                                  aaPlotOptions: AAPlotOptions
    ): AAPlotOptions {
        val chartType = aaChartModel.chartType
        //数据点标记相关配置，只有线性图(折线图、曲线图、折线区域填充图、曲线区域填充图,散点图)才有数据点标记
        if (chartType === AAChartType.Area.value
            || chartType === AAChartType.Areaspline.value
            || chartType === AAChartType.Line.value
            || chartType === AAChartType.Spline.value
            || chartType === AAChartType.Scatter.value) {
            val aaMarker = AAMarker()
                .radius(aaChartModel.markerRadius)//曲线连接点半径，默认是4
                .symbol(aaChartModel.markerSymbol)//曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
            if (aaChartModel.markerSymbolStyle === AAChartSymbolStyleType.InnerBlank.value) {
                aaMarker.fillColor("#ffffff")//点的填充色(用来设置折线连接点的填充色)
                    .lineWidth(2f)//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                    .lineColor("")//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
            } else if (aaChartModel.markerSymbolStyle == AAChartSymbolStyleType.BorderBlank.value) {
                aaMarker.lineWidth(2f)
                    .lineColor(aaChartModel.backgroundColor)
            }
            val aaSeries = aaPlotOptions.series
            aaSeries?.marker(aaMarker)
        }
        return aaPlotOptions
    }


    private fun configureAAPlotOptionsDataLabels(
        aaPlotOptions: AAPlotOptions,
        aaChartModel: AAChartModel
    ): AAPlotOptions {

        val chartType = aaChartModel.chartType

        var aaDataLabels = AADataLabels()
        if (aaChartModel.dataLabelsEnabled == true) {
            aaDataLabels = aaDataLabels
                .enabled(true)
                .style(AAStyle()
                        .color(aaChartModel.dataLabelsFontColor)
                        .fontSize(aaChartModel.dataLabelsFontSize)
                        .fontWeight(aaChartModel.dataLabelsFontWeight)
                )
        }

        if (chartType == AAChartType.Column.value) {
            val aaColumn = AAColumn()
                .borderWidth(0f)
                .borderRadius(aaChartModel.borderRadius)
                .dataLabels(aaDataLabels)
            if (aaChartModel.polar == true) {
                aaColumn.pointPadding(0f)
                    .groupPadding(0.005f)
            }
            aaPlotOptions.column(aaColumn)
        } else if (chartType == AAChartType.Bar.value) {
            val aaBar = AABar()
                .borderWidth(0f)
                .borderRadius(aaChartModel.borderRadius)
                .dataLabels(aaDataLabels)
            if (aaChartModel.polar == true) {
                aaBar.pointPadding(0f)
                    .groupPadding(0.005f)
            }
            aaPlotOptions.bar(aaBar)
        } else if (chartType == AAChartType.Area.value) {
            aaPlotOptions.area(AAArea().dataLabels(aaDataLabels))
        } else if (chartType == AAChartType.Areaspline.value) {
            aaPlotOptions.areaspline(AAAreaspline().dataLabels(aaDataLabels))
        } else if (chartType == AAChartType.Line.value) {
            aaPlotOptions.line(AALine().dataLabels(aaDataLabels))
        } else if (chartType == AAChartType.Spline.value) {
            aaPlotOptions.spline(AASpline().dataLabels(aaDataLabels))
        } else if (chartType == AAChartType.Pie.value) {
            val aaPie = AAPie()
                .allowPointSelect(true)
                .cursor("pointer")
                .showInLegend(true)
            if (aaChartModel.dataLabelsEnabled == true) {
                aaPie.dataLabels(aaDataLabels.format("<b>{point.name}</b>: {point.percentage:.1f} %"))
            } else {
                aaPie.dataLabels(AADataLabels().enabled(false))
            }
            aaPlotOptions.pie(aaPie)
        } else if (chartType == AAChartType.Columnrange.value) {
            val columnRangeMap = mapOf(
                "borderRadius" to 0,//The color of the border surrounding each column or bar
                "borderWidth" to 0,//The corner radius of the border surrounding each column or bar. default：0
                "dataLabels" to aaDataLabels
                )
            aaPlotOptions.columnrange(columnRangeMap)
        } else if (chartType == AAChartType.Arearange.value) {
            val areaRangeMap = mapOf(
                "dataLabels" to aaDataLabels
            )
            aaPlotOptions.arearange(areaRangeMap)
        }
        return aaPlotOptions
    }


    private fun configureAxisContentAndStyle(aaOptions: AAOptions,
                                             aaChartModel: AAChartModel) {
        if (aaChartModel.chartType !== AAChartType.Pie.value
            && aaChartModel.chartType !== AAChartType.Pyramid.value
            && aaChartModel.chartType !== AAChartType.Funnel.value) {
            val aaXAxis = AAXAxis()
                .labels(AALabels()
                    .enabled(aaChartModel.xAxisLabelsEnabled)//设置 x 轴是否显示文字
                )
                .reversed(aaChartModel.xAxisReversed)
                .gridLineWidth(aaChartModel.xAxisGridLineWidth)//x轴网格线宽度
                .categories(aaChartModel.categories)
                .visible(aaChartModel.xAxisVisible)//x轴是否可见
                .tickInterval(aaChartModel.xAxisTickInterval) //x轴坐标点间隔数


            val aaYAxis = AAYAxis()
                .labels(AALabels()
                    .enabled(aaChartModel.yAxisLabelsEnabled)
                )//设置 y 轴是否显示数字
                .min(aaChartModel.yAxisMin)//设置 y 轴最小值,最小值等于零就不能显示负值了
                .max(aaChartModel.yAxisMax)//y轴最大值
                .allowDecimals(aaChartModel.yAxisAllowDecimals)//是否允许显示小数
                .reversed(aaChartModel.yAxisReversed)
                .gridLineWidth(aaChartModel.yAxisGridLineWidth)//y轴网格线宽度
                .title( AATitle()
                    .text(aaChartModel.yAxisTitle)
                )//y 轴标题
                .lineWidth(aaChartModel.yAxisLineWidth)//设置 y轴轴线的宽度,为0即是隐藏 y轴轴线
                .visible(aaChartModel.yAxisVisible)


            aaOptions.xAxis(aaXAxis)
                .yAxis(aaYAxis)
        }
    }


}
