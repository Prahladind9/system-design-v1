package edu.prahlad.patterns.behavioural.decorator.pizza;

public class VeggiePizzaDecorator extends PizzaDecorator{

    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding Veggie Toppings");
        //addVeggieToppings();
    }
}
