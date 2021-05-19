package edu.prahlad.patterns.creational.factory;

import edu.prahlad.patterns.creational.factory.person.PersonImp;
import edu.prahlad.patterns.creational.factory.pizza.PizzaStore;

public class ZRunner {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        System.out.println(pizzaStore.orderPizza("veg"));
        System.out.println(pizzaStore.orderPizza("veg"));

        PersonImp person = new PersonImp();
        System.out.println(person.grantPersonWish("male", "hello"));
    }
}
