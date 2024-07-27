package com.yomahub.liteflow.bean.designpattern.statpattern;

/**
 * 奖品发放完毕状态
 * 说明，当我们activity 改变成 OverPrizeState， 抽奖活动结束
 */
public class OverPrizeState extends AbstractState {
   PrizeActivity activity;

   public OverPrizeState(PrizeActivity activity) {
      this.activity = activity;
   }

   @Override
   public void deductScores() {
      System.out.println("奖品发送完了，请下次再参加");
   }

   @Override
   public boolean prize() {
      System.out.println("奖品发送完了，请下次再参加");
      return false;
   }

   @Override
   public void givePrize() {
      System.out.println("奖品发送完了，请下次再参加");
   }
}
