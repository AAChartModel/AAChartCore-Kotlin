 ![AAInfographics-LOGO](https://raw.githubusercontent.com/AAChartModel/Gallery/master/AAInfographics/AAInfographics-Logo02.png)

# AAInfographics

 
[![Support](https://img.shields.io/badge/Support-Android-brightgreen.svg)](https://github.com/AAChartModel/AAChartCore-Kotlin) </br>
[![](https://img.shields.io/badge/license-MIT-brightgreen.svg)](https://github.com/AAChartModel/AAChartCore-Kotlin/blob/master/LICENSE)</br>
[![](https://img.shields.io/badge/language-Kotlin-green.svg)](https://github.com/AAChartModel/AAChartCore-Kotlin) </br>
[![](https://img.shields.io/badge/support-Java-orange.svg)](https://github.com/AAChartModel/AAChartCore)</br>
[![](https://img.shields.io/badge/support-Animation-yellow.svg)](https://github.com/AAChartModel/AAChartCore-Kotlin/blob/master/CHINESE-README.md#當前已支持的圖表渲染動畫類型有三十種以上說明如下)</br>
[![](https://jaywcjlove.github.io/sb/lang/chinese.svg)](https://github.com/AAChartModel/AAChartCore-Kotlin/blob/master/CHINESE-README.md)</br>
[![](https://jaywcjlove.github.io/sb/lang/english.svg)](https://github.com/AAChartModel/AAChartCore-Kotlin)</br>
[![Average time to resolve an issue](http://isitmaintained.com/badge/resolution/AAChartModel/AAChartCore-Kotlin.svg)](http://isitmaintained.com/project/AAChartModel/AAChartCore-Kotlin "Average time to resolve an issue")</br>
[![Percentage of issues still open](http://isitmaintained.com/badge/open/AAChartModel/AAChartCore-Kotlin.svg)](http://isitmaintained.com/project/AAChartModel/AAChartCore-Kotlin "Percentage of issues still open")


## [ **English Document 🇬🇧** ](https://github.com/AAChartModel/AAChartCore-Kotlin)  |  [ **簡體中文文檔 🇨🇳** ](https://github.com/AAChartModel/AAChartCore-Kotlin/blob/master/CHINESE-README.md)| [ **繁體中文文檔 🇭🇰** ](https://github.com/AAChartModel/AAChartCore-Kotlin/blob/master/TRADITIONAL-CHINESE-README.md)

### 您所喜愛的`AAInfographics`開源圖表框架同時更有`Java`版本可供使用,詳情請點擊以下鏈接
### 傳送門
#### *https://github.com/AAChartModel/AAChartCore*

## 前言

 ***AAInfographics***,是 [AAChartKit](https://github.com/AAChartModel/AAChartKit) 的 `Kotlin`語言版本,是在流行的開源前端圖表框架的基礎上,封裝的面向對象的,壹組簡單易用,極其精美的圖表繪制組件.可能是這個星球上 UI 最精致的第三方 Android 開源圖表框架了(✟我以無神論者的名義向上帝起誓🖐,我真的沒有在說鬼話✟)

***
## 功能特性

1. **環境友好,兼容性強**. 支持 `Kotlin`語言,配置簡單.同時更有蘋果公司的 iOS 端 Objective-C 版本 [AAChartKit](https://github.com/AAChartModel/AAChartKit)、Swift 版本 [AAChartKit-Swift](https://github.com/AAChartModel/AAChartKit-Swift)、谷歌公司的 Android 端 Java 版本 [AAChartCore](https://github.com/AAChartModel/AAChartCore)、等其他各種移動平臺主流語言版本可供使用.
1. **功能強大,類型多樣**. 支持`柱狀圖` 、`條形圖` 、`折線圖` 、`曲線圖` 、`折線填充圖` 、`曲線填充圖`、`雷達圖`、`極地圖`、`扇形圖`、`氣泡圖`、`散點圖`、`區域範圍圖`、`柱形範圍圖`、`面積範圍圖`、`面積範圍均線圖`、`直方折線圖`、`直方折線填充圖`、`箱線圖`、`瀑布圖`、`熱力圖`、`桑基圖`、`金字塔圖`、`漏鬥圖`、等二十幾種類型的圖形,不可謂之不多.
1. **交互式圖形動畫**. 有著清晰和充滿細節的用戶交互方式,與此同時,圖形渲染`動畫`效果細膩精致,流暢優美.有三十多種以上渲染動畫效果可供選擇,用戶可自由設置渲染圖形時的動畫時間和動畫類型,關於圖形渲染動畫類型,具體參見[ AAInfographics 動畫類型](https://github.com/AAChartModel/AAChartCore-Kotlin/blob/master/CHINESE-README.md#當前已支持的圖表渲染動畫類型有三十種以上說明如下).
1. **支持手勢縮放**.支持圖表的手勢縮放和拖動閱覽,手勢縮放類型具體參見[ AAInfographics 手勢縮放類型](https://github.com/AAChartModel/AAChartCore-Kotlin/blob/master/CHINESE-README.md#當前已支持的圖表手勢縮放類型共有三種說明如下),默認禁用手勢縮放功能.
1. **極簡主義**. `AAChartView + AAChartModel = Chart`,在 ***AAInfographics*** 數據可視化圖形框架當中,遵循這樣壹個極簡主義公式:`圖表視圖控件 + 圖表模型 = 妳想要的圖表`.同其他幾款強大、精美而又易用的開源圖形框架 [AAChartKit](https://github.com/AAChartModel/AAChartKit)、[AAChartKit-Swift](https://github.com/AAChartModel/AAChartKit-Swift)、[AAChartCore](https://github.com/AAChartModel/AAChartCore) 完全壹致.
1. **鏈式編程語法**. 支持系統類推薦的 `鏈式編程語法`,壹行代碼即可配置完成 `AAChartModel`模型對象實例.
1. **簡潔清晰,輕便易用**. 最少僅僅需要 **五行代碼** 即可完成整個圖表的繪制工作(使用鏈式編程語法配置 `AAChartModel` 實例對象時,無論妳寫多少行代碼,理論上只能算作是壹行). 😜😜😜

***

## 真機美圖

<div>
<img src='https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAChartKit/BeautyAppreciation/ColumnChart.png' width="24%" >
<img src='https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAChartKit/BeautyAppreciation/BarChart.png' width="24%" >
<img src='https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAChartKit/BeautyAppreciation/AreaChart.png' width="24%" >
<img src='https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAChartKit/BeautyAppreciation/LineChart.png' width="24%" >
</div>

<div>
<img src='https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAChartKit/BeautyAppreciation/StepAreaChart.png' width="24%" >
<img src='https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAChartKit/BeautyAppreciation/StepLineChart.png' width="24%" >
<img src='https://raw.githubusercontent.com/AAChartModel/Gallery/master/AAChartKit/splineChart.png' width="24%" >
<img src='https://raw.githubusercontent.com/AAChartModel/Gallery/master/AAChartKit/areasplineChart.png' width="24%" >
</div>

<div>
<img src='https://raw.githubusercontent.com/AAChartModel/Gallery/master/AAChartKit/percentStackingAreasplineChart.png' width="24%" >
<img src='https://github.com/AAChartModel/Gallery/blob/master/AAInfographics/BubbleChart.png' width="24%">
<img src='https://github.com/AAChartModel/Gallery/blob/master/AAInfographics/ArearangeAverageValueChart.png' width="24%">
<img src='https://github.com/AAChartModel/Gallery/blob/master/AAInfographics/ColumnMixedLineChart.png' width="24%">
</div>

<div>
<img src='https://raw.githubusercontent.com/AAChartModel/Gallery/master/AAChartKit/scatterChart.png' width="24%" >
<img src='https://raw.githubusercontent.com/AAChartModel/Gallery/master/AAChartKit/boxplotChart.png' width="24%">
<img src='https://raw.githubusercontent.com/AAChartModel/Gallery/master/AAChartKit/MirrorColumnChart.png' width="24%">
<img src='https://raw.githubusercontent.com/AAChartModel/Gallery/master/AAChartKit/stackingColumnChart.png' width="24%">
</div>

## 安裝

### 手動安裝

1. 下載 Demo  `AAChartCore-KotlinDemo`
2. 將 Demo 中的名為`AAInfographicsLib` 的文件夾拖入至妳的項目之中.


## 使用方法

1. 創建視圖*AAChartView*
```xml
        <com.aachartmodel.aainfographics.AAInfographicsLib.AAChartConfiger.AAChartView
        android:id="@+id/AAChartView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        />
 ```

 ```kotlin
        aaChartView = findViewById(R.id.AAChartView)
 ```
2. 配置視圖模型*AAChartModel*

* 鏈式編程的方式配置 *AAChartModel* 模型對象屬性
```kotlin
 val aaChartModel = AAChartModel()
    .chartType(AAChartType.Area)
    .title("title")
    .subtitle("subtitle")
    .backgroundColor("#4b2b7f")
    .dataLabelEnabled(true)
    .yAxisGridLineWidth(0)
    .legendVerticalAlign(AAChartLegendVerticalAlignType.Bottom)
    .series(arrayOf(
        AASeriesElement()
            .name("Tokyo")
            .data(arrayOf(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)),
        AASeriesElement()
            .name("NewYork")
            .data(arrayOf(0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5)),
        AASeriesElement()
            .name("London")
            .data(arrayOf(0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0)),
        AASeriesElement()
            .name("Berlin")
            .data(arrayOf(3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8))
    )
    )
```

3.  繪制圖形(創建 AAChartView 實例對象後,首次繪制圖形調用此方法)

```kotlin
        /*圖表視圖對象調用圖表模型對象,繪制最終圖形*/
        aaChartView.aa_drawChartWithChartModel(aaChartModel);
```

🌹🌹🌹 好了,至此,有關於繪制圖形的任務,壹切皆已經搞定!!! 妳將得到妳想要的任意圖形!!!

### 更新圖形內容
如果妳需要更新圖表內容,妳應該閱讀以下內容,根據妳的實際需要,選擇調用適合妳的函數

* 僅僅刷新圖形的`series`數據內容(首次繪制圖形完成之後,後續刷新圖表數據均建議調用此方法)

```kotlin
    /*僅僅更新了圖表的series數組數據,不改動圖表的其他內容*/
    aaChartView.aa_onlyRefreshTheChartDataWithChartModelSeries(chartModelSeriesArray)
```

*   刷新圖形除數據屬性 `series` 以外的其他屬性(首次繪制圖形完成之後,後續刷新圖表的屬性均建議調用此方法 註意:僅僅刷新圖形數據,則建議使用上面的👆`aa_onlyRefreshTheChartDataWithChartModelSeries`方法)

```kotlin
    /*更新 AAChartModel 整體內容(如修改了圖表的類型,將 column chart 改為 area chart)之後,刷新圖表*/
    aaChartView.aa_refreshChartWholeContentWithChartModel(aaChartModel)
```


##  **AAInfographics**壹些重要屬性經過配置之後的圖形示例如下

- ### line chart - 折線圖

![line chart](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/LineChart.png)

- ### column chart - 柱形圖

![IMG_1873.JPG](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/ColumnChart.png)

- ### bar chart - 條形圖

![bar chart](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/BarChart.png)

- ### special area chart one - 常規折線區域填充圖

![IMG_1869.JPG](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/IMG_1482.JPG)

- ### special area chart two - 帶有負數的區域填充圖

![IMG_1871.JPG](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/AreaChartOne.png))

- ### special area chart three - 堆積效果的區域填充圖

![IMG_1863.JPG](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/AreaChartTwo.png)

- ### polar chart - 極地圖

![polar chart](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/PolarChart.png)

- ### radar chart - 雷達圖

![radar chart](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/RadarChart.png)

- ### pie chart - 扇形圖

![pie chart](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/PieChart.png)

- ### bubble chart - 氣泡圖

![bubble chart](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/BubbleChart.png)

- ### scatter chart - 散點圖

![scatter chart](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/ScatterChart.png)

- ### arearange chart - 區域範圍圖

![arearange chart](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/ArearangeChart.png)

- ### step area chart - 直方折線填充圖

![step area chart](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/StepAreaChart.png)

- ### mixed chart - 混合圖形

![mixed chart](https://github.com/AAChartModel/loadHtmlCssJsDemo-master/blob/master/AAInfographics/MixedChart.png)


### 更多圖形效果
註意:如下的這幅`DEMO演示圖`為大小*6M*左右的`GIF動態圖`,如未顯示動態效果則說明圖片資源未全部加載。請耐心等待至圖片資源內容完全加載結束後，即可最終觀賞更多的項目的動態演示效果.

![AAChartKit-Live](https://github.com/AAChartModel/Gallery/blob/master/AAChartKit/AAChartKit-Live.gif)


## 特別說明

### 支持監聽用戶點擊事件及單指滑動事件

  可通過給 AAChartView 實例對象設置代理方法,來實現監聽用戶的點擊事件和單指滑動事件
 ```kotlin
 interface AAChartViewCallBack {
        fun chartViewMoveOverEventMessage(aaChartView: AAChartView, messageModel: AAMoveOverEventMessageModel)
    }
  ```

  在監聽用戶交互事件時,獲取的事件信息`AAMoveOverEventMessageModel`共包含以下內容

  ```kotlin
  class AAMoveOverEventMessageModel {
    var name: String? = null
    var x: Double? = null
    var y: Double? = null
    var category: String? = null
    var offset: LinkedTreeMap<*, *>? = null
    var index: Double? = null
}
  ```



### 支持通過`JavaScript` 函數來自定義 `AATooltip`視圖顯示效果

有時系統默認的 tooltip 浮動提示框的顯示效果無法滿足使用者的特殊自定義要求,此時可以通過添加 AATooltip 的 `headerFormat`、`footerFormat` 和 `pointFormat` 的字符串屬性的`HTML`文本內容,來自定義浮動提示框的顯示內容,此三者可以勝任絕大數情況下的自定義浮動提示框 AATooltip 的任務.

如仍舊不能滿足需求,更可以通過 AATooltip 的 `formatter` 函數來實現視圖的特殊定制化 例如,如下配置 AATooltip 實例對象屬性


```kotlin
    val aaTooltip = AATooltip()
            .useHTML(true)
            .formatter(
             """
function () {
        return ' 🌕 🌖 🌗 🌘 🌑 🌒 🌓 🌔 <br/> '
        + ' Support JavaScript Function Just Right Now !!! <br/> '
        + ' The Gold Price For <b>2020 '
        +  this.x
        + ' </b> Is <b> '
        +  this.y
        + ' </b> Dollars ';
        }
             """.trimIndent()
            )
            .valueDecimals(2)//設置取值精確到小數點後幾位//設置取值精確到小數點後幾位
            .backgroundColor("#000000")
            .borderColor("#000000")
            .style(
                AAStyle()
                    .color("#FFD700")
                    .fontSize("12 px")
            )
          
```
即可完成圖表的浮動提示框的特殊定制化.得到的自定義浮動提示框的視覺效果圖如下👇
![Custom Tooltip Style](https://user-images.githubusercontent.com/16357599/56589690-543c5880-6618-11e9-9d18-6bc0fe2fa53f.png)

### 支持添加值域分割功能⚔

* 添加`顏色帶🎀`值域分割
![plotBandsChart](https://raw.githubusercontent.com/AAChartModel/Gallery/master/AAChartKit/plotBandsChart.png)


* 添加`顏色線🧶`值域分割
![plotLinesChart](https://raw.githubusercontent.com/AAChartModel/Gallery/master/AAChartKit/plotLinesChart.png)


### 當前已支持的圖表類型有十種以上,說明如下

```kotlin
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
    Polygon         ("polygon")
}
```

### 當前已支持的圖表手勢縮放類型共有三種,說明如下

```kotlin
enum class AAChartZoomType(val value: String) {
    None ("none"),  //禁用圖表手勢縮放功能(默認禁用手勢縮放)
    X    ("x"),     //支持圖表 X 軸橫向縮放
    Y    ("y"),     //支持圖表 Y 軸縱向縮放X
    XY   ("xy"),    //支持圖表 XY 軸縱向縮放
}
```

NOTE:例如,設置了`AAChartModel`的縮放屬性`zoomType`為`AAChartZoomType.X`,並且將圖表進行了手勢放大之後,這時候如果想要左右滑動圖表,可以使用 **雙指點按** 屏幕中的`AAChartView`視圖區域進行 **左右拖動** 即可.同時屏幕的右上角會自動出現壹個標題為 **"恢復縮放"** 的按鈕,點擊恢復縮放,圖表大小和位置將會回歸到原初的樣式.

### 當前已支持的圖表渲染動畫類型有三十種以上,說明如下

```kotlin
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
```

以下是**AAInfographics**其中十種圖表渲染動畫類型

| Back      | Bounce    | Circ      | Cubic     | Elastic   |
|:---------:|:---------:|:---------:|:---------:|:---------:|
| ![][1]    | ![][2]    | ![][3]    | ![][4]    | ![][5]    |


| Expo      | Quad      | Quart     | Quint     | Sine      |
|:---------:|:---------:|:---------:|:---------:|:---------:|
| ![][6]    | ![][7]    | ![][8]    | ![][9]    | ![][10]   |


## 關於`AAChartModel` 屬性說明

* ### AAChartModel 主要屬性說明

屬性名稱 | 描述 | 取值範圍 | 
------------ |------------- | ------------- |
title |  圖表主標題 | 任意有效的字符串 | 
subtitle | 圖表副標題  | 任意有效的字符串 |
chartType |  圖表類型,可以為`AAChartType`枚舉字符串當中指定的任意有效類型.其中有支持`柱狀圖` 、`條形圖` 、`折線圖` 、`曲線圖` 、`折線填充圖` 、`曲線填充圖`、`雷達圖`、`扇形圖`、`氣泡圖`、`散點圖`、`金字塔圖`、`漏鬥圖`、`區域範圍圖`、`柱形範圍圖`等多種圖形  | AAChartType.Column, <br/> AAChartType.Bar,<br/>  AAChartType.Area, <br/> AAChartType.AreaSpline,<br/>  AAChartType.Line,<br/>  AAChartType.Spline,<br/>  AAChartType.Pie,<br/>  AAChartType.Bubble, <br/> AAChartType.Scatter,<br/>  AAChartType.Pyramid, <br/> AAChartType.Funnel,<br/>  AAChartType.Arearange, <br/> AAChartType.Columnrange |  
stacking| 是否將圖表每個數據列的值疊加在壹起。 默認的值為`.none`， 即禁用堆疊樣式效果.另有常規堆疊樣式和百分比堆疊樣式可供選擇 | AAChartStackingType.None,<br/>AAChartStackingType.Normal,<br/>  AAChartStackingType.Percent | 
symbol | 圖表曲線連接點的樣式類型.其可供選擇的值有`圓`、`正方形`、`鉆石`、`常規三角形`和`倒三角形`,默認為混合樣式 | AAChartSymbolType.Circle,<br/>  AAChartSymbolType.Square,<br/>  AAChartSymbolType.Diamond, <br/> AAChartSymbolType.Triangle,<br/>  AAChartSymbolType.TriangleDown | 
colorsTheme | 圖表顯示的顏色主題效果 |類似此 `new String[]{"#fe117c","#ffc069","#06caf4","#7dffc0"}` 有效十六進制顏色字符串數組 | 
series | 圖表的數據列 | AASeriesElement實例對象組成的有效數組,其中每個AASeriesElement都有與之對應的數據、類型、顏色、透明度等具體的值 | 


* ### AAChartModel 所有屬性列表說明
```kotlin
    var animationType: String? = null          //動畫類型
    var animationDuration: Int? = null         //動畫時間
    var title: String? = null                  //標題內容
    var subtitle: String? = null               //副標題內容
    var chartType: String? = null              //圖表類型
    var stacking: String? = null               //堆積樣式
    var symbol: String? = null                 //折線曲線連接點的類型："circle", "square", "diamond", "triangle","triangle-down"，默認是"circle"
    var symbolStyle: String? = null
    var zoomType: String? = null               //縮放類型 AAChartZoomTypeX表示可沿著 x 軸進行手勢縮放
    var pointHollow: Boolean? = null           //折線或者曲線的連接點是否為空心的
    var inverted: Boolean? = null              //x 軸是否翻轉(垂直)
    var xAxisReversed: Boolean? = null         //x 軸翻轉
    var yAxisReversed: Boolean? = null         //y 軸翻轉
    var tooltipEnabled: Boolean? = null        //是否顯示浮動提示框(默認顯示)
    var tooltipValueSuffix: String? = null     //浮動提示框單位後綴
    var tooltipCrosshairs: Boolean? = null     //是否顯示準星線(默認顯示)
    var gradientColorEnable: Boolean? = null   //是否要為漸變色
    var polar: Boolean? = null                 //是否極化圖形(變為雷達圖)
    var marginLeft: Float? = null              //左部外邊距
    var marginRight: Float? = null             //右邊外邊距
    var dataLabelEnabled: Boolean? = null      //是否顯示數據
    var xAxisLabelsEnabled: Boolean? = null    //x軸是否顯示數據
    var categories: Array<String>? = null      //x軸是否顯示數據
    var xAxisGridLineWidth: Int? = null        //x軸網格線的寬度
    var xAxisVisible: Boolean? = null          //x 軸是否顯示
    var yAxisVisible: Boolean? = null          //y 軸是否顯示
    var yAxisLabelsEnabled: Boolean? = null    //y軸是否顯示數據
    var yAxisTitle: String? = null             //y軸標題
    var yAxisLineWidth: Float? = null          //y 軸軸線的寬度
    var yAxisGridLineWidth: Int? = null        //y軸網格線的寬度
    var colorsTheme: Array<Any>? = null        //圖表主題顏色數組
    var legendEnabled: Boolean? = null         //是否顯示圖例
    var legendLayout: String? = null           //圖例數據項的布局。布局類型： "horizontal" 或 "vertical" 即水平布局和垂直布局 默認是：horizontal.
    var legendAlign: String? = null            //設定圖例在圖表區中的水平對齊方式，合法值有left，center 和 right。
    var legendVerticalAlign: String? = null    //設定圖例在圖表區中的垂直對齊方式，合法值有 top，middle 和 bottom。垂直位置可以通過 y 選項做進壹步設定。
    var backgroundColor: String? = null        //圖表背景色
    var borderRadius: Int? = null              //柱狀圖長條圖頭部圓角半徑(可用於設置頭部的形狀,僅對條形圖,柱狀圖有效)
    var markerRadius: Int? = null              //折線連接點的半徑長度
    var series: Array<AASeriesElement>? = null
    var titleColor: String? = null             //標題顏色
    var subTitleColor: String? = null          //副標題顏色
    var axisColor: String? = null              //x 軸和 y 軸文字顏色
```


## 作者

![](https://avatars1.githubusercontent.com/u/16357599?s=40&v=4)An An
```java

                       _oo0oo_
                      o8888888o
                      88" . "88
                      (| -_- |)
                      0\  =  /0
                    ___/`---'\___
                  .' \\|     |// '.
                 / \\|||  :  |||// \
                / _||||| -:- |||||- \
               |   | \\\  -  /// |   |
               | \_|  ''\---/''  |_/ |
               \  .-\__  '-'  ___/-. /
             ___'. .'  /--.--\  `. .'___
          ."" '<  `.___\_<|>_/___.' >' "".
         | | :  `- \`.;`\ _ /`;.`/ - ` : | |
         \  \ `_.   \_ __\ /__ _/   .-` /  /
     =====`-.____`.___ \_____/___.-`___.-'=====
                       `=---='
*******************************************************
     ¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥¥
         €€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€
               $$$$$$$$$$$$$$$$$$$$$$$  
                   BUDDHA_BLESS_YOU       
                      AWAY_FROM
                         BUG

```

## 源代碼⛓
語言版本 |  項目名稱 | 適用平臺| 源代碼鏈接|
------------ | ------------- |------------- | ------------- |
Kotlin | AAInfographics | Android | https://github.com/AAChartModel/AAChartKit-Kotlin |
Java | AAChartCore | Android | https://github.com/AAChartModel/AAChartKit |
Swift | AAInfographics |  iOS |https://github.com/AAChartModel/AAChartKit-Swift |
Objective C | AAChartKit | iOS | https://github.com/AAChartModel/AAChartKit |


## 許可證

![](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/License_icon-mit-88x31-2.svg/128px-License_icon-mit-88x31-2.svg.png)

本項目 `AAChartCore`使用 MIT許可證,詳情請點擊[MIT LICENSE](https://github.com/AAChartModel/AAChartKit-Swift/blob/master/LICENSE),框架所依賴的非框架原有的其他內容仍舊遵循其原有的許可證.

## 聯系方式

-------------------------------------------------------------------------------
*  🌕 🌖 🌗 🌘     暖心提示   🌑 🌒 🌓 🌔
*
* 如果有任何使用上的問題,隨時歡迎您在 GitHub 上向我提 issue.
* GitHub Issues : https://github.com/AAChartModel/AAChartCore/issues
-------------------------------------------------------------------------------
* 如果您想參與到此項目的開源活動中來,也同樣隨時歡迎您聯系我
* GitHub        : https://github.com/AAChartModel
* StackOverflow : https://stackoverflow.com/users/7842508/codeforu
* JianShu       : http://www.jianshu.com/u/f1e6753d4254
* SegmentFault  : https://segmentfault.com/u/huanghunbieguan
-------------------------------------------------------------------------------

## 待辦清單

- [x] 支持圖形加載完成後用戶添加代理事件
- [x] 支持圖形動態刷新全局內容
- [x] 支持圖形動態刷新純數據`(series)`內容
- [x] 支持色彩圖層漸變效果
- [x] 支持橫屏(全屏)效果
- [x] 支持自由設置圖形渲染動畫
- [x] 支持用戶自由配置`AAOptions`模型對象屬性
- [x] 支持圖形堆疊
- [x] 支持圖形坐標軸反轉
- [x] 支持渲染散點圖
- [x] 支持渲染柱形範圍圖
- [x] 支持渲染面積範圍圖
- [x] 支持渲染面積範圍均線圖
- [x] 支持渲染極地圖
- [x] 支持渲染折線直方圖
- [x] 支持渲染折線直方填充圖
- [ ] 支持渲染矩形樹狀層級關系圖
- [ ] 支持渲染活動刻度儀表圖
- [ ] 支持為圖形添加點擊事件回調
- [ ] 支持圖形實時刷新純數據並動態滾動
- [ ] 支持已渲染圖形生成圖片文件
- [ ] 支持生成圖片文件保存至系統相冊


[1]:  https://raw.githubusercontent.com/adad184/MMTweenAnimation/master/Images/1.gif
[2]:  https://raw.githubusercontent.com/adad184/MMTweenAnimation/master/Images/2.gif
[3]:  https://raw.githubusercontent.com/adad184/MMTweenAnimation/master/Images/3.gif
[4]:  https://raw.githubusercontent.com/adad184/MMTweenAnimation/master/Images/4.gif
[5]:  https://raw.githubusercontent.com/adad184/MMTweenAnimation/master/Images/5.gif
[6]:  https://raw.githubusercontent.com/adad184/MMTweenAnimation/master/Images/6.gif
[7]:  https://raw.githubusercontent.com/adad184/MMTweenAnimation/master/Images/7.gif
[8]:  https://raw.githubusercontent.com/adad184/MMTweenAnimation/master/Images/8.gif
[9]:  https://raw.githubusercontent.com/adad184/MMTweenAnimation/master/Images/9.gif
[10]: https://raw.githubusercontent.com/adad184/MMTweenAnimation/master/Images/10.gif

