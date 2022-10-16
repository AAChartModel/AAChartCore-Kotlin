package com.github.aachartmodel.aainfographics.demo.chartcomposer

import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.AAColor
import com.github.aachartmodel.aainfographics.aatools.AAGradientColor
import com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection

object JSFunctionForAAOptionsComposer {
    fun customDoubleXAxesChart(): AAOptions {
        val gradientColorDic1 = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToTop,
            "#7052f4",
            "#00b0ff"//颜色字符串设置支持十六进制类型和 rgba 类型
        )

        val gradientColorDic2 = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToTop,
            "#EF71FF",
            "#4740C8"//颜色字符串设置支持十六进制类型和 rgba 类型
        )

        val aaChart = AAChart()
            .type(AAChartType.Bar)

        val aaTitle = AATitle()
            .text("2015 年德国人口金字塔")
            .style(AAStyle()
                .color("#000000")
                .fontSize(12.0))

        val aaCategories = arrayOf("0-4", "5-9", "10-14", "15-19", "20-24", "25-29",
            "30-34", "35-39", "40-44", "45-49", "50-54", "55-59", "60-64", "65-69", "70-74",
            "75-79", "80-84", "85-89", "90-94", "95-99", "100 + ")

        val aaXAxis1 = AAXAxis()
            .reversed(true)
            .categories(aaCategories)
            .labels(AALabels()
                .step(1))

        val aaXAxis2 = AAXAxis()
            .reversed(true)
            .opposite(true)
            .categories(aaCategories)
            .linkedTo(0)
            .labels(AALabels()
                .step(1))

        val aaYAxis = AAYAxis()
            .gridLineWidth(0)// Y 轴网格线宽度
            .title(AATitle()
                .text(""))//Y 轴标题
            .labels(AALabels()
                .formatter("""
function () {
    return (Math.abs(this.value) / 1000000) + 'M';
}
                    """.trimIndent()
                ))
            .min(-4000000)
            .max(4000000)

        val aaPlotOptions = AAPlotOptions()
            .series(AASeries()
                .animation(AAAnimation()
                    .duration(800)
                    .easing(AAChartAnimationType.Bounce))
                .stacking(AAChartStackingType.Normal))

        val aaTooltip = AATooltip()
            .enabled(true)
            .shared(false)
            .formatter("""
function () {
    return '<b>' + this.series.name + ', age ' + this.point.category + '</b><br/>' +
        '人口: ' + Highcharts.numberFormat(Math.abs(this.point.y), 0);
}
                """.trimIndent()
            )

        val aaSeriesElement1 = AASeriesElement()
            .name("Men")
            .color(gradientColorDic1)
            .data(arrayOf(-1746181, -1884428, -2089758, -2222362, -2537431, -2507081, -2443179,
                -2664537, -3556505, -3680231, -3143062, -2721122, -2229181, -2227768, -2176300,
                -1329968, -836804, -354784, -90569, -28367, -3878))

        val aaSeriesElement2 = AASeriesElement()
            .name("Women")
            .color(gradientColorDic2)
            .data(arrayOf(1656154, 1787564, 1981671, 2108575, 2403438, 2366003, 2301402, 2519874,
                3360596, 3493473, 3050775, 2759560, 2304444, 2426504, 2568938, 1785638, 1447162,
                1005011, 330870, 130632, 21208))

        return AAOptions()
            .chart(aaChart)
            .title(aaTitle)
            .xAxisArray(arrayOf(aaXAxis1, aaXAxis2))
            .yAxis(aaYAxis)
            .plotOptions(aaPlotOptions)
            .tooltip(aaTooltip)
            .series(arrayOf(aaSeriesElement1, aaSeriesElement2))
    }

    //https://github.com/AAChartModel/AAChartKit/issues/967
    fun disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Bar)
            .title("Custom Bar Chart select color")
            .yAxisReversed(true)
            .xAxisReversed(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("ElementOne")
                    .data(arrayOf(211, 183, 157, 133, 111, 91, 73, 57, 43, 31, 21, 13, 7, 3))
                    .allowPointSelect(true)
                    .states(AAStates()
                        .hover(AAHover()
                            .color(AAColor.Yellow))
                        .select(AASelect()
                            .color(AAColor.Red)))))
        val aaOptions = aaChartModel.aa_toAAOptions()
        val aaPoint: AAPoint = AAPoint()
            .events(AAPointEvents()
                .click("""
     function () {
         if (this.selected == true) {
             this.selected = false;
         }
         return;
     }
     """))
        aaOptions.plotOptions?.series
            ?.point(aaPoint)
        return aaOptions
    }

    // Refer to the issue https://github.com/AAChartModel/AAChartKit/issues/589
    fun customizeEveryDataLabelSinglelyByDataLabelsFormatter(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline) //图表类型
            .dataLabelsEnabled(true)
            .tooltipEnabled(false)
            .colorsTheme(arrayOf(AAGradientColor.FizzyPeach))
            .markerRadius(0)
            .legendEnabled(false)
            .categories(arrayOf(
                "美国🇺🇸",
                "欧洲🇪🇺",
                "中国🇨🇳",
                "日本🇯🇵",
                "韩国🇰🇷",
                "越南🇻🇳",
                "中国香港🇭🇰"))
            .series(arrayOf(
                AASeriesElement()
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2))))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.yAxis?.gridLineDashStyle = AAChartLineDashStyleType.LongDash.value //设置Y轴的网格线样式为 AAChartLineDashStyleType.LongDash
        val unitArr = arrayOf("美元", "欧元", "人民币", "日元", "韩元", "越南盾", "港币")
        val unitJSArrStr: String = javaScriptArrayStringWithJavaArray(unitArr)
        val dataLabelsFormatter = String.format(
            "function () {\n" +
                    "        return this.y + %s[this.point.index];  \n" +  //单组 series 图表, 获取选中的点的索引是 this.point.index ,多组并且共享提示框,则是this.points[0].index
                    "    }", unitJSArrStr
        )
        val aaDatalabels = aaOptions.plotOptions?.series?.dataLabels
        aaDatalabels?.apply {
            style(AAStyle.style(AAColor.Red, 10, AAChartFontWeightType.Bold, "1px 1px contrast"))
                .formatter(dataLabelsFormatter)
                .backgroundColor(AAColor.White) // white color
                .borderColor(AAColor.Red) // red color
                .borderRadius(1.5)
                .borderWidth(1.3)
                .x(3).y(-20)
                .verticalAlign(AAChartVerticalAlignType.Middle)
        }
        return aaOptions
    }

    //https://github.com/AAChartModel/AAChartKit-Swift/issues/404
    fun configureColorfulDataLabelsForPieChart(): AAOptions {
        return AAOptions()
            .title(AATitle()
                .text("Colorful DataLabels For Pie Chart"))
            .colors(arrayOf(
                "#0c9674", "#7dffc0", "#ff3333", "#facd32", "#ffffa0",
                "#EA007B", "#fe117c", "#ffc069", "#06caf4", "#7dffc0"))
            .series(arrayOf(
                AASeriesElement()
                    .type(AAChartType.Pie)
                    .name("语言热度值")
                    .innerSize("20%") //内部圆环半径大小占比
                    .borderWidth(0) //描边的宽度
                    .allowPointSelect(true) //是否允许在点击数据点标记(扇形图点击选中的块发生位移)
                    .states(AAStates()
                        .hover(AAHover()
                            .enabled(false))) //禁用点击区块之后出现的半透明遮罩层
                    .dataLabels(AADataLabels()
                        .allowOverlap(true) //允许字符重叠
                        .useHTML(true)
                        .formatter("""
                            function () {
                                const point = this.point;
                                return '<span style=\"color: ' + point.color + '\">' +
                                    point.name + ': ' + point.y + '%</span>';
                            }
                            """))
                    .data(arrayOf(
                        arrayOf("Firefox", 3336.2),
                        arrayOf("IE", 26.8),
                        arrayOf("Chrome", 666.8),
                        arrayOf("Safari", 88.5),
                        arrayOf("Opera", 46.0),
                        arrayOf("Others", 223.0),
                        arrayOf("Firefox", 3336.2),
                        arrayOf("IE", 26.8),
                        arrayOf("Chrome", 666.8),
                        arrayOf("Safari", 88.5),
                        arrayOf("Opera", 46.0),
                        arrayOf("Others", 223.0)
                    ))))
    }


    fun javaScriptArrayStringWithJavaArray(javaArray: Array<String>): String {
        val originalJsArrStr = StringBuilder()
        for (element: Any in javaArray) {
            originalJsArrStr.append("'").append(element.toString()).append("',")
        }
        return "[$originalJsArrStr]"
    }


}