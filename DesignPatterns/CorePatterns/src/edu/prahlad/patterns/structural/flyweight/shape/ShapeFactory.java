package edu.prahlad.patterns.structural.flyweight.shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String type) {
        Shape shape = null;
        if (shapes.get(type) != null) {
            shape = shapes.get(type);
        } else if (type.equals("circle")) {
            shape = new Circle();
            shapes.put("circle", shape);
        } else if (type.equals("rectangle")) {
            shape = new Rectangle();
            shapes.put("rectangle", shape);
        }
        return shape;
    }
}
