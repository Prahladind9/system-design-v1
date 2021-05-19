package edu.prahlad.patterns.structural.adapter.payment;

public class PaymentProcessorImpl implements PaymentProcessor {
    @Override
    public void pay(int dollars) {
        System.out.println("Payment Processed Successfully - " + dollars + "$");
    }
}
