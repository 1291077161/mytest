package com.yomahub.liteflow.bean.jieshiqipattern;

/**
 * @Author: Joy
 * @Date: 2023/12/28 15:12
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        //创建一个上下文对象
        Context context = new Context();
        context.setVariable("x",20);
        //创建一个表达式树
        Expression expr = new AddExpr(new SubExpr(new NumberExpr(20), new NumberExpr(5)),
                new NumberExpr(context.getVariable("-")));

        Expression expr1 = new AddExpr(new AddExpr(new NumberExpr(20), new NumberExpr(5)),
                new NumberExpr(context.getVariable("+")));

        //解释并打印表达式的值
        System.out.println(expr.interpret(context));
        System.out.println(expr1.interpret(context));

    }
}