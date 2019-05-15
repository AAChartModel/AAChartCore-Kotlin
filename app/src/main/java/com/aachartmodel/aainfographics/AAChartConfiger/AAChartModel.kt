package com.example.chartcorekotlin.AAChartConfiger

enum class AAChartAnimationType(val value :String){
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
    AreaSpline      ("areaspline"),
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
}

enum class AAChartAlighType(val value: String) {
    Left   ("left"),
    Center ("center"),
    Right  ("right"),
}

enum class AAChartZoomType(val value: String) {
    X  ("x"),
    Y  ("y"),
    XY ("xy"),
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
    TriangleDown  ("triangle-down"),
}

enum class AAChartSymbolStyleType(val value: String) {
    Normal       ("normal"),
    InnerBlank   ("innerBlank"),
    BorderBlank  ("borderBlank"),
}

enum class AAChartLegendlLayoutType(val value: String) {
    Horizontal  ("horizontal"),
    Vertical    ("vertical"),
}

enum class AAChartLegendAlignType(val value: String) {
    Left     ("left"),
    Center   ("center"),
    Right    ("right"),
}

enum class AAChartLegendVerticalAlignType(val value: String) {
    Top     ("top"),
    Middle  ("middle"),
    Bottom  ("bottom"),
}

enum class AAChartLineDashSyleType(val value: String) {
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

class AAChartModel {

    var animationType: String? = null          //动画类型
    var animationDuration: Int? = null     //动画时间
    var title: String? = null                 //标题内容
    var subtitle: String? = null               //副标题内容
    var chartType: String? = null              //图表类型
    var stacking: String? = null               //堆积样式
    var symbol: String? = null                 //折线曲线连接点的类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
    var symbolStyle: String? = null
    var zoomType: String? = null               //缩放类型 AAChartZoomTypeX表示可沿着 x 轴进行手势缩放
    var pointHollow: Boolean? = null           //折线或者曲线的连接点是否为空心的
    var inverted: Boolean? = null              //x 轴是否翻转(垂直)
    var xAxisReversed: Boolean? = null         //x 轴翻转
    var yAxisReversed: Boolean? = null         //y 轴翻转
    var tooltipEnabled: Boolean? = null      //是否显示浮动提示框(默认显示)
    var tooltipValueSuffix: String? = null  //浮动提示框单位后缀
    var tooltipCrosshairs: Boolean? = null     //是否显示准星线(默认显示)
    var gradientColorEnable: Boolean? = null   //是否要为渐变色
    var polar: Boolean? = null                 //是否极化图形(变为雷达图)
    var marginLeft: Float? = null
    var marginRight: Float? = null
    var dataLabelEnabled: Boolean? = null      //是否显示数据
    var xAxisLabelsEnabled: Boolean? = null    //x轴是否显示数据
    var categories: Array<String>? = null             //x轴是否显示数据
    var xAxisGridLineWidth: Int? = null    //x轴网格线的宽度
    var xAxisVisible: Boolean? = null        //x 轴是否显示
    var yAxisVisible: Boolean? = null        //y 轴是否显示
    var yAxisLabelsEnabled: Boolean? = null    //y轴是否显示数据
    var yAxisTitle: String? = null             //y轴标题
    var yAxisLineWidth: Float? = null       //y 轴轴线的宽度

    var yAxisGridLineWidth: Int? = null    //y轴网格线的宽度
    var colorsTheme: Array<Any>? = null            //图表主题颜色数组
    var legendEnabled: Boolean? = null         //是否显示图例
    var legendLayout: String? = null           //图例数据项的布局。布局类型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默认是：horizontal.
    var legendAlign: String? = null            //设定图例在图表区中的水平对齐方式，合法值有left，center 和 right。
    var legendVerticalAlign: String? = null    //设定图例在图表区中的垂直对齐方式，合法值有 top，middle 和 bottom。垂直位置可以通过 y 选项做进一步设定。
    var backgroundColor: String? = null        //图表背景色
    var options3dEnable: Boolean? = null       //是否3D化图形(仅对条形图,柱状图有效)
    var options3dAlphaInt: Int? = null
    var options3dBetaInt: Int? = null
    var options3dDepth: Int? = null        //3D图形深度
    var borderRadius: Int? = null          //柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效)
    var markerRadius: Int? = null          //折线连接点的半径长度
    var series: Array<AASeriesElement>? = null
    var titleColor: String? = null//标题颜色
    var subTitleColor: String? = null//副标题颜色
    var axisColor: String? = null//x 轴和 y 轴文字颜色



