package edu.prahlad.patterns2.behavioural.observer.base;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Chart got updated");
    }
}
