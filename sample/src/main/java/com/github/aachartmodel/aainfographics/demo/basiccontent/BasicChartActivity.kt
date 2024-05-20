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
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aatools.AAGradientColor
import com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.BasicChartComposer
import com.google.gson.Gson

open class BasicChartActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener,
    CompoundButton.OnCheckedChangeListener, AAChartView.AAChartViewCallBack {

    var aaChartModel = AAChartModel()
    var aaChartView: AAChartView? = null
    var chartType: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_chart)

        setUpAAChartView()
        setUpRadioButtonsAndSwitches()
    }

    private fun setUpAAChartView() {
        aaChartView = findViewById(R.id.AAChartView)
        aaChartView?.setBackgroundColor(0)
        aaChartView?.callBack = this
        aaChartModel = configureAAChartModel()
        aaChartView?.aa_drawChartWithChartModel(aaChartModel)

    }


    private fun configureAAChartModel(): AAChartModel {
        val intent = intent
        chartType = intent.getStringExtra("chartType").toString()
        val position = intent.getIntExtra("position", 0)
        aaChartModel = BasicChartComposer.configureAreaChart()
        val chartTypeEnum = convertStringToEnum(chartType)
        aaChartModel.chartType(chartTypeEnum)

        configureTheStyleForDifferentTypeChart(chartType,position)
        configureViewsVisibility(chartType)

        return aaChartModel
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

    private fun configureViewsVisibility(chartType: String) {
        val squareCornersRadio: RadioGroup = findViewById(R.id.cornerStyleTypeRadioGroup)
        val markerSymbolTypeRadioGroup: RadioGroup = findViewById(R.id.markerSymbolTypeRadioGroup)
        if (chartType == AAChartType.Column.value || chartType == AAChartType.Bar.value) {
            squareCornersRadio.visibility = View.VISIBLE
            markerSymbolTypeRadioGroup.visibility = View.GONE

            val markerHideSwitch: Switch = findViewById(R.id.markerHideSwitch)
            markerHideSwitch.visibility = View.GONE
            val markerHideTextView: TextView = findViewById(R.id.markerHideTextView)
            markerHideTextView.visibility = View.GONE
        } else {
            squareCornersRadio.visibility = View.GONE
            markerSymbolTypeRadioGroup.visibility = View.VISIBLE
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
            .colorsTheme(arrayOf("#fe117c", "#ffc069", "#06caf4", "#7dffc0"))
            .animationType(AAChartAnimationType.EaseInCubic)
            .animationDuration(1200)
    }

    private fun configureAreaChartAndAreasplineChartStyle(chartType:String) {
        aaChartModel
            .animationType(AAChartAnimationType.EaseOutQuart)
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
        val stackingTypeRadioGroup = findViewById<RadioGroup>(R.id.stackingTypeRadioGroup)
        stackingTypeRadioGroup.setOnCheckedChangeListener(this)

        val cornerStyleTypeRadioGroup = findViewById<RadioGroup>(R.id.cornerStyleTypeRadioGroup)
        cornerStyleTypeRadioGroup.setOnCheckedChangeListener(this)

        val markerSymbolTypeRadioGroup: RadioGroup = findViewById(R.id.markerSymbolTypeRadioGroup)
        markerSymbolTypeRadioGroup.setOnCheckedChangeListener(this)

        val boolSwitch1: Switch = findViewById(R.id.xReversedSwitch)
        boolSwitch1.setOnCheckedChangeListener(this)

        val boolSwitch2: Switch = findViewById(R.id.yReversedSwitch)
        boolSwitch2.setOnCheckedChangeListener(this)

        val boolSwitch3: Switch = findViewById(R.id.polarSwitch)
        boolSwitch3.setOnCheckedChangeListener(this)

        val boolSwitch4: Switch = findViewById(R.id.xInvertedSwitch)
        boolSwitch4.setOnCheckedChangeListener(this)

        val boolSwitch5: Switch = findViewById(R.id.dataShowSwitch)
        boolSwitch5.setOnCheckedChangeListener(this)

        val boolSwitch6: Switch = findViewById(R.id.markerHideSwitch)
        boolSwitch6.setOnCheckedChangeListener(this)
    }

    /**
     * 重写的状态改变的事件的方法
     * @param group 单选组合框
     * @param checkedId 其中的每个RadioButton的Id
     */
    override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
        if (group.id == R.id.stackingTypeRadioGroup) {
            when (group.checkedRadioButtonId) {
                R.id.noStackingRadio -> aaChartModel.stacking(AAChartStackingType.False)
                R.id.normalStackingRadio -> aaChartModel.stacking(AAChartStackingType.Normal)
                R.id.percentStackingRadio -> aaChartModel.stacking(AAChartStackingType.Percent)
            }
        } else {
            if (aaChartModel.chartType == AAChartType.Bar
                || aaChartModel.chartType == AAChartType.Column
            ) {
                when (group.checkedRadioButtonId) {
                    R.id.squareCornersRadio -> aaChartModel.borderRadius(1f)
                    R.id.roundedCornersRadio -> aaChartModel.borderRadius(10f)
                    R.id.wedgeCornersRadio -> aaChartModel.borderRadius(1000f)
                }
            } else {
                when (group.checkedRadioButtonId) {
                    R.id.circleSymbolRadio -> aaChartModel.markerSymbol(AAChartSymbolType.Circle)
                    R.id.squareSymbolRadio -> aaChartModel.markerSymbol(AAChartSymbolType.Square)
                    R.id.diamondSymbolRadio -> aaChartModel.markerSymbol(AAChartSymbolType.Diamond)
                    R.id.triangleSymbolRadio -> aaChartModel.markerSymbol(AAChartSymbolType.Triangle)
                    R.id.triangleDownSymbolRadio -> aaChartModel.markerSymbol(AAChartSymbolType.TriangleDown)
                }
            }
        }

        aaChartView?.aa_refreshChartWithChartModel(aaChartModel)
    }

    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        when (buttonView.id) {
            R.id.xReversedSwitch -> aaChartModel.xAxisReversed(isChecked)
            R.id.yReversedSwitch -> aaChartModel.yAxisReversed(isChecked)
            R.id.xInvertedSwitch -> aaChartModel.inverted(isChecked)
            R.id.polarSwitch -> aaChartModel.polar(isChecked)
            R.id.dataShowSwitch -> aaChartModel.dataLabelsEnabled(isChecked)
            R.id.markerHideSwitch -> aaChartModel.markerRadius(if (isChecked) 0f else 6f)
        }

        aaChartView?.aa_refreshChartWithChartModel(aaChartModel)
    }

    override fun chartViewDidFinishLoad(aaChartView: AAChartView) {
        println("🔥图表加载完成回调方法 ")
    }

    override fun chartViewMoveOverEventMessage(
        aaChartView: AAChartView,
        messageModel: AAMoveOverEventMessageModel
    ) {
        val gson = Gson()
        println("🚀move over event message " + gson.toJson(messageModel))
    }
}

