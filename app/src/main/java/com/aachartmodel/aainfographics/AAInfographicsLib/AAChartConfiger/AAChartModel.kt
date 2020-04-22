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

package com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger

import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.AAScrollablePlotArea

enum class AAChartAnimationType(val value :String){
    Linear         ("Linear"),
    EaseInQuad     ("easeInQuad"),
    EaseOutQuad    ("easeOutQuad"),
    EaseInOutQuad  ("easeInOutQuad"),
    EaseInCubic    ("easeInCubic"),
    EaseOutCubic   ("easeOutCubic"),
    EaseInOutCubic ("easeInOutCubic"),
    EaseInQuart    ("easeInQuart"),
    EaseOutQuart   ("easeOutQuart"),
    EaseInOutQuart ("easeInOutQuart"),
    EaseInQuint    ("easeInQuint"),
    EaseOutQuint   ("easeOutQuint"),
    EaseInOutQuint ("easeInOutQuint"),
    EaseInSine     ("easeInSine"),
    EaseOutSine    ("easeOutSine"),
    EaseInOutSine  ("easeInOutSine"),
    EaseInExpo     ("easeInExpo"),
    EaseOutExpo    ("easeOutExpo"),
    EaseInOutExpo  ("easeInOutExpo"),
    EaseInCirc     ("easeInCirc"),
    EaseOutCirc    ("easeOutCirc"),
    EaseInOutCirc  ("easeInOutCirc"),
    EaseOutBounce  ("easeOutBounce"),
    EaseInBack     ("easeInBack"),
    EaseOutBack    ("easeOutBack"),
    EaseInOutBack  ("easeInOutBack"),
    Elastic        ("elastic"),
    SwingFromTo    ("swingFromTo"),
    SwingFrom      ("swingFrom"),
    SwingTo        ("swingTo"),
    Bounce         ("bounce"),
    BouncePast     ("bouncePast"),
    EaseFromTo     ("easeFromTo"),
    EaseFrom       ("easeFrom"),
    EaseTo         ("easeTo"),
}

enum class AAChartType(val value: String) {
    Column          ("column"),
    Bar             ("bar"),
    Area            ("area"),
    Areaspline      ("areaspline"),
    Line            ("line"),
    Spline          ("spline"),
    Scatter         ("scatter"),
    Pie             ("pie"),
    Bubble          ("bubble"),
    Pyramid         ("pyramid"),
    Funnel          ("funnel"),
    Columnrange     ("columnrange"),
    Arearange       ("arearange"),
    Areasplinerange ("areasplinerange"),
    Boxplot         ("boxplot"),
    Waterfall       ("waterfall"),
    Polygon         ("polygon"),
    Gauge           ("gauge"),
    Errorbar        ("errorbar"),
}

enum class AAChartZoomType(val value: String) {
    None ("none"),
    X    ("x"),
    Y    ("y"),
    XY   ("xy"),
}

enum class AAChartStackingType(val value: String) {
    False   (""),
    Normal  ("normal"),
    Percent ("percent"),
}

enum class AAChartSymbolType(val value: String) {
    Circle         ("circle"),
    Square         ("square"),
    Diamond        ("diamond"),
    Triangle       ("triangle"),
    TriangleDown   ("triangle-down"),
}

enum class AAChartSymbolStyleType(val value: String) {
    Normal       ("normal"),
    InnerBlank   ("innerBlank"),
    BorderBlank  ("borderBlank"),
}

enum class AAChartLayoutType(val value: String) {
    Horizontal  ("horizontal"),
    Vertical    ("vertical"),
}

enum class AAChartAlignType(val value: String) {
    Left     ("left"),
    Center   ("center"),
    Right    ("right"),
}

enum class AAChartVerticalAlignType(val value: String) {
    Top     ("top"),
    Middle  ("middle"),
    Bottom  ("bottom"),
}