    fun animationType(prop: AAChartAnimationType): AAChartModel {
        this.animationType = prop.toString()
        return this
    }

    fun animationDuration(prop: Int?): AAChartModel {
        this.animationDuration = prop
        return this
    }

    fun title(prop: String): AAChartModel {
        this.title = prop
        return this
    }

    fun subtitle(prop: String): AAChartModel {
        this.subtitle = prop
        return this
    }

    fun chartType(prop: AAChartType): AAChartModel {
        this.chartType = prop.toString()
        return this
    }

    fun stacking(prop: AAChartStackingType): AAChartModel {
        this.stacking = prop.toString()
        return this
    }

    fun symbol(prop: String): AAChartModel {
        this.symbol = prop
        return this
    }

    fun symbolStyle(prop: AAChartSymbolStyleType): AAChartModel {
        this.symbolStyle = prop.toString()
        return this
    }

    fun zoomType(prop: String): AAChartModel {
        this.zoomType = prop
        return this
    }

    fun pointHollow(prop: Boolean?): AAChartModel {
        this.pointHollow = prop
        return this
    }

    fun inverted(prop: Boolean?): AAChartModel {
        this.inverted = prop
        return this
    }

    fun xAxisReversed(prop: Boolean?): AAChartModel {
        this.xAxisReversed = prop
        return this
    }

    fun yAxisReversed(prop: Boolean?): AAChartModel {
        this.yAxisReversed = prop
        return this
    }

    fun tooltipEnabled(prop: Boolean?): AAChartModel {
        this.tooltipEnabled = prop
        return this
    }

    fun tooltipCrosshairs(prop: Boolean?): AAChartModel {
        this.tooltipCrosshairs = prop
        return this
    }

    fun gradientColorEnable(prop: Boolean?): AAChartModel {
        this.gradientColorEnable = prop
        return this
    }

    fun polar(prop: Boolean?): AAChartModel {
        this.polar = prop
        return this
    }

    fun dataLabelEnabled(prop: Boolean?): AAChartModel {
        this.dataLabelEnabled = prop
        return this
    }

    fun xAxisLabelsEnabled(prop: Boolean?): AAChartModel {
        this.xAxisLabelsEnabled = prop
        return this
    }

    fun categories(prop: Array<String>): AAChartModel {
        this.categories = prop
        return this
    }

    fun xAxisGridLineWidth(prop: Int?): AAChartModel {
        this.xAxisGridLineWidth = prop
        return this
    }

    fun yAxisGridLineWidth(prop: Int?): AAChartModel {
        this.yAxisGridLineWidth = prop
        return this
    }

    fun yAxisLabelsEnabled(prop: Boolean?): AAChartModel {
        this.yAxisLabelsEnabled = prop
        return this
    }

    fun yAxisTitle(prop: String): AAChartModel {
        this.yAxisTitle = prop
        return this
    }

    fun colorsTheme(prop: Array<Any>): AAChartModel {
        this.colorsTheme = prop
        return this
    }

    fun legendEnabled(prop: Boolean?): AAChartModel {
        this.legendEnabled = prop
        return this
    }

    fun legendLayout(prop: String): AAChartModel {
        this.legendLayout = prop

        return this
    }

    fun legendAlign(prop: String): AAChartModel {
        this.legendAlign = prop
        return this
    }

    fun legendVerticalAlign(prop: AAChartLegendVerticalAlignType): AAChartModel {
        this.legendVerticalAlign = prop.toString()
        return this
    }

