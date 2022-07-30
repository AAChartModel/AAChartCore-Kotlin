package com.github.aachartmodel.aainfographics.aatools

import android.content.Context
import android.os.Build
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAScrollablePlotArea
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle

/**
 * This AABuilder can help you set strings and dimensions from application resources. It enforces
 * stricter typing than AAChartModel to prevent you from setting invalid values.
 */
class AABuilder(context: Context) {
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
    private var markerRadius: Number? = 6f
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
    private var margin: Array<Number>? = null
    private var dataLabelsEnabled: Boolean? = false
    private var dataLabelsStyle: AAStyle? = null
    private var xAxisLabelsEnabled: Boolean? = true
    private var xAxisTickInterval: Int? = null
    private var categories: Array<String>? = null
    private var xAxisGridLineWidth: Number? = 0f
    private var xAxisVisible: Boolean? = null
    private var yAxisVisible: Boolean? = null
    private var yAxisLabelsEnabled: Boolean? = true
    private var yAxisTitle: String? = null
    private var yAxisLineWidth: Number? = null
    private var yAxisMin: Number? = null
    private var yAxisMax: Number? = null
    private var yAxisAllowDecimals: Boolean? = null
    private var yAxisGridLineWidth: Number? = 1f
    private var colorsTheme: Array<Any>? = arrayOf("#fe117c", "#ffc069", "#06caf4", "#7dffc0")
    private var legendEnabled: Boolean? = true
    private var backgroundColor: Any? = "#ffffff"
    private var borderRadius: Number? = 0f
    private var series: Array<Any>? = null
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

