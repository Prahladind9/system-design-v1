package edu.prahlad.patterns2.observer.base;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("SpreadSheet got notified");
    }
}
