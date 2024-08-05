package com.github.aachartmodel.aainfographics.demo.chartcomposer

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartLineDashStyleType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartStackingType
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChart
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAChartEvents
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AACrosshair
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AADataLabels
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAMarker
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAPlotOptions
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AASeries
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAStyle
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATitle
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AATooltip
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAXAxis
import com.github.aachartmodel.aainfographics.aaoptionsmodel.AAYAxis
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

    //https://github.com/AAChartModel/AAChartKit/issues/1557
    /*
     🖱鼠标事件
     function () {
         const chart = this;
         let currentIndex = 0;
         let intervalId;
         let isHovered = false;

         function moveTooltip() {
             const pointsToShow = [];
             for (let i = 0; i < chart.series.length; i++) {
                 const point = chart.series[i].points[currentIndex];
                 if (point) {
                     pointsToShow.push(point);
                 }
             }

             if (pointsToShow.length > 0) {
                 chart.tooltip.refresh(pointsToShow);
                 chart.xAxis[0].drawCrosshair(null, pointsToShow[0]);

                 currentIndex = (currentIndex + 1) % chart.series[0].points.length;
             }
         }

         function startInterval() {
             if (intervalId) {
                 clearInterval(intervalId);
             }
             intervalId = setInterval(moveTooltip, 2000); // 每2秒切换一次
         }

         // 立即显示第一个点的 tooltip 和十字线
         moveTooltip();

         // 初始启动 interval
         startInterval();

         // 鼠标进入图表
         chart.container.onmouseenter = function() {
             isHovered = true;
             if (intervalId) {
                 clearInterval(intervalId);
                 intervalId = null;
             }
         };

         // 鼠标在图表上移动
         chart.container.onmousemove = function(e) {
             if (isHovered) {
                 const event = chart.pointer.normalize(e);
                 const point = chart.series[0].searchPoint(event, true); // 可以考虑使用更通用的方法选择点
                 if (point) {
                     currentIndex = chart.series[0].points.indexOf(point);
                     const pointsToShow = [];
                     for (let i = 0; i < chart.series.length; i++) {
                         const pointInSeries = chart.series[i].points[currentIndex];
                         if (pointInSeries) {
                             pointsToShow.push(pointInSeries);
                         }
                     }
                     chart.tooltip.refresh(pointsToShow);
                     chart.xAxis[0].drawCrosshair(event, point);
                 }
             }
         };

         // 鼠标离开图表
         chart.container.onmouseleave = function() {
             isHovered = false;
             if (!intervalId) {
                 // 立即移动到下一个点，然后开始 interval
                 moveTooltip();
                 startInterval();
             }
         };

         // 在图表销毁时清除 interval
         this.callbacks.push(function() {
             if (intervalId) {
                 clearInterval(intervalId);
             }
         });
     }
     */

    /*
     👋手势事件
     function() {
         const chart = this;
         let currentIndex = 0;
         let intervalId;
         let isTouched = false;

         function moveTooltip() {
             const pointsToShow = [];
             for (let i = 0; i < chart.series.length; i++) {
                 const point = chart.series[i].points[currentIndex];
                 if (point) {
                     pointsToShow.push(point);
                 }
             }

             if (pointsToShow.length > 0) {
                 chart.tooltip.refresh(pointsToShow);
                 chart.xAxis[0].drawCrosshair(null, pointsToShow[0]);

                 currentIndex = (currentIndex + 1) % chart.series[0].points.length;
             }
         }

         function startInterval() {
             if (intervalId) {
                 clearInterval(intervalId);
             }
             intervalId = setInterval(moveTooltip, 2000); // 每2秒切换一次
         }

         // 立即显示第一个点的 tooltip 和十字线
         moveTooltip();

         // 初始启动 interval
         startInterval();

         // 触摸开始
         chart.container.ontouchstart = function(e) {
             isTouched = true;
             if (intervalId) {
                 clearInterval(intervalId);
                 intervalId = null;
             }
             handleTouch(e);
         };

         // 触摸移动
         chart.container.ontouchmove = function(e) {
             if (isTouched) {
                 handleTouch(e);
             }
         };

         function handleTouch(e) {
             e.preventDefault(); // 阻止默认的滚动行为
             const touch = e.touches[0];
             const event = chart.pointer.normalize(touch);
             const point = chart.series[0].searchPoint(event, true);
             if (point) {
                 currentIndex = chart.series[0].points.indexOf(point);
                 const pointsToShow = [];
                 for (let i = 0; i < chart.series.length; i++) {
                     const pointInSeries = chart.series[i].points[currentIndex];
                     if (pointInSeries) {
                         pointsToShow.push(pointInSeries);
                     }
                 }
                 chart.tooltip.refresh(pointsToShow);
                 chart.xAxis[0].drawCrosshair(event, point);
             }
         }

         // 触摸结束
         chart.container.ontouchend = function() {
             isTouched = false;
             if (!intervalId) {
                 // 立即移动到下一个点，然后开始 interval
                 moveTooltip();
                 startInterval();
             }
         };

         // 在图表销毁时清除 interval
         this.callbacks.push(function() {
             if (intervalId) {
                 clearInterval(intervalId);
             }
         });
     }
     */
    fun createChartOptions(): AAOptions {
        return AAOptions()
            .title(AATitle()
                    .text("Auto Crosshair And Tooltip"))
            .chart(AAChart()
                    .type(AAChartType.Areaspline)
                    .events(AAChartEvents()
                            .load("""
                function() {
                    const chart = this;
                    let currentIndex = 0;
                    let intervalId;
                    let isTouched = false;

                    function moveTooltip() {
                        const pointsToShow = [];
                        for (let i = 0; i < chart.series.length; i++) {
                            const point = chart.series[i].points[currentIndex];
                            if (point) {
                                pointsToShow.push(point);
                            }
                        }

                        if (pointsToShow.length > 0) {
                            chart.tooltip.refresh(pointsToShow);
                            chart.xAxis[0].drawCrosshair(null, pointsToShow[0]);

                            currentIndex = (currentIndex + 1) % chart.series[0].points.length;
                        }
                    }

                    function startInterval() {
                        if (intervalId) {
                            clearInterval(intervalId);
                        }
                        intervalId = setInterval(moveTooltip, 2000);
                    }

                    moveTooltip();

                    startInterval();

                    chart.container.ontouchstart = function(e) {
                        isTouched = true;
                        if (intervalId) {
                            clearInterval(intervalId);
                            intervalId = null;
                        }
                        handleTouch(e);
                    };

                    chart.container.ontouchmove = function(e) {
                        if (isTouched) {
                            handleTouch(e);
                        }
                    };

                    function handleTouch(e) {
                        e.preventDefault();
                        const touch = e.touches[0];
                        const event = chart.pointer.normalize(touch);
                        const point = chart.series[0].searchPoint(event, true);
                        if (point) {
                            currentIndex = chart.series[0].points.indexOf(point);
                            const pointsToShow = [];
                            for (let i = 0; i < chart.series.length; i++) {
                                const pointInSeries = chart.series[i].points[currentIndex];
                                if (pointInSeries) {
                                    pointsToShow.push(pointInSeries);
                                }
                            }
                            chart.tooltip.refresh(pointsToShow);
                            chart.xAxis[0].drawCrosshair(event, point);
                        }
                    }

                    chart.container.ontouchend = function() {
                        isTouched = false;
                        if (!intervalId) {
                            moveTooltip();
                            startInterval();
                        }
                    };

                    this.callbacks.push(function() {
                        if (intervalId) {
                            clearInterval(intervalId);
                        }
                    });
                }
                            """.trimIndent())))
            .colors(arrayOf("#04d69f", "#1e90ff", "#ef476f", "#ffd066"))
            .plotOptions(AAPlotOptions()
                    .series(AASeries()
                            .stacking(AAChartStackingType.Normal)
                            .marker(AAMarker()
                                    .radius(0))))
            .tooltip(AATooltip()
                    .style(AAStyle().color(AAColor.White))
                    .backgroundColor("#050505")
                    .borderColor("#050505"))
            .xAxis(AAXAxis()
                    .crosshair(AACrosshair()
                            .color(AAColor.DarkGray)
                            .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
                            .width(2f)))
            .yAxis(AAYAxis()
                    .visible(false))
            .series(arrayOf(
                AASeriesElement()
                    .name("Tokyo Hot")
                    .lineWidth(5.0f)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.45, 0.43, 0.50, 0.55, 0.58, 0.62, 0.83, 0.39, 0.56, 0.67, 0.50, 0.34, 0.50, 0.67, 0.58, 0.29, 0.46, 0.23, 0.47, 0.46, 0.38, 0.56, 0.48, 0.36)),
                AASeriesElement()
                    .name("Berlin Hot")
                    .lineWidth(5.0f)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.38, 0.31, 0.32, 0.32, 0.64, 0.66, 0.86, 0.47, 0.52, 0.75, 0.52, 0.56, 0.54, 0.60, 0.46, 0.63, 0.54, 0.51, 0.58, 0.64, 0.60, 0.45, 0.36, 0.67)),
                AASeriesElement()
                    .name("London Hot")
                    .lineWidth(5.0f)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.46, 0.32, 0.53, 0.58, 0.86, 0.68, 0.85, 0.73, 0.69, 0.71, 0.91, 0.74, 0.60, 0.50, 0.39, 0.67, 0.55, 0.49, 0.65, 0.45, 0.64, 0.47, 0.63, 0.64)),
                AASeriesElement()
                    .name("NewYork Hot")
                    .lineWidth(5.0f)
                    .fillOpacity(0.4f)
                    .data(arrayOf(0.60, 0.51, 0.52, 0.53, 0.64, 0.84, 0.65, 0.68, 0.63, 0.47, 0.72, 0.60, 0.65, 0.74, 0.66, 0.65, 0.71, 0.59, 0.65, 0.77, 0.52, 0.53, 0.58, 0.53))
            ))
    }

}