package com.yomahub.liteflow.bean.designpattern.guanchazhepattern.customizedemo;

/***
 * 
 * @author Joy
 * 声明通知者通用的接口，定义updata方法
 *
 */
public interface Observer {

    /**
     * 通知观察者
     * @param temp temp
     * @param humidity humidity
     * @param pressure pressure
     */
    public void update(float temp, float humidity, float pressure);
}

