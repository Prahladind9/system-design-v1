package edu.prahlad.patterns3.intro;

import edu.prahlad.patterns3.intro.fly.FlyWithWings;
import edu.prahlad.patterns3.intro.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        //later will be passed as constructorParams & dynamically assigned
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
