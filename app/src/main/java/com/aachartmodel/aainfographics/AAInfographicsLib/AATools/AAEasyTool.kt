/**
 * Copyright (C), 2015-2019, 飞牛集达有限公司
 * FileName: AAEasyTool
 * Author: ios-fn
 * Date: 2019-06-16 19:05
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger

import com.example.chartcorekotlin.AAChartConfiger.AAChartType


object AAEasyTool {

    fun pureJavaScriptFunctionString(jsFunctionStr: String): String {
        var pureJSFunctionStr = jsFunctionStr
        pureJSFunctionStr = pureJSFunctionStr.replace("'", "\"")
        pureJSFunctionStr = pureJSFunctionStr.replace("\u0000", "")
        pureJSFunctionStr = pureJSFunctionStr.replace("\n", "")
        pureJSFunctionStr = pureJSFunctionStr.replace("\\", "\\\\")
        pureJSFunctionStr = pureJSFunctionStr.replace("\"", "\\\"")
//        pureJSFunctionStr = pureJSFunctionStr.replace("\'", "\\\'");
        pureJSFunctionStr = pureJSFunctionStr.replace("\n", "\\n")
        pureJSFunctionStr = pureJSFunctionStr.replace("\r", "\\r")
//        pureJSFunctionStr = pureJSFunctionStr.replace("\f", "\\f")
        pureJSFunctionStr = pureJSFunctionStr.replace("\u2028", "\\u2028")
        pureJSFunctionStr = pureJSFunctionStr.replace("\u2029", "\\u2029")

        return pureJSFunctionStr
    }

}