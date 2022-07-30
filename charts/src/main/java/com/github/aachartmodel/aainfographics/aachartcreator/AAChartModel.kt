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

package com.github.aachartmodel.aainfographics.aachartcreator

import android.content.Context
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle
import com.github.aachartmodel.aainfographics.aatools.AABuilder

enum class AAChartAnimationType(val value: String) {
    Linear("Linear"),
    EaseInQuad("easeInQuad"),
    EaseOutQuad("easeOutQuad"),
    EaseInOutQuad("easeInOutQuad"),
    EaseInCubic("easeInCubic"),
    EaseOutCubic("easeOutCubic"),
    EaseInOutCubic("easeInOutCubic"),
    EaseInQuart("easeInQuart"),
    EaseOutQuart("easeOutQuart"),
    EaseInOutQuart("easeInOutQuart"),
    EaseInQuint("easeInQuint"),
    EaseOutQuint("easeOutQuint"),
    EaseInOutQuint("easeInOutQuint"),
    EaseInSine("easeInSine"),
    EaseOutSine("easeOutSine"),
    EaseInOutSine("easeInOutSine"),
    EaseInExpo("easeInExpo"),
    EaseOutExpo("easeOutExpo"),
    EaseInOutExpo("easeInOutExpo"),
    EaseInCirc("easeInCirc"),
    EaseOutCirc("easeOutCirc"),
    EaseInOutCirc("easeInOutCirc"),
    EaseOutBounce("easeOutBounce"),
    EaseInBack("easeInBack"),
    EaseOutBack("easeOutBack"),
    EaseInOutBack("easeInOutBack"),
    Elastic("elastic"),
    SwingFromTo("swingFromTo"),
    SwingFrom("swingFrom"),
    SwingTo("swingTo"),
    Bounce("bounce"),
    BouncePast("bouncePast"),
    EaseFromTo("easeFromTo"),
    EaseFrom("easeFrom"),
    EaseTo("easeTo"),
}

enum class AAChartType(val value: String) {
    Column("column"), //Column series display one column per value along an X axis.
    Bar("bar"), //A bar series is a special type of column series where the columns are horizontal.
    Area("area"), //The area series type.
    Areaspline("areaspline"), //The area spline series is an area series where the graph between the points is smoothed into a spline.
    Line("line"), //A line series displays information as a series of data points connected by straight line segments.
    Spline("spline"), //A spline series is a special type of line series, where the segments between the data points are smoothed.
    Scatter("scatter"), //A scatter plot uses cartesian coordinates to display values for two variables for a set of data.
    Pie("pie"), //A pie chart is a circular graphic which is divided into slices to illustrate numerical proportion.
    Bubble("bubble"), //A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value.
    Pyramid("pyramid"), //A pyramid series is a special type of funnel, without neck and reversed by default.
    Funnel("funnel"), //Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the modules/funnel.js file is loaded.
    Columnrange("columnrange"), //The column range is a cartesian series type with higher and lower Y values along an X axis. To display horizontal bars, set chart.inverted to true.
    Arearange("arearange"), //The area range series is a carteseian series with higher and lower values for each point along an X axis, where the area between the values is shaded.
    Areasplinerange("areasplinerange"), //The area spline range is a cartesian series type with higher and lower Y values along an X axis. The area inside the range is colored, and the graph outlining the area is a smoothed spline.
    Boxplot("boxplot"), //A box plot is a convenient way of depicting groups of data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum).
    Waterfall("waterfall"), //A waterfall chart displays sequentially introduced positive or negative values in cumulative columns.
    Polygon("polygon"), //A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the color option, and stroke is applied through lineWidth and lineColor options.
    Gauge("gauge"), //Gauges are circular plots displaying one or more values with a dial pointing to values along the perimeter.
    Errorbar("errorbar"), //Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement.
}

enum class AAChartZoomType(val value: String) {
    None("none"),
    X("x"),
    Y("y"),
    XY("xy"),
}

enum class AAChartStackingType(val value: String) {
    False(""),
    Normal("normal"),
    Percent("percent"),
}

enum class AAChartSymbolType(val value: String) {
    Circle("circle"),              //◉ ◉ ◉
    Square("square"),              //■ ■ ■
    Diamond("diamond"),            //◆ ◆ ◆
    Triangle("triangle"),          //▲ ▲ ▲
    TriangleDown("triangle-down"), //▼ ▼ ▼
}

