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
package com.aachartmodel.aainfographics.ChartsDemo.ChartComposer

import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AADataLabels
import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAStyle
import com.example.chartcorekotlin.AAChartConfiger.*

class MixedChartComposer {
companion object {
    internal fun arearangeMixedLine(): AAChartModel {
        return AAChartModel()
            .title("LANGUAGE MARKET SHARES JANUARY,2020 TO MAY")
            .subtitle("virtual data")
            .series(arrayOf(
                AASeriesElement()
                    .name("Temperature")
                    .color("#1E90FF")
                    .type(AAChartType.Line)
                    .data(arrayOf(
                        arrayOf(12464064, 21.5),
                        arrayOf(12464928, 22.1),
                        arrayOf(12465792, 23.0),
                        arrayOf(12466656, 23.8),
                        arrayOf(12467520, 21.4),
                        arrayOf(12468384, 21.3),
                        arrayOf(12469248, 18.3),
                        arrayOf(12470112, 15.4),
                        arrayOf(12470976, 16.4),
                        arrayOf(12471840, 17.7),
                        arrayOf(12472704, 17.5),
                        arrayOf(12473568, 17.6),
                        arrayOf(12474432, 17.7),
                        arrayOf(12475296, 16.8),
                        arrayOf(12476160, 17.7),
                        arrayOf(12477024, 16.3),
                        arrayOf(12477888, 17.8),
                        arrayOf(12478752, 18.1),
                        arrayOf(12479616, 17.2),
                        arrayOf(12480480, 14.4),
                        arrayOf(12481344, 13.7),
                        arrayOf(12482208, 15.7),
                        arrayOf(12483072, 14.6),
                        arrayOf(12483936, 15.3),
                        arrayOf(12484800, 15.3),
                        arrayOf(12485664, 15.8),
                        arrayOf(12486528, 15.2),
                        arrayOf(12487392, 14.8),
                        arrayOf(12488256, 14.4),
                        arrayOf(12489120, 15.0),
                        arrayOf(12489984, 13.6)
                    )
                    )
                    .zIndex(1),
                AASeriesElement()
                    .name("Range")
                    .color("#1E90FF")
                    .type(AAChartType.Arearange)
                    .lineWidth(0f)
                    .fillOpacity(0.3f)
                    .data(arrayOf(
                        arrayOf(12464064, 14.3, 27.7),
                        arrayOf(12464928, 14.5, 27.8),
                        arrayOf(12465792, 15.5, 29.6),
                        arrayOf(12466656, 16.7, 30.7),
                        arrayOf(12467520, 16.5, 25.0),
                        arrayOf(12468384, 17.8, 25.7),
                        arrayOf(12469248, 13.5, 24.8),
                        arrayOf(12470112, 10.5, 21.4),
                        arrayOf(12470976, 9.20, 23.8),
                        arrayOf(12471840, 11.6, 21.8),
                        arrayOf(12472704, 10.7, 23.7),
                        arrayOf(12473568, 11.0, 23.3),
                        arrayOf(12474432, 11.6, 23.7),
                        arrayOf(12475296, 11.8, 20.7),
                        arrayOf(12476160, 12.6, 22.4),
                        arrayOf(12477024, 13.6, 19.6),
                        arrayOf(12477888, 11.4, 22.6),
                        arrayOf(12478752, 13.2, 25.0),
                        arrayOf(12479616, 14.2, 21.6),
                        arrayOf(12480480, 13.1, 17.1),
                        arrayOf(12481344, 12.2, 15.5),
                        arrayOf(12482208, 12.0, 20.8),
                        arrayOf(12483072, 12.0, 17.1),
                        arrayOf(12483936, 12.7, 18.3),
                        arrayOf(12484800, 12.4, 19.4),
                        arrayOf(12485664, 12.6, 19.9),
                        arrayOf(12486528, 11.9, 20.2),
                        arrayOf(12487392, 11.0, 19.3),
                        arrayOf(12488256, 10.8, 17.8),
                        arrayOf(12489120, 11.8, 18.5),
                        arrayOf(12489984, 10.8, 16.1)
                    )
                    )
                    .zIndex(0)
            )
            )
    }

    fun configureColumnrangeMixedLineChart(): AAChartModel {
        return AAChartModel()
            .colorsTheme(arrayOf("#1e90ff", "#EA007B", "#49C1B6", "#FDC20A", "#F78320", "#068E81"))//主题颜色数组
            .title("")//图形标题
            .subtitle("")//图形副标题
            .chartType(AAChartType.Line)
            .dataLabelsEnabled(false)
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)
            .series(arrayOf(
                AASeriesElement()
                    .name("Temperature")
                    .type(AAChartType.Columnrange)  //COLUMN_RANGE
                    .data(arrayOf(
                        arrayOf(-9.7,  9.4),
                        arrayOf(-8.7,  6.5),
                        arrayOf(-3.5,  9.4),
                        arrayOf(-1.4, 19.9),
                        arrayOf(0.0,  22.6),
                        arrayOf(2.9,  29.5),
                        arrayOf(9.2,  30.7),
                        arrayOf(7.3,  26.5),
                        arrayOf(4.4,  18.0),
                        arrayOf(-3.1, 11.4),
                        arrayOf(-5.2, 10.4),
                        arrayOf(-9.9, 16.8)
                    )
                    ),
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)),
                AASeriesElement()
                    .name("New York")
                    .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5)),
                AASeriesElement()
                    .name("Berlin")
                    .data(arrayOf(0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0)),
                AASeriesElement()
                    .name("London")
                    .data(arrayOf(3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8))
            )
            )
    }

    fun configurestackingColumnMixedLineChart(): AAChartModel {
        return AAChartModel()
            .title("16年1月-16年11月充值客单分析")//图形标题
            .subtitle("BY MICVS")//图形副标题
            .chartType(AAChartType.Column)
            .stacking(AAChartStackingType.Normal)
            .legendEnabled(true)
            .colorsTheme(arrayOf(
                AAGradientColor.oceanBlueColor(),
                AAGradientColor.sanguineColor(),
                AAGradientColor.lusciousLimeColor()
            )
            )
            .series(arrayOf(
                AASeriesElement()
                    .name("新用户")
                    .data(arrayOf(82.89,67.54,62.07,59.43,67.02,67.09,35.66,71.78,81.61,78.85,79.12,72.30))
                    .dataLabels(AADataLabels()
                        .enabled(true)
                        .style(
                            AAStyle()
                                .color(AAColor.redColor())
                                .fontSize(11f)
                        )
                    ),
                AASeriesElement()
                    .name("老用户")
                    .data(arrayOf(198.66,330.81,151.95,160.12,222.56,229.05,128.53,250.91,224.47,473.99,126.85,260.50))
                    .dataLabels(AADataLabels()
                        .enabled(true)
                        .style(AAStyle()
                            .color("#000000")
                            .fontSize(11f)
                        )
                    ),
                AASeriesElement()
                    .name("总量")
                    .type(AAChartType.Line)
                    .data(arrayOf(281.55,398.35,214.02,219.55,289.57,296.14,164.18,322.69,306.08,552.84,205.97,332.79))
                    .dataLabels(AADataLabels()
                        .enabled(true)
                        .style(AAStyle()
                            .color("#000000")
                            .fontSize(15f)
                            .fontWeight("bold")
                        )
                    )
            )
            )
    }

    fun dashStyleTypeMixedChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Spline)//图形类型
            .dataLabelsEnabled(false)//是否显示数字
            .stacking(AAChartStackingType.Normal)
            .markerRadius(0f)
            .series(arrayOf(
                AASeriesElement()
                    .name("SolidLine")
                    .lineWidth(3f)
                    .data(arrayOf(50, 320, 230, 370, 230, 400, 320)),
                AASeriesElement()
                    .name("Dash")
                    .lineWidth(3f)
                    .dashStyle(AAChartLineDashStyleType.Dash)
                    .data(arrayOf(50, 320, 230, 370, 230, 400, 320)),
                AASeriesElement()
                    .name("DashDot")
                    .lineWidth(3f)
                    .dashStyle(AAChartLineDashStyleType.DashDot)
                    .data(arrayOf(50, 320, 230, 370, 230, 400, 320)),
                AASeriesElement()
                    .name("LongDash")
                    .lineWidth(3f)
                    .dashStyle(AAChartLineDashStyleType.LongDash)
                    .data(arrayOf(50, 320, 230, 370, 230, 400, 320)),
                AASeriesElement()
                    .name("LongDashDot")
                    .lineWidth(3f)
                    .dashStyle(AAChartLineDashStyleType.LongDashDot)
                    .data(arrayOf(50, 320, 230, 370, 230, 400, 320))
            )
            )
    }

    fun negativeColorMixedChart(): AAChartModel {
        return AAChartModel()
            .dataLabelsEnabled(false)//是否显示数字
            .series(arrayOf(
                AASeriesElement()
                    .name("Column")
                    .type(AAChartType.Column)
                    .data(arrayOf(
                        -6.4, -5.2, -3.0, 0.2, 2.3, 5.5, 8.4, 8.3, 5.1, 0.9, -1.1, -4.0,
                        -6.4, -5.2, -3.0, 0.2, 2.3, 5.5, 8.4, 8.3, 5.1, 0.9, -1.1, -4.0,
                        -6.4, -5.2, -3.0, 0.2, 2.3, 5.5, 8.4, 8.3, 5.1, 0.9, -1.1, -4.0
                    )
                    )
                    .color("#0088FF")
                    .negativeColor("#FF0000")
                    .threshold(4f)//default:0
            )
            )
    }

    internal fun scatterMixedLine(): AAChartModel {
        return AAChartModel()
            .dataLabelsEnabled(false)//是否显示数字
            .chartType(AAChartType.Scatter)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .markerSymbol(AAChartSymbolType.Circle)
            .markerRadius(8f)
            .series(arrayOf(
                AASeriesElement()
                    .name("Scatter")
                    .data(arrayOf(
                        arrayOf(0.067732, 3.176513),
                        arrayOf(0.427810, 3.816464),
                        arrayOf(0.995731, 4.550095),
                        arrayOf(0.738336, 4.256571),
                        arrayOf(0.981083, 4.560815),
                        arrayOf(0.526171, 3.929515),
                        arrayOf(0.378887, 3.526170),
                        arrayOf(0.033859, 3.156393),
                        arrayOf(0.132791, 3.110301),
                        arrayOf(0.138306, 3.149813),
                        arrayOf(0.247809, 3.476346),
                        arrayOf(0.648270, 4.119688),
                        arrayOf(0.731209, 4.282233),
                        arrayOf(0.236833, 3.486582),
                        arrayOf(0.969788, 4.655492),
                        arrayOf(0.607492, 3.965162),
                        arrayOf(0.358622, 3.514900),
                        arrayOf(0.147846, 3.125947),
                        arrayOf(0.637820, 4.094115),
                        arrayOf(0.230372, 3.476039),
                        arrayOf(0.070237, 3.210610),
                        arrayOf(0.067154, 3.190612),
                        arrayOf(0.925577, 4.631504),
                        arrayOf(0.717733, 4.295890),
                        arrayOf(0.015371, 3.085028),
                        arrayOf(0.335070, 3.448080),
                        arrayOf(0.040486, 3.167440),
                        arrayOf(0.212575, 3.364266),
                        arrayOf(0.617218, 3.993482),
                        arrayOf(0.541196, 3.891471),
                        arrayOf(0.045353, 3.143259),
                        arrayOf(0.126762, 3.114204),
                        arrayOf(0.556486, 3.851484),
                        arrayOf(0.901144, 4.621899),
                        arrayOf(0.958476, 4.580768),
                        arrayOf(0.274561, 3.620992),
                        arrayOf(0.394396, 3.580501),
                        arrayOf(0.872480, 4.618706),
                        arrayOf(0.409932, 3.676867),
                        arrayOf(0.908969, 4.641845),
                        arrayOf(0.166819, 3.175939),
                        arrayOf(0.665016, 4.264980),
                        arrayOf(0.263727, 3.558448),
                        arrayOf(0.231214, 3.436632),
                        arrayOf(0.552928, 3.831052),
                        arrayOf(0.047744, 3.182853),
                        arrayOf(0.365746, 3.498906),
                        arrayOf(0.495002, 3.946833),
                        arrayOf(0.493466, 3.900583),
                        arrayOf(0.792101, 4.238522),
                        arrayOf(0.769660, 4.233080),
                        arrayOf(0.251821, 3.521557),
                        arrayOf(0.181951, 3.203344),
                        arrayOf(0.808177, 4.278105),
                        arrayOf(0.334116, 3.555705),
                        arrayOf(0.338630, 3.502661),
                        arrayOf(0.452584, 3.859776),
                        arrayOf(0.694770, 4.275956),
                        arrayOf(0.590902, 3.916191),
                        arrayOf(0.307928, 3.587961),
                        arrayOf(0.148364, 3.183004),
                        arrayOf(0.702180, 4.225236),
                        arrayOf(0.721544, 4.231083),
                        arrayOf(0.666886, 4.240544),
                        arrayOf(0.124931, 3.222372),
                        arrayOf(0.618286, 4.021445),
                        arrayOf(0.381086, 3.567479),
                        arrayOf(0.385643, 3.562580),
                        arrayOf(0.777175, 4.262059),
                        arrayOf(0.116089, 3.208813),
                        arrayOf(0.115487, 3.169825),
                        arrayOf(0.663510, 4.193949),
                        arrayOf(0.254884, 3.491678),
                        arrayOf(0.993888, 4.533306),
                        arrayOf(0.295434, 3.550108),
                        arrayOf(0.952523, 4.636427),
                        arrayOf(0.307047, 3.557078),
                        arrayOf(0.277261, 3.552874),
                        arrayOf(0.279101, 3.494159),
                        arrayOf(0.175724, 3.206828),
                        arrayOf(0.156383, 3.195266),
                        arrayOf(0.733165, 4.221292),
                        arrayOf(0.848142, 4.413372),
                        arrayOf(0.771184, 4.184347),
                        arrayOf(0.429492, 3.742878),
                        arrayOf(0.162176, 3.201878),
                        arrayOf(0.917064, 4.648964),
                        arrayOf(0.315044, 3.510117),
                        arrayOf(0.201473, 3.274434),
                        arrayOf(0.297038, 3.579622),
                        arrayOf(0.336647, 3.489244),
                        arrayOf(0.666109, 4.237386),
                        arrayOf(0.583888, 3.913749),
                        arrayOf(0.085031, 3.228990),
                        arrayOf(0.687006, 4.286286),
                        arrayOf(0.949655, 4.628614),
                        arrayOf(0.189912, 3.239536),
                        arrayOf(0.844027, 4.457997),
                        arrayOf(0.333288, 3.513384),
                        arrayOf(0.427035, 3.729674),
                        arrayOf(0.466369, 3.834274),
                        arrayOf(0.550659, 3.811155),
                        arrayOf(0.278213, 3.598316),
                        arrayOf(0.918769, 4.692514),
                        arrayOf(0.886555, 4.604859),
                        arrayOf(0.569488, 3.864912),
                        arrayOf(0.066379, 3.184236),
                        arrayOf(0.335751, 3.500796),
                        arrayOf(0.426863, 3.743365),
                        arrayOf(0.395746, 3.622905),
                        arrayOf(0.694221, 4.310796),
                        arrayOf(0.272760, 3.583357),
                        arrayOf(0.503495, 3.901852),
                        arrayOf(0.067119, 3.233521),
                        arrayOf(0.038326, 3.105266),
                        arrayOf(0.599122, 3.865544),
                        arrayOf(0.947054, 4.628625),
                        arrayOf(0.671279, 4.231213),
                        arrayOf(0.434811, 3.791149),
                        arrayOf(0.509381, 3.968271),
                        arrayOf(0.749442, 4.253910),
                        arrayOf(0.058014, 3.194710),
                        arrayOf(0.482978, 3.996503),
                        arrayOf(0.466776, 3.904358),
                        arrayOf(0.357767, 3.503976),
                        arrayOf(0.949123, 4.557545),
                        arrayOf(0.417320, 3.699876),
                        arrayOf(0.920461, 4.613614),
                        arrayOf(0.156433, 3.140401),
                        arrayOf(0.656662, 4.206717),
                        arrayOf(0.616418, 3.969524),
                        arrayOf(0.853428, 4.476096),
                        arrayOf(0.133295, 3.136528),
                        arrayOf(0.693007, 4.279071),
                        arrayOf(0.178449, 3.200603),
                        arrayOf(0.199526, 3.299012),
                        arrayOf(0.073224, 3.209873),
                        arrayOf(0.286515, 3.632942),
                        arrayOf(0.182026, 3.248361),
                        arrayOf(0.621523, 3.995783),
                        arrayOf(0.344584, 3.563262),
                        arrayOf(0.398556, 3.649712),
                        arrayOf(0.480369, 3.951845),
                        arrayOf(0.153350, 3.145031),
                        arrayOf(0.171846, 3.181577),
                        arrayOf(0.867082, 4.637087),
                        arrayOf(0.223855, 3.404964),
                        arrayOf(0.528301, 3.873188),
                        arrayOf(0.890192, 4.633648),
                        arrayOf(0.106352, 3.154768),
                        arrayOf(0.917886, 4.623637),
                        arrayOf(0.014855, 3.078132),
                        arrayOf(0.567682, 3.913596),
                        arrayOf(0.068854, 3.221817),
                        arrayOf(0.603535, 3.938071),
                        arrayOf(0.532050, 3.880822),
                        arrayOf(0.651362, 4.176436),
                        arrayOf(0.901225, 4.648161),
                        arrayOf(0.204337, 3.332312),
                        arrayOf(0.696081, 4.240614),
                        arrayOf(0.963924, 4.532224),
                        arrayOf(0.981390, 4.557105),
                        arrayOf(0.987911, 4.610072),
                        arrayOf(0.990947, 4.636569),
                        arrayOf(0.736021, 4.229813),
                        arrayOf(0.253574, 3.500860),
                        arrayOf(0.674722, 4.245514),
                        arrayOf(0.939368, 4.605182),
                        arrayOf(0.235419, 3.454340),
                        arrayOf(0.110521, 3.180775),
                        arrayOf(0.218023, 3.380820),
                        arrayOf(0.869778, 4.565020),
                        arrayOf(0.196830, 3.279973),
                        arrayOf(0.958178, 4.554241),
                        arrayOf(0.972673, 4.633520),
                        arrayOf(0.745797, 4.281037),
                        arrayOf(0.445674, 3.844426),
                        arrayOf(0.470557, 3.891601),
                        arrayOf(0.549236, 3.849728),
                        arrayOf(0.335691, 3.492215),
                        arrayOf(0.884739, 4.592374),
                        arrayOf(0.918916, 4.632025),
                        arrayOf(0.441815, 3.756750),
                        arrayOf(0.116598, 3.133555),
                        arrayOf(0.359274, 3.567919),
                        arrayOf(0.814811, 4.363382),
                        arrayOf(0.387125, 3.560165),
                        arrayOf(0.982243, 4.564305),
                        arrayOf(0.780880, 4.215055),
                        arrayOf(0.652565, 4.174999),
                        arrayOf(0.870030, 4.586640),
                        arrayOf(0.604755, 3.960008),
                        arrayOf(0.255212, 3.529963),
                        arrayOf(0.730546, 4.213412),
                        arrayOf(0.493829, 3.908685),
                        arrayOf(0.257017, 3.585821),
                        arrayOf(0.833735, 4.374394),
                        arrayOf(0.070095, 3.213817),
                        arrayOf(0.527070, 3.952681),
                        arrayOf(0.116163, 3.129283)
                    )
                    )
                    .color("#0088FF")
            )
            )
    }


    internal fun negativeColorMixedBubble(): AAChartModel {
        return AAChartModel()
            .categories(arrayOf("Saturday", "Friday", "Thursday", "Wednesday", "Tuesday", "Monday", "Sunday"))
            .series(arrayOf(
                AASeriesElement()
                    .name("Bubble")
                    .type(AAChartType.Bubble)
                    .data(arrayOf(
                        arrayOf(0,0,5),arrayOf(0,1,1),arrayOf(0,2,0),arrayOf(0,3,0),arrayOf(0,4,0),arrayOf(0,5,0),arrayOf(0,6,0),arrayOf(0,7,0),arrayOf(0,8,0),arrayOf(0,9,0),
                        arrayOf(0,10,0),arrayOf(0,11,2),arrayOf(0,12,4),arrayOf(0,13,1),arrayOf(0,14,1),arrayOf(0,15,3),arrayOf(0,16,4),arrayOf(0,17,6),arrayOf(0,18,4),
                        arrayOf(0,19,4),arrayOf(0,20,3),arrayOf(0,21,3),arrayOf(0,22,2),arrayOf(0,23,5),arrayOf(1,0,7),arrayOf(1,1,0),arrayOf(1,2,0),arrayOf(1,3,0),
                        arrayOf(1,4,0),arrayOf(1,5,0),arrayOf(1,6,0),arrayOf(1,7,0),arrayOf(1,8,0),arrayOf(1,9,0),arrayOf(1,10,5),arrayOf(1,11,2),arrayOf(1,12,2),
                        arrayOf(1,13,6),arrayOf(1,14,9),arrayOf(1,15,11),arrayOf(1,16,6),arrayOf(1,17,7),arrayOf(1,18,8),arrayOf(1,19,12),arrayOf(1,20,5),arrayOf(1,21,5),
                        arrayOf(1,22,7),arrayOf(1,23,2),arrayOf(2,0,1),arrayOf(2,1,1),arrayOf(2,2,0),arrayOf(2,3,0),arrayOf(2,4,0),arrayOf(2,5,0),arrayOf(2,6,0),arrayOf(2,7,0),
                        arrayOf(2,8,0),arrayOf(2,9,0),arrayOf(2,10,3),arrayOf(2,11,2),arrayOf(2,12,1),arrayOf(2,13,9),arrayOf(2,14,8),arrayOf(2,15,10),arrayOf(2,16,6),
                        arrayOf(2,17,5),arrayOf(2,18,5),arrayOf(2,19,5),arrayOf(2,20,7),arrayOf(2,21,4),arrayOf(2,22,2),arrayOf(2,23,4),arrayOf(3,0,7),arrayOf(3,1,3),
                        arrayOf(3,2,0),arrayOf(3,3,0),arrayOf(3,4,0),arrayOf(3,5,0),arrayOf(3,6,0),arrayOf(3,7,0),arrayOf(3,8,1),arrayOf(3,9,0),arrayOf(3,10,5),arrayOf(3,11,4),
                        arrayOf(3,12,7),arrayOf(3,13,14),arrayOf(3,14,13),arrayOf(3,15,12),arrayOf(3,16,9),arrayOf(3,17,5),arrayOf(3,18,5),arrayOf(3,19,10),
                        arrayOf(3,20,6),arrayOf(3,21,4),arrayOf(3,22,4),arrayOf(3,23,1),arrayOf(4,0,1),arrayOf(4,1,3),arrayOf(4,2,0),arrayOf(4,3,0),arrayOf(4,4,0),
                        arrayOf(4,5,1),arrayOf(4,6,0),arrayOf(4,7,0),arrayOf(4,8,0),arrayOf(4,9,2),arrayOf(4,10,4),arrayOf(4,11,4),arrayOf(4,12,2),arrayOf(4,13,4),
                        arrayOf(4,14,4),arrayOf(4,15,14),arrayOf(4,16,12),arrayOf(4,17,1),arrayOf(4,18,8),arrayOf(4,19,5),arrayOf(4,20,3),arrayOf(4,21,7),arrayOf(4,22,3),
                        arrayOf(4,23,0),arrayOf(5,0,2),arrayOf(5,1,1),arrayOf(5,2,0),arrayOf(5,3,3),arrayOf(5,4,0),arrayOf(5,5,0),arrayOf(5,6,0),arrayOf(5,7,0),arrayOf(5,8,2),
                        arrayOf(5,9,0),arrayOf(5,10,4),arrayOf(5,11,1),arrayOf(5,12,5),arrayOf(5,13,10),arrayOf(5,14,5),arrayOf(5,15,7),arrayOf(5,16,11),arrayOf(5,17,6),
                        arrayOf(5,18,0),arrayOf(5,19,5),arrayOf(5,20,3),arrayOf(5,21,4),arrayOf(5,22,2),arrayOf(5,23,0),arrayOf(6,0,1),arrayOf(6,1,0),arrayOf(6,2,0),
                        arrayOf(6,3,0),arrayOf(6,4,0),arrayOf(6,5,0),arrayOf(6,6,0),arrayOf(6,7,0),arrayOf(6,8,0),arrayOf(6,9,0),arrayOf(6,10,1),arrayOf(6,11,0),arrayOf(6,12,2),
                        arrayOf(6,13,1),arrayOf(6,14,3),arrayOf(6,15,4),arrayOf(6,16,0),arrayOf(6,17,0),arrayOf(6,18,0),arrayOf(6,19,0),arrayOf(6,20,1),arrayOf(6,21,2),
                        arrayOf(6,22,2),arrayOf(6,23,6)
                    )
                    )
                    .color("#0088FF")
                    .negativeColor("#FF0000")
                    .threshold(4f)//default:0
            )
            )
    }

    internal fun polygonMixedScatter(): AAChartModel {
        return AAChartModel()
            .series(arrayOf(
                AASeriesElement()
                    .name("目标")
                    .type(AAChartType.Polygon)
                    .data(arrayOf(
                        arrayOf(153, 42), arrayOf(149, 46), arrayOf(149, 55), arrayOf(152, 60), arrayOf(159, 70), arrayOf(170, 77), arrayOf(180, 70),
                        arrayOf(180, 60), arrayOf(173, 52), arrayOf(166, 45))),
                AASeriesElement()
                    .name("实际值")
                    .type(AAChartType.Scatter)
                    .data(arrayOf(
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
                        arrayOf(166.8, 56.6), arrayOf(172.7, 105 ), arrayOf(163.5, 51.8), arrayOf(169.4, 63.4), arrayOf(167.8, 59.0),
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
                        arrayOf(160.0, 55.4), arrayOf(165.1, 104 ), arrayOf(174.0, 55.5), arrayOf(170.2, 77.3), arrayOf(160.0, 80.5),
                        arrayOf(167.6, 64.5), arrayOf(167.6, 72.3), arrayOf(167.6, 61.4), arrayOf(154.9, 58.2), arrayOf(162.6, 81.8),
                        arrayOf(175.3, 63.6), arrayOf(171.4, 53.4), arrayOf(157.5, 54.5), arrayOf(165.1, 53.6), arrayOf(160.0, 60.0),
                        arrayOf(174.0, 73.6), arrayOf(162.6, 61.4), arrayOf(174.0, 55.5), arrayOf(162.6, 63.6), arrayOf(161.3, 60.9),
                        arrayOf(156.2, 60.0), arrayOf(149.9, 46.8), arrayOf(169.5, 57.3), arrayOf(160.0, 64.1), arrayOf(175.3, 63.6),
                        arrayOf(169.5, 67.3), arrayOf(160.0, 75.5), arrayOf(172.7, 68.2), arrayOf(162.6, 61.4), arrayOf(157.5, 76.8),
                        arrayOf(176.5, 71.8), arrayOf(164.4, 55.5), arrayOf(160.7, 48.6), arrayOf(174.0, 66.4), arrayOf(163.8, 67.3)
                    )
                    )
            )
            )

    }

    fun polarChartMixedChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .polar(true)
            .series(arrayOf(
                AASeriesElement()
                    .name("Column")
                    .type(AAChartType.Column)
                    .data(arrayOf(8, 7, 6, 5, 4, 3, 2, 1)),
                AASeriesElement()
                    .name("Line")
                    .type(AAChartType.Line)
                    .data(arrayOf(1, 2, 3, 4, 5, 6, 7, 8)),
                AASeriesElement()
                    .name("Area")
                    .type(AAChartType.Area)
                    .data(arrayOf(1, 8, 2, 7, 3, 6, 4, 5))
            )
            )
    }
    }
}
