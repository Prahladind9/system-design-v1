package edu.prahlad.patterns3.intro.quack;

import edu.prahlad.patterns3.intro.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
