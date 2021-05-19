package edu.prahlad.patterns.structural.flyweight.shapeBefore;

public class RectangleBefore implements ShapeBefore {
    private String label;
    private int length;
    private int breadth;
    private String fillStyle;

    public RectangleBefore() {
        label = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + label + ", with length " + length + ", breadth " + breadth
                + ", fill Style with " + fillStyle);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public String getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }
}