enum class AAChartSymbolStyleType(val value: String) {
    Normal("normal"),
    InnerBlank("innerBlank"),
    BorderBlank("borderBlank"),
}

enum class AAChartLayoutType(val value: String) {
    Horizontal("horizontal"),
    Vertical("vertical"),
}

enum class AAChartAlignType(val value: String) {
    Left("left"),
    Center("center"),
    Right("right"),
}

enum class AAChartVerticalAlignType(val value: String) {
    Top("top"),
    Middle("middle"),
    Bottom("bottom"),
}

enum class AAChartLineDashStyleType(val value: String) {
    Solid("Solid"),                      //———————————————————————————————————
    ShortDash("ShortDash"),              //— — — — — — — — — — — — — — — — — —
    ShortDot("ShortDot"),                //ⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈⵈ
    ShortDashDot("ShortDashDot"),        //—‧—‧—‧—‧—‧—‧—‧—‧—‧—‧—‧—‧—‧—‧—‧—‧—‧—‧
    ShortDashDotDot("ShortDashDotDot"),  //—‧‧—‧‧—‧‧—‧‧—‧‧—‧‧—‧‧—‧‧—‧‧—‧‧—‧‧—‧‧
    Dot("Dot"),                          //‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧‧
    Dash("Dash"),                        //—— —— —— —— —— —— —— —— —— —— —— ——
    LongDash("LongDash"),                //——— ——— ——— ——— ——— ——— ——— ——— ———
    DashDot("DashDot"),                  //——‧——‧——‧——‧——‧——‧——‧——‧——‧——‧——‧——‧
    LongDashDot("LongDashDot"),          //———‧———‧———‧———‧———‧———‧———‧———‧———‧
    LongDashDotDot("LongDashDotDot"),    //———‧‧———‧‧———‧‧———‧‧———‧‧———‧‧———‧‧
}

enum class AAChartFontWeightType(val value: String) {
    Thin("thin"),
    Regular("regular"),
    Bold("bold"),
}

/**
 * @param animationType 动画类型
 * @param animationDuration 动画时间
 * @param title 标题内容
 * @param titleStyle 标题文本风格样式
 * @param subtitle 副标题内容
 * @param subtitleAlign
 * @param subtitleStyle 副标题文本风格样式
 * @param axesTextColor x 轴和 y 轴文字颜色
 * @param chartType 图表类型
 * @param stacking 堆积样式
 * @param markerRadius 折线连接点的半径长度,如果值设置为0,这样就相当于不显示了
 * @param markerSymbol 折线曲线连接点的类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
 * @param markerSymbolStyle
 * @param zoomType 缩放类型 AAChartZoomTypeX表示可沿着 x 轴进行手势缩放
 * @param inverted x 轴是否翻转(垂直)
 * @param xAxisReversed x 轴翻转
 * @param yAxisReversed y 轴翻转
 * @param tooltipEnabled 是否显示浮动提示框(默认显示)
 * @param tooltipValueSuffix 浮动提示框单位后缀
 * @param gradientColorEnable 是否要为渐变色
 * @param polar 是否极化图形(变为雷达图)
 * @param margin 图表外边缘和绘图区域之间的边距
 * @param dataLabelsEnabled 是否显示数据
 * @param dataLabelsStyle
 * @param xAxisLabelsEnabled x轴是否显示数据
 * @param xAxisTickInterval
 * @param categories x轴是否显示数据
 * @param xAxisGridLineWidth x轴网格线的宽度
 * @param xAxisVisible x 轴是否显示
 * @param yAxisVisible y 轴是否显示
 * @param yAxisLabelsEnabled y轴是否显示数据
 * @param yAxisTitle y轴标题
 * @param yAxisLineWidth y 轴轴线的宽度
 * @param yAxisMin
 * @param yAxisMax
 * @param yAxisAllowDecimals
 * @param yAxisGridLineWidth y轴网格线的宽度
 * @param colorsTheme 图表主题颜色数组
 * @param legendEnabled 是否显示图例
 * @param backgroundColor 图表背景色
 * @param borderRadius 柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效,设置为1000时,柱形图或者条形图头部为楔形)
 * @param series
 * @param touchEventEnabled 是否支持用户触摸事件
 * @param scrollablePlotArea
 */
