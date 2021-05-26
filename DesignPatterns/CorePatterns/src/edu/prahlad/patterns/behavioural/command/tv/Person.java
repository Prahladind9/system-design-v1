package edu.prahlad.patterns.behavioural.command.tv;

public class Person {
    public static void main(String[] args) {
        final Television television = new Television();
        final RemoteControl remoteControl = new RemoteControl();

        final Command commandOn = new CommandOn(television);
        remoteControl.setCommand(commandOn);
        remoteControl.pressButton();

        final Command commandOff = new CommandOff(television);
        remoteControl.setCommand(commandOff);
        remoteControl.pressButton();

    }
}
