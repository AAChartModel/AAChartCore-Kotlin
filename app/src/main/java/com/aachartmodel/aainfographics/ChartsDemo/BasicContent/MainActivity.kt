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
package com.aachartmodel.aainfographics

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import com.aachartmodel.aainfographics.ChartsDemo.AdditionalContent.CustomTooltipWithJSFunctionActivity
import com.aachartmodel.aainfographics.ChartsDemo.AdditionalContent.DrawChartWithAAOptionsActivity
import com.aachartmodel.aainfographics.ChartsDemo.AdditionalContent.HideOrShowChartSeriesActivity
import com.aachartmodel.aainfographics.ChartsDemo.BasicContent.CommonChartActivity
import com.aachartmodel.aainfographics.ChartsDemo.BasicContent.CustomStyleChartActivity
import com.aachartmodel.aainfographics.ChartsDemo.BasicContent.MixedChartActivity
import com.aachartmodel.aainfographics.ChartsDemo.BasicContent.SpecialChartActivity
import com.example.chartcorekotlin.AAChartConfiger.*

class MainActivity : AppCompatActivity() {

    private val data = arrayOf(
        /*基础类型图表*/
        "/*基础类型图表*/Column Chart---柱形图--------------",
        "Bar Chart---条形图",
        "Area Chart---折线填充图",
        "Areaspline Chart---曲线填充图",
        "Step Area Chart--- 直方折线填充图",
        "Step Line Chart--- 直方折线图",
        "Line Chart---折线图",
        "Spline Chart---曲线图",
        /*特殊类型图表*/
        "/*特殊类型图表*/Polar Chart---极地图图-------------",
        "Pie Chart---扇形图",
        "Bubble Chart---气泡图",
        "Scatter Chart---散点图",
        "Arearange Chart---区域范围图",
        "Columnrange Chart--- 柱形范围图",
        "Step Line Chart--- 直方折线图",
        "Step Area Chart--- 直方折线填充图",
        "Boxplot Chart--- 箱线图",
        "Waterfall Chart--- 瀑布图",
        "Pyramid Chart---金字塔图",
        "Funnel Chart---漏斗图",
        /*Mixed Chart---混合图*/
        "/*Mixed Chart---混合图*/arearangeMixedLine-----------------",
        "columnrangeMixedLine",
        "stackingColumnMixedLine",
        "dashStyleTypeMixed",
        "negativeColorMixed",
        "scatterMixedLine",
        "negativeColorMixedBubble",
        "polygonMixedScatter",
        "polarChartMixed",
        /*自定义样式图表*/
        "/*自定义样式图表*/colorfulChart-----------------",
        "gradientColorfulChart",
        "discontinuousDataChart",
        "colorfulColumnChart",
        "nightingaleRoseChart",
        "chartWithShadowStyle",
        "colorfulGradientAreaChart",
        "colorfulGradientSplineChart",
        "gradientColorAreasplineChart",
        /*使用AAOptions绘制图表*/
        "/*使用AAOptions绘制图表*/drawChartWithOptionsOne-----------------",
        "configureAAPlotLinesForChart",
        "customAATooltipWithJSFuntion",
        "customXAxisCrosshairStyle",
        /*隐藏或显示内容*/
        "/*隐藏或显示内容*/Column Chart---柱形图--------------",
        "Bar Chart---条形图",
        "Area Chart---折线填充图",
        "Areaspline Chart---曲线填充图",
        "Step Area Chart--- 直方折线填充图",
        "Step Line Chart--- 直方折线图",
        "Line Chart---折线图",
        "Spline Chart---曲线图",
        "/*使用JavaScript函数自定义内容*/简单字符串拼接--------------------------------",
        "自定义不同单位后缀",
        "值为0时,在tooltip中不显示",
        "自定义多彩颜色文字",
        "自定义箱线图的浮动提示框头部内容"
    )

