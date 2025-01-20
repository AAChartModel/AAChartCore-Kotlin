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
package com.github.aachartmodel.aainfographics.demo.basiccontent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.aachartcreator.AAClickEventMessageModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAMoveOverEventMessageModel
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.SpecialChartComposer
import com.google.gson.Gson
import com.google.gson.GsonBuilder

class SpecialChartActivity : AppCompatActivity(),
    AAChartView.AAChartViewCallBack {

//    private var aaChartModel: AAChartModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_special_chart)

        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        val aaChartModel = configureChartModelWithChartType(chartType!!)
        aaChartModel.clickEventEnabled(true)
            .touchEventEnabled(true)

        val aaChartView: AAChartView = findViewById(R.id.AAChartView)
        aaChartView.callBack = this
        aaChartView.aa_drawChartWithChartModel(aaChartModel)
    }

    private fun configureChartModelWithChartType(chartType: String): AAChartModel {
        when (chartType) {
            AAChartType.Column.value -> return SpecialChartComposer.configurePolarColumnChart()
            AAChartType.Bar.value -> return SpecialChartComposer.configurePolarBarChart()
            AAChartType.Line.value -> return SpecialChartComposer.configurePolarLineChart()
            AAChartType.Area.value -> return SpecialChartComposer.configurePolarAreaChart()
            AAChartType.Pie.value -> return SpecialChartComposer.configurePieChart()
            AAChartType.Bubble.value -> return SpecialChartComposer.configureBubbleChart()
            AAChartType.Scatter.value -> return SpecialChartComposer.configureScatterChart()
            AAChartType.Arearange.value -> return SpecialChartComposer.configureArearangeChart()
            AAChartType.Areasplinerange.value -> return SpecialChartComposer.configureAreasplinerangeChart()
            AAChartType.Columnrange.value -> return SpecialChartComposer.configureColumnrangeChart()
            AAChartType.Spline.value -> return SpecialChartComposer.configureStepLineChart()
            AAChartType.Areaspline.value -> return SpecialChartComposer.configureStepAreaChart()
            AAChartType.Boxplot.value -> return SpecialChartComposer.configureBoxplotChart()
            AAChartType.Waterfall.value -> return SpecialChartComposer.configureWaterfallChart()
            AAChartType.Pyramid.value -> return SpecialChartComposer.configurePyramidChart()
            AAChartType.Funnel.value -> return SpecialChartComposer.configureFunnelChart()
            AAChartType.Errorbar.value -> return SpecialChartComposer.configureErrorbarChart()
            AAChartType.Gauge.value -> return SpecialChartComposer.configureGaugeChart()
            AAChartType.Polygon.value -> return SpecialChartComposer.configurePolygonChart()
        }

        return SpecialChartComposer.configurePolarColumnChart()

    }

    override fun chartViewDidFinishLoad(aaChartView: AAChartView) {
        //do nothing
    }

    override fun chartViewClickEventMessage(
        aaChartView: AAChartView,
        clickEventMessage: AAClickEventMessageModel
    ) {
        val gson = GsonBuilder().setPrettyPrinting().create()
        val clickEventMessageModelJson = gson.toJson(clickEventMessage)

        // 打印点击事件信息
        println("🖱🖱🖱获取点击事件 clickMessageModel = $clickEventMessageModelJson")
    }


    override fun chartViewMoveOverEventMessage(
        aaChartView: AAChartView,
        messageModel: AAMoveOverEventMessageModel
    ) {
        //do nothing
    }


}
