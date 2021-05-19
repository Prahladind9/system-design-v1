package edu.prahlad.patterns.structural.flyweight;

import edu.prahlad.patterns.structural.flyweight.shape.PaintApp;

public class ZRunner {
    public static void main(String[] args) {
        PaintApp paintApp = new PaintApp();
        paintApp.render(10);
    }
}
