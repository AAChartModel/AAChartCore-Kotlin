package com.github.aachartmodel.aainfographics.demo.chartcomposer

import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.AAColor
import com.github.aachartmodel.aainfographics.aatools.AAGradientColor
import com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection
import com.github.aachartmodel.aainfographics.aatools.AARgba

object JSFunctionForAAAxisComposer {
    fun customYAxisLabels(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Line)//图形类型
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .markerRadius(8)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4))))

        val aaYAxisLabels = AALabels()
            .formatter("""
function () {
        var yValue = this.value;
        if (yValue >= 200) {
            return "极佳";
        } else if (yValue >= 150 && yValue < 200) {
            return "非常棒";
        } else if (yValue >= 100 && yValue < 150) {
            return "相当棒";
        } else if (yValue >= 50 && yValue < 100) {
            return "还不错";
        } else {
            return "一般";
        }
    }
                """.trimIndent()
            )

        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.yAxis?.labels(aaYAxisLabels)

        return aaOptions
    }

    fun customYAxisLabels2(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Line)//图形类型
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelsEnabled(false)
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .markerRadius(8)
            .series(arrayOf(
                AASeriesElement()
                .name("Tokyo Hot")
                .lineWidth(5.0)
                .fillOpacity(0.4f)
                .data(arrayOf(229.9, 771.5, 1106.4, 1129.2, 6644.0, 1176.0, 8835.6, 148.5, 8816.4, 6694.1, 7795.6, 9954.4))))

        val aaYAxisLabels = AALabels()
            .style(
                AAStyle()
                .fontSize(10)
                .fontWeight(AAChartFontWeightType.Bold)
                .color(AAColor.Gray))
            .formatter("""
function () {
        var yValue = this.value;
        if (yValue == 0) {
            return "0";
        } else if (yValue == 2500) {
            return "25%";
        } else if (yValue == 5000) {
            return "50%";
        } else if (yValue == 7500) {
            return "75%";
        } else if (yValue == 10000) {
            return "100%";
        }
    }
                """.trimIndent()
            )

        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.yAxis?.apply {
             opposite(true)
            .tickWidth(2)
            .lineWidth(1.5)//Y轴轴线颜色
            .lineColor(AAColor.LightGray)//Y轴轴线颜色
            .gridLineWidth(0)//Y轴网格线宽度
            .tickPositions(arrayOf(0, 2500, 5000, 7500, 10000))
            .labels(aaYAxisLabels)
        }

        return aaOptions
    }

    //Stupid method
    fun customAreaChartXAxisLabelsTextUnitSuffix1(): AAOptions {
        val gradientColorDic1 = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToTop,
            "#7052f4",
            "#00b0ff"
        )
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Area)
            .title("Custom X Axis Labels Text")
            .subtitle("By Using JavaScript Formatter Function")
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)
            .yAxisGridLineWidth(0)
            .series(arrayOf(
                AASeriesElement()
                    .lineWidth(1.5)
                    .color("#00b0ff")
                    .fillColor(gradientColorDic1)
                    .name("2018")
                    .data(arrayOf(
                        1.51, 6.7, 0.94, 1.44, 1.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                        4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.51, 12.7, 0.94, 1.44,
                        18.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46,
                        3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.33, 4.68, 1.31, 1.10, 13.9, 1.10, 1.16, 1.67,
                        2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3, 3.32, 3.07, 3.92, 3.05,
                        2.18, 3.24, 3.23, 3.15, 2.90, 1.81, 2.11, 2.43, 5.59, 3.09, 4.09, 6.14, 5.33, 6.05,
                        5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.48,
                    ))))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.xAxis?.labels
            ?.formatter(
                "function () {" +
                        "const xValue = this.value;" +
                        "if (xValue%10 == 0) {" +
                        "return xValue + \" sec\";" +
                        "} else {" +
                        "return \"\";" +
                        "}" +
                        "}"
            )
        return aaOptions
    }

    //Smart method
    fun customAreaChartXAxisLabelsTextUnitSuffix2(): AAOptions {
        val aaOptions = customAreaChartXAxisLabelsTextUnitSuffix1()
        aaOptions.xAxis?.labels?.apply {
            step(10)
                .format("{value} sec")
        }
        return aaOptions
    }

    //https://github.com/AAChartModel/AAChartKit/issues/901
    //https://github.com/AAChartModel/AAChartKit/issues/952
    fun configureTheAxesLabelsFormattersOfDoubleYAxesChart(): AAOptions {
        val aaChart = AAChart()
            .backgroundColor(AAColor.White)
        val aaTitle = AATitle()
            .text("")
        val aaXAxis = AAXAxis()
            .visible(true)
            .min(0)
            .categories(arrayOf(
                "Java", "Swift", "Python", "Ruby", "PHP", "Go", "C",
                "C#", "C++", "Perl", "R", "MATLAB", "SQL"
            ))
        val aaPlotOptions = AAPlotOptions()
            .series(
                AASeries()
                .marker(
                    AAMarker()
                    .radius(7) //曲线连接点半径，默认是4
                    .symbol(AAChartSymbolType.Circle.value) //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                    .fillColor(AAColor.White) //点的填充色(用来设置折线连接点的填充色)
                    .lineWidth(3) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                    .lineColor("") //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                ))
        val yAxis1 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color("DodgerBlue"))
                .formatter("""function () {
        let yValue = this.value;
        if (yValue >= 200) {
            return "极佳";
        } else if (yValue >= 150 && yValue < 200) {
            return "非常棒";
        } else if (yValue >= 100 && yValue < 150) {
            return "相当棒";
        } else if (yValue >= 50 && yValue < 100) {
            return "还不错";
        } else {
            return "一般";
        }
    }"""))
            .gridLineWidth(0)
            .title(
                AATitle()
                .text("中文")
                .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)))
        val yAxis2 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color(AAColor.Red))
                .formatter("""function () {
        let yValue = this.value;
        if (yValue >= 200) {
            return "Awesome";
        } else if (yValue >= 150 && yValue < 200) {
            return "Great";
        } else if (yValue >= 100 && yValue < 150) {
            return "Very Good";
        } else if (yValue >= 50 && yValue < 100) {
            return "Not Bad";
        } else {
            return "Just So So";
        }
    }"""))
            .gridLineWidth(0)
            .title(
                AATitle()
                .text("ENGLISH")
                .style(AAStyle.style(AAColor.Red, 14, AAChartFontWeightType.Bold)))
            .opposite(true)
        val aaTooltip = AATooltip()
            .enabled(true)
            .shared(true)
        val seriesArr: Array<Any> = arrayOf(
            AASeriesElement()
                .name("2020")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.DeepSea)
                .borderRadius(4)
                .yAxis(1)
                .data(arrayOf(
                    0, 71.5, 106.4, 129.2, 144.0, 176.0,
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4
                )),
            AASeriesElement()
                .name("2021")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.Sanguine)
                .yAxis(0)
                .data(arrayOf(
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4,
                    0, 71.5, 106.4, 129.2, 144.0, 176.0
                )))
        return AAOptions()
            .chart(aaChart)
            .title(aaTitle)
            .plotOptions(aaPlotOptions)
            .xAxis(aaXAxis)
            .yAxisArray(arrayOf(yAxis1, yAxis2))
            .tooltip(aaTooltip)
            .series(seriesArr)
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1324
    fun configureTheAxesLabelsFormattersOfDoubleYAxesChart2(): AAOptions {
        val aaChart = AAChart()
            .backgroundColor(AAColor.White)
        val aaTitle = AATitle()
            .text("")
        val aaXAxis = AAXAxis()
            .visible(true)
            .min(0)
            .categories(arrayOf(
                "Java", "Swift", "Python", "Ruby", "PHP", "Go", "C",
                "C#", "C++", "Perl", "R", "MATLAB", "SQL"))
        val aaPlotOptions = AAPlotOptions()
            .series(
                AASeries()
                .marker(
                    AAMarker()
                    .radius(7) //曲线连接点半径，默认是4
                    .symbol(AAChartSymbolType.Circle.value) //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                    .fillColor(AAColor.White) //点的填充色(用来设置折线连接点的填充色)
                    .lineWidth(3) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                    .lineColor("") //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                ))
        val yAxis1 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color("DodgerBlue"))
                .formatter("""function () {
       var yValue = this.value;
       var formattedYValue = (yValue / 1000).toFixed(3) + '千';
       return formattedYValue;
   }"""
                ))
            .gridLineWidth(0)
            .title(
                AATitle()
                .text("以「千」为单位")
                .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)))
        val yAxis2 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color(AAColor.Red))
                .formatter("""function () {
       var yValue = this.value;
       var formattedYValue = (yValue / 10000).toFixed(4) + '万';
       return formattedYValue;
   }"""
                ))
            .gridLineWidth(0)
            .title(
                AATitle()
                .text("以『万』为单位")
                .style(AAStyle.style(AAColor.Red, 14, AAChartFontWeightType.Bold)))
            .opposite(true)
        val aaTooltip = AATooltip()
            .enabled(true)
            .shared(true)
        val seriesArr: Array<Any> = arrayOf(
            AASeriesElement()
                .name("2020")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.DeepSea)
                .borderRadius(4)
                .yAxis(1)
                .data(arrayOf(
                    0, 71.5, 106.4, 129.2, 144.0, 176.0,
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4)),
            AASeriesElement()
                .name("2021")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.Sanguine)
                .yAxis(0)
                .data(arrayOf(
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4,
                    0, 71.5, 106.4, 129.2, 144.0, 176.0
                )))
        return AAOptions()
            .chart(aaChart)
            .title(aaTitle)
            .plotOptions(aaPlotOptions)
            .xAxis(aaXAxis)
            .yAxisArray(arrayOf(yAxis1, yAxis2))
            .tooltip(aaTooltip)
            .series(seriesArr)
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1324
    //https://github.com/AAChartModel/AAChartKit/issues/1330
    fun configureTheAxesLabelsFormattersOfDoubleYAxesChart3(): AAOptions {
        val aaChart = AAChart()
            .backgroundColor(AAColor.White)
        val aaTitle = AATitle()
            .text("")
        val aaXAxis = AAXAxis()
            .visible(true)
            .min(0)
            .categories(arrayOf(
                "Java", "Swift", "Python", "Ruby", "PHP", "Go", "C",
                "C#", "C++", "Perl", "R", "MATLAB", "SQL"
            ))
        val aaPlotOptions = AAPlotOptions()
            .series(
                AASeries()
                .marker(
                    AAMarker()
                    .radius(7) //曲线连接点半径，默认是4
                    .symbol(AAChartSymbolType.Circle.value) //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
                    .fillColor(AAColor.White) //点的填充色(用来设置折线连接点的填充色)
                    .lineWidth(3) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
                    .lineColor("") //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
                ))
        val yAxis1 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color("DodgerBlue"))
                .formatter("""function () {
       var yValue = this.value;
       var unitStr = "千";
       if (yValue == 0) {
           unitStr = "";
       }
       var formattedYValue = (yValue / 1000).toFixed(3) + unitStr;
       return formattedYValue;
   }""")) //Y轴文字数值为 0 的时候, 不显示单位
            .gridLineWidth(0)
            .title(
                AATitle()
                .text("以「千」为单位")
                .style(AAStyle.style("DodgerBlue", 14, AAChartFontWeightType.Bold)))
        val yAxis2 = AAYAxis()
            .visible(true)
            .lineWidth(1)
            .tickPositions(arrayOf(0, 50, 100, 150, 200))
            .labels(AALabels()
                .enabled(true)
                .style(AAStyle()
                    .color(AAColor.Red))
                .formatter("""function () {
       var yValue = this.value;
       var unitStr = "万";
       if (yValue == 0) {
           unitStr = "";
       }
       var formattedYValue = (yValue / 10000).toFixed(4) + unitStr;
       return formattedYValue;
   }""")) //Y轴文字数值为 0 的时候, 不显示单位
            .gridLineWidth(0)
            .title(
                AATitle()
                .text("以『万』为单位")
                .style(AAStyle.style(AAColor.Red, 14, AAChartFontWeightType.Bold)))
            .opposite(true)
        val aaTooltip = AATooltip()
            .enabled(true)
            .shared(true)
        val seriesArr: Array<Any> = arrayOf(
            AASeriesElement()
                .name("2020")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.DeepSea)
                .borderRadius(4)
                .yAxis(1)
                .data(arrayOf(
                    0, 71.5, 106.4, 129.2, 144.0, 176.0,
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4)),
            AASeriesElement()
                .name("2021")
                .type(AAChartType.Spline)
                .lineWidth(7)
                .color(AAGradientColor.Sanguine)
                .yAxis(0)
                .data(arrayOf(
                    135.6, 148.5, 216.4, 194.1, 95.6, 54.4,
                    0, 71.5, 106.4, 129.2, 144.0, 176.0)))
        return AAOptions()
            .chart(aaChart)
            .title(aaTitle)
            .plotOptions(aaPlotOptions)
            .xAxis(aaXAxis)
            .yAxisArray(arrayOf(yAxis1, yAxis2))
            .tooltip(aaTooltip)
            .series(seriesArr)
    }

    //https://github.com/AAChartModel/AAChartKit/issues/1217
    fun customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Bar) //图表类型
            .title("春江花月夜") //图表主标题
            .subtitle("张若虚") //图表副标题
            //        .yAxisGridLineStyle([AALineStyle styleWithWidth:0})//y轴横向分割线宽度(为0即是隐藏分割线)
            .xAxisReversed(true) //        .xAxisLabelsStyle(AAStyle.style(AAColor.Black))
            .legendEnabled(false)
            .categories(arrayOf(
                "春江潮水连海平", "海上明月共潮生",
                "滟滟随波千万里", "何处春江无月明",
                "江流宛转绕芳甸", "月照花林皆似霰",
                "空里流霜不觉飞", "汀上白沙看不见",
                "江天一色无纤尘", "皎皎空中孤月轮",
                "江畔何人初见月", "江月何年初照人",
                "人生代代无穷已", "江月年年望相似",
                "不知江月待何人", "但见长江送流水",
                "白云一片去悠悠", "青枫浦上不胜愁",
                "谁家今夜扁舟子", "何处相思明月楼",
                "可怜楼上月裴回", "应照离人妆镜台",
                "玉户帘中卷不去", "捣衣砧上拂还来",
                "此时相望不相闻", "愿逐月华流照君",
                "鸿雁长飞光不度", "鱼龙潜跃水成文",
                "昨夜闲潭梦落花", "可怜春半不还家",
                "江水流春去欲尽", "江潭落月复西斜",
                "斜月沉沉藏海雾", "碣石潇湘无限路",
                "不知乘月几人归", "落月摇情满江树"))
            .series(arrayOf(
                AASeriesElement()
                    .lineWidth(1.5)
                    .color(AAGradientColor.DeepSea)
                    .name("2018")
                    .data(arrayOf(
                        1.51, 3.7, 0.94, 1.44, 1.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10,
                        4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28,1.51, 2.7, 0.94, 1.44,
                        3.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90,))))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.xAxis?.labels
            ?.formatter("function () {\n" +
                    "        let xAxisCategory = this.value;\n" +
                    "        if (xAxisCategory.length > 4) {\n" +
                    "            return xAxisCategory.substr(0, 4);\n" +
                    "        } else {\n" +
                    "            return xAxisCategory;\n" +
                    "        }\n" +
                    "    }")
        return aaOptions
    }

    //https://github.com/AAChartModel/AAChartKit/issues/852 自定义蜘蛛🕷图样式
    fun customSpiderChartStyle(): AAOptions {
        val categoryArr = arrayOf(
            "周转天数(天)",
            "订单满足率",
            "订单履约时效",
            "动销率",
            "畅销商品缺货率",
            "高库存金额占比",
            "不动销金额占比",
            "停采金额占比"
        )

//        String categoryJSArrStr = {categoryArr aa_toJSArray];

//
//        String xAxisLabelsFormatter ={String stringWithFormat:(AAJSFunc(function () {
//            return %[this.value];
//        })),categoryJSArrStr];
        val categoryJSArrStr = javaScriptArrayStringWithJavaArray(categoryArr)
        val xAxisLabelsFormatter = String.format(
            "function () {\n" +
                    "        return %s[this.value];\n" +
                    "    }", categoryJSArrStr
        )
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Line) //图表类型
            .title("健康体检表") //图表主标题
            .colorsTheme(arrayOf("#fe117c", "#ffc069")) //设置主体颜色数组
            .yAxisLineWidth(0) //                .yAxisGridLineStyle([AALineStyle styleWithWidth:0})
            //    .yAxisTickPositions([0, 5, 10, 15, 20, 25, 30, 35})
            .markerRadius(5)
            .markerSymbol(AAChartSymbolType.Circle)
            .polar(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("本月得分")
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5)),
                AASeriesElement()
                    .name("上月得分")
                    .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1))))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.chart?.apply {
            marginLeft(80)
                .marginRight(80)
        }
        aaOptions.xAxis?.apply {
            lineWidth(0) //避免多边形外环之外有额外套了一层无用的外环
                .labels?.style(AAStyle.style(AAColor.Black))
                ?.formatter(xAxisLabelsFormatter)
        }
        aaOptions.yAxis?.apply {
            gridLineInterpolation("polygon") //设置蜘蛛网🕸图表的网线为多边形
                .labels?.style(AAStyle.style(AAColor.Black))
        }


        //设定图例项的CSS样式。只支持有关文本的CSS样式设定。
