package edu.prahlad.patterns2.structural.bridge.prob;

//Basic Remote Control (turnOn, turnOff)
//Advanced Remote Control(setChannel)
//Movie Remote Control (play, pause, rewind)

/**
 * RemoteControl
 *  SonyRemoteControl
 *  SamsungRemoteControl
 *  AdvancedRemoteControl
 *      SonyAdvancedRemoteControl
 *      SamsungAdvancedRemoteControl
 *
 */

public abstract class RemoteControl {
    public abstract void turnOn();
    public abstract void turnOff();
}
