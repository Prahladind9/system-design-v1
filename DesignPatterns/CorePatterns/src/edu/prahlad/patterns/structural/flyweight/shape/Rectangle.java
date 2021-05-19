package edu.prahlad.patterns.structural.flyweight.shape;

public class Rectangle extends Shape {

    private String label; //Common with Circle

    //Separate the Extrinsic State
    /*private int length;
    private int breadth;
    private String fillStyle;*/

    public Rectangle() {
        label = "Rectangle";
    }

    @Override
    void draw(int length, int breadth, String fillStyle) {
        super.draw(length, breadth, fillStyle);
        System.out.println("Drawing a " + label + ", with length " + length + ", breadth " + breadth
                + ", fill Style with " + fillStyle);
    }
}
