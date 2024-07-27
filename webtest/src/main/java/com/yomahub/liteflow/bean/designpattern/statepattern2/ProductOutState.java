package com.yomahub.liteflow.bean.designpattern.statepattern2;

public class ProductOutState implements LogisticsState {
    @Override
    public void doAction(JdLogistics context) {
        System.out.println("商品已经出库...");
    }
}