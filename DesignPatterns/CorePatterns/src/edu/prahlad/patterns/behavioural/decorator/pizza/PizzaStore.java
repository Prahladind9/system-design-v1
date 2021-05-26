package edu.prahlad.patterns.behavioural.decorator.pizza;

public class PizzaStore {

    public static void main(String[] args) {
        /* Stage 1 - Plain Object
        Pizza pizza = new PlainPizza();
        pizza.bake();*/

        /* Stage 2 - Wrapping Cheese Functionality
        Pizza pizza = new CheesePizzaDecorator(new PlainPizza());
        pizza.bake();*/

        //Stage 3 - Wrapping more functionality
        Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza.bake();

    }
}
