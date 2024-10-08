package com.yomahub.liteflow.bean.designpattern.guanchazhepattern.customizedemo;

import lombok.Getter;

import java.util.ArrayList;


/***
 *
 * @author Joy
 * 天气广播者，实现并扩展Subject类
 *
 */
public class WeatherDataSubject implements Subject {
    // 定义一个ArrayList对象，用于存储注册的观察者类
    private ArrayList observers;
    // get方法，用于拉数据，后面会讲到
    @Getter
    // 温度
    private float temperature;
    @Getter
    // 湿度
    private float humidity;
    @Getter
    // 气压
    private float pressure;

    // 在构造器中初始化observers对象
    public WeatherDataSubject() {
        observers = new ArrayList();
    }

    // 注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    // 通知所有观察者
    @Override
    public void notifyObservers() {
        for (Object o : observers) {
            // Observer是所以观察者的父类，此处运用了多态
            Observer observer = (Observer) o;
            // 通知更新
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        // 触发通知
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 数据改变触发通知
        measurementsChanged();
    }

}