//                /默认是：{
//            "color": "#333333",
//                    "cursor": "pointer",
//                    "fontSize": "12px",
//                    "fontWeight": "bold"
//        }
//     /
        val aaItemStyle = AAItemStyle()
            .color(AAColor.Gray) //字体颜色
            .cursor("pointer") //(在移动端这个属性没什么意义,其实不用设置)指定鼠标滑过数据列时鼠标的形状。当绑定了数据列点击事件时，可以将此参数设置为 "pointer"，用来提醒用户改数据列是可以点击的。
            .fontSize(14) //字体大小
            .fontWeight(AAChartFontWeightType.Thin) //字体为细体字
        aaOptions.legend?.apply {
            enabled(true)
                .align(AAChartAlignType.Center) //设置图例位于水平方向上的右侧
                .layout(AAChartLayoutType.Horizontal) //设置图例排列方式为垂直排布
                .verticalAlign(AAChartVerticalAlignType.Top) //设置图例位于竖直方向上的顶部
                .itemStyle(aaItemStyle)
        }
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
        val unitJSArrStr: String =
            JSFunctionForAAOptionsComposer.javaScriptArrayStringWithJavaArray(unitArr)
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


    // Refer to GitHub issue: https://github.com/AAChartModel/AAChartKit/issues/938
    // Refer to online chart sample: https://www.highcharts.com/demo/column-comparison
    fun customXAxisLabelsBeImages(): AAOptions {
        val nameArr: Array<String> = arrayOf(
            "South Korea",
            "Japan",
            "Australia",
            "Germany",
            "Russia",
            "China",
            "Great Britain",
            "United States"
        )
        val colorArr: Array<Any> = arrayOf(
            AARgba(201, 36, 39, 1f),
            AARgba(201, 36, 39, 1f),
            AARgba(0, 82, 180, 1f),
            AARgba(0, 0, 0, 1f),
            AARgba(240, 240, 240, 1f),
            AARgba(255, 217, 68, 1f),
            AARgba(0, 82, 180, 1f),
            AARgba(215, 0, 38, 1f)
        )
        val imageLinkFlagArr: Array<String> = arrayOf(
            "197582",
            "197604",
            "197507",
            "197571",
            "197408",
            "197375",
            "197374",
            "197484"
        )
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Column)
            .title("Custom X Axis Labels Be Images")
            .subtitle("use HTML")
            .categories(nameArr)
            .colorsTheme(colorArr)
            .borderRadius(5)
            .series(arrayOf(
                AASeriesElement()
                    .name("AD 2020")
                    .data(arrayOf(9.0, 9.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5))
                    .colorByPoint(true)
                    .borderRadiusTopLeft("50%")
                    .borderRadiusTopRight("50%")))
        val imageLinkFlagJSArrStr: String = javaScriptArrayStringWithJavaArray(imageLinkFlagArr)
        val xLabelsFormatter = String.format(
            "function () {\n" +
                    "        let imageFlag = %s[this.pos];\n" +
                    "        let imageLink = \"\";\n" +
                    "        return imageLink;\n" +
                    "    }", imageLinkFlagJSArrStr
        )

        //    https://api.highcharts.com.cn/highcharts#xAxis.labels.formatter
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.xAxis?.labels?.apply {
            useHTML(true)
            .formatter(xLabelsFormatter)
        }
        aaOptions.plotOptions?.column?.groupPadding(0.005f)

