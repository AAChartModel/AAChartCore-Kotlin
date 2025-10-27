
var aaGlobalChart;

function loadTheHighChartView (sender,receivedWidth, receivedHeight) {
    var aaOptions = JSON.parse(sender, function (key, value) {
        if (   typeof(value) == 'string'
            && value.indexOf('function') != -1) {
            return eval(value)
        }

        //判断 key 如果是 lineColor , 并且 value 为 "AANull", 则将其转换为 null
        if (key === 'lineColor' && value === 'AANull') {
            return null;
        }
        return value;
    });

    if (aaOptions.xAxisArray) {
        aaOptions.xAxis = aaOptions.xAxisArray
    }

    if (aaOptions.yAxisArray) {
        aaOptions.yAxis = aaOptions.yAxisArray
    }

    if (aaOptions.defaultOptions) {
        Highcharts.setOptions({
            lang: aaOptions.defaultOptions
        });
    }

    if (aaOptions.plotOptions) {
        configurePlotOptions(aaOptions);
    }

    aaGlobalChart = Highcharts.chart('container', aaOptions);
    //全局配置(可通过全局配置设置主题)https://api.hcharts.cn/highcharts#Highcharts.setOptions
};

function configurePlotOptions(aaOptions) {
    var aaPlotOptions = aaOptions.plotOptions;
    var animation = aaPlotOptions.series.animation;
    if (animation) {//懒调用(只有在 AAChartModel 实例对象设置了 animationType 属性值的时候才会调用设置动画类型的函数,否则不调用)
        var animationEasingType = animation.easing;
        animation.easing = configureTheChartAnimationEasingType(animationEasingType);
    }

    if (aaOptions.clickEventEnabled == true) {
        configureChartClickEvent(aaPlotOptions);
    }

    if (aaOptions.touchEventEnabled == true) {
        configureChartTouchEvent(aaPlotOptions);
    }
}

function configureEventMessageBody(selectedPoint) {
    return {
        name: selectedPoint.series.name,
        x: selectedPoint.x,
        y: selectedPoint.y,
        category: selectedPoint.category ? selectedPoint.category : selectedPoint.name,
        index: selectedPoint.index,
        offset: {
            plotX: selectedPoint.plotX,
            plotY: selectedPoint.plotY
        },
    };
}

function configureChartClickEvent(aaPlotOptions) {
    var clickEventFunc = function() {
        var message = configureEventMessageBody(this);
        var messageStr = JSON.stringify(message);
        window.androidObject.clickEventAndroidMethod(messageStr);
    };

    aaPlotOptions.series.point.events.click = clickEventFunc;
}

function configureChartTouchEvent(aaPlotOptions) {
    var mouseOverEventFunc = function() {
        var message = configureEventMessageBody(this);
        var messageStr = JSON.stringify(message);
        window.androidObject.moveOverEventAndroidMethod(messageStr);
    };

    aaPlotOptions.series.point.events.mouseOver = mouseOverEventFunc;
}

function onlyRefreshTheChartDataWithSeries(receivedSeries, animation) {
    let receivedSeriesArr = JSON.parse(receivedSeries);
    let animationBool = (animation === "true");

    aaGlobalChart.update({
            series: receivedSeriesArr
        },
        true, false, animationBool
    );
}

function updateChart(optionsStr, redraw) {
    var options = JSON.parse(optionsStr);
    aaGlobalChart.update(options,redraw);
}

function addPointToChartSeries(elementIndex, optionsStr, redraw, shift, animation) {
    var options = JSON.parse(optionsStr);
    var redrawBool = (redraw == "true") ? true:false;
    var shiftBool = (shift == "true") ? true:false;
    var animationBool = (animation == "true") ? true:false;

    var seriesElement = aaGlobalChart.series[elementIndex];
    seriesElement.addPoint(options, redrawBool, shiftBool, animationBool);
}

//pragma mark -- setter method
function setTheChartViewContentWidth(receivedWidth) {
    var container = document.getElementById('container'); //获得元素
    container.style.width = receivedWidth; //设置宽度
    aaGlobalChart.reflow();
}

function setTheChartViewContentHeight(receivedHeight) {
    var container = document.getElementById('container'); //获得元素
    container.style.height = receivedHeight; //设置高度
    aaGlobalChart.reflow();
}

function setChartSeriesHidden(hidden) {
    for (var i = 0; i < aaGlobalChart.series.length; i++) {
        var seriesElement = aaGlobalChart.series[i];
        if (hidden == true) {
            seriesElement.hide();
        } else {
            seriesElement.show();
        }
    }
}

function showTheSeriesElementContentWithIndex(elementIndex) {
    var seriesElement = aaGlobalChart.series[elementIndex];
    seriesElement.show();
}

function hideTheSeriesElementContentWithIndex(elementIndex) {
    var seriesElement = aaGlobalChart.series[elementIndex];
    seriesElement.hide();
}

function addElementToChartSeriesWithElement(elementStr) {
    var seriesElement = JSON.parse(elementStr);
    aaGlobalChart.addSeries(seriesElement);
}

function removeElementFromChartSeriesWithElementIndex(elementIndex) {
    var seriesElement = aaGlobalChart.series[elementIndex];
    if (seriesElement) {
        seriesElement.remove(true);
    }
}

function evaluateTheJavaScriptStringFunction(jsStringFunction) {
    eval(jsStringFunction);
}