enum class AAChartLineDashStyleType(val value: String) {
    Solid           ("Solid"),
    ShortDash       ("ShortDash"),
    ShortDot        ("ShortDot"),
    ShortDashDot    ("ShortDashDot"),
    ShortDashDotDot ("ShortDashDotDot"),
    Dot             ("Dot"),
    Dash            ("Dash"),
    LongDash        ("LongDash"),
    DashDot         ("DashDot"),
    LongDashDot     ("LongDashDot"),
    LongDashDotDot  ("LongDashDotDot"),
}

enum class AAChartFontWeightType(val value: String) {
    Thin     ("thin"),
    Regular  ("regular"),
    Bold     ("bold"),
}


class AAChartModel {

    var animationType: AAChartAnimationType? = null          //动画类型
    var animationDuration: Int? = null         //动画时间
    var title: String? = null                  //标题内容
    var titleFontColor: String? = null         //标题字体颜色
    var titleFontSize: Float? = null           //标题字体大小
    var titleFontWeight: AAChartFontWeightType? = null        //标题字体粗细
    var subtitle: String? = null               //副标题内容
    var subtitleAlign: AAChartAlignType? = null
    var subtitleFontColor: String? = null      //副标题字体颜色
    var subtitleFontSize: Float? = null        //副标题字体大小
    var subtitleFontWeight: AAChartFontWeightType? = null     //副标题字体粗细
    var axesTextColor: String? = null          //x 轴和 y 轴文字颜色
    var chartType: AAChartType? = null              //图表类型
    var stacking: AAChartStackingType? = null               //堆积样式
    var markerRadius: Float? = null            //折线连接点的半径长度
    var markerSymbol: AAChartSymbolType? = null           //折线曲线连接点的类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
    var markerSymbolStyle: AAChartSymbolStyleType? = null
    var zoomType: AAChartZoomType? = null               //缩放类型 AAChartZoomTypeX表示可沿着 x 轴进行手势缩放
    var pointHollow: Boolean? = null           //折线或者曲线的连接点是否为空心的
    var inverted: Boolean? = null              //x 轴是否翻转(垂直)
    var xAxisReversed: Boolean? = null         //x 轴翻转
    var yAxisReversed: Boolean? = null         //y 轴翻转
    var tooltipEnabled: Boolean? = null        //是否显示浮动提示框(默认显示)
    var tooltipValueSuffix: String? = null     //浮动提示框单位后缀
    var tooltipCrosshairs: Boolean? = null     //是否显示准星线(默认显示)
    var gradientColorEnable: Boolean? = null   //是否要为渐变色
    var polar: Boolean? = null                 //是否极化图形(变为雷达图)
    var marginLeft: Float? = null
    var marginRight: Float? = null
    var dataLabelsEnabled: Boolean? = null     //是否显示数据
    var dataLabelsFontColor: String? = null
    var dataLabelsFontSize: Float? = null
    var dataLabelsFontWeight: AAChartFontWeightType? = null
    var xAxisLabelsEnabled: Boolean? = null    //x轴是否显示数据
    var xAxisTickInterval: Int? = null
    var categories: Array<String>? = null      //x轴是否显示数据
    var xAxisGridLineWidth: Float? = null      //x轴网格线的宽度
    var xAxisVisible: Boolean? = null          //x 轴是否显示
    var yAxisVisible: Boolean? = null          //y 轴是否显示
    var yAxisLabelsEnabled: Boolean? = null    //y轴是否显示数据
    var yAxisTitle: String? = null             //y轴标题
    var yAxisLineWidth: Float? = null          //y 轴轴线的宽度
    var yAxisMin: Float? = null
    var yAxisMax: Float? = null
    var yAxisAllowDecimals: Boolean? = null
    var yAxisGridLineWidth: Float? = null      //y轴网格线的宽度
    var colorsTheme: Array<Any>? = null        //图表主题颜色数组
    var legendEnabled: Boolean? = null         //是否显示图例
    var backgroundColor: Any ? = null          //图表背景色
    var borderRadius: Float? = null            //柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效)
    var series: Array<AASeriesElement>? = null
    var touchEventEnabled: Boolean? = null     //是否支持用户触摸事件
    var scrollablePlotArea: AAScrollablePlotArea? = null


