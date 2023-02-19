package com.github.aachartmodel.aainfographics.demo.chartcomposer

import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.AAColor
import com.github.aachartmodel.aainfographics.aatools.AADate.AADateUTC
import java.util.*

object JSFunctionForAAChartEventsComposer {
    //https://github.com/AAChartModel/AAChartKit-Swift/issues/345
    fun setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart(): AAOptions {
        val aaChartModel: AAChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline) //图表类型
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .yAxisVisible(false)
            .markerRadius(0)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36)),
                AASeriesElement()
                    .name("Berlin Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67)),
                AASeriesElement()
                    .name("New York Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64)),
                AASeriesElement()
                    .name("London Hot")
                    .lineWidth(5.0)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53))
            ))

        val aaOptions: AAOptions = aaChartModel.aa_toAAOptions()

        aaOptions.tooltip?.apply {
            style(AAStyle.style(AAColor.White))
           .backgroundColor("#050505")
           .borderColor("#050505")
        }

        aaOptions.xAxis?.apply {
            crosshair(AACrosshair()
                .color(AAColor.DarkGray)
                .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
                .width(2))
        }

        //默认选中的位置索引
        val defaultSelectedIndex = 5

        //https://api.highcharts.com/highcharts/chart.events.load
        //https://www.highcharts.com/forum/viewtopic.php?t=36508
        aaOptions.chart?.apply {
            events(AAChartEvents()
                    .load(String.format(
                            """
            function() {
                let points = [];
                let chart = this;
                let series = chart.series;
                let length = series.length;
                           
                for (let i = 0; i < length; i++) {
                    let pointElement = series[i].data[%s];
                    points.push(pointElement);
                }
                chart.xAxis[0].drawCrosshair(null, points[0]);
                chart.tooltip.refresh(points);
                       }""", defaultSelectedIndex
                        )))
        }
        return aaOptions
    }

    fun generalDrawingChart(): AAOptions {
        return AAOptions()
            .chart(AAChart()
                    .backgroundColor(AAColor.White)
                    .events(AAChartEvents()
                            .load("""function () {
                var ren = this.renderer,
                    colors = Highcharts.getOptions().colors,
                    rightArrow = ['M', 0, 0, 'L', 100, 0, 'L', 95, 5, 'M', 100, 0, 'L', 95, -5],
                    leftArrow = ['M', 100, 0, 'L', 0, 0, 'L', 5, 5, 'M', 0, 0, 'L', 5, -5];


                ren.path(['M', 120, 40, 'L', 120, 330])
                    .attr({
                        'stroke-width': 2,
                        stroke: 'silver',
                        dashstyle: 'dash'
                    })
                    .add();

                ren.path(['M', 420, 40, 'L', 420, 330])
                    .attr({
                        'stroke-width': 2,
                        stroke: 'silver',
                        dashstyle: 'dash'
                    })
                    .add();

                ren.label('Web client', 20, 40)
                    .css({
                        fontWeight: 'bold'
                    })
                    .add();
                ren.label('Web service / CLI', 220, 40)
                    .css({
                        fontWeight: 'bold'
                    })
                    .add();
                ren.label('Command line client', 440, 40)
                    .css({
                        fontWeight: 'bold'
                    })
                    .add();

                ren.label('SaaS client<br/>(browser or<br/>script)', 10, 82)
                    .attr({
                        fill: colors[0],
                        stroke: 'white',
                        'stroke-width': 2,
                        padding: 5,
                        r: 5
                    })
                    .css({
                        color: 'white'
                    })
                    .add()
                    .shadow(true);

                ren.path(rightArrow)
                    .attr({
                        'stroke-width': 2,
                        stroke: colors[3]
                    })
                    .translate(95, 95)
                    .add();

                ren.label('POST options in JSON', 90, 75)
                    .css({
                        fontSize: '10px',
                        color: colors[3]
                    })
                    .add();

                ren.label('PhantomJS', 210, 82)
                    .attr({
                        r: 5,
                        width: 100,
                        fill: colors[1]
                    })
                    .css({
                        color: 'white',
                        fontWeight: 'bold'
                    })
                    .add();

                ren.path(['M', 250, 110, 'L', 250, 185, 'L', 245, 180, 'M', 250, 185, 'L', 255, 180])
                    .attr({
                        'stroke-width': 2,
                        stroke: colors[3]
                    })
                    .add();

                ren.label('SVG', 255, 120)
                    .css({
                        color: colors[3],
                        fontSize: '10px'
                    })
                    .add();

                ren.label('Batik', 210, 200)
                    .attr({
                        r: 5,
                        width: 100,
                        fill: colors[1]
                    })
                    .css({
                        color: 'white',
                        fontWeight: 'bold'
                    })
                    .add();

                ren
                    .path([
                        'M', 235, 185,
                        'L', 235, 155,
                        'C', 235, 130, 235, 130, 215, 130,
                        'L', 95, 130,
                        'L', 100, 125,
                        'M', 95, 130,
                        'L', 100, 135
                    ])
                    .attr({
                        'stroke-width': 2,
                        stroke: colors[3]
                    })
                    .add();

                ren.label('Rasterized image', 100, 110)
                    .css({
                        color: colors[3],
                        fontSize: '10px'
                    })
                    .add();

                ren.label('Browser<br/>running<br/>Highcharts', 10, 180)
                    .attr({
                        fill: colors[0],
                        stroke: 'white',
                        'stroke-width': 2,
                        padding: 5,
                        r: 5
                    })
                    .css({
                        color: 'white',
                        width: '100px'
                    })
                    .add()
                    .shadow(true);


                ren.path(rightArrow)
                    .attr({
                        'stroke-width': 2,
                        stroke: colors[1]
                    })
                    .translate(95, 205)
                    .add();

                ren.label('POST SVG', 110, 185)
                    .css({
                        color: colors[1],
                        fontSize: '10px'
                    })
                    .add();

                ren.path(leftArrow)
                    .attr({
                        'stroke-width': 2,
                        stroke: colors[1]
                    })
                    .translate(95, 215)
                    .add();

                ren.label('Rasterized image', 100, 215)
                    .css({
                        color: colors[1],
                        fontSize: '10px'
                    })
                    .add();

                ren.label('Script', 450, 82)
                    .attr({
                        fill: colors[2],
                        stroke: 'white',
                        'stroke-width': 2,
                        padding: 5,
                        r: 5
                    })
                    .css({
                        color: 'white',
                        width: '100px'
                    })
                    .add()
                    .shadow(true);

                ren.path(leftArrow)
                    .attr({
                        'stroke-width': 2,
                        stroke: colors[2]
                    })
                    .translate(330, 90)
                    .add();

                ren.label('Command', 340, 70)
                    .css({
                        color: colors[2],
                        fontSize: '10px'
                    })
                    .add();

                ren.path(rightArrow)
                    .attr({
                        'stroke-width': 2,
                        stroke: colors[2]
                    })
                    .translate(330, 100)
                    .add();

                ren.label('Rasterized image', 330, 100)
                    .css({
                        color: colors[2],
                        fontSize: '10px'
                    })
                    .add();
            }"""
                            )
                    )
            )
            .title(AATitle()
                    .text("Highcharts export server overview")
                    .style(AAStyle.style(AAColor.Black)))
    }

    fun advancedTimeLineChart(): AAOptions {
        return AAOptions()
            .chart(AAChart()
                    .backgroundColor(AAColor.Red)
                    .events(AAChartEvents()
                            .load("""function () {
                        var centerX = 140;
                        var centerY = 110;
                        var path = [];
                        var angle;
                        var radius;
                        var badgeColor = Highcharts.color(Highcharts.getOptions().colors[0]).brighten(-0.2).get();
                        var spike;
                        var empImage;
                        var big5;
                        var label;
                        var left;
                        var right;
                        var years;
                        var renderer;

                        if (this.chartWidth < 530) {
                            return;
                        }

                        for (angle = 0; angle < 2 * Math.PI; angle += Math.PI / 24) {
                            radius = spike ? 80 : 70;
                            path.push(
                                'L',
                                centerX + radius * Math.cos(angle),
                                centerY + radius * Math.sin(angle)
                            );
                            spike = !spike;
                        }
                        path[0] = 'M';
                        path.push('z');
                        this.renderer.path(path)
                            .attr({
                                fill: badgeColor,
                                zIndex: 6
                            })
                            .add();

                        empImage = this.renderer.path(path)
                            .attr({
                                zIndex: 7,
                                opacity: 0,
                                stroke: badgeColor,
                                'stroke-width': 1
                            })
                            .add();

                        big5 = this.renderer.text('5')
                            .attr({
                                zIndex: 6
                            })
                            .css({
                                color: 'white',
                                fontSize: '100px',
                                fontStyle: 'italic',
                                fontFamily: '\'Brush Script MT\', sans-serif'
                            })
                            .add();
                        big5.attr({
                            x: centerX - big5.getBBox().width / 2,
                            y: centerY + 14
                        });

                        label = this.renderer.text('Highcharts Anniversary')
                            .attr({
                                zIndex: 6
                            })
                            .css({
                                color: '#FFFFFF'
                            })
                            .add();

                        left = centerX - label.getBBox().width / 2;
                        right = centerX + label.getBBox().width / 2;

                        label.attr({
                            x: left,
                            y: centerY + 44
                        });

                        left = centerX - 90;
                        right = centerX + 90;
                        this.renderer
                            .path([
                                'M', left, centerY + 30,
                                'L', right, centerY + 30,
                                right, centerY + 50,
                                left, centerY + 50,
                                'z',
                                'M', left, centerY + 40,
                                'L', left - 20, centerY + 40,
                                left - 10, centerY + 50,
                                left - 20, centerY + 60,
                                left + 10, centerY + 60,
                                left, centerY + 50,
                                left + 10, centerY + 60,
                                left + 10, centerY + 50,
                                left, centerY + 50,
                                'z',
                                'M', right, centerY + 40,
                                'L', right + 20, centerY + 40,
                                right + 10, centerY + 50,
                                right + 20, centerY + 60,
                                right - 10, centerY + 60,
                                right, centerY + 50,
                                right - 10, centerY + 60,
                                right - 10, centerY + 50,
                                right, centerY + 50,
                                'z'
                            ])
                            .attr({
                                fill: badgeColor,
                                stroke: '#FFFFFF',
                                'stroke-width': 1,
                                zIndex: 5
                            })
                            .add();

                        years = this.renderer.text('2009-2014')
                            .attr({
                                zIndex: 6
                            })
                            .css({
                                color: '#FFFFFF',
                                fontStyle: 'italic',
                                fontSize: '10px'
                            })
                            .add();
                        years.attr({
                            x: centerX - years.getBBox().width / 2,
                            y: centerY + 62
                        });

                        renderer = this.renderer;
                        if (renderer.defs) {
                            this.get('employees').points.forEach(point => {
                                let pattern;
                                if (point.image) {
                                    pattern = renderer.createElement('pattern').attr({
                                        id: 'pattern-' + point.image,
                                        patternUnits: 'userSpaceOnUse',
                                        width: 400,
                                        height: 400
                                    }).add(renderer.defs);
                                    renderer.image(
                                        'https://www.highcharts.com/images/employees2014/' + point.image + '.jpg',
                                        centerX - 80,
                                        centerY - 80,
                                        160,
                                        213
                                    ).add(pattern);

                                    Highcharts.addEvent(point, 'mouseOver', function () {
                                        empImage
                                            .attr({
                                                fill: 'url(#pattern-' + point.image + ')'
                                            })
                                            .animate({ opacity: 1 }, { duration: 500 });
                                    });
                                    Highcharts.addEvent(point, 'mouseOut', function () {
                                        empImage.animate({ opacity: 0 }, { duration: 500 });
                                    });
                                }
                            });
                        }
                    }"""
                            )
                    )
            ) //
            .xAxis(AAXAxis()
                    .type(AAChartAxisType.Datetime)
                    .minTickInterval(315360000)
                    .labels(AALabels()
                            .align(AAChartAlignType.Left))
                    .plotBands(arrayOf(
                            AAPlotBandsElement()
                                .from(1259280000)
                                .to(1291161600)
                                .color("#EFFFFF")
                                .label(AALabel()
                                        .text("办事处:Torstein的地下室")
                                        .style(AAStyle()
                                                .color("#999999"))
                                        .y(180)),
                            AAPlotBandsElement()
                                .from(1291161600)
                                .to(1380585600)
                                .color("#FFFFEF")
                                .label(AALabel()
                                        .text("办事处:Tomtebu")
                                        .style(AAStyle()
                                                .color("#999999"))
                                        .y(30)
                                ),
                            AAPlotBandsElement()
                                .from(1380585600)
                                .to(1417046400)
                                .color("#FFEFFF")
                                .label(AALabel()
                                        .text("办事处:VikØrsta")
                                        .style(AAStyle()
                                                .color("#999999"))
                                        .y(30))
                    )))
            .title(AATitle()
                    .text("Highsoft 公司发展历程"))
            .tooltip(AATooltip()
                    .style(AAStyle()
                            .width(250)))
            .yAxisArray(arrayOf(
                    AAYAxis()
                        .max(100)
                        .labels(AALabels()
                                .enabled(false))
                        .title(AATitle()
                                .text(""))
                        .gridLineColor("rgba(0, 0, 0, 0.07)"),
                    AAYAxis()
                        .allowDecimals(false)
                        .max(15)
                        .labels(AALabels()
                                .style(AAStyle()
                                        .color("#90ed7d")))
                        .title(AATitle()
                                .text("雇员")
                                .style(AAStyle()
                                        .color("#90ed7d")))
                        .opposite(true)
                        .gridLineWidth(0)))
            .plotOptions(AAPlotOptions()
                    .series(AASeries()
                            .marker(AAMarker()
                                    .enabled(false)
                                    .symbol(AAChartSymbolType.Circle.value)
                                    .radius(2)
                            ) //                .fillOpacity(0.5)
                    ) //            .flags(AAFlags.new
                //                .tooltip(new AATooltip()
                //                    .xDateFormat("%B %e, %Y")))
            )
            .series(arrayOf(
                    AASeriesElement()
                        .type(AAChartType.Line) //                .id("google-trends")
                        .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
                        .name("Google search for highcharts")
                        .data(arrayOf(
                                AADataElement().x(1258322400) /* November 2009 */.y(0),
                                AADataElement().x(1260961200).y(5),
                                AADataElement().x(1263639600).y(7),
                                AADataElement().x(1266188400).y(5),
                                AADataElement().x(1268740800).y(6),
                                AADataElement().x(1271368800).y(8),
                                AADataElement().x(1274004000).y(11),
                                AADataElement().x(1276639200).y(9),
                                AADataElement().x(1279274400).y(12),
                                AADataElement().x(1281952800).y(13),
                                AADataElement().x(1284588000).y(17),
                                AADataElement().x(1287223200).y(17),
                                AADataElement().x(1289858400).y(18),
                                AADataElement().x(1292497200).y(20),
                                AADataElement().x(1295175600).y(20),
                                AADataElement().x(1297724400).y(27),
                                AADataElement().x(1300276800).y(32),
                                AADataElement().x(1302904800).y(29),
                                AADataElement().x(1305540000).y(34),
                                AADataElement().x(1308175200).y(34),
                                AADataElement().x(1310810400).y(36),
                                AADataElement().x(1313488800).y(43),
                                AADataElement().x(1316124000).y(44),
                                AADataElement().x(1318759200).y(42),
                                AADataElement().x(1321394400).y(47),
                                AADataElement().x(1324033200).y(46),
                                AADataElement().x(1326711600).y(50),
                                AADataElement().x(1329303600).y(57),
                                AADataElement().x(1331899200).y(54),
                                AADataElement().x(1334527200).y(59),
                                AADataElement().x(1337162400).y(62),
                                AADataElement().x(1339797600).y(66),
                                AADataElement().x(1342432800).y(61),
                                AADataElement().x(1345111200).y(68),
                                AADataElement().x(1347746400).y(67),
                                AADataElement().x(1350381600).y(73),
                                AADataElement().x(1353016800).y(63),
                                AADataElement().x(1355655600).y(54),
                                AADataElement().x(1358334000).y(67),
                                AADataElement().x(1360882800).y(74),
                                AADataElement().x(1363435200).y(81),
                                AADataElement().x(1366063200).y(89),
                                AADataElement().x(1368698400).y(83),
                                AADataElement().x(1371333600).y(88),
                                AADataElement().x(1373968800).y(86),
                                AADataElement().x(1376647200).y(81),
                                AADataElement().x(1379282400).y(83),
                                AADataElement().x(1381917600).y(95),
                                AADataElement().x(1384552800).y(86),
                                AADataElement().x(1387191600).y(83),
                                AADataElement().x(1389870000).y(89),
                                AADataElement().x(1392418800).y(90),
                                AADataElement().x(1394971200).y(94),
                                AADataElement().x(1397599200).y(0),
                                AADataElement().x(1400234400).y(0),
                                AADataElement().x(1402869600).y(99),
                                AADataElement().x(1405504800).y(99),
                                AADataElement().x(1408183200).y(93),
                                AADataElement().x(1410818400).y(97),
                                AADataElement().x(1413453600).y(9)
                            )
                        )
                                .tooltip(AATooltip()
//                                        .xDateFormat("%B %Y")
                                        .valueSuffix(" % of best month"))
                    ,
                    AASeriesElement()
                        .name("收入")
                        .id("revenue")
                        .type(AAChartType.Area)
                        .data(arrayOf(
                                AADataElement().x(1257033600).y(2),
                                AADataElement().x(1259625600).y(3),
                                AADataElement().x(1262304000).y(2),
                                AADataElement().x(1264982400).y(3),
                                AADataElement().x(1267401600).y(4),
                                AADataElement().x(1270080000).y(4),
                                AADataElement().x(1272672000).y(4),
                                AADataElement().x(1275350400).y(4),
                                AADataElement().x(1277942400).y(5),
                                AADataElement().x(1280620800).y(7),
                                AADataElement().x(1283299200).y(6),
                                AADataElement().x(1285891200).y(9),
                                AADataElement().x(1288569600).y(10),
                                AADataElement().x(1291161600).y(8),
                                AADataElement().x(1293840000).y(10),
                                AADataElement().x(1296518400).y(13),
                                AADataElement().x(1298937600).y(15),
                                AADataElement().x(1301616000).y(14),
                                AADataElement().x(1304208000).y(15),
                                AADataElement().x(1306886400).y(16),
                                AADataElement().x(1309478400).y(22),
                                AADataElement().x(1312156800).y(19),
                                AADataElement().x(1314835200).y(20),
                                AADataElement().x(1317427200).y(32),
                                AADataElement().x(1320105600).y(34),
                                AADataElement().x(1322697600).y(36),
                                AADataElement().x(1325376000).y(34),
                                AADataElement().x(1328054400).y(40),
                                AADataElement().x(1330560000).y(37),
                                AADataElement().x(1333238400).y(35),
                                AADataElement().x(1335830400).y(40),
                                AADataElement().x(1338508800).y(38),
                                AADataElement().x(1341100800).y(39),
                                AADataElement().x(1343779200).y(43),
                                AADataElement().x(1346457600).y(49),
                                AADataElement().x(1349049600).y(43),
                                AADataElement().x(1351728000).y(54),
                                AADataElement().x(1354320000).y(44),
                                AADataElement().x(1356998400).y(43),
                                AADataElement().x(1359676800).y(43),
                                AADataElement().x(1362096000).y(52),
                                AADataElement().x(1364774400).y(52),
                                AADataElement().x(1367366400).y(56),
                                AADataElement().x(1370044800).y(62),
                                AADataElement().x(1372636800).y(66),
                                AADataElement().x(1375315200).y(62),
                                AADataElement().x(1377993600).y(63),
                                AADataElement().x(1380585600).y(60),
                                AADataElement().x(1383264000).y(60),
                                AADataElement().x(1385856000).y(58),
                                AADataElement().x(1388534400).y(65),
                                AADataElement().x(1391212800).y(52),
                                AADataElement().x(1393632000).y(72),
                                AADataElement().x(1396310400).y(57),
                                AADataElement().x(1398902400).y(70),
                                AADataElement().x(1401580800).y(63),
                                AADataElement().x(1404172800).y(65),
                                AADataElement().x(1406851200).y(65),
                                AADataElement().x(1409529600).y(89),
                                AADataElement().x(1412121600).y(0)
                            )
                        )
                                .tooltip( AATooltip()
//                                        .xDateFormat("%B %Y")
                                        .valueSuffix(" % of best month")
                                )
                    ,
                    AASeriesElement()
                        .yAxis(1)
                        .name("Highsoft 员工")
                        .id("employees")
                        .type(AAChartType.Area)
                        .step("left")
                        .tooltip(AATooltip()
                                .headerFormat("{point.x:%B %e, %Y}")
                                .pointFormat("{point.name}{point.y}")
                                .valueSuffix(" employees"))
                        .data(arrayOf(
                                AADataElement().x(AADateUTC(2009, 10, 1)).y(1)
                                    .name("Torstein 一个人工作"),
                                AADataElement().x(AADateUTC(2010, 10, 20)).y(2).name("Grethe 加入"),
                                AADataElement().x(AADateUTC(2011, 3, 1)).y(3).name("Erik 加入"),
                                AADataElement().x(AADateUTC(2011, 7, 1)).y(4).name("Gert 加入"),
                                AADataElement().x(AADateUTC(2011, 7, 15)).y(5).name("Hilde 加入"),
                                AADataElement().x(AADateUTC(2012, 5, 1)).y(6).name("Guro 加入"),
                                AADataElement().x(AADateUTC(2012, 8, 1)).y(5).name("Erik left"),
                                AADataElement().x(AADateUTC(2012, 8, 15)).y(6).name("Anne Jorunn"),
                                AADataElement().x(AADateUTC(2013, 0, 1)).y(7).name("Hilde T"),
                                AADataElement().x(AADateUTC(2013, 7, 1)).y(8).name("Jon Arild"),
                                AADataElement().x(AADateUTC(2013, 7, 20)).y(9).name("Øystein 加入"),
                                AADataElement().x(AADateUTC(2013, 9, 1)).y(1).name("Stephane 加入"),
                                AADataElement().x(AADateUTC(2014, 9, 1)).y(1).name("Anita 加入"),
                                AADataElement().x(AADateUTC(2014, 10, 27)).y(1).name("")
                            )
                        )
                )
            )
    }


    //https://github.com/AAChartModel/AAChartKit/issues/1093
    //https://github.com/highcharts/highcharts-ios/issues/97
    fun automaticallyHideTooltipAfterItIsShown(): AAOptions {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline) //图表类型
            .colorsTheme(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .stacking(AAChartStackingType.Normal)
            .yAxisVisible(false)
            .markerRadius(0)
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)),
                AASeriesElement()
                    .name("NewYork")
                    .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5)),
                AASeriesElement()
                    .name("London")
                    .data(arrayOf(0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0)),
                AASeriesElement()
                    .name("Berlin")
                    .data(arrayOf(3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8))
            ))

        val aaOptions = aaChartModel.aa_toAAOptions()

        aaOptions.tooltip?.apply {
             style(AAStyle.style(AAColor.White))
            .backgroundColor("#050505")
            .borderColor("#050505")
        }

        aaOptions.xAxis
            ?.crosshair(AACrosshair()
                .color(AAColor.DarkGray)
                .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
                .width(2))


        //https://api.highcharts.com/highcharts/chart.events.load
        //https://www.highcharts.com/forum/viewtopic.php?t=36508
        aaOptions.chart
            ?.events(AAChartEvents()
                    .load("""
            function() {
                const chart = this;
                Highcharts.addEvent(
                    chart.tooltip,
                    'refresh',
                    function () {
                        chart.tooltip.hide(888);
                });
            }"""
                    )
            )
        return aaOptions
    }


    //https://github.com/AAChartModel/AAChartKit-Swift/issues/394
    //https://www.highcharts.com/forum/viewtopic.php?t=44985
    fun configureBlinkMarkerChart(): AAOptions {
        val dataArr: Array<Any> = arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6)
        val selectedIndex = dataArr.size - 1
        return AAOptions()
            .chart(AAChart()
                    .events(AAChartEvents()
                            .load(String.format(
                                    Locale.CHINA, "function() {" +
                                            "const chart = this;" +
                                            "const point = chart.series[0].points[%d];" +
                                            "let big = true;" +
                                            "setInterval(() => {" +
                                            "big = !big;" +
                                            "point.update({" +
                                            "marker: {" +
                                            "radius: big ? 5 : 15" +
                                            "}" +
                                            "})" +
                                            "}, 500);" +
                                            "}",
                                    selectedIndex
                                ))))
            .series(arrayOf(
                    AASeriesElement()
                        .data(dataArr)
                        .marker(AAMarker()
                                .lineColor(AAColor.Red)
                                .lineWidth(3f)
                                .radius(10f))))
    }


    //https://github.com/AAChartModel/AAChartKit-Swift/issues/394
    //https://www.highcharts.com/forum/viewtopic.php?t=44985
    fun configureSpecialStyleMarkerOfSingleDataElementChartWithBlinkEffect(): AAOptions {
        val stopsArr = arrayOf<Any>(
            arrayOf<Any>(0.00f, "#febc0f"),
            arrayOf<Any>(0.25f, "#FF14d4"),
            arrayOf<Any>(0.50f, "#0bf8f5"),
            arrayOf<Any>(0.75f, "#F33c52"),
            arrayOf<Any>(1.00f, "#1904dd")
        )
        val aaMarker = AAMarker()
            .radius(8f) //曲线连接点半径
            .symbol(AAChartSymbolType.Circle.value) //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
            .fillColor(AAColor.White) //点的填充色(用来设置折线连接点的填充色)
            .lineWidth(5f) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
            //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
            .lineColor(AAColor.Red)
        val singleSpecialData = AADataElement()
            .marker(aaMarker)
            .y(26.5f)
        return AAOptions()
            .chart(AAChart()
                    .type(AAChartType.Spline)
                    .backgroundColor("#4b2b7f")
                    .events(AAChartEvents()
                            .load("""function () {
                          const chart = this;
                          const point = chart.series[0].points[11];
                          let big = true;
                          setInterval(() => {
                                 big = !big;
                                 point.update({
                                      marker: {
                                        radius: big ? 5 : 55,
                                        fillColor: big ? "white": "red",
                                        lineWidth: big ? 5 : 15,
                                        lineColor: big ? "green": "yellow",
                                      }
                                 })
                          }, 500)
                     }""")))
            .title(AATitle()
                    .text("Special style single data element chart"))
            .tooltip(AATooltip()
                    .enabled(true))
            .xAxis(AAXAxis()
                    .visible(false))
            .yAxis(AAYAxis()
                    .visible(false))
            .series(arrayOf(
                    AASeriesElement()
                        .name("Virtual Data")
                        .lineWidth(6f)
                        .data(arrayOf( 7.0f, 6.9f, 2.5f, 14.5f, 18.2f, singleSpecialData, 5.2f, 26.5f, 23.3f, 45.3f, 13.9f, 9.6f))
                        .color(AAColor.Red)))
    }

    //https://github.com/AAChartModel/AAChartKit-Swift/issues/394
    //https://echarts.apache.org/examples/zh/editor.html?c=scatter-effect
    fun configureScatterChartWithBlinkEffect(): AAOptions{
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Scatter)
            .title("Height and weight distribution by sex")
            .yAxisTitle("kg")
            .markerRadius(8)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("Blink Scatter")
                    .color(AAColor.Green)
                    .data(arrayOf(arrayOf<Any>(172.7, 105.2), arrayOf<Any>(153.4, 42))),
                AASeriesElement()
                    .name("Female")
                    .color("#ff0000")
                    .data( arrayOf(
                        arrayOf(161.2, 51.6), arrayOf(167.5, 59.0), arrayOf(159.5, 49.2), arrayOf(157.0, 63.0), arrayOf(155.8, 53.6),
                        arrayOf(170.0, 59.0), arrayOf(159.1, 47.6), arrayOf(166.0, 69.8), arrayOf(176.2, 66.8), arrayOf(160.2, 75.2),
                        arrayOf(172.5, 55.2), arrayOf(170.9, 54.2), arrayOf(172.9, 62.5), arrayOf(153.4, 42.0), arrayOf(160.0, 50.0),
                        arrayOf(147.2, 49.8), arrayOf(168.2, 49.2), arrayOf(175.0, 73.2), arrayOf(157.0, 47.8), arrayOf(167.6, 68.8),
                        arrayOf(159.5, 50.6), arrayOf(175.0, 82.5), arrayOf(166.8, 57.2), arrayOf(176.5, 87.8), arrayOf(170.2, 72.8),
                        arrayOf(174.0, 54.5), arrayOf(173.0, 59.8), arrayOf(179.9, 67.3), arrayOf(170.5, 67.8), arrayOf(160.0, 47.0),
                        arrayOf(154.4, 46.2), arrayOf(162.0, 55.0), arrayOf(176.5, 83.0), arrayOf(160.0, 54.4), arrayOf(152.0, 45.8),
                        arrayOf(162.1, 53.6), arrayOf(170.0, 73.2), arrayOf(160.2, 52.1), arrayOf(161.3, 67.9), arrayOf(166.4, 56.6),
                        arrayOf(168.9, 62.3), arrayOf(163.8, 58.5), arrayOf(167.6, 54.5), arrayOf(160.0, 50.2), arrayOf(161.3, 60.3),
                        arrayOf(167.6, 58.3), arrayOf(165.1, 56.2), arrayOf(160.0, 50.2), arrayOf(170.0, 72.9), arrayOf(157.5, 59.8),
                        arrayOf(167.6, 61.0), arrayOf(160.7, 69.1), arrayOf(163.2, 55.9), arrayOf(152.4, 46.5), arrayOf(157.5, 54.3),
                        arrayOf(168.3, 54.8), arrayOf(180.3, 60.7), arrayOf(165.5, 60.0), arrayOf(165.0, 62.0), arrayOf(164.5, 60.3),
                        arrayOf(156.0, 52.7), arrayOf(160.0, 74.3), arrayOf(163.0, 62.0), arrayOf(165.7, 73.1), arrayOf(161.0, 80.0),
                        arrayOf(162.0, 54.7), arrayOf(166.0, 53.2), arrayOf(174.0, 75.7), arrayOf(172.7, 61.1), arrayOf(167.6, 55.7),
                        arrayOf(151.1, 48.7), arrayOf(164.5, 52.3), arrayOf(163.5, 50.0), arrayOf(152.0, 59.3), arrayOf(169.0, 62.5),
                        arrayOf(164.0, 55.7), arrayOf(161.2, 54.8), arrayOf(155.0, 45.9), arrayOf(170.0, 70.6), arrayOf(176.2, 67.2),
                        arrayOf(170.0, 69.4), arrayOf(162.5, 58.2), arrayOf(170.3, 64.8), arrayOf(164.1, 71.6), arrayOf(169.5, 52.8),
                        arrayOf(163.2, 59.8), arrayOf(154.5, 49.0), arrayOf(159.8, 50.0), arrayOf(173.2, 69.2), arrayOf(170.0, 55.9),
                        arrayOf(161.4, 63.4), arrayOf(169.0, 58.2), arrayOf(166.2, 58.6), arrayOf(159.4, 45.7), arrayOf(162.5, 52.2),
                        arrayOf(159.0, 48.6), arrayOf(162.8, 57.8), arrayOf(159.0, 55.6), arrayOf(179.8, 66.8), arrayOf(162.9, 59.4),
                        arrayOf(161.0, 53.6), arrayOf(151.1, 73.2), arrayOf(168.2, 53.4), arrayOf(168.9, 69.0), arrayOf(173.2, 58.4),
                        arrayOf(171.8, 56.2), arrayOf(178.0, 70.6), arrayOf(164.3, 59.8), arrayOf(163.0, 72.0), arrayOf(168.5, 65.2),
                        arrayOf(166.8, 56.6), arrayOf(172.7, 88.8), arrayOf(163.5, 51.8), arrayOf(169.4, 63.4), arrayOf(167.8, 59.0),
                        arrayOf(159.5, 47.6), arrayOf(167.6, 63.0), arrayOf(161.2, 55.2), arrayOf(160.0, 45.0), arrayOf(163.2, 54.0),
                        arrayOf(162.2, 50.2), arrayOf(161.3, 60.2), arrayOf(149.5, 44.8), arrayOf(157.5, 58.8), arrayOf(163.2, 56.4),
                        arrayOf(172.7, 62.0), arrayOf(155.0, 49.2), arrayOf(156.5, 67.2), arrayOf(164.0, 53.8), arrayOf(160.9, 54.4),
                        arrayOf(162.8, 58.0), arrayOf(167.0, 59.8), arrayOf(160.0, 54.8), arrayOf(160.0, 43.2), arrayOf(168.9, 60.5),
                        arrayOf(158.2, 46.4), arrayOf(156.0, 64.4), arrayOf(160.0, 48.8), arrayOf(167.1, 62.2), arrayOf(158.0, 55.5),
                        arrayOf(167.6, 57.8), arrayOf(156.0, 54.6), arrayOf(162.1, 59.2), arrayOf(173.4, 52.7), arrayOf(159.8, 53.2),
                        arrayOf(170.5, 64.5), arrayOf(159.2, 51.8), arrayOf(157.5, 56.0), arrayOf(161.3, 63.6), arrayOf(162.6, 63.2),
                        arrayOf(160.0, 59.5), arrayOf(168.9, 56.8), arrayOf(165.1, 64.1), arrayOf(162.6, 50.0), arrayOf(165.1, 72.3),
                        arrayOf(166.4, 55.0), arrayOf(160.0, 55.9), arrayOf(152.4, 60.4), arrayOf(170.2, 69.1), arrayOf(162.6, 84.5),
                        arrayOf(170.2, 55.9), arrayOf(158.8, 55.5), arrayOf(172.7, 69.5), arrayOf(167.6, 76.4), arrayOf(162.6, 61.4),
                        arrayOf(167.6, 65.9), arrayOf(156.2, 58.6), arrayOf(175.2, 66.8), arrayOf(172.1, 56.6), arrayOf(162.6, 58.6),
                        arrayOf(160.0, 55.9), arrayOf(165.1, 59.1), arrayOf(182.9, 81.8), arrayOf(166.4, 70.7), arrayOf(165.1, 56.8),
                        arrayOf(177.8, 60.0), arrayOf(165.1, 58.2), arrayOf(175.3, 72.7), arrayOf(154.9, 54.1), arrayOf(158.8, 49.1),
                        arrayOf(172.7, 75.9), arrayOf(168.9, 55.0), arrayOf(161.3, 57.3), arrayOf(167.6, 55.0), arrayOf(165.1, 65.5),
                        arrayOf(175.3, 65.5), arrayOf(157.5, 48.6), arrayOf(163.8, 58.6), arrayOf(167.6, 63.6), arrayOf(165.1, 55.2),
                        arrayOf(165.1, 62.7), arrayOf(168.9, 56.6), arrayOf(162.6, 53.9), arrayOf(164.5, 63.2), arrayOf(176.5, 73.6),
                        arrayOf(168.9, 62.0), arrayOf(175.3, 63.6), arrayOf(159.4, 53.2), arrayOf(160.0, 53.4), arrayOf(170.2, 55.0),
                        arrayOf(162.6, 70.5), arrayOf(167.6, 54.5), arrayOf(162.6, 54.5), arrayOf(160.7, 55.9), arrayOf(160.0, 59.0),
                        arrayOf(157.5, 63.6), arrayOf(162.6, 54.5), arrayOf(152.4, 47.3), arrayOf(170.2, 67.7), arrayOf(165.1, 80.9),
                        arrayOf(172.7, 70.5), arrayOf(165.1, 60.9), arrayOf(170.2, 63.6), arrayOf(170.2, 54.5), arrayOf(170.2, 59.1),
                        arrayOf(161.3, 70.5), arrayOf(167.6, 52.7), arrayOf(167.6, 62.7), arrayOf(165.1, 86.3), arrayOf(162.6, 66.4),
                        arrayOf(152.4, 67.3), arrayOf(168.9, 63.0), arrayOf(170.2, 73.6), arrayOf(175.2, 62.3), arrayOf(175.2, 57.7),
                        arrayOf(160.0, 55.4), arrayOf(165.1, 77.7), arrayOf(174.0, 55.5), arrayOf(170.2, 77.3), arrayOf(160.0, 80.5),
                        arrayOf(167.6, 64.5), arrayOf(167.6, 72.3), arrayOf(167.6, 61.4), arrayOf(154.9, 58.2), arrayOf(162.6, 81.8),
                        arrayOf(175.3, 63.6), arrayOf(171.4, 53.4), arrayOf(157.5, 54.5), arrayOf(165.1, 53.6), arrayOf(160.0, 60.0),
                        arrayOf(174.0, 73.6), arrayOf(162.6, 61.4), arrayOf(174.0, 55.5), arrayOf(162.6, 63.6), arrayOf(161.3, 60.9),
                        arrayOf(156.2, 60.0), arrayOf(149.9, 46.8), arrayOf(169.5, 57.3), arrayOf(160.0, 64.1), arrayOf(175.3, 63.6),
                        arrayOf(169.5, 67.3), arrayOf(160.0, 75.5), arrayOf(172.7, 68.2), arrayOf(162.6, 61.4), arrayOf(157.5, 76.8),
                        arrayOf(176.5, 71.8), arrayOf(164.4, 55.5), arrayOf(160.7, 48.6), arrayOf(174.0, 66.4), arrayOf(163.8, 67.3)))
            ))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.chart?.events(AAChartEvents()
            .load("""function() {
                const chart = this;
                const blinkScatterPointsArr = chart.series[0].points;
                const range = blinkScatterPointsArr.length;
                for (let i = 0; i < range; i++) {
                    const point = blinkScatterPointsArr[i];
                    let big = true;
                    setInterval(() => {
                            big = !big;
                            point.update({
                                marker: {
                                radius: big ? 5 : 25,
                                    fillColor: big ? "pink": "red",
                                        lineWidth: big ? 5 : 15,
                                        lineColor: big ? "gold": "yellow",
                            }
                            })
                    }, 600)
                }
            }"""))
        return aaOptions
    }


    //https://github.com/AAChartModel/AAChartKit/issues/1383
    //https://www.highcharts.com/forum/viewtopic.php?t=49409
    //    dynamicHeightGridLineAreaChart in Java
    fun dynamicHeightGridLineAreaChart(): AAOptions {
        return AAOptions()
            .title(AATitle()
                    .text("dynamicHeightGridLineAreaChart"))
            .chart(AAChart()
                    .type(AAChartType.Scatter)
                    .events(AAChartEvents()
                            .load("""function() {
   const chart = this;
   const mainSeries = chart.series[0];
   mainSeries.data.forEach((point, i) => {
       chart.addSeries({
           data: [
               [i, 0],
               [i, point.y]
           ]
       })
   })
}"""
                            )
                    )
            )
            .plotOptions(AAPlotOptions()
                    .scatter(AAScatter()
                            .lineWidth(2)
                            .lineColor("#dbe751")
                            .dashStyle(AAChartLineDashStyleType.LongDash)
                            .enableMouseTracking(false)
                            .linkedTo("main")
                            .states(AAStates()
                                    .inactive(AAInactive()
                                            .enabled(false)))
                            .marker(AAMarker()
                                    .enabled(false))))
            .yAxis(AAYAxis()
                    .gridLineWidth(0))
            .series(arrayOf(
                    AASeriesElement()
                        .type(AAChartType.Areaspline)
                        .id("main")
                        .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                        .lineWidth(6)
                        .color("#dbe751")
                        .fillOpacity(0.4f)
                        .marker(AAMarker()
                                .enabled(false))))
    }

    //https://github.com/AAChartModel/AAChartKit-Swift-Pro/issues/3
    //https://www.highcharts.com/forum/viewtopic.php?f=9&t=49492
    fun customizeYAxisPlotLinesLabelBeSpecialStyle(): AAOptions {
        return AAOptions()
            .chart(AAChart()
                    .events(AAChartEvents()
                            .load("function() {\n" +
                                        "   const chart = this,\n" +
                                        "   ren = chart.renderer,\n" +
                                        "   plotLineLabel = chart.yAxis[0].plotLinesAndBands[0].label,\n" +
                                        "   {\n" +
                                        "           x: labelX,\n" +
                                        "       y: labelY,\n" +
                                        "       width: labelWidth,\n" +
                                        "       height: labelHeight\n" +
                                        "       } = plotLineLabel.getBBox(),\n" +
                                        "   x = labelX + labelWidth,\n" +
                                        "   y = labelY,\n" +
                                        "   lh = labelHeight,\n" +
                                        "   ll = 40;\n" +
                                        "\n" +
                                        "   chart.customLabelTriangle = ren.path(['M', x - ll, y, x, y, x + lh, y + lh / 2, x, y + lh, x - ll, y + lh, 'Z']).attr({\n" +
                                        "       fill: '#a9a9ff',\n" +
                                        "                  }).add().toFront();\n" +
                                        "              }"
                            )
                    )
            )
            .yAxis(AAYAxis()
                    .visible(true)
                    .lineWidth(2)
                    .plotLines(arrayOf(
                            AAPlotLinesElement()
                                .value(6.5f)
                                .color("#a9a9ff")
                                .width(2)
                                .dashStyle(AAChartLineDashStyleType.Dash)
                                .label(AALabel()
                                        .useHTML(true)
                                        .textAlign(AAChartAlignType.Center)
                                        .x(0).y(2)
                                        .formatter(
                                            ("function () {\n" +
                                                    "               return `<span style=\"padding: 2px 10px; display: block; color: white\">`+this.options.value+`</span>`\n" +
                                                    "               }"))))))
            .series(arrayOf(
                    AASeriesElement()
                        .data(arrayOf(2, 5, 2, 3, 6))))
    }

    //https://stackoverflow.com/questions/47392848/set-ecg-paper-like-grid-intervals-highcharts-js
    fun configureECGStyleChart(): AAOptions {
        return AAOptions()
            .chart(
                AAChart()
                    .events(
                        AAChartEvents()
                            .render(
                                """
   function () {
       const chart = this;
       const axes = chart.axes;
       let showMinorTicks = true;

       axes.forEach((a) => {
               if (Object.keys(a.minorTicks).length === 0) {
                   showMinorTicks = false;
               }
       });

       axes.forEach((a) => {
               for (var key in a.minorTicks) {
                   var mt = a.minorTicks[key].gridLine;
                   showMinorTicks ? mt.show() : mt.hide();
               }
       });
   }"""
                            )
                    )
            )
            .xAxis(
                AAXAxis()
                    .tickInterval(0.5f)
                    .minorTicks(true)
                    .minorTickInterval(0.1f)
                    .gridLineWidth(1)
                    .gridLineColor("#ff0000")
            )
            .yAxis(
                AAYAxis()
                    .tickInterval(0.5f)
                    .minorTicks(true)
                    .minorTickInterval(0.1f)
                    .gridLineWidth(1)
                    .gridLineColor("#ff0000")
            )
            .series(arrayOf(
                    AASeriesElement()
                        .data(arrayOf(1, 3, 4, 6, 1, 2, 2, 6, 1, 1, 1, 4, 6))
                )
            )
    }
}

