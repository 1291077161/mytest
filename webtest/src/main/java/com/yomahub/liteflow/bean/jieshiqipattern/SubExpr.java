package com.yomahub.liteflow.bean.jieshiqipattern;

/**
 * @Author: Joy
 * @Date: 2023/12/28 15:09
 * @Description:
 */
public class SubExpr implements Expression{
    private Expression left, right;

    public SubExpr(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context ctx) {
        return left.interpret(ctx) - right.interpret(ctx);
    }
}