    fun animationType(prop: AAChartAnimationType): AAChartModel {
        animationType = prop
        return this
    }

    fun animationDuration(prop: Int?): AAChartModel {
        animationDuration = prop
        return this
    }

    fun title(prop: String): AAChartModel {
        title = prop
        return this
    }

    fun titleFontColor(prop: String): AAChartModel {
        titleFontColor = prop
        return this
    }

    fun titleFontSize(prop: Float?): AAChartModel {
        titleFontSize = prop
        return this
    }

    fun titleFontWeight(prop: AAChartFontWeightType): AAChartModel {
        titleFontWeight = prop
        return this
    }

    fun subtitle(prop: String): AAChartModel {
        subtitle = prop
        return this
    }

    fun subtitleAlign(prop: AAChartAlignType): AAChartModel {
        subtitleAlign = prop
        return this
    }

    fun subtitleFontColor(prop: String): AAChartModel {
        subtitleFontColor = prop
        return this
    }

    fun subtitleFontSize(prop: Float?): AAChartModel {
        subtitleFontSize = prop
        return this
    }

    fun subtitleFontWeight(prop: AAChartFontWeightType): AAChartModel {
        subtitleFontWeight = prop
        return this
    }

    fun axesTextColor(prop: String): AAChartModel {
        axesTextColor = prop
        return this
    }

    fun chartType(prop: AAChartType): AAChartModel {
        chartType = prop
        return this
    }

    fun stacking(prop: AAChartStackingType): AAChartModel {
        stacking = prop
        return this
    }

    fun markerRadius(prop: Float?): AAChartModel {
        markerRadius = prop
        return this
    }

    fun markerSymbol(prop: AAChartSymbolType): AAChartModel {
        markerSymbol = prop
        return this
    }

    fun markerSymbolStyle(prop: AAChartSymbolStyleType): AAChartModel {
        markerSymbolStyle = prop
        return this
    }

    fun zoomType(prop: AAChartZoomType): AAChartModel {
        zoomType = prop
        return this
    }

    fun pointHollow(prop: Boolean?): AAChartModel {
        pointHollow = prop
        return this
    }

    fun inverted(prop: Boolean?): AAChartModel {
        inverted = prop
        return this
    }

    fun xAxisReversed(prop: Boolean?): AAChartModel {
        xAxisReversed = prop
        return this
    }

    fun yAxisReversed(prop: Boolean?): AAChartModel {
        yAxisReversed = prop
        return this
    }

    fun tooltipEnabled(prop: Boolean?): AAChartModel {
        tooltipEnabled = prop
        return this
    }

    fun tooltipCrosshairs(prop: Boolean?): AAChartModel {
        tooltipCrosshairs = prop
        return this
    }

    fun gradientColorEnable(prop: Boolean?): AAChartModel {
        gradientColorEnable = prop
        return this
    }

    fun polar(prop: Boolean?): AAChartModel {
        polar = prop
        return this
    }

    fun marginLeft(prop: Float?): AAChartModel {
        marginLeft = prop
        return this
    }

    fun marginright(prop: Float?): AAChartModel {
        marginRight = prop
        return this
    }

    fun dataLabelsEnabled(prop: Boolean?): AAChartModel {
        dataLabelsEnabled = prop
        return this
    }

    fun dataLabelsFontColor(prop: String): AAChartModel {
        dataLabelsFontColor = prop
        return this
    }

    fun dataLabelsFontSize(prop: Float?): AAChartModel {
        dataLabelsFontSize = prop
        return this
    }

    fun dataLabelsFontWeight(prop: AAChartFontWeightType): AAChartModel {
        dataLabelsFontWeight = prop
        return this
    }

    fun xAxisLabelsEnabled(prop: Boolean?): AAChartModel {
        xAxisLabelsEnabled = prop
        return this
    }

