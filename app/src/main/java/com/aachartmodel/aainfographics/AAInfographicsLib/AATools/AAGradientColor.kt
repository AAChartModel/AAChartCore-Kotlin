package com.example.chartcorekotlin.AAChartConfiger

import java.util.HashMap


object AAGradientColor {


    fun oceanBlueColor(): HashMap<String, Any> {
        return configureGradientColor("#2E3192", "#1BFFFF")
    }

    fun sanguineColor(): HashMap<String, Any> {
        return configureGradientColor("#D4145A", "#FBB03B")
    }

    fun lusciousLimeColor(): HashMap<String, Any> {
        return configureGradientColor("#009245", "#FCEE21")
    }

    fun purpleLakeColor(): HashMap<String, Any> {
        return configureGradientColor("#662D8C", "#ED1E79")
    }

    fun freshPapayaColor(): HashMap<String, Any> {
        return configureGradientColor("#ED1C24", "#FCEE21")
    }

    fun ultramarineColor(): HashMap<String, Any> {
        return configureGradientColor("#00A8C5", "#FFFF7E")
    }

    fun pinkSugarColor(): HashMap<String, Any> {
        return configureGradientColor("#D74177", "#FFE98A")
    }

    fun lemonDrizzleColor(): HashMap<String, Any> {
        return configureGradientColor("#FB872B", "#D9E021")
    }

    fun victoriaPurpleColor(): HashMap<String, Any> {
        return configureGradientColor("#312A6C", "#852D91")
    }

    fun springGreensColor(): HashMap<String, Any> {
        return configureGradientColor("#009E00", "#FFFF96")
    }

    fun mysticMauveColor(): HashMap<String, Any> {
        return configureGradientColor("#B066FE", "#63E2FF")
    }

    fun reflexSilverColor(): HashMap<String, Any> {
        return configureGradientColor("#808080", "#E6E6E6")
    }

    fun neonGlowColor(): HashMap<String, Any> {
        return configureGradientColor("#00FFA1", "#00FFFF")
    }

    fun berrySmoothieColor(): HashMap<String, Any> {
        return configureGradientColor("#8E78FF", "#FC7D7B")
    }

    fun newLeafColor(): HashMap<String, Any> {
        return configureGradientColor("#00537E", "#3AA17E")
    }

    fun cottonCandyColor(): HashMap<String, Any> {
        return configureGradientColor("#FCA5F1", "#B5FFFF")
    }

    fun pixieDustColor(): HashMap<String, Any> {
        return configureGradientColor("#D585FF", "#00FFEE")
    }

    fun fizzyPeachColor(): HashMap<String, Any> {
        return configureGradientColor("#F24645", "#EBC08D")
    }

    fun sweetDreamColor(): HashMap<String, Any> {
        return configureGradientColor("#3A3897", "#A3A1FF")
    }

    fun firebrickColor(): HashMap<String, Any> {
        return configureGradientColor("#45145A", "#FF5300")
    }

    fun wroughtIronColor(): HashMap<String, Any> {
        return configureGradientColor("#333333", "#5A5454")
    }

    fun deepSeaColor(): HashMap<String, Any> {
        return configureGradientColor("#4F00BC", "#29ABE2")
    }

    fun coastalBreezeColor(): HashMap<String, Any> {
        return configureGradientColor("#00B7FF", "#FFFFC7")
    }

    fun eveningDelightColor(): HashMap<String, Any> {
        return configureGradientColor("#93278F", "#00A99D")
    }

    private fun configureGradientColor(startColor: String,
                                       endColor: String): HashMap<String, Any> {
        val linearGradientColorMap = HashMap<String, Int>()
        linearGradientColorMap["x1"] = 0
        linearGradientColorMap["y1"] = 1
        linearGradientColorMap["x2"] = 0
        linearGradientColorMap["y2"] = 0
        val stopsArr = arrayOf<Any>(arrayOf(0, startColor), arrayOf(1, endColor))
        val gradientColorMap = HashMap<String, Any>()
        gradientColorMap["linearGradient"] = linearGradientColorMap
        gradientColorMap["stops"] = stopsArr
        return gradientColorMap
    }
}
