package com.yomahub.liteflow.bean.designpattern.statepattern2;

public class StateClient {
	public static void main(String[] args) {
		//状态的保持与切换者
		JdLogistics jdLogistics = new JdLogistics();

		//接单状态
		OrderState orderState = new OrderState();
		jdLogistics.setLogisticsState(orderState);
		jdLogistics.doAction();

		//出库状态
		ProductOutState productOutState = new ProductOutState();
		jdLogistics.setLogisticsState(productOutState);
		jdLogistics.doAction();

		//运输状态
		// TransportState transportState = new TransportState();
		// jdLogistics.setLogisticsState(transportState);
		// jdLogistics.doAction();

	}

}