    fun backgroundColor(prop: String): AAChartModel {
        this.backgroundColor = prop
        return this
    }

    fun options3dEnable(prop: Boolean?): AAChartModel {
        this.options3dEnable = prop
        return this
    }

    fun options3dAlphaInt(prop: Int?): AAChartModel {
        this.options3dAlphaInt = prop
        return this
    }

    fun options3dBetaInt(prop: Int?): AAChartModel {
        this.options3dBetaInt = prop
        return this
    }

    fun options3dDepth(prop: Int?): AAChartModel {
        this.options3dDepth = prop
        return this
    }

    fun borderRadius(prop: Int?): AAChartModel {
        this.borderRadius = prop
        return this
    }

    fun markerRadius(prop: Int?): AAChartModel {
        this.markerRadius = prop
        return this
    }

    fun series(prop: Array<AASeriesElement>): AAChartModel {
        this.series = prop
        return this
    }

    // 构造函数(亦即是初始化函数)
    init {

        //        this.animationType = AAChartAnimationType.EaseInBack;
        //        this.animationDuration = 800;//以毫秒为单位
        //        this.chartType = AAChartType.Column;
        //        this.inverted = false;
        //        this.stacking = AAChartStackingType.False;
        //        //this.symbol = AAChartSymbolType.Square.rawValue//默认的折线连接点类型
        //        this.xAxisReversed = false;
        //        this.yAxisReversed = false;
        //        this.zoomType = AAChartZoomType.X;
        //        this.pointHollow = false;//默认折线或者曲线的连接点不为空
        //        this.colorsTheme = new String[]{"#b5282a","#e7a701","#50c18d","#fd4800","#f1c6c5"};
        //        this.gradientColorEnable = false;
        //        this.polar = false;
        //        this.dataLabelEnabled = true;
        //        this.options3dEnable = false;
        //        this.crosshairs = true;
        //        this.xAxisLabelsEnabled = true;
        //        this.xAxisGridLineWidth = 0;
        //        this.yAxisLabelsEnabled = true;
        //        this.yAxisGridLineWidth = 1;
        //        this.legendEnabled = true;
        //        this.legendLayout = AAchartLegendlLayoutType.Horizontal;
        //        this.legendAlign = AAChartLegendAlignType.Center;
        //        this.legendVerticalAlign = AAChartLegendVerticalAlignType.Bottom;
        //        this.borderRadius = 0;//柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效,设置为1000时,柱形图或者条形图头部为楔形)
        //        this.markerRadius = 5;//折线连接点的半径长度,设置默认值为0,这样就相当于不显示了

        this.animationType = AAChartAnimationType.EaseInBack.toString()
        this.animationDuration = 800//以毫秒为单位
        this.pointHollow = false
        this.inverted = false
        this.stacking = AAChartStackingType.False.toString()
        this.xAxisReversed = false
        this.yAxisReversed = false
        this.zoomType = "x"
        //        this.colorsTheme = new String[]{"#b5282a","#e7a701","#50c18d","#fd4800","#f1c6c5"};
        this.colorsTheme = arrayOf<Any>("#fe117c", "#ffc069", "#06caf4", "#7dffc0")//默认的颜色数组(必须要添加默认数组,否则就会出错)

        this.tooltipCrosshairs = true

        this.gradientColorEnable = false
        this.polar = false
        this.options3dEnable = false
        this.xAxisLabelsEnabled = true
        this.xAxisGridLineWidth = 0
        this.yAxisLabelsEnabled = true
        this.yAxisGridLineWidth = 1
        this.legendEnabled = true
        this.legendLayout = "horizontal"
        this.legendAlign = "center"
        this.legendVerticalAlign = "bottom"
        this.backgroundColor = "#ffffff"
        this.borderRadius = 0//柱状图长条图头部圆角半径(可用于设置头部的形状,仅对条形图,柱状图有效,设置为1000时,柱形图或者条形图头部为楔形)
        this.markerRadius = 6//折线连接点的半径长度,如果值设置为0,这样就相当于不显示了

    }
}


