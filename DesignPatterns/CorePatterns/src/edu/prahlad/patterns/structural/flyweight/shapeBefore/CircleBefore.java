package edu.prahlad.patterns.structural.flyweight.shapeBefore;

public class CircleBefore implements ShapeBefore {
    private String label;
    private int radius;
    private String fillColor;
    private String lineColor;

    public CircleBefore() {
        label = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + label + ", with radius " + radius
                + ", fill colors with " + fillColor + ", line Color with " + lineColor);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }
}
