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
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView
import com.github.aachartmodel.aainfographics.demo.R
import com.github.aachartmodel.aainfographics.demo.chartcomposer.MixedChartComposer

class MixedChartActivity : AppCompatActivity() {
    private var aaChartModel: AAChartModel? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mixed_chart)

        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        this.aaChartModel = configureTheAAChartModel(chartType!!)

        aaChartModel = configureTheAAChartModel(chartType)
        val aaChartView: AAChartView = findViewById(R.id.AAChartView)
        aaChartView.aa_drawChartWithChartModel(aaChartModel!!)
    }


    private fun configureTheAAChartModel(chartType: String): AAChartModel {
        when (chartType) {
            "arearangeMixedLine" -> return MixedChartComposer.arearangeMixedLine()
            "columnrangeMixedLine" -> return MixedChartComposer.configureColumnrangeMixedLineChart()
            "stackingColumnMixedLine" -> return MixedChartComposer.configureStackingColumnMixedLineChart()
            "dashStyleTypeMixed" -> return MixedChartComposer.dashStyleTypeMixedChart()
            "negativeColorMixed" -> return MixedChartComposer.negativeColorMixedChart()
            "scatterMixedLine" -> return MixedChartComposer.scatterMixedLine()
            "negativeColorMixedBubble" -> return MixedChartComposer.negativeColorMixedBubble()
            "polygonMixedScatter" -> return MixedChartComposer.polygonMixedScatter()
            "polarChartMixed" -> return MixedChartComposer.polarChartMixedChart()
            "configurePieMixedLineMixedColumnChart" -> return MixedChartComposer.configurePieMixedLineMixedColumnChart()
            "configureNegativeColorMixedAreasplineChart" -> return MixedChartComposer.configureNegativeColorMixedAreasplineChart()
        }
        return MixedChartComposer.arearangeMixedLine()
    }
}