    private var chartTypeArr = arrayOf(
        /*基础类型图表*/
        AAChartType.Column.toString(),
        AAChartType.Bar.toString(),
        AAChartType.Area.toString(),
        AAChartType.Areaspline.toString(),
        AAChartType.Area.toString(),
        AAChartType.Line.toString(),
        AAChartType.Line.toString(),
        AAChartType.Spline.toString(),
        /*特殊类型图表*/
        AAChartType.Column.toString(),
        AAChartType.Pie.toString(),
        AAChartType.Bubble.toString(),
        AAChartType.Scatter.toString(),
        AAChartType.Arearange.toString(),
        AAChartType.Columnrange.toString(),
        AAChartType.Line.toString(),
        AAChartType.Area.toString(),
        AAChartType.Boxplot.toString(),
        AAChartType.Waterfall.toString(),
        AAChartType.Pyramid.toString(),
        AAChartType.Funnel.toString(),

        /*Mixed Chart---混合图*/
        "arearangeMixedLine",
        "columnrangeMixedLine",
        "stackingColumnMixedLine",
        "dashStyleTypeMixed",
        "negativeColorMixed",
        "scatterMixedLine",
        "negativeColorMixedBubble",
        "polygonMixedScatter",
        "polarChartMixed",
        /*自定义样式图表*/
        "colorfulChart",
        "gradientColorfulChart",
        "discontinuousDataChart",
        "colorfulColumnChart",
        "nightingaleRoseChart",
        "chartWithShadowStyle",
        "colorfulGradientAreaChart",
        "colorfulGradientSplineChart",
        "gradientColorAreasplineChart",
        /*使用AAOptions绘制图表*/
        "configureAAPlotBandsForChart",
        "configureAAPlotLinesForChart",
        "customAATooltipWithJSFuntion",
        "customXAxisCrosshairStyle",
        /*隐藏或显示内容*/
        AAChartType.Column.toString(),
        AAChartType.Bar.toString(),
        AAChartType.Area.toString(),
        AAChartType.Areaspline.toString(),
        AAChartType.Area.toString(),
        AAChartType.Line.toString(),
        AAChartType.Line.toString(),
        AAChartType.Spline.toString(),
        "formatterFunction1",
        "formatterFunction2",
        "formatterFunction3",
        "formatterFunction4",
        "formatterFunction5"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(
            this@MainActivity, android.R.layout.simple_list_item_1, data
        )
        val listView = findViewById<View>(R.id.list) as ListView
        listView.adapter = adapter


        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            println(position)
            when {
                position <= 7 -> goToCommonChartActivity(position)
                position in 8..19 -> goToSpecialChartActivity(position)
                position in 20..28 -> goToMixedChartActivity(position)
                position in 29..37 -> goToCustomStyleChartActivity(position)
                position in 38..41 -> goToDrawChartWithAAOptionsActivity(position)
                position in 42..49 -> goToHideOrShowChartSeriesActivity(position)
                position > 49 -> goToCustomTooltipWithJSFunctionActivity(position)
            }
        }
    }

    private fun goToCommonChartActivity(position: Int) {
        val intent = Intent(this, CommonChartActivity::class.java)
        intent.putExtra("chartType", chartTypeArr[position])
        intent.putExtra("position", position)

        startActivity(intent)
    }

    private fun goToSpecialChartActivity(position: Int) {
        val intent = Intent(this, SpecialChartActivity::class.java)
        intent.putExtra("chartType", chartTypeArr[position])

        startActivity(intent)
    }

    private fun goToCustomStyleChartActivity(position: Int) {
        val intent = Intent(this, CustomStyleChartActivity::class.java)
        intent.putExtra("chartType", chartTypeArr[position])

        startActivity(intent)
    }

    private fun goToMixedChartActivity(position: Int) {
        val intent = Intent(this, MixedChartActivity::class.java)
        intent.putExtra("chartType", chartTypeArr[position])

        startActivity(intent)
    }

    private fun goToDrawChartWithAAOptionsActivity(position: Int) {
        val intent = Intent(this, DrawChartWithAAOptionsActivity::class.java)
        intent.putExtra("chartType", chartTypeArr[position])

        startActivity(intent)
    }

    private fun goToHideOrShowChartSeriesActivity(position: Int) {
        val intent = Intent(this, HideOrShowChartSeriesActivity::class.java)
        intent.putExtra("chartType", chartTypeArr[position])

        startActivity(intent)
    }

    private fun goToCustomTooltipWithJSFunctionActivity(position: Int) {
        val intent = Intent(this, CustomTooltipWithJSFunctionActivity::class.java)
        intent.putExtra("chartType", chartTypeArr[position])

        startActivity(intent)
    }


}



