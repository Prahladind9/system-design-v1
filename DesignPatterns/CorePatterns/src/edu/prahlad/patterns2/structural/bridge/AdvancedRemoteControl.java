package edu.prahlad.patterns2.structural.bridge;

public abstract class AdvancedRemoteControl extends RemoteControl{

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number){
        device.setChannel(number);
    }

}