class AAChartModel(
    var animationType: AAChartAnimationType? = AAChartAnimationType.Linear,
    var animationDuration: Int? = 500,
    var title: String? = "",
    var titleStyle: AAStyle? = null,
    var subtitle: String? = "",
    var subtitleAlign: AAChartAlignType? = null,
    var subtitleStyle: AAStyle? = null,
    var axesTextColor: String? = null,
    var chartType: AAChartType? = AAChartType.Line,
    var stacking: AAChartStackingType? = AAChartStackingType.False,
    var markerRadius: Number? = 6f,
    var markerSymbol: AAChartSymbolType? = null,
    var markerSymbolStyle: AAChartSymbolStyleType? = AAChartSymbolStyleType.Normal,
    var zoomType: AAChartZoomType? = AAChartZoomType.None,
    var inverted: Boolean? = false,
    var xAxisReversed: Boolean? = false,
    var yAxisReversed: Boolean? = false,
    var tooltipEnabled: Boolean? = null,
    var tooltipValueSuffix: String? = null,
    var gradientColorEnable: Boolean? = false,
    var polar: Boolean? = false,
    var margin: Array<Number>? = null,
    var dataLabelsEnabled: Boolean? = false,
    var dataLabelsStyle: AAStyle? = null,
    var xAxisLabelsEnabled: Boolean? = true,
    var xAxisTickInterval: Int? = null,
    var categories: Array<String>? = null,
    var xAxisGridLineWidth: Number? = 0f,
    var xAxisVisible: Boolean? = null,
    var yAxisVisible: Boolean? = null,
    var yAxisLabelsEnabled: Boolean? = true,
    var yAxisTitle: String? = null,
    var yAxisLineWidth: Number? = null,
    var yAxisMin: Number? = null,
    var yAxisMax: Number? = null,
    var yAxisAllowDecimals: Boolean? = null,
    var yAxisGridLineWidth: Number? = 1f,
    var colorsTheme: Array<Any>? = arrayOf("#fe117c", "#ffc069", "#06caf4", "#7dffc0"),
    var legendEnabled: Boolean? = true,
    var backgroundColor: Any? = "#ffffff",
    var borderRadius: Number? = 0f,
    var series: Array<Any>? = null,
    var touchEventEnabled: Boolean? = null,
    var scrollablePlotArea: AAScrollablePlotArea? = null
) {

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

    fun titleStyle(prop: AAStyle): AAChartModel {
        titleStyle = prop
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

    fun subtitleStyle(prop: AAStyle): AAChartModel {
        subtitleStyle = prop
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

    fun markerRadius(prop: Number?): AAChartModel {
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

    fun tooltipValueSuffix(prop: String?): AAChartModel {
        tooltipValueSuffix = prop
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

    fun margin(prop: Array<Number>?): AAChartModel {
        margin = prop
        return this
    }

    fun dataLabelsEnabled(prop: Boolean?): AAChartModel {
        dataLabelsEnabled = prop
        return this
    }

    fun dataLabelsStyle(prop: AAStyle): AAChartModel {
        dataLabelsStyle = prop
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

    fun xAxisGridLineWidth(prop: Number?): AAChartModel {
        xAxisGridLineWidth = prop
        return this
    }

    fun yAxisGridLineWidth(prop: Number?): AAChartModel {
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

    fun yAxisLineWidth(prop: Number?): AAChartModel {
        yAxisLineWidth = prop
        return this
    }

    fun yAxisMin(prop: Number?): AAChartModel {
        yAxisMin = prop
        return this
    }

    fun yAxisMax(prop: Number?): AAChartModel {
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

    fun borderRadius(prop: Number?): AAChartModel {
        borderRadius = prop
        return this
    }

    fun series(prop: Array<Any>): AAChartModel {
        series = prop
        return this
    }

    fun touchEventEnabled(prop: Boolean?): AAChartModel {
        touchEventEnabled = prop
        return this
    }

    fun scrollablePlotArea(prop: AAScrollablePlotArea): AAChartModel {
        scrollablePlotArea = prop
        return this
    }

    companion object {
        fun Builder(context: Context): AABuilder {
            return AABuilder(context);
        }
    }
}



fun AAChartModel.aa_toAAOptions(): AAOptions {
    return AAOptionsConstructor.configureChartOptions(this)
}