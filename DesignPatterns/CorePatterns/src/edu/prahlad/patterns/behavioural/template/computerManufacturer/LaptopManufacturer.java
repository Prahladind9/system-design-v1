package edu.prahlad.patterns.behavioural.template.computerManufacturer;

public class LaptopManufacturer extends ComputerManufacturer{
    @Override
    protected void addHardDisk() {
        System.out.println("Added HardDisk for Laptop");
    }

    @Override
    protected void addRAM() {
        System.out.println("Added RAM for Laptop");
    }

    @Override
    protected void addKeyboard() {
        System.out.println("Added Keyboard for Laptop");
    }
}
