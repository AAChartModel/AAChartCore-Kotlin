/**
//  AAChartModel.java
//  AAChartCore-Kotlin
//
//  Created by AnAn on 2017/9/8..
//  Copyright © 2018年 An An. All rights reserved.
*/
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

package com.aachartmodel.aainfographics.aainfographicsLib.aachartConfiger

import android.content.Context
import android.content.DialogInterface
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v7.app.AlertDialog
import android.util.AttributeSet
import android.util.Log
import android.webkit.JavascriptInterface
import android.webkit.JsResult
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAOptions
import com.example.chartcorekotlin.AAChartConfiger.AAChartModel
import com.example.chartcorekotlin.AAChartConfiger.AAOptionsConstructor
import com.example.chartcorekotlin.AAChartConfiger.AASeriesElement

import com.google.gson.Gson
import com.google.gson.internal.LinkedTreeMap

import java.util.HashMap

class AAMoveOverEventMessageModel {
    var name: String? = null
    var x: Double? = null
    var y: Double? = null
    var category: String? = null
    var offset: LinkedTreeMap<*, *>? = null
    var index: Double? = null
}


class AAChartView : WebView {

    var contentWidth: Float? = null
    var contentHeight: Float? = null
    var chartSeriesHidden: Boolean? = null
    var callBack: AAChartViewCallBack? = null


    private val optionsJson: String? = null

    interface AAChartViewCallBack {
        fun chartViewDidFinishedLoad(aaChartView: AAChartView)
        fun chartViewMoveOverEventMessage(
            aaChartView: AAChartView,
            messageModel: AAMoveOverEventMessageModel
        )
    }

    constructor(context: Context) : super(context) {
        sharedConstructor()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        sharedConstructor()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        sharedConstructor()
    }

    private fun sharedConstructor() {
        // Do some initialize work.
        this.contentWidth = 320f
        this.contentHeight = 350f
        //        //设置WebView支持JavaScript(这一句是十分关键的一句)
        this.settings.javaScriptEnabled = true
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            this.setWebContentsDebuggingEnabled(true)
//        }
        //把当前对象作为androidObject别名传递给js
        //js通过window.androidObject.androidMethod()就可以直接调用安卓的androidMethod方法
        this.addJavascriptInterface(this, "androidObject")
    }


    //js调用安卓，必须加@JavascriptInterface注释的方法才可以被js调用
    @JavascriptInterface
    fun androidMethod(message: String): String {
        val gson = Gson()
        var messageBody: Map<*, *> = HashMap<String, Any>()
        messageBody = gson.fromJson(message, messageBody.javaClass)
        val eventMessageModel = getEventMessageModel(messageBody)
        if (callBack != null) {
            callBack!!.chartViewMoveOverEventMessage(this, eventMessageModel)
        }
        println("显示总共调用了几次")

        return ""
    }

    internal fun getEventMessageModel(messageBody: Map<*, *>): AAMoveOverEventMessageModel {
        val eventMessageModel = AAMoveOverEventMessageModel()
        eventMessageModel.name = messageBody["name"].toString()
        eventMessageModel.x = messageBody["x"] as Double
        eventMessageModel.y = messageBody["y"] as Double
        eventMessageModel.category = messageBody["category"].toString()
        eventMessageModel.offset = messageBody["offset"] as LinkedTreeMap<*, *>
        eventMessageModel.index = messageBody["index"] as Double
        return eventMessageModel
    }

    fun aa_drawChartWithChartModel(chartModel: AAChartModel) {
        val aaOptions = AAOptionsConstructor.configureChartOptions(chartModel)
        this.aa_drawChartWithChartOptions(aaOptions)
    }

    fun aa_onlyRefreshTheChartDataWithChartModelSeriesArray(seriesElementsArr: Array<AASeriesElement>) {
        this.aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(seriesElementsArr)
    }

    fun aa_refreshChartWithChartModel(chartModel: AAChartModel) {
        val aaOptions = AAOptionsConstructor.configureChartOptions(chartModel)
        this.aa_refreshChartWithChartOptions(aaOptions)
    }

    fun aa_drawChartWithChartOptions(chartOptions: AAOptions) {
        this.loadUrl("file:///android_asset/AAChartView.html")
        this.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                println("图表加载完成!!!!!!!! ")
                if (callBack != null) {
                    callBack!!.chartViewDidFinishedLoad(this@AAChartView)
                }
                configureChartOptionsAndDrawChart(chartOptions)
            }

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            override fun shouldOverrideUrlLoading(
                view: WebView,
                request: WebResourceRequest
            ): Boolean {
                super.shouldOverrideUrlLoading(view, request)
                val urlStr = request.url.toString()
                val jsBridgeName = "AAChartViewBridge".toLowerCase()
                if (urlStr.startsWith(jsBridgeName)) {
                    val message = urlStr.replace("$jsBridgeName://?", "")
                    val gson = Gson()
                    var messageBody: Map<*, *> = HashMap<String, Any>()
                    messageBody = gson.fromJson(message, messageBody.javaClass)
                }

                return false
            }
        }


        this.webChromeClient = object : WebChromeClient() {
            override fun onJsAlert(
                view: WebView,
                url: String,
                message: String,
                result: JsResult
            ): Boolean {
                super.onJsAlert(view, url, message, result)

                return true
            }
        }
    }

    fun aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(seriesElementsArr: Array<AASeriesElement>) {
        // 将对象编译成json
        val gson = Gson()
        val seriesArr = gson.toJson(seriesElementsArr)
        val javaScriptStr = "onlyRefreshTheChartDataWithSeries('$seriesArr')"
        this.safeEvaluateJavaScriptString(javaScriptStr)
    }

    fun aa_refreshChartWithChartOptions(chartOptions: AAOptions) {
        // 将对象编译成json
        val gson = Gson()
        val aaOptionsJsonStr = gson.toJson(chartOptions)
        val javaScriptStr =
            "loadTheHighChartView('$aaOptionsJsonStr','$contentWidth','$contentHeight')"
        this.safeEvaluateJavaScriptString(javaScriptStr)
    }

    fun aa_showTheSeriesElementContent(elementIndex: Int?) {
        val javaScriptStr = "showTheSeriesElementContentWithIndex('$elementIndex')"
        this.safeEvaluateJavaScriptString(javaScriptStr)

    }

    fun aa_hideTheSeriesElementContent(elementIndex: Int?) {
        val javaScriptStr = "hideTheSeriesElementContentWithIndex('$elementIndex')"
        this.safeEvaluateJavaScriptString(javaScriptStr)
    }

    private fun configureChartOptionsAndDrawChart(chartOptions: AAOptions) {
        // 将对象编译成json
        val gson = Gson()
        val aaOptionsJsonStr = gson.toJson(chartOptions)
        val javaScriptStr = "loadTheHighChartView('$aaOptionsJsonStr','420','580')"
        this.safeEvaluateJavaScriptString(javaScriptStr)
    }

    private fun safeEvaluateJavaScriptString(javaScriptString: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            this.evaluateJavascript(
                "javascript:$javaScriptString"
            ) { s -> Log.i("回调信息", "输出打印查看回调的结果$s") }
        } else {
            this.loadUrl("javascript:$javaScriptString")
        }
    }


}
