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


* -------------------------------------------------------------------------------
*
*  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
*
* Please contact me on GitHub,if there are any problems encountered in use.
* GitHub Issues : https://github.com/AAChartModel/AAChartCore/issues
* -------------------------------------------------------------------------------
* And if you want to contribute for this project, please contact me as well
* GitHub        : https://github.com/AAChartModel
* StackOverflow : https://stackoverflow.com/users/7842508/codeforu
* JianShu       : http://www.jianshu.com/u/f1e6753d4254
* SegmentFault  : https://segmentfault.com/u/huanghunbieguan
*
* -------------------------------------------------------------------------------

*/

package com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger

import android.content.Context
import android.os.Build
import android.support.v7.app.AlertDialog
import android.util.AttributeSet
import android.webkit.*
import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAOptions
import com.google.gson.Gson
import com.google.gson.internal.LinkedTreeMap
import java.util.*


class AAMoveOverEventMessageModel {
    var name: String? = null
    var x: Double? = null
    var y: Double? = null
    var category: String? = null
    var offset: LinkedTreeMap<*, *>? = null
    var index: Int? = null
}


class AAChartView : WebView {
    interface AAChartViewCallBack {
        fun chartViewDidFinishLoad(aaChartView: AAChartView)
        fun chartViewMoveOverEventMessage(
            aaChartView: AAChartView,
            messageModel: AAMoveOverEventMessageModel
        )
    }

    var contentWidth: Float? = null
        set(value) {
            field = value
            val jsStr = ("setTheChartViewContentWidth('"
                    + field + "')")
            safeEvaluateJavaScriptString(jsStr)
        }
    var contentHeight: Float? = null
        set(value) {
            field = value
            val jsStr = ("setTheChartViewContentHeight('"
                    + field + "')")
            safeEvaluateJavaScriptString(jsStr)
        }
    var chartSeriesHidden: Boolean? = null
        set(value) {
            field = value
            val jsStr = ("setChartSeriesHidden('"
                    + field + "')")
            safeEvaluateJavaScriptString(jsStr)
        }
    var isClearBackgroundColor: Boolean? = null
        set(value) {
            field = value
            if (field == true) {
                setBackgroundColor(0)
                this.background?.alpha = 0
            } else {
                setBackgroundColor(1)
                this.background?.alpha = 255
            }
        }
    var callBack: AAChartViewCallBack? = null


    private var optionsJson: String? = null

    constructor(
        context: Context?
    ) : super(context) {
        setupBasicContent()
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?
    ) : super(context, attrs) {
        setupBasicContent()
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr) {
        setupBasicContent()
    }

