package com.yomahub.liteflow.bean.designpattern.statpattern;

/**
 * 不能抽奖状态
 * 当前状态可以扣积分 , 扣除后，将状态设置成可以抽奖状态
 */
public class NoPrizeState extends AbstractState {
   PrizeActivity activity;

   public NoPrizeState(PrizeActivity activity) {
      this.activity = activity;
   }

   @Override
   public void deductScores() {
      System.out.println("扣除50积分成功，您可以抽奖了");
      activity.setState(activity.getCanPrizeState());
   }

   @Override
   public boolean prize() {
      System.out.println("扣了积分才能抽奖喔！");
      return false;
   }

   @Override
   public void givePrize() {
      System.out.println("不能发放奖品");
   }
}