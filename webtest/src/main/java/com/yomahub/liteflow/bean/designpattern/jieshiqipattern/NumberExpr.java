package com.yomahub.liteflow.bean.designpattern.jieshiqipattern;

/**
 * @Author: Joy
 * @Date: 2023/12/28 15:04
 * @Description: 具体终结符表达式类-数字表达式
 */
public class NumberExpr implements TerminalExpr{

    private int value;

    public NumberExpr(int value){
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }
}