    private fun setupBasicContent() { // Do some initialize work.
        contentWidth = 420f
        contentHeight = 580f
        isClearBackgroundColor = false
        this.settings.javaScriptEnabled = true
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setWebContentsDebuggingEnabled(true)
        }
        //把当前对象作为androidObject别名传递给js
//js通过window.androidObject.androidMethod()就可以直接调用安卓的androidMethod方法
        addJavascriptInterface(this, "androidObject")
    }

    //js调用安卓，必须加@JavascriptInterface注释的方法才可以被js调用
    @JavascriptInterface
    fun androidMethod(message: String?): String {
        val gson = Gson()
        var messageBody: Map<*, *> =
            HashMap<String, Any>()
        messageBody = gson.fromJson(message, messageBody.javaClass)
        val eventMessageModel: AAMoveOverEventMessageModel = getEventMessageModel(messageBody)
        if (callBack != null) {
            callBack!!.chartViewMoveOverEventMessage(this, eventMessageModel)
        }
        //       Log.i("androidMethod","++++++++++++++++显示总共调用了几次");
        return ""
    }

    fun aa_drawChartWithChartModel(chartModel: AAChartModel) {
        val aaOptions: AAOptions = AAOptionsConstructor.configureChartOptions(chartModel)
        aa_drawChartWithChartOptions(aaOptions)
    }

    fun aa_refreshChartWithChartModel(chartModel: AAChartModel) {
        val aaOptions: AAOptions = AAOptionsConstructor.configureChartOptions(chartModel)
        aa_refreshChartWithChartOptions(aaOptions)
    }

    fun aa_drawChartWithChartOptions(chartOptions: AAOptions) {
        if (optionsJson != null) {
            aa_refreshChartWithChartOptions(chartOptions)
        } else {
            loadLocalFilesAndDrawChart(chartOptions)
            showJavaScriptAlertView()
        }
    }

    fun aa_refreshChartWithChartOptions(chartOptions: AAOptions) {
        configureChartOptionsAndDrawChart(chartOptions)
    }

    fun aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(
        seriesElementsArr: Array<AASeriesElement>
    ) {
        aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(seriesElementsArr, true)
    }

    fun aa_onlyRefreshTheChartDataWithChartOptionsSeriesArray(
        seriesElementsArr: Array<AASeriesElement>,
        animation: Boolean
    ) {
        val seriesArr = Gson().toJson(seriesElementsArr)
        val javaScriptStr = ("onlyRefreshTheChartDataWithSeries('"
                + seriesArr + "','" + animation + "')")
        safeEvaluateJavaScriptString(javaScriptStr)
    }

    fun aa_updateChartWithOptions(
        options: Any,
        redraw: Boolean
    ) {
        var classNameStr = options.javaClass.simpleName
        classNameStr = classNameStr.replace("AA", "")
        //convert fist character to be lowercase string
        val firstChar = classNameStr.substring(0, 1)
        val lowercaseFirstStr = firstChar.toLowerCase()
        classNameStr = classNameStr.substring(1)
        val finalClassName = lowercaseFirstStr + classNameStr
        val finalOptionsMap = HashMap<Any?, Any?>()
        finalOptionsMap[finalClassName] = options
        val optionsStr = Gson().toJson(finalOptionsMap)
        val javaScriptStr = "updateChart('$optionsStr','$redraw')"
        safeEvaluateJavaScriptString(javaScriptStr)
    }

    @JvmOverloads
    fun aa_addPointToChartSeriesElement(
        elementIndex: Int,
        options: Any,
        shift: Boolean =
            true
    ) {
        aa_addPointToChartSeriesElement(
            elementIndex,
            options,
            true,
            shift,
            true
        )
    }

    fun aa_addPointToChartSeriesElement(
        elementIndex: Int,
        options: Any,
        redraw: Boolean,
        shift: Boolean,
        animation: Boolean
    ) {
        val optionsStr: String
        optionsStr = if (options is Int
            || options is Float
            || options is Double
        ) {
            options.toString()
        } else {
            Gson().toJson(options)
        }
        val javaScriptStr = ("addPointToChartSeries('"
                + elementIndex + "','"
                + optionsStr + "','"
                + redraw + "','"
                + shift + "','"
                + animation + "')")
        safeEvaluateJavaScriptString(javaScriptStr)
    }

    fun aa_showTheSeriesElementContent(elementIndex: Int) {
        val javaScriptStr = ("showTheSeriesElementContentWithIndex('"
                + elementIndex + "')")
        safeEvaluateJavaScriptString(javaScriptStr)
    }

    fun aa_hideTheSeriesElementContent(elementIndex: Int) {
        val javaScriptStr = ("hideTheSeriesElementContentWithIndex('"
                + elementIndex + "')")
        safeEvaluateJavaScriptString(javaScriptStr)
    }

    fun aa_addElementToChartSeries(aaSeriesElement: AASeriesElement) {
        val pureElementJsonStr = Gson().toJson(aaSeriesElement)
        val javaScriptStr = ("addElementToChartSeriesWithElement('"
                + pureElementJsonStr + "')")
        safeEvaluateJavaScriptString(javaScriptStr)
    }

    fun aa_removeElementFromChartSeries(elementIndex: Int) {
        val javaScriptStr = ("removeElementFromChartSeriesWithElementIndex('"
                + elementIndex + "')")
        safeEvaluateJavaScriptString(javaScriptStr)
    }

    fun aa_evaluateTheJavaScriptStringFunction(jsFunctionStr: String) {
        val pureJSFunctionStr: String =
            AAJSStringPurer.pureJavaScriptFunctionString(jsFunctionStr)
        val jsFunctionNameStr = ("evaluateTheJavaScriptStringFunction('"
                + pureJSFunctionStr + "')")
        safeEvaluateJavaScriptString(jsFunctionNameStr)
    }

    private fun loadLocalFilesAndDrawChart(aaOptions: AAOptions) {
        this.loadUrl("file:///android_asset/AAChartView.html")
        this.webViewClient = object : WebViewClient() {
            override fun onPageFinished(
                view: WebView,
                url: String
            ) { //                Log.i("js files load","图表加载完成!!!!!!!! ");
                configureChartOptionsAndDrawChart(aaOptions)
                if (callBack != null) {
                    callBack!!.chartViewDidFinishLoad(this@AAChartView)
                }
            }
        }
    }

    private fun configureChartOptionsAndDrawChart(chartOptions: AAOptions) {
        if (isClearBackgroundColor!!) {
            chartOptions.chart!!.backgroundColor("rgba(0,0,0,0)")
        }
        val gson = Gson()
        val aaOptionsJsonStr = gson.toJson(chartOptions)
        optionsJson = aaOptionsJsonStr
        val javaScriptStr = ("loadTheHighChartView('"
                + aaOptionsJsonStr + "','"
                + contentWidth + "','"
                + contentHeight + "')")
        safeEvaluateJavaScriptString(javaScriptStr)
    }

    private fun showJavaScriptAlertView() {
        this.webChromeClient = object : WebChromeClient() {
            override fun onJsAlert(
                view: WebView,
                url: String,
                message: String,
                result: JsResult
            ): Boolean {
                super.onJsAlert(view, url, message, result)
                val urlStr = "url --->$url\n\n\n"
                val messageStr = "message --->$message\n\n\n"
                val resultStr = "result --->$result"
                val alertMessageStr = urlStr + messageStr + resultStr
                AlertDialog.Builder(context)
                    .setTitle("JavaScript alert Information") //设置对话框标题
                    .setMessage(alertMessageStr)
                    .setNeutralButton("sure", null)
                    .show()
                return true
            }
        }
    }

    private fun getEventMessageModel(messageBody: Map<*, *>): AAMoveOverEventMessageModel {
        val eventMessageModel = AAMoveOverEventMessageModel()
        eventMessageModel.name = messageBody["name"].toString()
        eventMessageModel.x = messageBody["x"] as Double?
        eventMessageModel.y = messageBody["y"] as Double?
        eventMessageModel.category = messageBody["category"].toString()
        eventMessageModel.offset = messageBody["offset"] as LinkedTreeMap<*, *>?
        val index = messageBody["index"] as Double?
        eventMessageModel.index = index?.toInt()
        return eventMessageModel
    }

    private fun safeEvaluateJavaScriptString(javaScriptString: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            evaluateJavascript("javascript:$javaScriptString") {
                //                 Log.i("call back information","输出打印查看回调的结果"+ it);
            }
        } else {
            this.loadUrl("javascript:$javaScriptString")
        }
    }
}