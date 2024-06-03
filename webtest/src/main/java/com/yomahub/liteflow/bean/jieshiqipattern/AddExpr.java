package com.yomahub.liteflow.bean.jieshiqipattern;

/**
 * @Author: Joy
 * @Date: 2023/12/28 15:06
 * @Description: 具体非终结符表达式类-加法表达式
 */
public class AddExpr implements Expression{

    private Expression left,right;


    public AddExpr(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context ctx) {
        return left.interpret(ctx) + right.interpret(ctx);
    }
}