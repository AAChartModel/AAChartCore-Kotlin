/**
 * Copyright (C), 2015-2019, 飞牛集达有限公司
 * FileName: AAChartView
 * Author: ios-fn
 * Date: 2019-05-15 11:20
 * Description: Chart View
 * History:
 */
package com.aachartmodel.aachartcore_kotlin.AAChartCreator;

//
//  AAChartModel.java
//  ChartCore-Slim
//
//  Created by AnAn on 2017/9/8..
//  Copyright © 2018年 An An. All rights reserved.
//*************** ...... SOURCE CODE ...... ***************
//***...................................................***
//*** https://github.com/AAChartModel/ChartCore         ***
//*** https://github.com/AAChartModel/ChartCore-Slim    ***
//***...................................................***
//*************** ...... SOURCE CODE ...... ***************


/*

 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/ChartCore-Slim/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */


import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.chartcorekotlin.AAChartConfiger.AAChartModel
import com.example.chartcorekotlin.AAChartConfiger.AASeriesElement

import com.google.gson.Gson

import java.util.HashMap


/**
 * Created by AnAn on 2017/9/8.
 */

class AAChartView : WebView {

    var contentWidth: Float? = null
    var contentHeight: Float? = null
    var chartSeriesHidden: Boolean? = null
    var testTheAutoGenerateGetMethod: String? = null

    private var optionsJson: String? = null

    constructor(context: Context) : super(context) {
        sharedConstructor()


    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        sharedConstructor()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        sharedConstructor()
    }

    private fun sharedConstructor() {
        // Do some initialize work.
        this.contentWidth = 320f
        this.contentHeight = 350f
        //        //设置WebView支持JavaScript(这一句是十分关键的一句)
        this.settings.javaScriptEnabled = true
        //        this.loadUrl("file:///android_asset/AAChartView.html");//神奇了,这个方法写在aa_drawChartWithChartModel方法里面就不行,难道是因为不能在还未加载成功的时候就直接调用 JS 方法?(跟 OC 一样)必须在加载完成后的代理里面调用 JS 方法

    }


    fun aa_drawChartWithChartModel(chartModel: AAChartModel) {
        this.loadUrl("file:///android_asset/AAChartView.html")//神奇了,这个方法写在aa_drawChartWithChartModel方法里面就不行,难道是因为不能在还未加载成功的时候就直接调用 JS 方法?(跟 OC 一样)必须在加载完成后的代理里面调用 JS 方法

        this.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                //                System.out.println("图表加载完成!!!!!!!! ");
                configureChartOptionsAndDrawChart(chartModel)
            }
        }
    }

    fun aa_onlyRefreshTheChartDataWithChartModelSeriesArray(seriesElementsArr: Array<AASeriesElement>) {
        // 将对象编译成json
        val gson = Gson()
        val seriesArr = gson.toJson(seriesElementsArr)
        this.loadUrl("javascript:onlyRefreshTheChartDataWithSeries('$seriesArr',')")
    }

    fun aa_refreshChartWithChartModel(chartModel: AAChartModel) {
        // 将对象编译成json
        val gson = Gson()
        val newOptions = gson.toJson(chartModel)
        this.loadUrl("javascript:loadTheHighChartView('$newOptions','$contentWidth','$contentHeight')")
    }

    private fun configureChartOptionsAndDrawChart(chartModel: AAChartModel) {
        // 将对象编译成json
        val gson = Gson()
        optionsJson = gson.toJson(chartModel)
        //        System.out.println("🍎获得了最后的字符串 Options "+optionsJson);
        //
        //
        //        HashMap myJson = AAOptionsConstructor.configureChartOptions(chartModel);
        //        System.out.println("🔥🔥🔥🔥🔥获得了最后的字符串 Options "+optionsJson);

        //        this.loadUrl("javascript:loadTheHighChartView('" + optionsJson + "','" + contentWidth + "','" + contentHeight + "',)");
        this.loadUrl("javascript:loadTheHighChartView('$optionsJson','420','580')")
    }


}