    fun set(prop: AAChartModel): AABuilder {
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

    fun setAnimationType(prop: AAChartAnimationType): AABuilder {
        animationType = prop
        return this
    }

    fun setAnimationDuration(prop: Int): AABuilder {
        animationDuration = prop
        return this
    }

    fun setTitle(prop: String): AABuilder {
        title = prop
        return this
    }

    fun setTitle(id: Int, vararg formatArgs: Any?): AABuilder =
        setTitle(getString(id, formatArgs))

    fun setTitleStyle(prop: AAStyle): AABuilder {
        titleStyle = prop
        return this
    }

    fun setSubtitle(prop: String): AABuilder {
        subtitle = prop
        return this
    }

    fun setSubtitle(id: Int, vararg formatArgs: Any?): AABuilder =
        setSubtitle(getString(id, formatArgs))

    fun setSubtitleAlign(prop: AAChartAlignType): AABuilder {
        subtitleAlign = prop
        return this
    }

    fun setSubtitleStyle(prop: AAStyle): AABuilder {
        subtitleStyle = prop
        return this
    }

    fun setAxesTextColor(prop: String): AABuilder {
        axesTextColor = prop
        return this
    }

    fun setAxesTextColor(color: Int): AABuilder = setAxesTextColor(color.toColorString())

    fun setAxesTextColorRes(colorResId: Int): AABuilder =
        setAxesTextColor(getColor(colorResId).toColorString())

    fun setChartType(prop: AAChartType): AABuilder {
        chartType = prop
        return this
    }

    fun setStacking(prop: AAChartStackingType): AABuilder {
        stacking = prop
        return this
    }

    fun setMarkerRadius(prop: Number): AABuilder {
        markerRadius = prop
        return this
    }

    fun setMarkerRadiusRes(dimenResId: Int): AABuilder = setMarkerRadius(getDimen(dimenResId))

    fun setMarkerSymbol(prop: AAChartSymbolType): AABuilder {
        markerSymbol = prop
        return this
    }

    fun setMarkerSymbolStyle(prop: AAChartSymbolStyleType): AABuilder {
        markerSymbolStyle = prop
        return this
    }

    fun setZoomType(prop: AAChartZoomType): AABuilder {
        zoomType = prop
        return this
    }

    fun setInverted(prop: Boolean): AABuilder {
        inverted = prop
        return this
    }

    fun setXAxisReversed(prop: Boolean): AABuilder {
        xAxisReversed = prop
        return this
    }

    fun setYAxisReversed(prop: Boolean): AABuilder {
        yAxisReversed = prop
        return this
    }

    fun setTooltipEnabled(prop: Boolean): AABuilder {
        tooltipEnabled = prop
        return this
    }

    fun setTooltipValueSuffix(prop: String): AABuilder {
        tooltipValueSuffix = prop
        return this
    }

    fun setTooltipValueSuffix(stringResId: Int, vararg formatArgs: Any?): AABuilder =
        setTooltipValueSuffix(getString(stringResId, formatArgs))

    fun setGradientColorEnable(prop: Boolean): AABuilder {
        gradientColorEnable = prop
        return this
    }

    fun setPolar(prop: Boolean): AABuilder {
        polar = prop
        return this
    }

    fun setMargin(vararg prop: Number): AABuilder {
        margin = prop.map { it }.toTypedArray()
        return this
    }

    fun setMargin(top: Number, left: Number, bottom: Number, right: Number): AABuilder =
        setMargin(top, left, bottom, right)

    fun setMargin(topResId: Int, leftResId: Int, bottomResId: Int, rightResId: Int): AABuilder =
        setMargin(
            getDimen(topResId),
            getDimen(leftResId),
            getDimen(bottomResId),
            getDimen(rightResId)
        )

    fun setDataLabelsEnabled(prop: Boolean): AABuilder {
        dataLabelsEnabled = prop
        return this
    }

    fun setDataLabelsStyle(prop: AAStyle): AABuilder {
        dataLabelsStyle = prop
        return this
    }

    fun setXAxisLabelsEnabled(prop: Boolean): AABuilder {
        xAxisLabelsEnabled = prop
        return this
    }

    fun setXAxisTickInterval(prop: Int): AABuilder {
        xAxisTickInterval = prop
        return this
    }

    fun setCategories(vararg prop: String): AABuilder {
        categories = prop.map { it }.toTypedArray()
        return this
    }

    /** Set Category labels, supports StringRes IDs */
    fun setCategories(vararg stringResIds: Int): AABuilder =
        setCategories(*stringResIds.map { stringResId -> getString(stringResId) }
            .toTypedArray())

    fun setXAxisGridLineWidth(prop: Number): AABuilder {
        xAxisGridLineWidth = prop
        return this
    }

    fun setXAxisGridLineWidth(dimenResId: Int): AABuilder =
        setXAxisGridLineWidth(getDimen(dimenResId))

    fun setYAxisGridLineWidth(prop: Number): AABuilder {
        yAxisGridLineWidth = prop
        return this
    }

    fun setYAxisGridLineWidth(dimenResId: Int): AABuilder =
        setYAxisGridLineWidth(getDimen(dimenResId))

    fun setXAxisVisible(prop: Boolean): AABuilder {
        xAxisVisible = prop
        return this
    }

    fun setYAxisVisible(prop: Boolean): AABuilder {
        yAxisVisible = prop
        return this
    }

    fun setYAxisLabelsEnabled(prop: Boolean): AABuilder {
        yAxisLabelsEnabled = prop
        return this
    }

    fun setYAxisTitle(prop: String): AABuilder {
        yAxisTitle = prop
        return this
    }

    fun setYAxisTitle(stringResId: Int, vararg formatArgs: Any?): AABuilder =
        setYAxisTitle(getString(stringResId, formatArgs))

    fun setYAxisLineWidth(prop: Number): AABuilder {
        yAxisLineWidth = prop
        return this
    }

    fun setYAxisLineWidth(dimenResId: Int): AABuilder =
        setYAxisLineWidth(getDimen(dimenResId))

    fun setYAxisMin(prop: Number?): AABuilder {
        yAxisMin = prop
        return this
    }

    fun setYAxisMin(dimenResId: Int): AABuilder =
        setYAxisMin(getDimen(dimenResId))

    fun setYAxisMax(prop: Number?): AABuilder {
        yAxisMax = prop
        return this
    }

    fun setYAxisMax(dimenResId: Int): AABuilder =
        setYAxisMax(getDimen(dimenResId))

    fun setYAxisAllowDecimals(prop: Boolean): AABuilder {
        yAxisAllowDecimals = prop
        return this
    }

    fun setColorsTheme(prop: Array<Any>): AABuilder {
        colorsTheme = prop.map { it }.toTypedArray()
        return this
    }

    fun setColorsTheme(vararg prop: String): AABuilder {
        colorsTheme = prop.map { it }.toTypedArray()
        return this
    }

    /** Set theme colors, supports ColorRes IDs */
    fun setColorsTheme(vararg colorResIds: Int): AABuilder =
        setColorsTheme(*colorResIds.map { getColor(it).toColorString() }.toTypedArray())

    fun setLegendEnabled(prop: Boolean): AABuilder {
        legendEnabled = prop
        return this
    }

    fun setBackgroundColor(prop: String): AABuilder {
        backgroundColor = prop
        return this
    }

    fun setBackgroundColor(colorResId: Int): AABuilder =
        setBackgroundColor(getColor(colorResId).toColorString())

    fun setBorderRadius(prop: Number): AABuilder {
        borderRadius = prop
        return this
    }

    fun setBorderRadius(dimenResId: Int): AABuilder = setBorderRadius(getDimen(dimenResId))

    fun setSeries(vararg prop: AASeriesElement): AABuilder {
        series = prop.map { it }.toTypedArray()
        return this
    }

    fun setTouchEventEnabled(prop: Boolean): AABuilder {
        touchEventEnabled = prop
        return this
    }

    fun setScrollablePlotArea(prop: AAScrollablePlotArea): AABuilder {
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
