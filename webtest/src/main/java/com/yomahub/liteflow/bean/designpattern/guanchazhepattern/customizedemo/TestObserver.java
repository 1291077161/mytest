package com.yomahub.liteflow.bean.designpattern.guanchazhepattern.customizedemo;

/***
 * 
 * @author Joy
 * 模拟天气改变时通知操作
 *
 */
public class TestObserver {

    public static void main(String[] args) {

        WeatherDataSubject weatherData = new WeatherDataSubject();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 90, 100L);
        weatherData.setMeasurements(90, 90, 100L);
    }
}