package edu.prahlad.patterns.creational.factory.person;

public class Male implements Person{
    @Override
    public void wish(String msg) {
        System.out.println("Male wish: " + msg);
    }
}
