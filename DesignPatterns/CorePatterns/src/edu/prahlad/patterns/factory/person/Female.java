package edu.prahlad.patterns.factory.person;

public class Female implements Person{
    @Override
    public void wish(String msg) {
        System.out.println("Female wish: " + msg);
    }
}
