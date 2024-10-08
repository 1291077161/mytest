package com.yomahub.liteflow.bean.designpattern.guanchazhepattern.jdkdemo;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    // 定义一个Observable
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        // 注册该观察者
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        // 如果obs是WeatherData类的一个实例
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            // 获取观察者需要的数据
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            // 通知显示
            display();
        }
    }

    // 显示方法
    @Override
    public void display() {
        System.out.println("温度：" + temperature + "\n湿度:" + humidity);
    }
}