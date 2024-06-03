package com.yomahub.liteflow.bean.statpattern;

/**
 * 抽奖活动
 */
public class PrizeActivity {
   /**
    * state 表示活动当前的状态，是变化
    */
   AbstractState state = null;
   /**
    * 奖品数量
    */
   int count = 0;
   /**
    * 四个属性，表示四种状态
    */
   AbstractState noPrizeState = new NoPrizeState(this);
   AbstractState canPrizeState = new CanPrizeState(this);
   AbstractState givePrizeState = new GivePrizeState(this);
   AbstractState overPrizeState = new OverPrizeState(this);

   /**
    * 1. 初始化当前的状态为 NoPrizeState（即不能抽奖的状态）
    * 2. 初始化奖品的数量
    *
    * @param count
    */
   public PrizeActivity(int count) {
      this.state = getNoPrizeState();
      this.count = count;
   }

   /**
    * 扣分, 调用当前状态的 deductMoney
    */
   public void deductScores() {
      state.deductScores();
   }

   /**
    * 抽奖
    */
   public void prize() {
      // 如果当前的状态是抽奖成功
      if (state.prize()) {
         //领取奖品
         state.givePrize();
      }
   }

   public AbstractState getState() {
      return state;
   }

   public void setState(AbstractState state) {
      this.state = state;
   }

   /**
    * 每领取一次奖品，count--
    *
    * @return
    */
   public int getCount() {
      int curCount = count;
      count--;
      return curCount;
   }

   public void setCount(int count) {
      this.count = count;
   }

   public AbstractState getNoPrizeState() {
      return noPrizeState;
   }

   public void setNoPrizeState(AbstractState noPrizeState) {
      this.noPrizeState = noPrizeState;
   }

   public AbstractState getCanPrizeState() {
      return canPrizeState;
   }

   public void setCanPrizeState(AbstractState canPrizeState) {
      this.canPrizeState = canPrizeState;
   }

   public AbstractState getGivePrizeState() {
      return givePrizeState;
   }

   public void setGivePrizeState(AbstractState givePrizeState) {
      this.givePrizeState = givePrizeState;
   }

   public AbstractState getOverPrizeState() {
      return overPrizeState;
   }

   public void setOverPrizeState(AbstractState overPrizeState) {
      this.overPrizeState = overPrizeState;
   }
}