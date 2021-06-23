package edu.prahlad.patterns2.structural.bridge;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();


        var remoteControl2 = new RemoteControl(new SamsungTV());
        remoteControl2.turnOn();
    }
}
