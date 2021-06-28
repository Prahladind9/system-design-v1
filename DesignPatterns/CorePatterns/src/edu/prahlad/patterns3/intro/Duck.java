package edu.prahlad.patterns3.intro;

import edu.prahlad.patterns3.intro.fly.FlyBehavior;
import edu.prahlad.patterns3.intro.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
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
