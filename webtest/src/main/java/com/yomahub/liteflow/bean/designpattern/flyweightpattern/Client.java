package com.yomahub.liteflow.bean.designpattern.flyweightpattern;

/**
 * @Author: Joy
 * @Date: 2023/12/28 17:00
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException {

        ShapeFactory factory = new ShapeFactory();

        Color redColor = new Color(0xFF0000);
        Color blueColor = new Color(0x0000FF);

        Shape redCircle = factory.getShape(redColor, ShapeType.CIRCLE);
        Shape redSquare = factory.getShape(redColor, ShapeType.SQUARE);
        Shape redTriangle = factory.getShape(redColor, ShapeType.TRIANGLE);

        Shape blueCircle = factory.getShape(blueColor, ShapeType.CIRCLE);
        Shape blueSquare = factory.getShape(blueColor, ShapeType.SQUARE);
        Shape blueTriangle = factory.getShape(blueColor, ShapeType.TRIANGLE);

        // 输出形状信息
        System.out.println("Red Circle: " + redCircle.getClass().getSimpleName());
        System.out.println("Red Square: " + redSquare.getClass().getSimpleName());
        System.out.println("Red Triangle: " + redTriangle.getClass().getSimpleName());

        System.out.println("Blue Circle: " + blueCircle.getClass().getSimpleName());
        System.out.println("Blue Square: " + blueSquare.getClass().getSimpleName());
        System.out.println("Blue Triangle: " + blueTriangle.getClass().getSimpleName());
    }
}