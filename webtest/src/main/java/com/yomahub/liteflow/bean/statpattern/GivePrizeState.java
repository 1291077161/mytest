package com.yomahub.liteflow.bean.statpattern;

/**
 * 发放奖品的状态
 */
public class GivePrizeState extends AbstractState {
   PrizeActivity activity;

   public GivePrizeState(PrizeActivity activity) {
      this.activity = activity;
   }

   @Override
   public void deductScores() {
      System.out.println("不能扣除积分");
   }

   @Override
   public boolean prize() {
      System.out.println("不能抽奖");
      return false;
   }

   @Override
   public void givePrize() {
      if (activity.getCount() > 0) {
         System.out.println("恭喜中奖了");
         // 改变状态为不能抽奖
         activity.setState(activity.getNoPrizeState());
      } else {
         System.out.println("很遗憾，奖品发送完了");
         // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
         activity.setState(activity.getOverPrizeState());
         //System.out.println("抽奖活动结束");
      }

   }
}