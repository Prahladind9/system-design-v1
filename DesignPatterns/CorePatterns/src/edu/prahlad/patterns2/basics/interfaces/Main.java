package edu.prahlad.patterns2.basics.interfaces;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
