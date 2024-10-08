package com.yomahub.liteflow.bean.designpattern.guanchazhepattern.jdkdemo;

import lombok.Getter;

import java.util.Observable;

/**
 *
 * @author Joy
 * @date 2024/10/8
 *
 */

@Getter
public class WeatherData extends Observable {
    // 方便观察者取数据
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        // 激活改变状态，使changed值为true
        setChanged();
        // 调用通知
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}