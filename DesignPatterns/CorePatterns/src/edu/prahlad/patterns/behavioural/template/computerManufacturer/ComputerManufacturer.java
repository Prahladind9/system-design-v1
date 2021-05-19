package edu.prahlad.patterns.behavioural.template.computerManufacturer;

public abstract class ComputerManufacturer {
    public final void buildComputer(){
        addHardDisk();
        addRAM();
        addKeyboard();
    }

    protected abstract void addHardDisk();
    protected abstract void addRAM();
    protected abstract void addKeyboard();
}
