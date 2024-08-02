package com.github.aachartmodel.aainfographics.demo.chartcomposer

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartEvents
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis
import com.github.aachartmodel.aainfographics.aatools.AAColor

object JSFunctionForAAChartEventsComposer2 {

//https://github.com/AAChartModel/AAChartKit/issues/1557
//https://github.com/AAChartModel/AAChartCore/issues/199
//https://developer.mozilla.org/zh-CN/docs/Web/API/Touch_events/Using_Touch_Events
//https://developer.mozilla.org/zh-CN/docs/Web/API/MouseEvent
    /*
    在 JavaScript 中，与触摸事件对应的鼠标事件分别是：

    - `touchstart` 对应 `mousedown`
    - `touchend` 对应 `mouseup`

    因此，将你的代码中的触摸事件改为鼠标事件后，代码可以改写为：


     1.
    ```javascript
    // 监听 mousedown 事件
    container.addEventListener('mousedown', function() {
      hideDataLabels(chart);
    });

    // 监听 mouseup 事件
    container.addEventListener('mouseup', function() {
      showDataLabels(chart);
    });
    ```

    或者也可以改成为:

     2.
     ```javascript
     // 监听 mouseenter 事件
     container.addEventListener('mouseenter', function() {
       hideDataLabels(chart);
     });

     // 监听 mouseleave 事件
     container.addEventListener('mouseleave', function() {
       showDataLabels(chart);
     });
     ```
    */
    fun toggleDataLabelsOnTouch(): AAOptions {
        val options = AAOptions()
            .chart(AAChart()
                .type(AAChartType.Areaspline)
                .events(AAChartEvents()
                    .load("""
                    function() {
                        const chart = this;
                        const container = document.getElementById('container');

                        container.addEventListener('touchstart', function() {
                            hideDataLabels(chart);
                        });

                        container.addEventListener('touchend', function() {
                            showDataLabels(chart);
                        });

                        function hideDataLabels(chart) {
                            chart.series.forEach(function(series) {
                                series.data.forEach(function(point) {
                                    point.update({ dataLabels: { enabled: false } });
                                });
                            });
                        }

                        function showDataLabels(chart) {
                            chart.series.forEach(function(series) {
                                series.data.forEach(function(point) {
                                    point.update({ dataLabels: { enabled: true } });
                                });
                            });
                        }
                    }
                """.trimIndent())))
            .xAxis(AAXAxis()
                .categories(arrayOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月")))
            .series(arrayOf(
                AASeriesElement()
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                    .dataLabels(AADataLabels()
                        .enabled(true))
                    .marker(AAMarker()
                        .lineColor(AAColor.Red)
                        .lineWidth(3f)
                        .radius(10f))
            ))

        return options
    }
}