package edu.prahlad.patterns3.behavioural.strategy;

import edu.prahlad.patterns3.behavioural.strategy.fly.FlyRocketPowered;

public class ZMain {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
