package edu.prahlad.patterns.factory;

import edu.prahlad.patterns.factory.person.Person;
import edu.prahlad.patterns.factory.person.PersonFactory;
import edu.prahlad.patterns.factory.person.PersonImp;
import edu.prahlad.patterns.factory.pizza.PizzaStore;

public class ZRunner {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        System.out.println(pizzaStore.orderPizza("veg"));
        System.out.println(pizzaStore.orderPizza("veg"));

        PersonImp person = new PersonImp();
        System.out.println(person.grantPersonWish("male", "hello"));
    }
}
