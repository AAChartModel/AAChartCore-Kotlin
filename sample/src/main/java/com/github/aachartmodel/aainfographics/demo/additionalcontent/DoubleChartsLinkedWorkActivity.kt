package com.github.aachartmodel.aainfographics.demo.additionalcontent

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
import com.github.aachartmodel.aainfographics.aatools.AAColor
import com.github.aachartmodel.aainfographics.aatools.AAGradientColor
import com.github.aachartmodel.aainfographics.demo.R

class DoubleChartsLinkedWorkActivity : AppCompatActivity(),
    AAChartView.AAChartViewCallBack {
    private var selectedGradientColor: Any = AAColor.Red
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

        val gradientColorArr = arrayOf(
                AAGradientColor.OceanBlue,
                AAGradientColor.Sanguine,
                AAGradientColor.LusciousLime,
                AAGradientColor.PurpleLake,
                AAGradientColor.FreshPapaya,
                AAGradientColor.Ultramarine,
                AAGradientColor.PinkSugar,
                AAGradientColor.LemonDrizzle,
                AAGradientColor.VictoriaPurple,
                AAGradientColor.SpringGreens,
                AAGradientColor.MysticMauve,
                AAGradientColor.ReflexSilver,
                AAGradientColor.NewLeaf,
                AAGradientColor.CottonCandy,
                AAGradientColor.PixieDust,
                AAGradientColor.FizzyPeach,
                AAGradientColor.SweetDream,
                AAGradientColor.Firebrick,
                AAGradientColor.WroughtIron,
                AAGradientColor.DeepSea,
                AAGradientColor.CoastalBreeze,
                AAGradientColor.EveningDelight,
                AAGradientColor.NeonGlow,
                AAGradientColor.BerrySmoothie
        )
        gradientColorsArr = gradientColorArr as Array<Any>
        val aaChartModel: AAChartModel = AAChartModel.Builder(this)
            .setChartType(AAChartType.Column)
            .setTitle("")
            .setYAxisTitle("")
            .setCategories(*gradientColorNamesArr)
            .setColorsTheme(gradientColorArr)
            .setXAxisReversed(true)
            .setYAxisReversed(true)
            .setInverted(true)
            .setLegendEnabled(false)
            .setTouchEventEnabled(true)
            .setSeries(
                    AASeriesElement()
                        .name("Tokyo")
                        .data(arrayOf(
                                211, 183, 157, 133, 111, 91, 73, 57, 43, 31, 21, 13,
                                211, 183, 157, 133, 111, 91, 73, 57, 43, 31, 21, 13
                            ))
                        .colorByPoint(true)).build()
        val aaOptions: AAOptions = aaChartModel.aa_toAAOptions()
        aaOptions.plotOptions?.column?.groupPadding = 0f
        return aaOptions
    }

    private fun configureChartOptions2(): AAOptions {
        val aaChartModel: AAChartModel = AAChartModel.Builder(this)
            .setChartType(AAChartType.Column)
            .setTitle("")
            .setYAxisTitle("")
            .setLegendEnabled(false)
            .setYAxisGridLineWidth(0f)
            .setSeries(
                    AASeriesElement()
                        .name("Tokyo")
                        .data(arrayOf(
                                211,183,157,133,111,91,73,57,43,31,21,13,
                                211,183,157,133,111,91,73,57,43,31,21,13,
                            ))
            ).build()
        val aaOptions: AAOptions = aaChartModel.aa_toAAOptions()
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
        }
    }
}