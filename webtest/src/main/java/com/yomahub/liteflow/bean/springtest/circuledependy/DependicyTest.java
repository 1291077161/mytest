package com.yomahub.liteflow.bean.springtest.circuledependy;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 * @author Joy
 * @date 2024/6/4
 * @param
 *
 */
@Data
public class DependicyTest {
	public static void main(String[] args) {
		GG gg = new GG();
		MM mm = new MM();
		gg.setMm(mm);
		mm.setGg(gg);


		BigDecimal b = new BigDecimal("20");
		System.out.println("b = " + b);
		BigDecimal test1 = test1(b);
		System.out.println("test1 = " + test1);
		System.out.println("b = " + b);



	}

	public static BigDecimal test1 (BigDecimal b) {
		b = b.add(new BigDecimal(11));
		System.out.println("bbb = " + b);
		return b;
	}

	// public static DependicyTest create() {
	// 	DependicyTest dependicyTest = DependicyTest.create();
	// 	return dependicyTest;
	// }
}
