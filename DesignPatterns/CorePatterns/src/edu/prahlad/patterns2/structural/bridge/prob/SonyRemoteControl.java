package edu.prahlad.patterns2.structural.bridge.prob;

public class SonyRemoteControl extends RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }
}
