package edu.prahlad.patterns.creational.factory.pizza;

public class PizzaStoreOld {
    public Pizza orderPizza(String type){
        Pizza p = null;

        //Logic for creating should be moved to factory
        if(type.equals("cheese")){
            p = new CheesePizza();
        }else if(type.equals("veg")) {
            p = new VegPizza();
        }else if(type.equals("tomato")) {
            p = new TomatoPizza();
        }

        p.prepare();
        p.bake();
        p.cut();

        return p;
    }
}
