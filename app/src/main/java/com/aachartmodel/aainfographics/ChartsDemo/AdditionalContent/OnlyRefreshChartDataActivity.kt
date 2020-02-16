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
package com.aachartmodel.aainfographics.ChartsDemo.AdditionalContent

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.*
import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAOptions
import com.aachartmodel.aainfographics.R
import kotlin.math.cos
import kotlin.math.sin


class OnlyRefreshChartDataActivity : AppCompatActivity() {
    private var aaChartModel = AAChartModel()
    private var aaChartView: AAChartView? = null
    private var updateTimes: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_only_refresh_chart_data)

        setUpAAChartView()
        repeatUpdateChartData()
    }


    fun setUpAAChartView() {
        aaChartView = findViewById(R.id.AAChartView)
        aaChartModel = configureAAChartModel()
        val aaOptions: AAOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
        if (aaChartModel.chartType == AAChartType.Column) {
            aaOptions.plotOptions?.column!!
                .groupPadding(0f)
                .pointPadding(0f)
                .borderRadius(5f)
        } else if (aaChartModel.chartType == AAChartType.Bar) {
            aaOptions.plotOptions?.bar!!
                .groupPadding(0f)
                .pointPadding(0f)
                .borderRadius(5f)
        }
        aaChartView?.aa_drawChartWithChartOptions(aaOptions)
    }

    private fun configureAAChartModel(): AAChartModel {
        val aaChartModel = configureChartBasicContent()
        aaChartModel.series(this.configureChartSeriesArray())
        return aaChartModel
    }

    private fun configureChartBasicContent(): AAChartModel {
        val intent = intent
        val chartType = intent.getStringExtra("chartType")
        return AAChartModel()
            .chartType(convertStringToEnum(chartType))
            .xAxisVisible(true)
            .yAxisVisible(false)
            .title("")
            .yAxisTitle("摄氏度")
            .colorsTheme(arrayOf(
                AAGradientColor.sanguineColor(),
                AAGradientColor.deepSeaColor(),
                AAGradientColor.neonGlowColor(),
                AAGradientColor.wroughtIronColor()))
            .stacking(AAChartStackingType.Normal)
    }

    private fun convertStringToEnum(chartTypeStr: String): AAChartType {
        var chartTypeEnum = AAChartType.Column
        when (chartTypeStr) {
            AAChartType.Column.value -> chartTypeEnum = AAChartType.Column
            AAChartType.Bar.value -> chartTypeEnum = AAChartType.Bar
            AAChartType.Area.value -> chartTypeEnum = AAChartType.Area
            AAChartType.Areaspline.value -> chartTypeEnum = AAChartType.Areaspline
            AAChartType.Line.value -> chartTypeEnum = AAChartType.Line
            AAChartType.Spline.value -> chartTypeEnum = AAChartType.Spline
            AAChartType.Scatter.value -> chartTypeEnum = AAChartType.Scatter
        }
        return chartTypeEnum
    }

    @Suppress("UNCHECKED_CAST")
    private fun configureChartSeriesArray(): Array<AASeriesElement> {
        val maxRange = 40
        val numberArr1 = arrayOfNulls<Any>(maxRange)
        val numberArr2 = arrayOfNulls<Any>(maxRange)
        var y1: Double
        var y2: Double
        val max = 38
        val min = 1
        val random = (Math.random() * (max - min) + min).toInt()
        for (i in 0 until maxRange) {
            y1 = sin(random * (i * Math.PI / 180)) + i * 2 * 0.01
            y2 = cos(random * (i * Math.PI / 180)) + i * 3 * 0.01
            numberArr1[i] = y1
            numberArr2[i] = y2
        }
        return arrayOf(
            AASeriesElement()
                .name("2017")
                .data(numberArr1 as Array<Any>),
            AASeriesElement()
                .name("2018")
                .data(numberArr2 as Array<Any>),
            AASeriesElement()
                .name("2019")
                .data(numberArr1 as Array<Any>),
            AASeriesElement()
                .name("2020")
                .data(numberArr2 as Array<Any>)
        )
    }

    private fun  repeatUpdateChartData() {
        val mStartVideoHandler = Handler()

        val mStartVideoRunnable: Runnable = object: Runnable {

            override fun run() {
                val seriesArr = configureChartSeriesArray()
                aaChartView!!.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(seriesArr)

                mStartVideoHandler.postDelayed(this,1000)
                updateTimes += 1

                print("图表数据正在刷新,刷新次数为:$updateTimes")
            }
        }

        mStartVideoHandler.postDelayed(mStartVideoRunnable,2000)
    }



}
