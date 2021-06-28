package edu.prahlad.patterns3.behavioural.strategy;

import edu.prahlad.patterns3.behavioural.strategy.fly.FlyBehavior;
import edu.prahlad.patterns3.behavioural.strategy.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }

    void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
