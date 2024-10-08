package com.yomahub.liteflow.bean.designpattern.guanchazhepattern.customizedemo;

/***
 *
 * @author Joy
 * 定义一个客户端显示当前数据
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        // 保存 weatherData对象，方便后续移除该观察者
        this.weatherData = weatherData;
        // 注册观察者
        weatherData.registerObserver(this);
    }

    // 通知方法
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 调用显示方法显示数据
        display();
    }

    // 显示方法
    @Override
    public void display() {
        System.out.println("温度：" + temperature + "\n湿度:" + humidity + "\n气压:" + pressure);
    }
}