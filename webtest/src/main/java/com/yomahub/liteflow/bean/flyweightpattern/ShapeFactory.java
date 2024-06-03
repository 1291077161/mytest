package com.yomahub.liteflow.bean.flyweightpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Joy
 * @Date: 2023/12/28 16:51
 * @Description: 享元工厂
 */
public class ShapeFactory {

    private final Map<Color, List<Shape>> shapes;

    public ShapeFactory() {
        this.shapes = new HashMap<>();
    }

    public Shape getShape(Color color, ShapeType type) throws IllegalAccessException {
        List<Shape> shapeList = this.shapes.get(color);
        if (shapeList == null) {
            shapeList = new ArrayList<>();
            shapes.put(color, shapeList);
        }

        for (Shape shape : shapeList) {
            if (shape.getClass() == type.getShapeClass()) {
                return shape;
            }
        }

        Shape newShape;
        switch (type) {
            case CIRCLE:
                newShape = new Circle(color, 10.0);
                break;
            case SQUARE:
                newShape = new Square(color, 10.0);
                break;
            case TRIANGLE:
                newShape = new Triangle(color, 10.0);
                break;
            default:
                throw new IllegalAccessException("Invalid shape type");
        }
        shapeList.add(newShape);
        return newShape;
    }
}