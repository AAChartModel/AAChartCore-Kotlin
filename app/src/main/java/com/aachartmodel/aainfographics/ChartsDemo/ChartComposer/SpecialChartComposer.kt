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

import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAWaterfall
import com.example.chartcorekotlin.AAChartConfiger.*
import java.util.HashMap

object SpecialChartComposer{



    fun configurePolarColumnChart(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .polar(true)
            .dataLabelsEnabled(false)
            .categories(arrayOf(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
            )
            )
            .series(arrayOf(
                AASeriesElement()
                    .name("2018")
                    .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)
                    )
            )
            )
    }

    fun configurePieChart(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Pie)
            .backgroundColor("#ffffff")
            .title("LANGUAGE MARKET SHARES JANUARY,2020 TO MAY")
            .subtitle("virtual data")
            .dataLabelsEnabled(true)//是否直接显示扇形图数据
            .yAxisTitle("℃")
            .series(arrayOf(
                AASeriesElement()
                    .name("Language market shares")
                    .data(arrayOf(
                        arrayOf("Java",   67),
                        arrayOf("Swift", 999),
                        arrayOf("Python", 83),
                        arrayOf("OC",     11),
                        arrayOf("Go",     30)
                    )
                    )
            )
            )
    }

    fun configureBubbleChart(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Bubble)
            .title("AACHARTKIT BUBBLES")
            .subtitle("JUST FOR FUN")
            .yAxisTitle("℃")
            .gradientColorEnable(true)
            .colorsTheme(arrayOf("#0c9674", "#7dffc0", "#d11b5f", "#facd32", "#ffffa0", "#EA007B"))
            .series(arrayOf(
                AASeriesElement()
                    .name("BubbleOne")
                    .data(arrayOf(
                        arrayOf(97, 36, 79),
                        arrayOf(94, 74, 60),
                        arrayOf(68, 76, 58),
                        arrayOf(64, 87, 56),
                        arrayOf(68, 27, 73),
                        arrayOf(74, 99, 42),
                        arrayOf(7 , 93, 99),
                        arrayOf(51, 69, 40),
                        arrayOf(38, 23, 33),
                        arrayOf(57, 86, 31),
                        arrayOf(33, 24, 22)
                    )
                    ),
                AASeriesElement()
                    .name("BubbleTwo")
                    .data(arrayOf(
                        arrayOf(25, 60, 87),
                        arrayOf(2 , 75, 59),
                        arrayOf(11, 54, 8 ),
                        arrayOf(86, 55, 93),
                        arrayOf(5 , 33, 88),
                        arrayOf(90, 63, 44),
                        arrayOf(91, 43, 17),
                        arrayOf(97, 56, 56),
                        arrayOf(15, 67, 48),
                        arrayOf(54, 25, 81),
                        arrayOf(55, 66, 11)
                    )
                    ),
                AASeriesElement()
                    .name("BubbleThree")
                    .data(arrayOf(
                        arrayOf(47, 47, 21),
                        arrayOf(20, 12, 66),
                        arrayOf(6 , 76, 91),
                        arrayOf(38, 30, 60),
                        arrayOf(57, 98, 64),
                        arrayOf(61, 47, 80),
                        arrayOf(83, 60, 13),
                        arrayOf(67, 78, 75),
                        arrayOf(64, 12, 55),
                        arrayOf(30, 77, 82),
                        arrayOf(88, 66, 13)
                    )
                    )
            )
            )
    }

    fun configureScatterChart(): AAChartModel {
        val elementOne = AASeriesElement()
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


        val elementTwo = AASeriesElement()
            .name("Male")
            .color("rgba(119, 152, 191, 1)")
            .data(arrayOf(
                arrayOf(174.0, 65.6), arrayOf(175.3, 71.8), arrayOf(193.5, 80.7), arrayOf(186.5, 72.6), arrayOf(187.2, 78.8),
                arrayOf(181.5, 74.8), arrayOf(184.0, 86.4), arrayOf(184.5, 78.4), arrayOf(175.0, 62.0), arrayOf(184.0, 81.6),
                arrayOf(180.0, 76.6), arrayOf(177.8, 83.6), arrayOf(192.0, 90.0), arrayOf(176.0, 74.6), arrayOf(174.0, 71.0),
                arrayOf(184.0, 79.6), arrayOf(192.7, 93.8), arrayOf(171.5, 70.0), arrayOf(173.0, 72.4), arrayOf(176.0, 85.9),
                arrayOf(176.0, 78.8), arrayOf(180.5, 77.8), arrayOf(172.7, 66.2), arrayOf(176.0, 86.4), arrayOf(173.5, 81.8),
                arrayOf(178.0, 89.6), arrayOf(180.3, 82.8), arrayOf(180.3, 76.4), arrayOf(164.5, 63.2), arrayOf(173.0, 60.9),
                arrayOf(183.5, 74.8), arrayOf(175.5, 70.0), arrayOf(188.0, 72.4), arrayOf(189.2, 84.1), arrayOf(172.8, 69.1),
                arrayOf(170.0, 59.5), arrayOf(182.0, 67.2), arrayOf(170.0, 61.3), arrayOf(177.8, 68.6), arrayOf(184.2, 80.1),
                arrayOf(186.7, 87.8), arrayOf(171.4, 84.7), arrayOf(172.7, 73.4), arrayOf(175.3, 72.1), arrayOf(180.3, 82.6),
                arrayOf(182.9, 88.7), arrayOf(188.0, 84.1), arrayOf(177.2, 94.1), arrayOf(172.1, 74.9), arrayOf(167.0, 59.1),
                arrayOf(169.5, 75.6), arrayOf(174.0, 86.2), arrayOf(172.7, 75.3), arrayOf(182.2, 87.1), arrayOf(164.1, 55.2),
                arrayOf(163.0, 57.0), arrayOf(171.5, 61.4), arrayOf(184.2, 76.8), arrayOf(174.0, 86.8), arrayOf(174.0, 72.2),
                arrayOf(177.0, 71.6), arrayOf(186.0, 84.8), arrayOf(167.0, 68.2), arrayOf(171.8, 66.1), arrayOf(182.0, 72.0),
                arrayOf(167.0, 64.6), arrayOf(177.8, 74.8), arrayOf(164.5, 70.0), arrayOf(192.0, 99.9), arrayOf(175.5, 63.2),
                arrayOf(171.2, 79.1), arrayOf(181.6, 78.9), arrayOf(167.4, 67.7), arrayOf(181.1, 66.0), arrayOf(177.0, 68.2),
                arrayOf(174.5, 63.9), arrayOf(177.5, 72.0), arrayOf(170.5, 56.8), arrayOf(182.4, 74.5), arrayOf(197.1, 90.9),
                arrayOf(180.1, 93.0), arrayOf(175.5, 80.9), arrayOf(180.6, 72.7), arrayOf(184.4, 68.0), arrayOf(175.5, 70.9),
                arrayOf(180.6, 72.5), arrayOf(177.0, 72.5), arrayOf(177.1, 83.4), arrayOf(181.6, 75.5), arrayOf(176.5, 73.0),
                arrayOf(175.0, 70.2), arrayOf(174.0, 73.4), arrayOf(165.1, 70.5), arrayOf(177.0, 68.9), arrayOf(192.0, 99.7),
                arrayOf(176.5, 68.4), arrayOf(169.4, 65.9), arrayOf(182.1, 75.7), arrayOf(179.8, 84.5), arrayOf(175.3, 87.7),
                arrayOf(184.9, 86.4), arrayOf(177.3, 73.2), arrayOf(167.4, 53.9), arrayOf(178.1, 72.0), arrayOf(168.9, 55.5),
                arrayOf(157.2, 58.4), arrayOf(180.3, 83.2), arrayOf(170.2, 72.7), arrayOf(177.8, 64.1), arrayOf(172.7, 72.3),
                arrayOf(165.1, 65.0), arrayOf(186.7, 86.4), arrayOf(165.1, 65.0), arrayOf(174.0, 88.6), arrayOf(175.3, 84.1),
                arrayOf(185.4, 66.8), arrayOf(177.8, 75.5), arrayOf(180.3, 93.2), arrayOf(180.3, 82.7), arrayOf(177.8, 58.0),
                arrayOf(177.8, 79.5), arrayOf(177.8, 78.6), arrayOf(177.8, 71.8), arrayOf(177.8, 88.8), arrayOf(163.8, 72.2),
                arrayOf(188.0, 83.6), arrayOf(198.1, 85.5), arrayOf(175.3, 90.9), arrayOf(166.4, 85.9), arrayOf(190.5, 89.1),
                arrayOf(166.4, 75.0), arrayOf(177.8, 77.7), arrayOf(179.7, 86.4), arrayOf(172.7, 90.9), arrayOf(190.5, 73.6),
                arrayOf(185.4, 76.4), arrayOf(168.9, 69.1), arrayOf(167.6, 84.5), arrayOf(175.3, 64.5), arrayOf(170.2, 69.1),
                arrayOf(190.5,108.6), arrayOf(177.8, 86.4), arrayOf(190.5, 80.9), arrayOf(177.8, 87.7), arrayOf(184.2, 94.5),
                arrayOf(176.5, 80.2), arrayOf(177.8, 72.0), arrayOf(180.3, 71.4), arrayOf(171.4, 72.7), arrayOf(172.7, 84.1),
                arrayOf(172.7, 76.8), arrayOf(177.8, 63.6), arrayOf(177.8, 80.9), arrayOf(182.9, 80.9), arrayOf(170.2, 85.5),
                arrayOf(167.6, 68.6), arrayOf(175.3, 67.7), arrayOf(165.1, 66.4), arrayOf(185.4, 77.7), arrayOf(181.6, 70.5),
                arrayOf(172.7, 95.9), arrayOf(190.5, 84.1), arrayOf(179.1, 87.3), arrayOf(175.3, 71.8), arrayOf(170.2, 65.9),
                arrayOf(193.0, 95.9), arrayOf(171.4, 91.4), arrayOf(177.8, 81.8), arrayOf(177.8, 96.8), arrayOf(167.6, 69.1),
                arrayOf(167.6, 82.7), arrayOf(180.3, 75.5), arrayOf(182.9, 79.5), arrayOf(176.5, 73.6), arrayOf(186.7, 91.8),
                arrayOf(188.0, 84.1), arrayOf(188.0, 85.9), arrayOf(177.8, 81.8), arrayOf(174.0, 82.5), arrayOf(177.8, 80.5),
                arrayOf(171.4, 70.0), arrayOf(185.4, 81.8), arrayOf(185.4, 84.1), arrayOf(188.0, 90.5), arrayOf(188.0, 91.4),
                arrayOf(182.9, 89.1), arrayOf(176.5, 85.0), arrayOf(175.3, 69.1), arrayOf(175.3, 73.6), arrayOf(188.0, 80.5),
                arrayOf(188.0, 82.7), arrayOf(175.3, 86.4), arrayOf(170.5, 67.7), arrayOf(179.1, 92.7), arrayOf(177.8, 93.6),
                arrayOf(175.3, 70.9), arrayOf(182.9, 75.0), arrayOf(170.8, 93.2), arrayOf(188.0, 93.2), arrayOf(180.3, 77.7),
                arrayOf(177.8, 61.4), arrayOf(185.4, 94.1), arrayOf(168.9, 75.0), arrayOf(185.4, 83.6), arrayOf(180.3, 85.5),
                arrayOf(174.0, 73.9), arrayOf(167.6, 66.8), arrayOf(182.9, 87.3), arrayOf(160.0, 72.3), arrayOf(180.3, 88.6),
                arrayOf(167.6, 75.5), arrayOf(186.7, 66.8), arrayOf(175.3, 91.1), arrayOf(175.3, 67.3), arrayOf(175.9, 77.7),
                arrayOf(175.3, 81.8), arrayOf(179.1, 75.5), arrayOf(181.6, 84.5), arrayOf(177.8, 76.6), arrayOf(182.9, 85.0),
                arrayOf(177.8, 81.8), arrayOf(184.2, 77.3), arrayOf(179.1, 71.8), arrayOf(176.5, 87.9), arrayOf(188.0, 94.3),
                arrayOf(174.0, 70.9), arrayOf(167.6, 64.5), arrayOf(170.2, 77.3), arrayOf(167.6, 72.3), arrayOf(188.0, 87.3),
                arrayOf(174.0, 80.0), arrayOf(176.5, 82.3), arrayOf(180.3, 73.6), arrayOf(167.6, 74.1), arrayOf(188.0, 85.9),
                arrayOf(180.3, 73.2), arrayOf(167.6, 76.3), arrayOf(183.0, 65.9), arrayOf(183.0, 90.9), arrayOf(179.1, 89.1),
                arrayOf(170.2, 62.3), arrayOf(177.8, 82.7), arrayOf(179.1, 79.1), arrayOf(190.5, 98.2), arrayOf(177.8, 84.1),
                arrayOf(180.3, 83.2), arrayOf(180.3, 83.2)));

        val seriesElements = arrayOf(elementOne,elementTwo)

        return  AAChartModel()
            .chartType(AAChartType.Scatter)
            .title("Height and weight distribution by sex")
            .yAxisTitle("kg")
            .markerRadius(8f)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .series(seriesElements)
    }

    fun  configureArearangeChart(): AAChartModel {
        return  AAChartModel()
            .chartType(AAChartType.Arearange)
            .title("Twilight Hall day temperature fluctuation map")
            .subtitle("real-time monitoring data")
            .yAxisTitle("℃")
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
                    .data(arrayOf(
                        /* 2014-01-01 */
                        arrayOf(138853800, 1.1,  4.7),
                        arrayOf(138862440, 1.8,  6.4),
                        arrayOf(138871080, 1.7,  6.9),
                        arrayOf(138879720, 2.6,  7.4),
                        arrayOf(138888360, 3.3,  9.3),
                        arrayOf(138897000, 3.0,  7.9),
                        arrayOf(138905640, 3.9,  6.0),
                        arrayOf(138914280, 3.9,  5.5),
                        arrayOf(138922920, -0.6, 4.5),
                        arrayOf(138931560, -0.5, 5.3),
                        arrayOf(138940200, -0.3, 2.4),
                        arrayOf(138948840, -6.5,-0.4),
                        arrayOf(138957480, -7.3,-3.4),
                        arrayOf(138966120, -7.3,-2.3),
                        arrayOf(138974760, -7.9,-4.2),
                        arrayOf(138983400, -4.7, 0.9),
                        arrayOf(138992040, -1.2, 0.4),
                        arrayOf(139000680, -2.3,-0.1),
                        arrayOf(139009320, -2.0, 0.3),
                        arrayOf(139017960, -5.1,-2.0),
                        arrayOf(139026600, -4.4,-0.5),
                        arrayOf(139035240, -6.4,-2.7),
                        arrayOf(139043880, -3.2,-0.5),
                        arrayOf(139052520, -5.5,-0.8),
                        arrayOf(139061160, -4.4, 2.4),
                        arrayOf(139069800, -4.0, 1.1),
                        arrayOf(139078440, -3.4, 0.8),
                        arrayOf(139087080, -1.7, 2.6),
                        arrayOf(139095720, -3.1, 3.9),
                        arrayOf(139104360, -8,  -1.9),
                        arrayOf(139113000, -7,  -2.8),
                        /* 2014-02-01 */
                        arrayOf(139121640, -2.7, 2.6),
                        arrayOf(139130280, -1.3, 8.2),
                        arrayOf(139138920, 1.5,  7.7),
                        arrayOf(139147560, -0.5, 5.3),
                        arrayOf(139156200, -0.2, 5.2),
                        arrayOf(139164840, 0.7,  4.8),
                        arrayOf(139173480, 0.9,  5.7),
                        arrayOf(139182120, 1.7,  3.9),
                        arrayOf(139190760, 2.2,  8.8),
                        arrayOf(139199400, 3.0,  6.6),
                        arrayOf(139208040, 1.4,  5.4),
                        arrayOf(139216680, 0.6,  5.1),
                        arrayOf(139225320, 0.1,  7.8),
                        arrayOf(139233960, 3.4,  7.3),
                        arrayOf(139242600, 2.0,  5.9),
                        arrayOf(139251240, 1.1,  4.7),
                        arrayOf(139259880, 1.1,  4.4),
                        arrayOf(139268520, -2.8, 2.6),
                        arrayOf(139277160, -5.0, 0.1),
                        arrayOf(139285800, -5.7, 0.2),
                        arrayOf(139294440, -0.7, 3.9),
                        arrayOf(139303080, 1.5,  7.8),
                        arrayOf(139311720, 5.5,  8.8),
                        arrayOf(139320360, 5.3, 11.7),
                        arrayOf(139329000, 1.7, 11.1),
                        arrayOf(139337640, 3.4,  9.3),
                        arrayOf(139346280, 3.4,  7.3),
                        arrayOf(139354920, 4.5,  8.0),
                        /* 2014-03-01 */
                        arrayOf(139363560, 2.1,  8.9),
                        arrayOf(139372200, 0.6,  6.1),
                        arrayOf(139380840, 1.2,  9.4),
                        arrayOf(139389480, 2.6,  7.3),
                        arrayOf(139398120, 3.9,  9.5),
                        arrayOf(139406760, 5.3,  9.9),
                        arrayOf(139415400, 2.7,  7.1),
                        arrayOf(139424040, 4.0,  8.6),
                        arrayOf(139432680, 6.1, 10.7),
                        arrayOf(139441320, 4.2,  7.6),
                        arrayOf(139449960, 2.5,  9.0),
                        arrayOf(139458600, 0.2,  7.0),
                        arrayOf(139467240, -1.2, 6.9),
                        arrayOf(139475880, 0.4,  6.7),
                        arrayOf(139484520, 0.2,  5.1),
                        arrayOf(139493160, -0.1, 6.0),
                        arrayOf(139501800, 1.0,  5.6),
                        arrayOf(139510440, -1.1, 6.3),
                        arrayOf(139519080, -1.9, 0.3),
                        arrayOf(139527720, 0.3,  4.5),
                        arrayOf(139536360, 2.4,  6.7),
                        arrayOf(139545000, 3.2,  9.2),
                        arrayOf(139553640, 1.7,  3.6),
                        arrayOf(139562280, -0.3, 7.9),
                        arrayOf(139570920, -2.4, 8.6),
                        arrayOf(139579560, -1.7,10.3),
                        arrayOf(139588200, 4.1, 10.0),
                        arrayOf(139596840, 4.4, 14.0),
                        arrayOf(139605480, 3.3, 11.0),
                        arrayOf(139614120, 3.0, 12.5),
                        arrayOf(139622400, 1.4, 10.4),
                        /* 2014-04-01 */
                        arrayOf(139631040, -1.2, 8.8),
                        arrayOf(139639680, 2.2,  7.6),
                        arrayOf(139648320, -1.0,10.1),
                        arrayOf(139656960, -1.8, 9.5),
                        arrayOf(139665600, 0.2,  7.7),
                        arrayOf(139674240, 3.7,  6.4),
                        arrayOf(139682880, 5.8, 11.4),
                        arrayOf(139691520, 5.4,  8.7),
                        arrayOf(139700160, 4.5, 12.2),
                        arrayOf(139708800, 3.9,  8.4),
                        arrayOf(139717440, 4.5,  8.0),
                        arrayOf(139726080, 6.6,  8.4),
                        arrayOf(139734720, 3.7,  7.3),
                        arrayOf(139743360, 3.6,  6.7),
                        arrayOf(139752000, 3.5,  8.3),
                        arrayOf(139760640, 1.5, 10.2),
                        arrayOf(139769280, 4.9,  9.4),
                        arrayOf(139777920, 3.5, 12.0),
                        arrayOf(139786560, 1.5, 13.1),
                        arrayOf(139795200, 1.7, 15.6),
                        arrayOf(139803840, 1.4, 16.0),
                        arrayOf(139812480, 3.0, 18.4),
                        arrayOf(139821120, 5.6, 18.8),
                        arrayOf(139829760, 5.7, 17.2),
                        arrayOf(139838400, 4.5, 16.4),
                        arrayOf(139847040, 3.1, 17.6),
                        arrayOf(139855680, 4.7, 18.9),
                        arrayOf(139864320, 4.9, 16.6),
                        arrayOf(139872960, 6.8, 15.6),
                        arrayOf(139881600, 2.8,  9.2),
                        /* 2014-05-01 */
                        arrayOf(139890240, -2.7,10.5),
                        arrayOf(139898880, -1.9,10.9),
                        arrayOf(139907520, 4.5,  8.5),
                        arrayOf(139916160, -0.6,10.4),
                        arrayOf(139924800, 4.0,  9.7),
                        arrayOf(139933440, 5.5,  9.5),
                        arrayOf(139942080, 6.5, 13.2),
                        arrayOf(139950720, 3.2, 14.5),
                        arrayOf(139959360, 2.1, 13.5),
                        arrayOf(139968000, 6.5, 15.6),
                        arrayOf(139976640, 5.7, 16.2),
                        arrayOf(139985280, 6.3, 15.3),
                        arrayOf(139993920, 5.3, 15.3),
                        arrayOf(140002560, 6.0, 14.1),
                        arrayOf(140011200, 1.9,  7.7),
                        arrayOf(140019840, 7.2,  9.8),
                        arrayOf(140028480, 8.9, 15.2),
                        arrayOf(140037120, 9.1, 20.5),
                        arrayOf(140045760, 8.4, 17.9),
                        arrayOf(140054400, 6.8, 21.5),
                        arrayOf(140063040, 7.6, 14.1),
                        arrayOf(140071680, 11.1,16.5),
                        arrayOf(140080320, 9.3, 14.3),
                        arrayOf(140088960, 10.4,19.3),
                        arrayOf(140097600, 5.7, 19.4),
                        arrayOf(140106240, 7.9, 17.9),
                        arrayOf(140114880, 5.0, 22.5),
                        arrayOf(140123520, 7.6, 22.0),
                        arrayOf(140132160, 5.7, 21.9),
                        arrayOf(140140800, 4.6, 20.0),
                        arrayOf(140149440, 7.0, 22.0),
                        /* 2014-06-01 */
                        arrayOf(140158080, 5.1, 20.6),
                        arrayOf(140166720, 6.6, 24.6),
                        arrayOf(140175360, 9.7, 22.2),
                        arrayOf(140184000, 9.6, 21.6),
                        arrayOf(140192640, 13.0,20.0),
                        arrayOf(140201280, 12.9,18.2),
                        arrayOf(140209920, 8.5, 23.2),
                        arrayOf(140218560, 9.2, 21.4),
                        arrayOf(140227200, 10.5,22.0),
                        arrayOf(140235840, 7.3, 23.4),
                        arrayOf(140244480, 12.1,18.2),
                        arrayOf(140253120, 11.1,13.3),
                        arrayOf(140261760, 10.0,20.7),
                        arrayOf(140270400, 5.8, 23.4),
                        arrayOf(140279040, 7.4, 20.1),
                        arrayOf(140287680, 10.3,21.9),
                        arrayOf(140296320, 7.8, 16.8),
                        arrayOf(140304960, 11.6,19.7),
                        arrayOf(140313600, 9.8, 16.0),
                        arrayOf(140322240, 10.7,14.4),
                        arrayOf(140330880, 9.0, 15.5),
                        arrayOf(140339520, 5.1, 13.3),
                        arrayOf(140348160, 10.0,19.3),
                        arrayOf(140356800, 5.2, 22.1),
                        arrayOf(140365440, 6.3, 21.3),
                        arrayOf(140374080, 5.5, 21.1),
                        arrayOf(140382720, 8.4, 19.7),
                        arrayOf(140391360, 7.1, 23.3),
                        arrayOf(140400000, 6.1, 20.8),
                        arrayOf(140408640, 8.4, 22.6),
                        /* 2014-07-01 */
                        arrayOf(140417280, 7.6, 23.3),
                        arrayOf(140425920, 8.1, 21.5),
                        arrayOf(140434560, 11.2,18.1),
                        arrayOf(140443200, 6.4, 14.9),
                        arrayOf(140451840, 12.7,23.1),
                        arrayOf(140460480, 15.3,21.7),
                        arrayOf(140469120, 15.1,19.4),
                        arrayOf(140477760, 10.8,22.8),
                        arrayOf(140486400, 15.8,29.7),
                        arrayOf(140495040, 15.8,29.0),
                        arrayOf(140503680, 15.2,30.5),
                        arrayOf(140512320, 14.9,28.1),
                        arrayOf(140520960, 13.1,27.4),
                        arrayOf(140529600, 15.5,23.5),
                        arrayOf(140538240, 14.7,20.1),
                        arrayOf(140546880, 14.4,16.8),
                        arrayOf(140555520, 12.6,18.5),
                        arrayOf(140564160, 13.9,24.4),
                        arrayOf(140572800, 11.3,26.9),
                        arrayOf(140581440, 13.3,27.4),
                        arrayOf(140590080, 13.3,29.7),
                        arrayOf(140598720, 14.0,28.8),
                        arrayOf(140607360, 14.1,29.8),
                        arrayOf(140616000, 15.4,31.1),
                        arrayOf(140624640, 17.0,26.5),
                        arrayOf(140633280, 16.6,27.1),
                        arrayOf(140641920, 13.3,25.6),
                        arrayOf(140650560, 16.8,21.9),
                        arrayOf(140659200, 16.0,22.8),
                        arrayOf(140667840, 14.4,19.0),
                        arrayOf(140676480, 12.8,18.1),
                        /* 2014-08-01 */
                        arrayOf(140685120, 12.6,18.0),
                        arrayOf(140693760, 11.4,19.7),
                        arrayOf(140702400, 13.9,18.9),
                        arrayOf(140711040, 12.5,19.9),
                        arrayOf(140719680, 12.3,23.4),
                        arrayOf(140728320, 12.8,23.3),
                        arrayOf(140736960, 11.0,20.4),
                        arrayOf(140745600, 14.7,22.4),
                        arrayOf(140754240, 11.1,23.6),
                        arrayOf(140762880, 13.5,20.7),
                        arrayOf(140771520, 13.7,23.1),
                        arrayOf(140780160, 12.8,19.6),
                        arrayOf(140788800, 12.1,18.7),
                        arrayOf(140797440, 8.8, 22.4),
                        arrayOf(140806080, 8.2, 20.1),
                        arrayOf(140814720, 10.9,16.3),
                        arrayOf(140823360, 10.7,16.1),
                        arrayOf(140832000, 11.0,18.9),
                        arrayOf(140840640, 12.1,14.7),
                        arrayOf(140849280, 11.2,14.4),
                        arrayOf(140857920, 9.9, 16.6),
                        arrayOf(140866560, 6.9, 15.7),
                        arrayOf(140875200, 8.9, 15.3),
                        arrayOf(140883840, 8.2, 17.6),
                        arrayOf(140892480, 8.4, 19.5),
                        arrayOf(140901120, 6.6, 19.9),
                        arrayOf(140909760, 6.4, 19.7),
                        arrayOf(140918400,null, null),
                        arrayOf(140927040,null, null),
                        arrayOf(140935680,null, null),
                        arrayOf(140944320,null, null),
                        /* 2014-09-01 */
                        arrayOf(140952960,null, null),
                        arrayOf(140961600,null, null),
                        arrayOf(140970240,null, null),
                        arrayOf(140978880,null, null),
                        arrayOf(140987520,null, null),
                        arrayOf(140996160, 13.4,13.4),
                        arrayOf(141004800, 13.2,17.1),
                        arrayOf(141013440, 11.9,18.9),
                        arrayOf(141022080, 9.0, 15.9),
                        arrayOf(141030720, 5.9, 17.5),
                        arrayOf(141039360, 6.8, 16.2),
                        arrayOf(141048000, 10.3,19.9),
                        arrayOf(141056640, 8.7, 17.9),
                        arrayOf(141065280, 7.9, 19.1),
                        arrayOf(141073920, 6.0, 20.1),
                        arrayOf(141082560, 4.7, 19.9),
                        arrayOf(141091200, 4.0, 18.8),
                        arrayOf(141099840, 4.5, 17.9),
                        arrayOf(141108480, 3.1, 16.1),
                        arrayOf(141117120, 8.5, 12.2),
                        arrayOf(141125760, 7.6, 13.8),
                        arrayOf(141134400, 1.3, 12.6),
                        arrayOf(141143040, 2.0, 10.9),
                        arrayOf(141151680, 5.0, 10.8),
                        arrayOf(141160320, 6.4, 10.1),
                        arrayOf(141168960, 8.2, 13.3),
                        arrayOf(141177600, 8.9, 11.8),
                        arrayOf(141186240, 9.9, 15.9),
                        arrayOf(141194880, 5.2, 12.5),
                        arrayOf(141203520, 4.6, 11.7),
                        /* 2014-10-01 */
                        arrayOf(141212160, 8.8, 12.1),
                        arrayOf(141220800, 3.9, 12.3),
                        arrayOf(141229440, 2.7, 18.1),
                        arrayOf(141238080, 10.2,18.2),
                        arrayOf(141246720, 9.6, 17.9),
                        arrayOf(141255360, 9.3, 17.5),
                        arrayOf(141264000, 8.1, 12.7),
                        arrayOf(141272640, 6.7, 11.2),
                        arrayOf(141281280, 4.0, 10.0),
                        arrayOf(141289920, 6.3, 10.2),
                        arrayOf(141298560, 6.6, 10.7),
                        arrayOf(141307200, 6.6, 10.3),
                        arrayOf(141315840, 5.9, 10.4),
                        arrayOf(141324480, 1.2, 10.6),
                        arrayOf(141333120, -0.1, 9.2),
                        arrayOf(141341760, -1.0, 9.4),
                        arrayOf(141350400, -1.7, 8.3),
                        arrayOf(141359040, -0.6, 7.5),
                        arrayOf(141367680, 6.9, 10.1),
                        arrayOf(141376320, 7.7, 10.5),
                        arrayOf(141384960, 3.8,  9.7),
                        arrayOf(141393600, 6.2,  8.6),
                        arrayOf(141402240, 6.5,  9.2),
                        arrayOf(141410880, 7.9, 10.7),
                        arrayOf(141419520, 6.1, 10.9),
                        arrayOf(141428160, 10.3,13.1),
                        arrayOf(141437160, 7.1, 13.3),
                        arrayOf(141445800, 0.0, 10.1),
                        arrayOf(141454440, 0.0,  5.7),
                        arrayOf(141463080, 3.9,  4.6),
                        arrayOf(141471720, 4.0,  4.8),
                        /* 2014-11-01 */
                        arrayOf(141480360, 4.8, 11.2),
                        arrayOf(141489000, 7.0,  8.5),
                        arrayOf(141497640, 3.0,  9.8),
                        arrayOf(141506280, 2.8,  5.9),
                        arrayOf(141514920, 0.8,  4.8),
                        arrayOf(141523560, -0.2, 2.9),
                        arrayOf(141532200, -0.6, 5.5),
                        arrayOf(141540840, 6.6, 10.3),
                        arrayOf(141549480, 5.4,  7.3),
                        arrayOf(141558120, 3.0,  8.4),
                        arrayOf(141566760, 0.4,  3.2),
                        arrayOf(141575400, -0.1, 6.8),
                        arrayOf(141584040, 4.8,  8.8),
                        arrayOf(141592680, 4.6,  8.5),
                        arrayOf(141601320, 4.3,  7.7),
                        arrayOf(141609960, 3.3,  7.5),
                        arrayOf(141618600, -0.4, 3.2),
                        arrayOf(141627240, 1.9,  4.7),
                        arrayOf(141635880, -0.2, 3.7),
                        arrayOf(141644520, -1.3, 2.1),
                        arrayOf(141653160, -1.8, 0.9),
                        arrayOf(141661800, -2.7, 1.3),
                        arrayOf(141670440, 0.3,  2.5),
                        arrayOf(141679080, 3.4,  6.5),
                        arrayOf(141687720, 0.8,  6.1),
                        arrayOf(141696360, -1.0, 1.3),
                        arrayOf(141705000, 0.4,  3.1),
                        arrayOf(141713640, -1.2, 1.9),
                        arrayOf(141722280, -1.1, 2.8),
                        arrayOf(141730920, -0.7, 1.8),
                        /* 2014-12-01 */
                        arrayOf(141739560, 0.5,  2.5),
                        arrayOf(141748200, 1.4,  3.2),
                        arrayOf(141756840, 4.5, 10.2),
                        arrayOf(141765480, 0.4, 10.0),
                        arrayOf(141774120, 2.5,  3.7),
                        arrayOf(141782760, 1.1,  5.0),
                        arrayOf(141791400, 2.0,  4.4),
                        arrayOf(141800040, 1.4,  2.2),
                        arrayOf(141808680, 0.7,  4.6),
                        arrayOf(141817320, 1.9,  3.9),
                        arrayOf(141825960, -0.2, 3.7),
                        arrayOf(141834600, -0.1, 1.7),
                        arrayOf(141843240, -1.0, 3.8),
                        arrayOf(141851880, 0.5,  5.4),
                        arrayOf(141860520, -1.7, 5.6),
                        arrayOf(141869160, 0.3,  2.8),
                        arrayOf(141877800, -3.0, 0.4),
                        arrayOf(141886440, -1.1, 1.5),
                        arrayOf(141895080, 0.8,  3.4),
                        arrayOf(141903720, 0.9,  4.4),
                        arrayOf(141912360, 0.3,  3.9),
                        arrayOf(141921000, 0.6,  5.3),
                        arrayOf(141929640, 1.5,  4.4),
                        arrayOf(141938280, 0,      0),
                        arrayOf(141946920, 0,      0),
                        arrayOf(141955560, 10.6,   4),
                        arrayOf(141964200, 10.8,   5),
                        arrayOf(141972840, 8.4,    4),
                        arrayOf(141981480, 5.2,  2.4),
                        arrayOf(141990120, 1.3,  2.5),
                        arrayOf(141998760, 1.6,  4.2)
                    ))

            ))

    }

    fun configureAreasplinerangeChart(): AAChartModel  {
        val gradientColorDic = "#ff0000"

        return AAChartModel()
            .chartType(AAChartType.Areasplinerange)
            .title("Area spline range chart")
            .subtitle("virtual data")
            .yAxisTitle("℃")
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
                    .color(gradientColorDic)//猩红色
                    .data(arrayOf(
                        /* 2014-06-01 */
                        arrayOf(140158080, 5.1,  20.6),
                        arrayOf(140166720, 6.6,  24.6),
                        arrayOf(140175360, 9.7,  22.2),
                        arrayOf(140184000, 9.6,  21.6),
                        arrayOf(140192640, 13.0, 20.0),
                        arrayOf(140201280, 12.9, 18.2),
                        arrayOf(140209920, 8.5,  23.2),
                        arrayOf(140218560, 9.2,  21.4),
                        arrayOf(140227200, 10.5, 22.0),
                        arrayOf(140235840, 7.3,  23.4),
                        arrayOf(140244480, 12.1, 18.2),
                        arrayOf(140253120, 11.1, 13.3),
                        arrayOf(140261760, 10.0, 20.7),
                        arrayOf(140270400, 5.8,  23.4),
                        arrayOf(140279040, 7.4,  20.1),
                        arrayOf(140287680, 10.3, 21.9),
                        arrayOf(140296320, 7.8,  16.8),
                        arrayOf(140304960, 11.6, 19.7),
                        arrayOf(140313600, 9.8,  16.0),
                        arrayOf(140322240, 10.7, 14.4),
                        arrayOf(140330880, 9.0,  15.5),
                        arrayOf(140339520, 5.1,  13.3),
                        arrayOf(140348160, 10.0, 19.3),
                        arrayOf(140356800, 5.2,  22.1),
                        arrayOf(140365440, 6.3,  21.3),
                        arrayOf(140374080, 5.5,  21.1),
                        arrayOf(140382720, 8.4,  19.7),
                        arrayOf(140391360, 7.1,  23.3),
                        arrayOf(140400000, 6.1,  20.8),
                        arrayOf(140408640, 8.4,  22.6)
                    )
                    )
            )
            )
    }

    fun configureColumnrangeChart(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Columnrange)
            .title("TEMPERATURE VARIATION BY MONTH")
            .subtitle("observed in Gotham city")
            .yAxisTitle("℃")
            .categories(arrayOf(
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
            )
            )
            .dataLabelsEnabled(true)
            .inverted(true)//x 轴是否垂直翻转
            .series(arrayOf(
                AASeriesElement()
                    .name("temperature")
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
                        arrayOf(-13.5, 9.8)
                    )
                    )
            )
            )
    }

    fun configureStepLineChart(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Line)//图形类型
            .animationType(AAChartAnimationType.Bounce)//图形渲染动画类型为"bounce"
            .title("STEP LINE CHART")//图形标题
            .subtitle("2020/08/08")//图形副标题
            .dataLabelsEnabled(false)//是否显示数字
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式
            .markerRadius(7f)//折线连接点半径长度,为0时相当于没有折线连接点
            .series(arrayOf(
                AASeriesElement()
                    .name("Berlin")
                    .data(arrayOf(450, 432, 401, 454, 590, 530, 510))
                    .step("right")//设置折线样式为直方折线,折线连接点位置靠右👉
                , AASeriesElement()
                    .name("New York")
                    .data(arrayOf(220, 282, 201, 234, 290, 430, 410))
                    .step("center")//设置折线样式为直方折线,折线连接点位置居中
                , AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(120, 132, 101, 134, 90, 230, 210))
                    .step("left")//设置折线样式为直方折线,折线连接点位置靠左👈
            )
            )
    }

    fun configureStepAreaChart(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Area)//图形类型
            .animationType(AAChartAnimationType.Bounce)//图形渲染动画类型为"bounce"
            .title("STEP AREA CHART")//图形标题
            .subtitle("2049/08/08")//图形副标题
            .dataLabelsEnabled(false)//是否显示数字
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)//折线连接点样式
            .markerRadius(0f)//折线连接点半径长度,为0时相当于没有折线连接点
            .series(arrayOf(
                AASeriesElement()
                    .name("Berlin")
                    .data(arrayOf(450, 432, 401, 454, 590, 530, 510))
                    .step(true)//设置折线样式为直方折线,折线连接点位置靠左👈
                , AASeriesElement()
                    .name("New York")
                    .data(arrayOf(220, 282, 201, 234, 290, 430, 410))
                    .step(true)//设置折线样式为直方折线,折线连接点位置靠左👈
                , AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(120, 132, 101, 134, 90, 230, 210))
                    .step(true)//设置折线样式为直方折线,折线连接点位置靠左👈
            )
            )
    }

    fun configureBoxplotChart(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Boxplot)
            .title("BOXPLOT CHART")
            .subtitle("virtual data")
            .yAxisTitle("℃")
            .series(arrayOf(
                AASeriesElement()
                    .name("Observed Data")
                    .color("#ef476f")
                    .fillColor(AAGradientColor.firebrickColor())
                    .data(arrayOf(
                        arrayOf(760, 801, 848, 895, 965),
                        arrayOf(733, 853, 939, 980,1080),
                        arrayOf(714, 762, 817, 870, 918),
                        arrayOf(724, 802, 806, 871, 950),
                        arrayOf(834, 836, 864, 882, 910)
                    )
                    )
            )
            )
    }

     fun configureWaterfallChart(): AAChartModel {
        val dataElement1 = HashMap<String, Any>()
        dataElement1["name"] = "启动资金"
        dataElement1["y"] = 120000

        val dataElement2 = HashMap<String, Any>()
        dataElement2["name"] = "产品收入"
        dataElement2["y"] = 569000

        val dataElement3 = HashMap<String, Any>()
        dataElement3["name"] = "服务收入"
        dataElement3["y"] = 231000

        val dataElement4 = HashMap<String, Any>()
        dataElement4["name"] = "正平衡"
        dataElement4["isIntermediateSum"] = true
        dataElement4["color"] = "#ffd066"

        val dataElement5 = HashMap<String, Any>()
        dataElement5["name"] = "固定成本"
        dataElement5["y"] = -342000

        val dataElement6 = HashMap<String, Any>()
        dataElement6["name"] = "可变成本"
        dataElement6["y"] = -233000

        val dataElement7 = HashMap<String, Any>()
        dataElement7["name"] = "余额"
        dataElement7["isSum"] = true
        dataElement7["color"] = "#04d69f"

        val seriesElement = AAWaterfall()
            .upColor("#9b43b4")
            .color("#ef476f")
            .borderWidth(0f)
            .data(arrayOf(
                    dataElement1,
                    dataElement2,
                    dataElement3,
                    dataElement4,
                    dataElement5,
                    dataElement6,
                    dataElement7
                )
            )

        return AAChartModel()
            .chartType(AAChartType.Waterfall)
            .title("WATERFALL CHART")
            .subtitle("virtual data")
//            .series(arrayOf(seriesElement))
    }
    fun configurePyramidChart(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Pyramid)
            .title("THE HEAT OF PROGRAM LANGUAGE")
            .subtitle("virtual data")
            .yAxisTitle("℃")
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
                    .data(arrayOf(
                        arrayOf("Swift",       11850),
                        arrayOf("Objective-C", 12379),
                        arrayOf("JavaScript",  14286),
                        arrayOf("Go",          15552),
                        arrayOf("Python",      18654)
                    )
                    )
            )
            )
    }

    fun configureFunnelChart(): AAChartModel  {
        return AAChartModel()
            .chartType(AAChartType.Funnel)
            .title("THE HEAT OF PROGRAM LANGUAGE")
            .subtitle("virtual data")
            .yAxisTitle("℉")
            .series(arrayOf(
                AASeriesElement()
                    .name("2020")
                    .data(arrayOf(
                        arrayOf("Swift",       11850),
                        arrayOf("Objective-C", 12379),
                        arrayOf("JavaScript",  14286),
                        arrayOf("Go",          15552),
                        arrayOf("Python",      18654))
                    )
            )
            )
    }

}
