package com.aachartmodel.aainfographics.ChartsDemo.AdditionalContent

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v7.app.AppCompatActivity
import com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.*
import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAOptions
import com.aachartmodel.aainfographics.R


class DoubleChartsLinkedWorkActivity : AppCompatActivity(),
    AAChartView.AAChartViewCallBack {
    private var selectedGradientColor: Any = AAColor.redColor()
    private var aaChartView1: AAChartView? = null
    private var aaChartView2: AAChartView? = null
    private var gradientColorsArr: Array<Any>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_double_charts_linked_work)
        aaChartView1 = findViewById(R.id.AAChartView1)
        aaChartView1?.callBack = this
        aaChartView2 = findViewById(R.id.AAChartView2)
        aaChartView1?.aa_drawChartWithChartOptions(configureChartOptions1())
        aaChartView2?.aa_drawChartWithChartOptions(configureChartOptions2())
    }

    private fun configureChartOptions1(): AAOptions {
        val gradientColorNamesArr = arrayOf(
            "oceanBlue",
            "sanguine",
            "lusciousLime",
            "purpleLake",
            "freshPapaya",
            "ultramarine",
            "pinkSugar",
            "lemonDrizzle",
            "victoriaPurple",
            "springGreens",
            "mysticMauve",
            "reflexSilver",
            "neonGlowColor",
            "berrySmoothieColor",
            "newLeaf",
            "cottonCandy",
            "pixieDust",
            "fizzyPeach",
            "sweetDream",
            "firebrick",
            "wroughtIron",
            "deepSea",
            "coastalBreeze",
            "eveningDelight",
            "neonGlowColor",
            "berrySmoothieColor"
        )
        val gradientColorArr =
            arrayOf<Map<*, *>>(
                AAGradientColor.oceanBlueColor(),
                AAGradientColor.sanguineColor(),
                AAGradientColor.lusciousLimeColor(),
                AAGradientColor.purpleLakeColor(),
                AAGradientColor.freshPapayaColor(),
                AAGradientColor.ultramarineColor(),
                AAGradientColor.pinkSugarColor(),
                AAGradientColor.lemonDrizzleColor(),
                AAGradientColor.victoriaPurpleColor(),
                AAGradientColor.springGreensColor(),
                AAGradientColor.mysticMauveColor(),
                AAGradientColor.reflexSilverColor(),
                AAGradientColor.neonGlowColor(),
                AAGradientColor.berrySmoothieColor(),
                AAGradientColor.newLeafColor(),
                AAGradientColor.cottonCandyColor(),
                AAGradientColor.pixieDustColor(),
                AAGradientColor.fizzyPeachColor(),
                AAGradientColor.sweetDreamColor(),
                AAGradientColor.firebrickColor(),
                AAGradientColor.wroughtIronColor(),
                AAGradientColor.deepSeaColor(),
                AAGradientColor.coastalBreezeColor(),
                AAGradientColor.eveningDelightColor(),
                AAGradientColor.neonGlowColor(),
                AAGradientColor.berrySmoothieColor()
            )
        gradientColorsArr = gradientColorArr as Array<Any>
        val aaChartModel: AAChartModel = AAChartModel()
            .chartType(AAChartType.Column)
            .title("")
            .yAxisTitle("")
            .categories(gradientColorNamesArr)
            .colorsTheme(gradientColorArr as Array<Any> )
            .xAxisReversed(true)
            .yAxisReversed(true)
            .inverted(true)
            .legendEnabled(false)
            .touchEventEnabled(true)
            .series(arrayOf(
                    AASeriesElement()
                        .name("Tokyo")
                        .data(arrayOf(
                                211, 183, 157, 133, 111, 91, 73, 57, 43, 31, 21, 13,
                                211, 183, 157, 133, 111, 91, 73, 57, 43, 31, 21, 13
                            )
                        )
                        .colorByPoint(true)
                )
            )
        val aaOptions: AAOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
        aaOptions.plotOptions?.column?.groupPadding = 0f
        return aaOptions
    }

    private fun configureChartOptions2(): AAOptions {
        val aaChartModel: AAChartModel = AAChartModel()
            .chartType(AAChartType.Column)
            .title("")
            .yAxisTitle("")
            .legendEnabled(false)
            .yAxisGridLineWidth(0f)
            .series(arrayOf(
                    AASeriesElement()
                        .name("Tokyo")
                        .data(arrayOf(
                            149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4,
                            149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4
                            )
                        )
                )
            )
        val aaOptions: AAOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
        aaOptions.plotOptions?.column?.groupPadding = 0f
        return aaOptions
    }

    private fun configureSeriesDataArray(): Array<AADataElement> {
        val maxRange = 40
        val numberArr1: Array<AADataElement?> = arrayOfNulls(maxRange)
        var y1: Double
        val max = 38
        val min = 1
        val random = (Math.random() * (max - min) + min).toInt()
        for (i in 0 until maxRange) {
            y1 = Math.sin(random * (i * Math.PI / 180)) + i * 2 * 0.01
            val aaDataElement: AADataElement = AADataElement()
                .color(selectedGradientColor)
                .y(y1.toFloat())
            numberArr1[i] = aaDataElement
        }
        return numberArr1 as Array<AADataElement>
    }

    override fun chartViewDidFinishLoad(aaChartView: AAChartView) {

    }

    override fun chartViewMoveOverEventMessage(
        aaChartView: AAChartView,
        messageModel: AAMoveOverEventMessageModel
    ) {
        selectedGradientColor = gradientColorsArr?.get(messageModel.index!!)!!

        val mainHandler = Handler(Looper.getMainLooper())
        mainHandler.post {
            //已在主线程中，可以更新UI
            val aaSeriesElementsArr: Array<AASeriesElement> = arrayOf<AASeriesElement>(
                AASeriesElement()
                    .data(configureSeriesDataArray() as Array<Any>)
            )
            aaChartView2?.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(
                aaSeriesElementsArr
            )
        }    }
}