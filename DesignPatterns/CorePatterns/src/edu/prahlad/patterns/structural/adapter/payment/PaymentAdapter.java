package edu.prahlad.patterns.structural.adapter.payment;

public class PaymentAdapter {
    public void convertAndPayInDollars(int rupees){
        PaymentProcessorImpl paymentProcessor = new PaymentProcessorImpl();
        int dollars = rupees / getExchangeRate("dollar", "rupees");
        paymentProcessor.pay(dollars);
    }

    private int getExchangeRate(String currency1, String currency2) {
        return 70;
    }
}
