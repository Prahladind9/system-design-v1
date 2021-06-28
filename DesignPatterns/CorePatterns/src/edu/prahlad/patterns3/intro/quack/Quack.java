package edu.prahlad.patterns3.intro.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}
