package edu.prahlad.patterns3.behavioural.strategy.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("<<Can't Fly>>");
    }
}