    fun xAxisTickInterval(prop: Int?): AAChartModel {
        xAxisTickInterval = prop
        return this
    }

    fun categories(prop: Array<String>): AAChartModel {
        categories = prop
        return this
    }

    fun xAxisGridLineWidth(prop: Float?): AAChartModel {
        xAxisGridLineWidth = prop
        return this
    }

    fun yAxisGridLineWidth(prop: Float?): AAChartModel {
        yAxisGridLineWidth = prop
        return this
    }

    fun xAxisVisible(prop: Boolean?): AAChartModel {
        xAxisVisible = prop
        return this
    }

    fun yAxisVisible(prop: Boolean?): AAChartModel {
        yAxisVisible = prop
        return this
    }

    fun yAxisLabelsEnabled(prop: Boolean?): AAChartModel {
        yAxisLabelsEnabled = prop
        return this
    }

    fun yAxisTitle(prop: String): AAChartModel {
        yAxisTitle = prop
        return this
    }

    fun yAxisLineWidth(prop: Float?): AAChartModel {
        yAxisLineWidth = prop
        return this
    }

    fun yAxisMin(prop: Float?): AAChartModel {
        yAxisMin = prop
        return this
    }

    fun yAxisMax(prop: Float?): AAChartModel {
        yAxisMax = prop
        return this
    }

    fun yAxisAllowDecimals(prop: Boolean?): AAChartModel {
        yAxisAllowDecimals = prop
        return this
    }

    fun colorsTheme(prop: Array<Any>): AAChartModel {
        colorsTheme = prop
        return this
    }

    fun legendEnabled(prop: Boolean?): AAChartModel {
        legendEnabled = prop
        return this
    }

    fun backgroundColor(prop: Any): AAChartModel {
        backgroundColor = prop
        return this
    }


    fun borderRadius(prop: Float?): AAChartModel {
        borderRadius = prop
        return this
    }

    fun series(prop: Array<AASeriesElement>): AAChartModel {
        series = prop
        return this
    }

    fun touchEventEnabled(prop: Boolean?): AAChartModel {
        touchEventEnabled = prop
        return this
    }

    fun scrollablePlotArea(prop: AAScrollablePlotArea): AAChartModel? {
        scrollablePlotArea = prop
        return this
    }

     init {
         title                = ""
         subtitle             = ""
         chartType            = AAChartType.Line
         animationDuration    = 500 //以毫秒为单位
         animationType        = AAChartAnimationType.Linear
         pointHollow          = false
         inverted             = false
         stacking             = AAChartStackingType.False
         xAxisReversed        = false
         yAxisReversed        = false
         zoomType             = AAChartZoomType.None
         dataLabelsEnabled    = false
         markerSymbolStyle    = AAChartSymbolStyleType.Normal
         colorsTheme          = arrayOf("#fe117c", "#ffc069", "#06caf4", "#7dffc0")
         tooltipCrosshairs    = true
         gradientColorEnable  = false
         polar                = false
         xAxisLabelsEnabled   = true
         xAxisGridLineWidth   = 0f
         yAxisLabelsEnabled   = true
         yAxisGridLineWidth   = 1f
         legendEnabled        = true
         backgroundColor      = "#ffffff"
         borderRadius         = 0f//柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效,设置为1000时,柱形图或者条形图头部为楔形)
         markerRadius         = 6f//折线连接点的半径长度,如果值设置为0,这样就相当于不显示了
         titleFontColor       = "#000000" //标题字体颜色为黑色
         titleFontWeight      = AAChartFontWeightType.Regular //常规字体
         titleFontSize        = 11f
         subtitleFontColor    = "#000000" //副标题字体颜色为黑色
         subtitleFontWeight   = AAChartFontWeightType.Regular //常规字体
         subtitleFontSize     = 9f
         dataLabelsFontColor  = "#000000" //数据标签默认颜色为黑色
         dataLabelsFontWeight = AAChartFontWeightType.Bold //图表的数据字体为粗体
         dataLabelsFontSize   = 10f

     }


}