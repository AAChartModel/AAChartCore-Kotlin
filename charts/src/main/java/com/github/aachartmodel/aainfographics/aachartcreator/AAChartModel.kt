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
import android.os.Build
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle

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
    Column("column"),
    Bar("bar"),
    Area("area"),
    Areaspline("areaspline"),
    Line("line"),
    Spline("spline"),
    Scatter("scatter"),
    Pie("pie"),
    Bubble("bubble"),
    Pyramid("pyramid"),
    Funnel("funnel"),
    Columnrange("columnrange"),
    Arearange("arearange"),
    Areasplinerange("areasplinerange"),
    Boxplot("boxplot"),
    Waterfall("waterfall"),
    Polygon("polygon"),
    Gauge("gauge"),
    Errorbar("errorbar"),
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
    Circle("circle"),
    Square("square"),
    Diamond("diamond"),
    Triangle("triangle"),
    TriangleDown("triangle-down"),
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
    Solid("Solid"),
    ShortDash("ShortDash"),
    ShortDot("ShortDot"),
    ShortDashDot("ShortDashDot"),
    ShortDashDotDot("ShortDashDotDot"),
    Dot("Dot"),
    Dash("Dash"),
    LongDash("LongDash"),
    DashDot("DashDot"),
    LongDashDot("LongDashDot"),
    LongDashDotDot("LongDashDotDot"),
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
    var markerRadius: Float? = 6f,
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
    var margin: Array<Float>? = null,
    var dataLabelsEnabled: Boolean? = false,
    var dataLabelsStyle: AAStyle? = null,
    var xAxisLabelsEnabled: Boolean? = true,
    var xAxisTickInterval: Int? = null,
    var categories: Array<String>? = null,
    var xAxisGridLineWidth: Float? = 0f,
    var xAxisVisible: Boolean? = null,
    var yAxisVisible: Boolean? = null,
    var yAxisLabelsEnabled: Boolean? = true,
    var yAxisTitle: String? = null,
    var yAxisLineWidth: Float? = null,
    var yAxisMin: Float? = null,
    var yAxisMax: Float? = null,
    var yAxisAllowDecimals: Boolean? = null,
    var yAxisGridLineWidth: Float? = 1f,
    var colorsTheme: Array<Any>? = arrayOf("#fe117c", "#ffc069", "#06caf4", "#7dffc0"),
    var legendEnabled: Boolean? = true,
    var backgroundColor: Any? = "#ffffff",
    var borderRadius: Float? = 0f,
    var series: Array<AASeriesElement>? = null,
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

    fun margin(prop: Array<Float>?): AAChartModel {
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

    fun scrollablePlotArea(prop: AAScrollablePlotArea): AAChartModel {
        scrollablePlotArea = prop
        return this
    }

    /**
     * This Builder can help you set strings and dimensions from application resources. It enforces
     * stricter typing than AAChartModel to prevent you from setting invalid values.
     */
    class Builder(context: Context) {
        private val applicationContext = context.applicationContext
        private val resources = applicationContext.resources

        private var animationType: AAChartAnimationType? = AAChartAnimationType.Linear
        private var animationDuration: Int? = 500
        private var title: String? = ""
        private var titleStyle: AAStyle? = null
        private var subtitle: String? = ""
        private var subtitleAlign: AAChartAlignType? = null
        private var subtitleStyle: AAStyle? = null
        private var axesTextColor: String? = null
        private var chartType: AAChartType? = AAChartType.Line
        private var stacking: AAChartStackingType? = AAChartStackingType.False
        private var markerRadius: Float? = 6f
        private var markerSymbol: AAChartSymbolType? = null
        private var markerSymbolStyle: AAChartSymbolStyleType? = AAChartSymbolStyleType.Normal
        private var zoomType: AAChartZoomType? = AAChartZoomType.None
        private var inverted: Boolean? = false
        private var xAxisReversed: Boolean? = false
        private var yAxisReversed: Boolean? = false
        private var tooltipEnabled: Boolean? = null
        private var tooltipValueSuffix: String? = null
        private var gradientColorEnable: Boolean? = false
        private var polar: Boolean? = false
        private var margin: Array<Float>? = null
        private var dataLabelsEnabled: Boolean? = false
        private var dataLabelsStyle: AAStyle? = null
        private var xAxisLabelsEnabled: Boolean? = true
        private var xAxisTickInterval: Int? = null
        private var categories: Array<String>? = null
        private var xAxisGridLineWidth: Float? = 0f
        private var xAxisVisible: Boolean? = null
        private var yAxisVisible: Boolean? = null
        private var yAxisLabelsEnabled: Boolean? = true
        private var yAxisTitle: String? = null
        private var yAxisLineWidth: Float? = null
        private var yAxisMin: Float? = null
        private var yAxisMax: Float? = null
        private var yAxisAllowDecimals: Boolean? = null
        private var yAxisGridLineWidth: Float? = 1f
        private var colorsTheme: Array<Any>? = arrayOf("#fe117c", "#ffc069", "#06caf4", "#7dffc0")
        private var legendEnabled: Boolean? = true
        private var backgroundColor: Any? = "#ffffff"
        private var borderRadius: Float? = 0f
        private var series: Array<AASeriesElement>? = null
        private var touchEventEnabled: Boolean? = null
        private var scrollablePlotArea: AAScrollablePlotArea? = null

        constructor(context: Context, source: AAChartModel) : this(context) {
            set(source)
        }

        private fun getString(id: Int, vararg formatArgs: Any?): String =
            resources.getString(id, formatArgs)

        private fun getColor(colorResId: Int): Int {
            return if (Build.VERSION.SDK_INT >= 23) {
                applicationContext.getColor(colorResId)
            } else {
                resources.getColor(colorResId)
            }
        }

        private fun Int.toColorString() = String.format("#%06X", 0xFFFFFF and this)

        private fun getDimen(dimenResId: Int): Float {
            return resources.getDimension(dimenResId)
        }

        fun set(prop: AAChartModel): Builder {
            animationType = prop.animationType
            animationDuration = prop.animationDuration
            title = prop.title
            titleStyle = prop.titleStyle
            subtitle = prop.subtitle
            subtitleAlign = prop.subtitleAlign
            subtitleStyle = prop.subtitleStyle
            axesTextColor = prop.axesTextColor
            chartType = prop.chartType
            stacking = prop.stacking
            markerRadius = prop.markerRadius
            markerSymbol = prop.markerSymbol
            markerSymbolStyle = prop.markerSymbolStyle
            zoomType = prop.zoomType
            inverted = prop.inverted
            xAxisReversed = prop.xAxisReversed
            yAxisReversed = prop.yAxisReversed
            tooltipEnabled = prop.tooltipEnabled
            tooltipValueSuffix = prop.tooltipValueSuffix
            gradientColorEnable = prop.gradientColorEnable
            polar = prop.polar
            margin = prop.margin
            dataLabelsEnabled = prop.dataLabelsEnabled
            dataLabelsStyle = prop.dataLabelsStyle
            xAxisLabelsEnabled = prop.xAxisLabelsEnabled
            xAxisTickInterval = prop.xAxisTickInterval
            categories = prop.categories
            xAxisGridLineWidth = prop.xAxisGridLineWidth
            xAxisVisible = prop.xAxisVisible
            yAxisVisible = prop.yAxisVisible
            yAxisLabelsEnabled = prop.yAxisLabelsEnabled
            yAxisTitle = prop.yAxisTitle
            yAxisLineWidth = prop.yAxisLineWidth
            yAxisMin = prop.yAxisMin
            yAxisMax = prop.yAxisMax
            yAxisAllowDecimals = prop.yAxisAllowDecimals
            yAxisGridLineWidth = prop.yAxisGridLineWidth
            colorsTheme = prop.colorsTheme
            legendEnabled = prop.legendEnabled
            backgroundColor = prop.backgroundColor
            borderRadius = prop.borderRadius
            series = prop.series
            touchEventEnabled = prop.touchEventEnabled
            scrollablePlotArea = prop.scrollablePlotArea
            return this
        }

        fun setAnimationType(prop: AAChartAnimationType): Builder {
            animationType = prop
            return this
        }

        fun setAnimationDuration(prop: Int): Builder {
            animationDuration = prop
            return this
        }

        fun setTitle(prop: String): Builder {
            title = prop
            return this
        }

        fun setTitle(id: Int, vararg formatArgs: Any?): Builder =
            setTitle(getString(id, formatArgs))

        fun setTitleStyle(prop: AAStyle): Builder {
            titleStyle = prop
            return this
        }

        fun setSubtitle(prop: String): Builder {
            subtitle = prop
            return this
        }

        fun setSubtitle(id: Int, vararg formatArgs: Any?): Builder =
            setSubtitle(getString(id, formatArgs))

        fun setSubtitleAlign(prop: AAChartAlignType): Builder {
            subtitleAlign = prop
            return this
        }

        fun setSubtitleStyle(prop: AAStyle): Builder {
            subtitleStyle = prop
            return this
        }

        fun setAxesTextColor(prop: String): Builder {
            axesTextColor = prop
            return this
        }

        fun setAxesTextColor(color: Int): Builder = setAxesTextColor(color.toColorString())

        fun setAxesTextColorRes(colorResId: Int): Builder =
            setAxesTextColor(getColor(colorResId).toColorString())

        fun setChartType(prop: AAChartType): Builder {
            chartType = prop
            return this
        }

        fun setStacking(prop: AAChartStackingType): Builder {
            stacking = prop
            return this
        }

        fun setMarkerRadius(prop: Float): Builder {
            markerRadius = prop
            return this
        }

        fun setMarkerRadiusRes(dimenResId: Int): Builder = setMarkerRadius(getDimen(dimenResId))

        fun setMarkerSymbol(prop: AAChartSymbolType): Builder {
            markerSymbol = prop
            return this
        }

        fun setMarkerSymbolStyle(prop: AAChartSymbolStyleType): Builder {
            markerSymbolStyle = prop
            return this
        }

        fun setZoomType(prop: AAChartZoomType): Builder {
            zoomType = prop
            return this
        }

        fun setInverted(prop: Boolean): Builder {
            inverted = prop
            return this
        }

        fun setXAxisReversed(prop: Boolean): Builder {
            xAxisReversed = prop
            return this
        }

        fun setYAxisReversed(prop: Boolean): Builder {
            yAxisReversed = prop
            return this
        }

        fun setTooltipEnabled(prop: Boolean): Builder {
            tooltipEnabled = prop
            return this
        }

        fun setTooltipValueSuffix(prop: String): Builder {
            tooltipValueSuffix = prop
            return this
        }

        fun setTooltipValueSuffix(stringResId: Int, vararg formatArgs: Any?): Builder =
            setTooltipValueSuffix(getString(stringResId, formatArgs))

        fun setGradientColorEnable(prop: Boolean): Builder {
            gradientColorEnable = prop
            return this
        }

        fun setPolar(prop: Boolean): Builder {
            polar = prop
            return this
        }

        fun setMargin(vararg prop: Float): Builder {
            margin = prop.map { it }.toTypedArray()
            return this
        }

        fun setMargin(top: Float, left: Float, bottom: Float, right: Float): Builder =
            setMargin(top, left, bottom, right)

        fun setMargin(topResId: Int, leftResId: Int, bottomResId: Int, rightResId: Int): Builder =
            setMargin(
                getDimen(topResId),
                getDimen(leftResId),
                getDimen(bottomResId),
                getDimen(rightResId)
            )

        fun setDataLabelsEnabled(prop: Boolean): Builder {
            dataLabelsEnabled = prop
            return this
        }

        fun setDataLabelsStyle(prop: AAStyle): Builder {
            dataLabelsStyle = prop
            return this
        }

        fun setXAxisLabelsEnabled(prop: Boolean): Builder {
            xAxisLabelsEnabled = prop
            return this
        }

        fun setXAxisTickInterval(prop: Int): Builder {
            xAxisTickInterval = prop
            return this
        }

        fun setCategories(vararg prop: String): Builder {
            categories = prop.map { it }.toTypedArray()
            return this
        }

        /** Set Category labels, supports StringRes IDs */
        fun setCategories(vararg stringResIds: Int): Builder =
            setCategories(*stringResIds.map { stringResId -> getString(stringResId) }
                .toTypedArray())

        fun setXAxisGridLineWidth(prop: Float): Builder {
            xAxisGridLineWidth = prop
            return this
        }

        fun setXAxisGridLineWidth(dimenResId: Int): Builder =
            setXAxisGridLineWidth(getDimen(dimenResId))

        fun setYAxisGridLineWidth(prop: Float): Builder {
            yAxisGridLineWidth = prop
            return this
        }

        fun setYAxisGridLineWidth(dimenResId: Int): Builder =
            setYAxisGridLineWidth(getDimen(dimenResId))

        fun setXAxisVisible(prop: Boolean): Builder {
            xAxisVisible = prop
            return this
        }

        fun setYAxisVisible(prop: Boolean): Builder {
            yAxisVisible = prop
            return this
        }

        fun setYAxisLabelsEnabled(prop: Boolean): Builder {
            yAxisLabelsEnabled = prop
            return this
        }

        fun setYAxisTitle(prop: String): Builder {
            yAxisTitle = prop
            return this
        }

        fun setYAxisTitle(stringResId: Int, vararg formatArgs: Any?): Builder =
            setYAxisTitle(getString(stringResId, formatArgs))

        fun setYAxisLineWidth(prop: Float): Builder {
            yAxisLineWidth = prop
            return this
        }

        fun setYAxisLineWidth(dimenResId: Int): Builder =
            setYAxisLineWidth(getDimen(dimenResId))

        fun setYAxisMin(prop: Float?): Builder {
            yAxisMin = prop
            return this
        }

        fun setYAxisMin(dimenResId: Int): Builder =
            setYAxisMin(getDimen(dimenResId))

        fun setYAxisMax(prop: Float?): Builder {
            yAxisMax = prop
            return this
        }

        fun setYAxisMax(dimenResId: Int): Builder =
            setYAxisMax(getDimen(dimenResId))

        fun setYAxisAllowDecimals(prop: Boolean): Builder {
            yAxisAllowDecimals = prop
            return this
        }

        fun setColorsTheme(prop: Array<Any>): Builder {
            colorsTheme = prop.map { it }.toTypedArray()
            return this
        }

        fun setColorsTheme(vararg prop: String): Builder {
            colorsTheme = prop.map { it }.toTypedArray()
            return this
        }

        /** Set theme colors, supports ColorRes IDs */
        fun setColorsTheme(vararg colorResIds: Int): Builder =
            setColorsTheme(*colorResIds.map { getColor(it).toColorString() }.toTypedArray())

        fun setLegendEnabled(prop: Boolean): Builder {
            legendEnabled = prop
            return this
        }

        fun setBackgroundColor(prop: String): Builder {
            backgroundColor = prop
            return this
        }

        fun setBackgroundColor(colorResId: Int): Builder =
            setBackgroundColor(getColor(colorResId).toColorString())

        fun setBorderRadius(prop: Float): Builder {
            borderRadius = prop
            return this
        }

        fun setBorderRadius(dimenResId: Int): Builder = setBorderRadius(getDimen(dimenResId))

        fun setSeries(vararg prop: AASeriesElement): Builder {
            series = prop.map { it }.toTypedArray()
            return this
        }

        fun setTouchEventEnabled(prop: Boolean): Builder {
            touchEventEnabled = prop
            return this
        }

        fun setScrollablePlotArea(prop: AAScrollablePlotArea): Builder {
            scrollablePlotArea = prop
            return this
        }

        fun build(): AAChartModel = AAChartModel(
            animationType = animationType,
            animationDuration = animationDuration,
            title = title,
            titleStyle = titleStyle,
            subtitle = subtitle,
            subtitleAlign = subtitleAlign,
            subtitleStyle = subtitleStyle,
            axesTextColor = axesTextColor,
            chartType = chartType,
            stacking = stacking,
            markerRadius = markerRadius,
            markerSymbol = markerSymbol,
            markerSymbolStyle = markerSymbolStyle,
            zoomType = zoomType,
            inverted = inverted,
            xAxisReversed = xAxisReversed,
            yAxisReversed = yAxisReversed,
            tooltipEnabled = tooltipEnabled,
            tooltipValueSuffix = tooltipValueSuffix,
            gradientColorEnable = gradientColorEnable,
            polar = polar,
            margin = margin,
            dataLabelsEnabled = dataLabelsEnabled,
            dataLabelsStyle = dataLabelsStyle,
            xAxisLabelsEnabled = xAxisLabelsEnabled,
            xAxisTickInterval = xAxisTickInterval,
            categories = categories,
            xAxisGridLineWidth = xAxisGridLineWidth,
            xAxisVisible = xAxisVisible,
            yAxisVisible = yAxisVisible,
            yAxisLabelsEnabled = yAxisLabelsEnabled,
            yAxisTitle = yAxisTitle,
            yAxisLineWidth = yAxisLineWidth,
            yAxisMin = yAxisMin,
            yAxisMax = yAxisMax,
            yAxisAllowDecimals = yAxisAllowDecimals,
            yAxisGridLineWidth = yAxisGridLineWidth,
            colorsTheme = colorsTheme,
            legendEnabled = legendEnabled,
            backgroundColor = backgroundColor,
            borderRadius = borderRadius,
            series = series,
            touchEventEnabled = touchEventEnabled,
            scrollablePlotArea = scrollablePlotArea,
        )
    }
}


fun AAChartModel.aa_toAAOptions(): AAOptions {
    return AAOptionsConstructor.configureChartOptions(this)
}