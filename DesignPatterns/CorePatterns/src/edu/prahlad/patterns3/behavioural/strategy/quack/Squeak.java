package edu.prahlad.patterns3.behavioural.strategy.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
