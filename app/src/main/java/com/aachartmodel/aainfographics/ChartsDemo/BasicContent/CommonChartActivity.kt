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
package com.aachartmodel.aainfographics.ChartsDemo.BasicContent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.Switch
import com.aachartmodel.aainfographics.R
import com.aachartmodel.aainfographics.aainfographicsLib.aachartConfiger.AAChartView
import com.aachartmodel.aainfographics.aainfographicsLib.aachartConfiger.AAMoveOverEventMessageModel
import com.example.chartcorekotlin.AAChartConfiger.*
import com.google.gson.Gson

class CommonChartActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener,
    CompoundButton.OnCheckedChangeListener, AAChartView.AAChartViewCallBack {

    private var aaChartModel = AAChartModel()
    private var aaChartView: AAChartView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common_chart)


        setUpRadioButtonsAndSwitches()
        setUpAAChartView()
    }

    private fun setUpAAChartView() {
        aaChartView = findViewById(R.id.AAChartView)
        aaChartView?.callBack = this
        aaChartModel = configureAAChartModel()
        aaChartView?.aa_drawChartWithChartModel(aaChartModel)

    }

    private fun configureAAChartModel(): AAChartModel {
        val intent = intent
        val chartType = intent.getStringExtra("chartType")
        val position = intent.getIntExtra("position", 0)
        val chartTypeEnum = convertStringToEnum(chartType)

        aaChartModel
            .chartType(chartTypeEnum)
            .title("title")
            .subtitle("subtitle")
            .backgroundColor("#4b2b7f")
            .dataLabelsEnabled(false)
            .yAxisGridLineWidth(0f)
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

        configureTheStyleForDifferentTypeChart(chartType,position)

        return aaChartModel as AAChartModel
    }

    private fun configureTheStyleForDifferentTypeChart(chartType: String, position: Int) {
        if ((chartType == AAChartType.Area.value || chartType == AAChartType.Line.value)
            && (position == 4 || position == 5)) {
            configureStepAreaChartAndStepLineChartStyle()
        } else if (chartType == AAChartType.Column.value || chartType == AAChartType.Bar.value) {
            configureColumnChartAndBarChartStyle()
        } else if (chartType == AAChartType.Area.value || chartType == AAChartType.Areaspline.value) {
            configureAreaChartAndAreasplineChartStyle(chartType)
        } else if (chartType == AAChartType.Line.value || chartType == AAChartType.Spline.value) {
            configureLineChartAndSplineChartStyle(chartType)
        }
    }

    private fun configureStepAreaChartAndStepLineChartStyle() {
        val element1 = AASeriesElement()
            .name("Tokyo")
            .step(true)
            .data(arrayOf(149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4))

        val element2 = AASeriesElement()
            .name("NewYork")
            .step(true)
            .data(arrayOf(83.6, 78.8, 188.5, 93.4, 106.0, 84.5, 105.0, 104.3, 131.2, 153.5, 226.6, 192.3))

        val element3 = AASeriesElement()
            .name("London")
            .step(true)
            .data(arrayOf(48.9, 38.8, 19.3, 41.4, 47.0, 28.3, 59.0, 69.6, 52.4, 65.2, 53.3, 72.2))

        aaChartModel.series(arrayOf(element1, element2, element3))
    }

    private fun configureColumnChartAndBarChartStyle() {
        aaChartModel
            .categories(arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Spe", "Oct", "Nov", "Dec"))
            .legendEnabled(true)
            .colorsTheme(arrayOf("#fe117c", "#ffc069", "#06caf4", "#7dffc0"))
            .animationType(AAChartAnimationType.Bounce)
            .animationDuration(1200)
    }

    private fun configureAreaChartAndAreasplineChartStyle(chartType:String) {
        aaChartModel
            .animationType(AAChartAnimationType.EaseOutQuart)
            .legendEnabled(true)
            .markerRadius(5f)
            .markerSymbol(AAChartSymbolType.Circle)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)

        if (chartType == AAChartType.Areaspline.value) {
            val gradientColorDic = AAGradientColor.linearGradient(
                AALinearGradientDirection.ToBottomRight,
                "rgba(138,43,226,1)",
                "rgba(30,144,255,1)" //颜色字符串设置支持十六进制类型和 rgba 类型
            )

            val element1 = AASeriesElement()
                .name("Predefined symbol")
                .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36))
            val element2 = AASeriesElement()
                .name("Image symbol")
                .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67))
            val element3 = AASeriesElement()
                .name("Base64 symbol (*)")
                .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64))
            val element4 = AASeriesElement()
                .name("Custom symbol")
                .data(arrayOf(0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53))


            aaChartModel
                .animationType(AAChartAnimationType.EaseFrom)//设置图表渲染动画类型为 EaseFrom
                .series(arrayOf(element1, element2, element3, element4))
        }
    }

    private fun configureLineChartAndSplineChartStyle(chartType: String) {
        aaChartModel
            .markerSymbolStyle(AAChartSymbolStyleType.BorderBlank)//设置折线连接点样式为:边缘白色
            .markerRadius(6f)
        if (chartType == AAChartType.Spline.value) {
            val element1 = AASeriesElement()
                .name("Tokyo")
                .lineWidth(7f)
                .data(arrayOf(50, 320, 230, 370, 230, 400))

            val element2 = AASeriesElement()
                .name("Berlin")
                .lineWidth(7f)
                .data(arrayOf(80, 390, 210, 340, 240, 350))

            val element3 = AASeriesElement()
                .name("New York")
                .lineWidth(7f)
                .data(arrayOf(100, 370, 180, 280, 260, 300))

            val element4 = AASeriesElement()
                .name("London")
                .lineWidth(7f)
                .data(arrayOf(130, 350, 160, 310, 250, 268))

            aaChartModel
                .animationType(AAChartAnimationType.SwingFromTo)
                .series(arrayOf(element1, element2, element3, element4))

        }
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
                R.id.stacking1 -> aaChartModel.stacking(AAChartStackingType.False)
                R.id.stacking2 -> aaChartModel.stacking(AAChartStackingType.Normal)
                R.id.stacking3 -> aaChartModel.stacking(AAChartStackingType.Percent)
            }
        } else {
            when (group.checkedRadioButtonId) {
                R.id.symbol1 -> aaChartModel.markerSymbol(AAChartSymbolType.Circle)
                R.id.symbol2 -> aaChartModel.markerSymbol(AAChartSymbolType.Diamond)
                R.id.symbol3 -> aaChartModel.markerSymbol(AAChartSymbolType.Square)
                R.id.symbol4 -> aaChartModel.markerSymbol(AAChartSymbolType.Triangle)
                R.id.symbol5 -> aaChartModel.markerSymbol(AAChartSymbolType.TriangleDown)
            }
        }

        aaChartView?.aa_refreshChartWithChartModel(aaChartModel)
    }

    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        when (buttonView.id) {
            R.id.switch1 -> aaChartModel.xAxisReversed(isChecked)
            R.id.switch2 -> aaChartModel.yAxisReversed(isChecked)
            R.id.switch3 -> aaChartModel.inverted(isChecked)
            R.id.switch4 -> aaChartModel.polar(isChecked)
            R.id.switch5 -> aaChartModel.dataLabelsEnabled(isChecked)
        }

        aaChartView?.aa_refreshChartWithChartModel(aaChartModel)

    }

    override fun chartViewDidFinishedLoad(aaChartView: AAChartView) {
        println("🔥图表加载完成回调方法 ")
    }

    override fun chartViewMoveOverEventMessage(aaChartView: AAChartView, messageModel: AAMoveOverEventMessageModel) {
        val gson = Gson()
        println("🚀move over event message " + gson.toJson(messageModel))

    }
}

