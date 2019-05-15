package com.example.chartcorekotlin.AAChartConfiger

import java.util.HashMap

//
//  AAChartModel.java
//  ChartCore-Slim
//
//  Created by AnAn on 2018/12/08.
//  Copyright © 2018年 An An. All rights reserved.
//*************** ...... SOURCE CODE ...... ***************
//***...................................................***
//*** https://github.com/AAChartModel/ChartCore         ***
//*** https://github.com/AAChartModel/ChartCore-Slim    ***
//***...................................................***
//*************** ...... SOURCE CODE ...... ***************


/*

 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/ChartCore-Slim/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : https://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */


object AAOptionsConstructor {
    fun configureChartOptions(aaChartModel: AAChartModel): HashMap<String, Any?> {
        val aaChart = HashMap<String, Any?>()
        aaChart["type"] = aaChartModel.chartType//图表类型
        aaChart["inverted"] = aaChartModel.inverted//设置是否反转坐标轴，使X轴垂直，Y轴水平。 如果值为 true，则 x 轴默认是 倒置 的。 如果图表中出现条形图系列，则会自动反转
        aaChart["backgroundColor"] = aaChartModel.backgroundColor//图表背景色
        aaChart["animation"] = true//是否开启图表渲染动画
        aaChart["pinchType"] = aaChartModel.zoomType//设置手势缩放方向
        aaChart["panning"] = true//设置手势缩放后是否可平移
        aaChart["polar"] = aaChartModel.polar//是否极化图表(开启极坐标模式)
        aaChart["marginLeft"] = aaChartModel.marginLeft/* 图表左边距 */
        aaChart["marginRight"] = aaChartModel.marginRight//图表右边距

        val aaTitle = HashMap<String, Any?>()
        aaTitle["text"] = aaChartModel.title//标题文本内容
        val aaTitleStyle = HashMap<String, Any?>()
        aaTitleStyle["color"] = aaChartModel.titleColor//标题文字颜色
        aaTitleStyle["fontSize"] = "12px"//标题文字大小
        aaTitle["style"] = aaTitleStyle

        val aaSubtitle = HashMap<String, Any?>()
        aaSubtitle["text"] = aaChartModel.subtitle//富标题文本内容
        val aaSubtitleStyle = HashMap<String, Any?>()
        aaSubtitleStyle["color"] = aaChartModel.subTitleColor//副标题文字颜色
        aaSubtitleStyle["fontSize"] = "9px"//副标题文字大小
        aaSubtitle["style"] = aaSubtitleStyle

        val aaTooltip = HashMap<String, Any?>()
        aaTooltip["enabled"] = aaChartModel.tooltipEnabled//是否开启浮动提示框 tooltip
        aaTooltip["valueSuffix"] = aaChartModel.tooltipValueSuffix// 浮动提示框数字的单位后缀
        aaTooltip["shared"] = true//多组 series 数据时,是否共享浮动提示框,默认共享
        aaTooltip["crosshairs"] = aaChartModel.tooltipCrosshairs

        val aaSeries = HashMap<String, Any?>()
        aaSeries["stacking"] = aaChartModel.stacking//图表堆叠样式类型
        val aaAnimation = HashMap<String, Any?>()
        aaAnimation["duration"] = aaChartModel.animationDuration//图表渲染的动画时间
        aaAnimation["easing"] = aaChartModel.animationType//图表渲染的动画类型
        aaSeries["animation"] = aaAnimation

        var aaPlotOptions = HashMap<String, Any?>()
        aaPlotOptions["series"] = aaSeries

        //数据点标记的相关配置
        aaPlotOptions = configureAAPlotOptionsMarkerStyle(aaChartModel, aaSeries, aaPlotOptions)
        //配置 aaPlotOptions 的 dataLabels 等相关内容
        aaPlotOptions = configureAAPlotOptionsDataLabels(aaPlotOptions, aaChartModel)

        val aaLegend = HashMap<String, Any?>()
        aaLegend["enabled"] = aaChartModel.legendEnabled//是否显示图表的图例,默认显示
        aaLegend["layout"] = aaChartModel.legendLayout //图例数据项的布局。布局类型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默认是：horizontal.
        aaLegend["align"] = aaChartModel.legendAlign//设定图例在图表区中的水平对齐方式，合法值有left，center 和 right。
        aaLegend["verticalAlign"] = aaChartModel.legendVerticalAlign//设定图例在图表区中的垂直对齐方式，合法值有 top，middle 和 bottom。垂直位置可以通过 y 选项做进一步设定。
        aaLegend["borderWidth"] = 0
        val aaLegendItemSyle = HashMap<String, Any?>()
        aaLegend["color"] = aaChartModel.axisColor//图例的文字颜色,默认图例的文字颜色和X轴文字颜色一样
        aaLegend["itemStyle"] = aaLegendItemSyle


        val aaOptions = HashMap<String, Any?>()
        aaOptions["chart"] = aaChart
        aaOptions["title"] = aaTitle
        aaOptions["subtitle"] = aaSubtitle
        aaOptions["tooltip"] = aaTooltip
        aaOptions["legend"] = aaLegend
        aaOptions["plotOptions"] = aaPlotOptions
        aaOptions["colors"] = aaChartModel.colorsTheme//图表的主体颜色数组
        aaOptions["series"] = aaChartModel.series//图表的数据列数组
        aaOptions["axisColor"] = aaChartModel.axisColor//图表的 x 轴颜色

        configureAxisContentAndStyle(aaOptions, aaChartModel)

        return aaOptions
    }

