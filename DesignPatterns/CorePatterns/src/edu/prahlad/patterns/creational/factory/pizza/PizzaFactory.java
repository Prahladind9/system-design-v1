package edu.prahlad.patterns.creational.factory.pizza;

public class PizzaFactory  {

    public static Pizza createPizza(String type){
        Pizza p = null;

        if(type.equals("cheese")){
            p = new CheesePizza();
        }else if(type.equals("veg")) {
            p = new VegPizza();
        }else if(type.equals("tomato")) {
            p = new TomatoPizza();
        }

        return p;
    }
}
