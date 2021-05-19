package edu.prahlad.patterns.behavioural.template.computerManufacturer;

public class DesktopManufacturer extends ComputerManufacturer{
    @Override
    protected void addHardDisk() {
        System.out.println("Added HardDisk for Desktop");
    }

    @Override
    protected void addRAM() {
        System.out.println("Added RAM for Desktop");
    }

    @Override
    protected void addKeyboard() {
        System.out.println("Added Keyboard for Desktop");
    }
}
