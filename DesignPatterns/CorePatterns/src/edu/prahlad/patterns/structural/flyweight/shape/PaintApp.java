package edu.prahlad.patterns.structural.flyweight.shape;

public class PaintApp {
    public void render(int numberOfShapes){
        //Only 2 objects are created
        for (int i = 1; i <= numberOfShapes; i++) {
            if(i%2 ==0){
                ShapeFactory.getShape("circle").draw(i, "red", "white");
            }else{
                ShapeFactory.getShape("rectangle").draw(i, i+i, "dotted");
            }
        }
    }
}
