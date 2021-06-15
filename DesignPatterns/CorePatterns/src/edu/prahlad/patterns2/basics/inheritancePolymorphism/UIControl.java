package edu.prahlad.patterns2.basics.inheritancePolymorphism;

public abstract class UIControl {
    public void enable(){
        System.out.println("Enabled");
    }

    public abstract void draw();
}
