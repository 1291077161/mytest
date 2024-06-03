package com.yomahub.liteflow.bean.statpattern;

public class Tests {
   public static void main(String[] args) {
      // 创建活动对象，奖品有1个奖品
      PrizeActivity activity = new PrizeActivity(1);

      // NoPrizeState state = (NoPrizeState) activity.getState();

      // 我们连续抽300次奖
      for (int i = 0; i < 10; i++) {
         System.out.println("--------第" + (i + 1) + "次抽奖----------");
         // 参加抽奖，第一步点击扣除积分
         activity.deductScores();
         // 第二步抽奖
         activity.prize();
      }
   }
}