package edu.prahlad.patterns3.behavioural.strategy.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