    private fun configureAAPlotOptionsMarkerStyle(aaChartModel: AAChartModel,
                                                  aaSeries: HashMap<String, Any?>,
                                                  aaPlotOptions: HashMap<String, Any?>
    ): HashMap<String, Any?> {
        val chartType = aaChartModel.chartType
        //数据点标记相关配置，只有线性图(折线图、曲线图、折线区域填充图、曲线区域填充图,散点图)才有数据点标记
        if (chartType === AAChartType.Area.toString()
            || chartType === AAChartType.AreaSpline.toString()
            || chartType === AAChartType.Line.toString()
            || chartType === AAChartType.Spline.toString()
            || chartType === AAChartType.Scatter.toString()) {
            val aaMarker = HashMap<String, Any?>()
            aaMarker["radius"] = aaChartModel.markerRadius//曲线连接点半径，默认是4
            aaMarker["symbol"] = aaChartModel.symbol//曲线连接点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
            //设置曲线连接点风格样式
            if (aaChartModel.symbolStyle === AAChartSymbolStyleType.InnerBlank.toString()) {
                aaMarker["fillColor"] = "#FFFFFF"//点的填充色(用来设置折线连接点的填充色)
                aaMarker["lineWidth"] = 2//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                aaMarker["lineColor"] = ""//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色。)
            } else if (aaChartModel.symbolStyle === AAChartSymbolStyleType.BorderBlank.toString()) {
                aaMarker["lineWidth"] = 2//外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                aaMarker["lineColor"] = aaChartModel.backgroundColor//外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色。)
            }
            aaSeries["marker"] = aaMarker
            aaPlotOptions["series"] = aaSeries
        }
        return aaPlotOptions
    }


    private fun configureAAPlotOptionsDataLabels(aaPlotOptions: HashMap<String, Any?>,
                                                 aaChartModel: AAChartModel): HashMap<String, Any?> {

        val chartType = aaChartModel.chartType!!
        val aaDataLabels = HashMap<String, Any?>()
        aaDataLabels["enabled"] = aaChartModel.xAxisLabelsEnabled
        val aaSomeTypeChart = HashMap<String, Any?>()

        if (chartType === AAChartType.Column.toString() || chartType === AAChartType.Bar.toString()) {
            aaSomeTypeChart["borderWidth"] = 0
            aaSomeTypeChart["borderRadius"] = aaChartModel.borderRadius
            aaSomeTypeChart["dataLabels"] = aaDataLabels
            if (aaChartModel.polar == true) {
                aaSomeTypeChart["pointPadding"] = 0
                aaSomeTypeChart["groupPadding"] = 0.005
            }
        } else if (chartType === AAChartType.Pie.toString()) {
            aaSomeTypeChart["allowPointSelect"] = true
            aaSomeTypeChart["cursor"] = "pointer"
            aaSomeTypeChart["showInLegend"] = aaChartModel.legendEnabled
            aaDataLabels["format"] = "{point.name}"
            aaSomeTypeChart["dataLabels"] = aaDataLabels
        } else {
            aaSomeTypeChart["dataLabels"] = aaDataLabels
        }
        aaPlotOptions[chartType] = aaSomeTypeChart

        return aaPlotOptions
    }

    private fun configureAxisContentAndStyle(aaOptions: HashMap<String, Any?>,
                                             aaChartModel: AAChartModel) {

        if (aaChartModel.chartType !== AAChartType.Pie.toString()
            && aaChartModel.chartType !== AAChartType.Pyramid.toString()
            && aaChartModel.chartType !== AAChartType.Funnel.toString()) {
            val aaAxisLabel = HashMap<String, Any?>()
            aaAxisLabel["enabled"] = aaChartModel.xAxisLabelsEnabled

            val aaXAxis = HashMap<String, Any?>()
            aaXAxis["label"] = aaAxisLabel
            aaXAxis["reversed"] = aaChartModel.xAxisReversed
            aaXAxis["gridLineWidth"] = aaChartModel.xAxisGridLineWidth
            aaXAxis["categories"] = aaChartModel.categories
            aaXAxis["visible"] = aaChartModel.xAxisVisible

            val aaYAxis = HashMap<String, Any?>()
            aaYAxis["label"] = aaAxisLabel
            aaYAxis["reversed"] = aaChartModel.yAxisReversed
            aaYAxis["gridLineWidth"] = aaChartModel.yAxisGridLineWidth
            aaYAxis["title"] = aaChartModel.yAxisTitle
            aaYAxis["lineWidth"] = aaChartModel.yAxisLineWidth
            aaYAxis["visible"] = aaChartModel.yAxisVisible

            aaOptions["xAxis"] = aaXAxis
            aaOptions["yAxis"] = aaYAxis
        }
    }


}
