package edu.prahlad.patterns.structural.flyweight.shape;

public class Circle extends Shape {
    private String label;//Common with Circle

    //Separate the Extrinsic State
    /*private int radius;
    private String fillColor;
    private String lineColor;*/

    public Circle() {
        label = "Circle";
    }

    @Override
    void draw(int radius, String fillColor, String lineColor) {
        super.draw(radius, fillColor, lineColor);
        System.out.println("Drawing a " + label + ", with radius " + radius
                + ", fill colors with " + fillColor + ", line Color with " + lineColor);
    }

}
