package com.yomahub.liteflow.bean.designpattern.statpattern;

public abstract class AbstractState {
   /**
    * 扣除积分 - 50
    */
   public abstract void deductScores();

   /**
    * 是否抽中奖品
    *
    * @return
    */
   public abstract boolean prize();

   /**
    * 发放奖品
    */
   public abstract void givePrize();
}