//    /Custom tooltip style/
//                String tooltipFormatter ={String stringWithFormat:(AAJSFunc(function () {
//            let imageFlag = %[this.point.index];
//            let imageLink = "
//            ";
//            return imageLink
//                    + " 🌕 🌖 🌗 🌘 🌑 🌒 🌓 🌔
//            "
//                    + " Support JavaScript Function Just Right Now !!!
//            "
//                    + " The Gold Price For 2020 "
//                    +  this.x
//                    + "  Is  "
//                    +  this.y
//                    + "  Dollars ";
//        })),imageLinkFlagJSArrStr];
        val tooltipFormatter = String.format(
            ("function () {\n" +
                    "        let imageFlag = %s[this.point.index];\n" +
                    "        let imageLink = \"<span><img src=\\\"https://image.flaticon.com/icons/svg/197/\" + imageFlag + \".svg\\\" style=\\\"width: 30px; height: 30px;\\\"/><br></span>\";\n" +
                    "        return imageLink\n" +
                    "        + \" \uD83C\uDF15 \uD83C\uDF16 \uD83C\uDF17 \uD83C\uDF18 \uD83C\uDF11 \uD83C\uDF12 \uD83C\uDF13 \uD83C\uDF14 <br/> \"\n" +
                    "        + \" Support JavaScript Function Just Right Now !!! <br/> \"\n" +
                    "        + \" The Gold Price For <b>2020 \"\n" +
                    "        +  this.x\n" +
                    "        + \" </b> Is <b> \"\n" +
                    "        +  this.y\n" +
                    "        + \" </b> Dollars \";\n" +
                    "    }"), imageLinkFlagJSArrStr
        )
        aaOptions.tooltip?.apply {
             shared(false)
            .useHTML(true)
            .formatter(tooltipFormatter)
        }
        return aaOptions
    }


    private fun javaScriptArrayStringWithJavaArray(javaArray: Array<String>): String {
        val originalJsArrStr = StringBuilder()
        for (element: Any in javaArray) {
            originalJsArrStr.append("'").append(element.toString()).append("',")
        }
        return "[$originalJsArrStr]"
    }


}