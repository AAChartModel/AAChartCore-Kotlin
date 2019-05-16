package com.example.chartcorekotlin

import com.example.chartcorekotlin.AAChartConfiger.*

class CustomStyleChartComposer  {

     fun configureColorfulChart(): AAChartModel {
        val colorsNameArr = arrayOf(
            "red",
            "orange",
            "yellow",
            "green",
            "cyan",
            "blue",
            "purple",
            "gray",
            "darkGray",
            "lightGray",
            "magenta",
            "brown",
            "black"
        )

        val colorsArr = arrayOf<Any>(
            AAColor.redColor(),
            AAColor.orangeColor(),
            AAColor.yellowColor(),
            AAColor.greenColor(),
            AAColor.cyanColor(),
            AAColor.blueColor(),
            AAColor.purpleColor(),
            AAColor.grayColor(),
            AAColor.darkGrayColor(),
            AAColor.lightGrayColor(),
            AAColor.magentaColor(),
            AAColor.brownColor(),
            AAColor.blackColor()
        )

       return AAChartModel()
            .chartType(AAChartType.Bar)
            .animationType(AAChartAnimationType.Bounce)
            .title("Colorful Chart")
            .subtitle("use AAColor to get color string")
            .dataLabelEnabled(false)
            .categories(colorsNameArr)
            .colorsTheme(colorsArr)
            .stacking(AAChartStackingType.Percent)
            .series(arrayOf(
                    AASeriesElement()
                        .name("Tokyo")
                        .data(arrayOf(149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4))
                        .colorByPoint(true)
                )
            )

    }


    internal fun configureColorfulGradientColorChart(): AAChartModel {

        val gradientColorNamesArr = arrayOf(
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
            "newLeaf",
            "cottonCandy",
            "pixieDust",
            "fizzyPeach",
            "sweetDream",
            "firebrick",
            "wroughtIron",
            "deepSea",
            "coastalBreeze",
            "eveningDelight"
        )

        val gradientColorArr = arrayOf<Any>(
            AAGradientColor.oceanBlueColor(),
            AAGradientColor.sanguineColor(),
            AAGradientColor.lusciousLimeColor(),
            AAGradientColor.purpleLakeColor(),
            AAGradientColor.freshPapayaColor(),
            AAGradientColor.ultramarineColor(),
            AAGradientColor.pinkSugarColor(),
            AAGradientColor.lemonDrizzleColor(),
            AAGradientColor.victoriaPurpleColor(),
            AAGradientColor.springGreensColor(),
            AAGradientColor.mysticMauveColor(),
            AAGradientColor.reflexSilverColor(),
            AAGradientColor.newLeafColor(),
            AAGradientColor.cottonCandyColor(),
            AAGradientColor.pixieDustColor(),
            AAGradientColor.fizzyPeachColor(),
            AAGradientColor.sweetDreamColor(),
            AAGradientColor.firebrickColor(),
            AAGradientColor.wroughtIronColor(),
            AAGradientColor.deepSeaColor(),
            AAGradientColor.coastalBreezeColor(),
            AAGradientColor.eveningDelightColor()
        )

       return AAChartModel()
            .chartType(AAChartType.Bar)
            .title("Colorful Column Chart")
            .subtitle("single data array colorful column chart")
            .categories(gradientColorNamesArr)
            .colorsTheme(gradientColorArr)
            .yAxisTitle("gradient color")
            .stacking(AAChartStackingType.Percent)
            .series(arrayOf(
                    AASeriesElement()
                        .name("Tokyo")
                        .data(arrayOf(149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4))
                        .colorByPoint(true)
                )
            )

    }

}
