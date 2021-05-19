package edu.prahlad.patterns.creational.factory.pizza;

public class TomatoPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Tomato Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Tomato Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Tomato Pizza");
    }
}
