package com.threadtest;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class First {
	public static void main(String[] args) {
		//while (true) {
		//
		//}
		//Integer i= 1; int i1 = 1;
		//System.out.println("i == i1 = " + (i == i1));

		Runnable r = new Runnable() {
			@Override
			public void run() {

			}
		};

		//Runnable runnable = new Runnable() {
		//	@Override
		//	public void run() {
		//
		//	}
		//};

		BigDecimal timesUsed = new BigDecimal(2);
		BigDecimal maxUsage = new BigDecimal(3);
		BigDecimal resultBigDecimal = timesUsed.divide(maxUsage, 2, RoundingMode.HALF_UP).scaleByPowerOfTen(2);

		System.out.println("resultBigDecimal = " + resultBigDecimal);
		//new Thread() {
		//	@Override
		//	public void run() {
		//		while (true) {
		//
		//		}
		//	}
		//}.start();
		//new Thread() {
		//	@Override
		//	public void run() {
		//		while (true) {
		//
		//		}
		//	}
		//}.start();
		//new Thread() {
		//	@Override
		//	public void run() {
		//		while (true) {
		//
		//		}
		//	}
		//}.start();
	}
}
