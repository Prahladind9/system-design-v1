package edu.prahlad.patterns3.intro.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("<<Can't Fly>>");
    }
}
