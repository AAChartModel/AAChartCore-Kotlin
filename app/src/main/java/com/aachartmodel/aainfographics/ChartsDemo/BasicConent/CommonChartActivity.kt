package com.aachartmodel.aainfographics.ChartsDemo.BasicConent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.Switch
import com.aachartmodel.aainfographics.R
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartConfiger.AAChartView
import com.example.anan.chartcore_slim.AAChartCoreLib.AAChartConfiger.AAMoveOverEventMessageModel
import com.example.chartcorekotlin.AAChartConfiger.*
import com.google.gson.Gson

class CommonChartActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener,
    CompoundButton.OnCheckedChangeListener, AAChartView.AAChartViewCallBack {


    private var aaChartModel: AAChartModel? = null
    private var aaChartView: AAChartView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common_chart)


        setUpRadioButtonsAndSwitches()
        setUpAAChartView()
    }

    private fun setUpAAChartView() {
        aaChartView = findViewById(R.id.AAChartView)
        aaChartView!!.callBack = this
        aaChartModel = configureAAChartModel()
        aaChartView!!.aa_drawChartWithChartModel(aaChartModel!!)

    }

    private fun configureAAChartModel(): AAChartModel {
        val intent = intent
        val chartType = intent.getStringExtra("chartType")
        val position = intent.getIntExtra("position", 0)
        val chartTypeEnum = convertStringToEnum(chartType)

        val aaChartModel = AAChartModel()
            .chartType(chartTypeEnum)
            .title("title")
            .subtitle("subtitle")
            .backgroundColor("#4b2b7f")
            .dataLabelEnabled(true)
            .yAxisGridLineWidth(0)
            .legendVerticalAlign(AAChartLegendVerticalAlignType.Bottom)
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
                )
            )

        if (position == 4 || position == 5) {
            aaChartModel.series(arrayOf(
                    AASeriesElement()
                        .name("Tokyo")
                        .step(true)
                        .data(arrayOf(149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4)
                        ), AASeriesElement()
                        .name("NewYork")
                        .step(true)
                        .data(arrayOf(83.6, 78.8, 188.5, 93.4, 106.0, 84.5, 105.0, 104.3, 131.2, 153.5, 226.6, 192.3)
                        ), AASeriesElement()
                        .name("London")
                        .step(true)
                        .data(arrayOf(48.9, 38.8, 19.3, 41.4, 47.0, 28.3, 59.0, 69.6, 52.4, 65.2, 53.3, 72.2))
                )
            )

        } else {
            aaChartModel.series(arrayOf(
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
                )
            )

        }

        if (chartType == AAChartType.Area.toString()
            || chartType == AAChartType.Arearange.toString()) {
            aaChartModel.symbolStyle(AAChartSymbolStyleType.InnerBlank)
        } else if (chartType == AAChartType.Line.toString()
            || chartType == AAChartType.Spline.toString()) {
            aaChartModel.symbolStyle(AAChartSymbolStyleType.BorderBlank)
        }


        return aaChartModel
    }

    private fun convertStringToEnum(chartTypeStr: String): AAChartType {
        var chartTypeEnum = AAChartType.Column
        when (chartTypeStr) {
            AAChartType.Column.toString() -> chartTypeEnum = AAChartType.Column
            AAChartType.Bar.toString() -> chartTypeEnum = AAChartType.Bar
            AAChartType.Area.toString() -> chartTypeEnum = AAChartType.Area
            AAChartType.Areaspline.toString() -> chartTypeEnum = AAChartType.Areaspline
            AAChartType.Line.toString() -> chartTypeEnum = AAChartType.Line
            AAChartType.Spline.toString() -> chartTypeEnum = AAChartType.Spline
        }
        return chartTypeEnum
    }


    private fun setUpRadioButtonsAndSwitches() {

        val radioGroup1 = findViewById<RadioGroup>(R.id.radioGroup1)
        radioGroup1.setOnCheckedChangeListener(this)

        val radioGroup2 = findViewById<RadioGroup>(R.id.radioGroup2)
        radioGroup2.setOnCheckedChangeListener(this)


        val boolSwitch1 = findViewById<Switch>(R.id.switch1)
        boolSwitch1.setOnCheckedChangeListener(this)

        val boolSwitch2 = findViewById<Switch>(R.id.switch2)
        boolSwitch2.setOnCheckedChangeListener(this)

        val boolSwitch3 = findViewById<Switch>(R.id.switch3)
        boolSwitch3.setOnCheckedChangeListener(this)

        val boolSwitch4 = findViewById<Switch>(R.id.switch4)
        boolSwitch4.setOnCheckedChangeListener(this)

        val boolSwitch5 = findViewById<Switch>(R.id.switch5)
        boolSwitch5.setOnCheckedChangeListener(this)
    }

    /**
     * 重写的状态改变的事件的方法
     * @param group 单选组合框
     * @param checkedId 其中的每个RadioButton的Id
     */
    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        if (group.id == R.id.radioGroup1) {
            //根据不同ID 弹出不同的吐司
            when (group.checkedRadioButtonId) {
                R.id.stacking1 -> aaChartModel!!.stacking(AAChartStackingType.False)
                R.id.stacking2 -> aaChartModel!!.stacking(AAChartStackingType.Normal)
                R.id.stacking3 -> aaChartModel!!.stacking(AAChartStackingType.Percent)
            }
        } else {
            when (group.checkedRadioButtonId) {
                R.id.symbol1 -> aaChartModel!!.symbol(AAChartSymbolType.Circle)
                R.id.symbol2 -> aaChartModel!!.symbol(AAChartSymbolType.Diamond)
                R.id.symbol3 -> aaChartModel!!.symbol(AAChartSymbolType.Square)
                R.id.symbol4 -> aaChartModel!!.symbol(AAChartSymbolType.Triangle)
                R.id.symbol5 -> aaChartModel!!.symbol(AAChartSymbolType.TriangleDown)
            }
        }

        aaChartView!!.aa_refreshChartWithChartModel(aaChartModel!!)
    }

    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        when (buttonView.id) {
            R.id.switch1 -> aaChartModel!!.xAxisReversed(isChecked)
            R.id.switch2 -> aaChartModel!!.yAxisReversed(isChecked)
            R.id.switch3 -> aaChartModel!!.inverted(isChecked)
            R.id.switch4 -> aaChartModel!!.polar(isChecked)
            R.id.switch5 -> aaChartModel!!.dataLabelEnabled(isChecked)
        }

        aaChartView!!.aa_refreshChartWithChartModel(aaChartModel!!)

    }

    override fun chartViewDidFinishedLoad(aaChartView: AAChartView) {
        println("🔥图表加载完成回调方法!!!!!!!! ")
    }

    override fun chartViewMoveOverEventMessage(aaChartView: AAChartView, messageModel: AAMoveOverEventMessageModel) {
        val gson = Gson()
        println("🚀move over event message " + gson.toJson(messageModel))

    }
}

