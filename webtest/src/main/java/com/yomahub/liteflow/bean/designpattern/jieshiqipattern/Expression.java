package com.yomahub.liteflow.bean.designpattern.jieshiqipattern;

/**
 * @Author: Joy
 * @Date: 2023/12/28 15:01
 * @Description: 抽象表达式接口
 */
public interface Expression {
    /**
     * 抽象表达式
     * @param context 上下文
     * @return 数值
     */
    int interpret(Context context);
}






