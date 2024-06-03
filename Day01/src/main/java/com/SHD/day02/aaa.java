package com.SHD.day02;

import java.math.BigDecimal;

public class aaa {
    public static void main(String[] args) {
        SheetHeader sheetHeader = new SheetHeader();
        System.out.println("sheetHeader.getDeliveryAddress() = " + sheetHeader.getDeliveryAddress());
        String a = "";
        int length = a.length();
        //if (a != null) {
        //    System.out.println("qqqq");
        //}
        //if ()
        System.out.println("length = " + length);
        //char c = a.charAt(0);
        //System.out.println("c = " + c);

        BigDecimal b = BigDecimal.ZERO;
        testBigDecimal(b);
        System.out.println("b.intValue() = " + b.intValue());
    }

    public static  void testBigDecimal(BigDecimal bigDecimal) {

        bigDecimal = new BigDecimal(5).add(BigDecimal.ONE);

        System.out.println("bigDecimal.intValue() = " + bigDecimal.intValue());
    }
}
