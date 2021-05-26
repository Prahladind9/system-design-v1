package edu.prahlad.patterns.behavioural.decorator.pizza;

public class PlainPizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking Plain Pizza");
    }
}
