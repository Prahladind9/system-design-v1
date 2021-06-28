package edu.prahlad.patterns3.behavioural.strategy;

import edu.prahlad.patterns3.behavioural.strategy.fly.FlyNoWay;
import edu.prahlad.patterns3.behavioural.strategy.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
