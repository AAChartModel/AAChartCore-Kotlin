package com.github.aachartmodel.aainfographics.demo.additionalcontent

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AALabels
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle
import com.github.aachartmodel.aainfographics.aatools.AAColor
import com.github.aachartmodel.aainfographics.aatools.AAGradientColor
import com.github.aachartmodel.aainfographics.demo.R
import kotlin.math.sin

class DoubleChartsLinkedWorkActivity : AppCompatActivity(),
    AAChartView.AAChartViewCallBack {
    private var selectedGradientColor: Any = AAColor.Red
    private var aaChartView1: AAChartView? = null
    private var aaChartView2: AAChartView? = null
    private var gradientColorNamesArr: Array<String> = arrayOf(
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

    private var gradientColorsArr: Array<Any> = arrayOf(
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

    private var selectedColorName: String? = null
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
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Column)
            .dataLabelsEnabled(false)
            .categories(gradientColorNamesArr)
            .borderRadius(4f)
            .legendEnabled(false)
            .colorsTheme(gradientColorsArr)
            .clickEventEnabled(true)
            .touchEventEnabled(true)
            .yAxisTitle("Random Number")
            .yAxisMax(210)
            .series(arrayOf(
                AASeriesElement()
                    .name("")
                    .data(arrayOf(149.9, 154, 106.4, 129.2, 144.0, 154, 135.6, 154, 154, 154, 95.6, 54.4))
                    .colorByPoint(true)
                    .borderWidth(2f)
                    .dataLabels(AADataLabels()
                        .enabled(true)
                        .verticalAlign(AAChartVerticalAlignType.Middle)
                        .x(0f)
                        .y(-10f)
                        .style(AAStyle()
                            .color(AAColor.Red)
                            .fontSize(12f)
                            .fontWeight(AAChartFontWeightType.Thin))
                    )
            ))

        val aaOptions = aaChartModel.aa_toAAOptions()

        val aaLabels = AALabels()
            .autoRotation(false)
            .style(AAStyle().fontSize(12).color("#999999"))  //坐标轴上文字颜色

        aaOptions.xAxis?.apply {
            labels(aaLabels)
                .lineColor("#EEEEEE")
                .lineWidth(0.5)
        }
        aaOptions.yAxis?.apply {
            minorGridLineColor("#EEEEEE")
                .minorGridLineWidth(0.5)
                .labels(aaLabels)
                .startOnTick(false)
                .endOnTick(false)
        }
        return aaOptions
    }

    private fun configureChartOptions2(): AAOptions {
        val aaChartModel: AAChartModel = AAChartModel.Builder(this)
            .setChartType(AAChartType.Column)
            .setTitle("")
            .setYAxisTitle("")
            .setLegendEnabled(false)
            .setYAxisGridLineWidth(0f)
            .setSeries(AASeriesElement()
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
            y1 = sin(random * (i * Math.PI / 180)) + i * 2 * 0.01
            val aaDataElement: AADataElement = AADataElement()
                .color(selectedGradientColor)
                .y(y1.toFloat())
            numberArr1[i] = aaDataElement
        }
        return numberArr1 as Array<AADataElement>
    }

    private fun configureXAxisCategoresDataArray(): Array<String> {
        val randomNumArrA = ArrayList<String>()
        for (x in 0 until 40) {
            val prefixStr = "${selectedColorName}$x"
            randomNumArrA.add(prefixStr)
        }
        return randomNumArrA.toTypedArray()
    }

    override fun chartViewDidFinishLoad(aaChartView: AAChartView) {

    }

    override fun chartViewClickEventMessage(
        aaChartView: AAChartView,
        clickEventMessage: AAClickEventMessageModel
    ) {
        //打印点击事件信息
        println("🖱🖱🖱获取点击事件 clickMessageModel = $clickEventMessage")

        selectedGradientColor = gradientColorsArr[clickEventMessage.index!!]
        selectedColorName = gradientColorNamesArr[clickEventMessage.index!!]

        val mainHandler = Handler(Looper.getMainLooper())
        mainHandler.post {
            //已在主线程中，可以更新UI
            val aaSeriesElementsArr: Array<AASeriesElement> = arrayOf(
                AASeriesElement()
                    .data(configureSeriesDataArray() as Array<Any>)
            )
            aaChartView2?.aa_updateXAxisCategories(configureXAxisCategoresDataArray(), false)

            aaChartView2?.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(
                aaSeriesElementsArr,
                false
            )
        }
    }

    override fun chartViewMoveOverEventMessage(
        aaChartView: AAChartView,
        moveOverEventMessage: AAMoveOverEventMessageModel
    ) {


        //打印触摸(手指掠过)事件信息
        println("👋👋👋获取触摸(手指掠过)事件 moveOverEventMessage  $moveOverEventMessage")
        selectedGradientColor = gradientColorsArr[moveOverEventMessage.index!!]
        selectedColorName = gradientColorNamesArr[moveOverEventMessage.index!!]

        val mainHandler = Handler(Looper.getMainLooper())
        mainHandler.post {
            //已在主线程中，可以更新UI
            val aaSeriesElementsArr: Array<AASeriesElement> = arrayOf(
                AASeriesElement()
                    .data(configureSeriesDataArray() as Array<Any>)
            )
            aaChartView2?.aa_updateXAxisCategories(configureXAxisCategoresDataArray(), false)

            aaChartView2?.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(
                aaSeriesElementsArr,
                false
            )
        }
    }


}