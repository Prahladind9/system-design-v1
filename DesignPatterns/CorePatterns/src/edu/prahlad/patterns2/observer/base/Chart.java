package edu.prahlad.patterns2.observer.base;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Chart got updated");
    }
}
