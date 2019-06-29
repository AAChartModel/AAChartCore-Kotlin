
        var aaGlobalChart;

        function loadTheHighChartView (sender,receivedWidth, receivedHeight) {

        var aaOptions = JSON.parse(sender);;

            aaOptions.credits = {enabled:false};//去掉表格右下角版权信息
            if (aaOptions.plotOptions) {
                    configurePlotOptions(aaOptions);
                            }
            if (aaOptions.tooltip) {
                    if (aaOptions.tooltip.formatter) {
                        aaOptions.tooltip.formatter = eval(aaOptions.tooltip.formatter);
                    }
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
                    // 添加鼠标事件
                    if (aaOptions.touchEventEnabled == true && aaPlotOptions.series) {
                        configureChartTouchEvent(aaOptions);
                    }
                }

        function configureChartTouchEvent(aaOptions) {
                    var mouseOverFunc = function(){
                        //console.log(this)
                        var message = {
                            name: this.series.name,
                            y :this.y,
                            x: this.x,
                            category:this.category,
                            offset:{plotX:this.plotX,plotY:this.plotY},
                            index: this.index,
                        };

                        var messageStr = JSON.stringify(message);

//                        alert("AAChartViewBridge://?"+ messageStr);

                        window.androidObject.androidMethod(messageStr);

//                        overrideUrlLoading("AAChartViewBridge://?"+ messageStr);

                    };

                    var pointEvents = {
                        point:{
                            events:{
                            mouseOver: mouseOverFunc,
//                                click: mouseOverFunc,
                            }
                        }
                    };
                    aaOptions.plotOptions.series = Object.assign(pointEvents,aaOptions.plotOptions.series)
                }


        function overrideUrlLoading(testOverrideUrlStr) {
            alert(testOverrideUrlStr);
            uiWebViewLoadURL(testOverrideUrlStr);
        }

        function uiWebViewLoadURL(url) {
            var iFrame;
            iFrame = document.createElement("iframe");
            iFrame.setAttribute("src", url);
            iFrame.setAttribute("style", "display:none;");
            iFrame.setAttribute("height", "0px");
            iFrame.setAttribute("width", "0px");
            iFrame.setAttribute("frameborder", "0");
            document.body.appendChild(iFrame);
            iFrame.parentNode.removeChild(iFrame);
            iFrame = null;
        }

        function onlyRefreshTheChartDataWithSeries (receivedSeries) {
            var receivedSeriesElementArr = JSON.parse(receivedSeries);

            for (var i = 0; i < receivedSeriesElementArr.length; i++) {
                var receivedSeriesData = receivedSeriesElementArr[i].data;
                // 获取series
                var chartSeries =  aaGlobalChart.series[i];
                // 执行只刷新数据的函数
                chartSeries.setData(receivedSeriesData);
            }
        }

          //pragma mark -- setter method 适应内容https://code.hcharts.cn/highcharts/4YM0a8
        function setTheChartViewContentWidth (receivedWidth) {
            var container = document.getElementById('container');//获得元素
            container.style.width = receivedWidth;//设置宽度
            aaGlobalChart.reflow();
            console.log("🌞修改了内容的宽度" + receivedWidth);
        }

        function setTheChartViewContentHeight (receivedHeight) {
             var container = document.getElementById('container');//获得元素
             container.style.height = receivedHeight;//设置高度
             aaGlobalChart.reflow();
             console.log("🌛修改了内容的高度" + receivedHeight);

        }

        function setChartSeriesHidden(hidden) {
                     console.log("🔥element是显示还是隐藏" + receivedHeight);


             for (var i = 0; i < aaGlobalChart.series.length; i++) {
                  var series = aaGlobalChart.series[i];
                     if (hidden == true) {
                        series.hide();
                     } else {
                         series.show();
                       }
                   }
                                        console.log("🚀element是显示还是隐藏" + receivedHeight);
                                                        alert("隐藏还是显示"+ hidden);

	var err = undefined;
	err.a = 1;
        }

        function showTheSeriesElementContentWithIndex (elementIndex) {
            var series = aaGlobalChart.series[elementIndex];
            series.show();
        }

        function hideTheSeriesElementContentWithIndex(elementIndex) {
            var series = aaGlobalChart.series[elementIndex];
            series.hide();
        }